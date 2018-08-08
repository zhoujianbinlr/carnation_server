<#include "common/common.ftl">
<#include "common/validationCommon.ftl">
<#assign shiro=JspTaglibs["/WEB-INF/tlds/shiro.tld"]/>
<link rel="stylesheet" href="${basePath}/platform/css/tree/metroStyle.css" type="text/css">
<script type="text/javascript" src="${basePath}/platform/tree/jquery.ztree.core.min.js"></script>
<script type="text/javascript" src="${basePath}/platform/tree/jquery.ztree.excheck.min.js"></script>
<article class="page-container">
    <form id="formBean" class="form form-horizontal">
        <input type="hidden" id="id" name="id" value="${role.id}" />
        <input type="hidden" id="status" name="status" value="${role.status}" />
        <input type="hidden" id="resourceIds" name="resourceIds" value="" />
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>角色编号：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text radius" required minlength="2" maxlength="16" placeholder="请输入角色编号"  id="roleCode" value="${role.roleCode}" name="roleCode">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>角色名称：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text radius" required minlength="2" maxlength="16" placeholder="请输入角色名称"  id="roleName" value="${role.roleName}" name="roleName">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">上级资源：</label>
            <div class="formControls col-xs-8 col-sm-9" style="border:1px solid #ddd; width: 50%; margin-left: 15px;border-radius:4px;">
                <div id="resourceTree" class="ztree" ></div>
            </div>
        </div>
        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<@shiro.hasPermission name="sys:role:edit:save">
                    <button class="btn btn-primary radius">保存</button>
                </@shiro.hasPermission>
                <button class="btn btn-primary radius">保存</button>
            </div>
        </div>
    </form>
</article>
    <script>
        var roleId = '${role.id}';
		var setting = {
		    async: {
				enable: true,
				url: basePath + "/platform/common/loadResources",
				autoParam:["id=pId", "name", "level"],
				otherParam:{"roleId":roleId,"loadType":"1"},
				dataFilter: null
			},
			check: {
				enable: true,
				chkboxType:{ "Y" : "ps", "N" : "ps" },
				chkStyle:"checkbox"
			},
			data: {
				simpleData: {
					enable: true
				}
			}
		};
	    $(document).ready(function(){
			$.fn.zTree.init($("#resourceTree"), setting);
		});
		
		function getALlCheckedReourceId(){
			var treeObj = $.fn.zTree.getZTreeObj("resourceTree");
			var nodes = treeObj.getCheckedNodes(true);
			var resourceIdArray = [];
			$(nodes).each(function() {
				resourceIdArray.push(this.id);
			});
			return resourceIdArray;
		}

        $("#formBean").validate({
            onkeyup:false,
            focusCleanup:true,
            success:"valid",
            submitHandler:function(form){
                builerParams();
                $(form).ajaxSubmit({
                    type : "POST",
                    url : "${basePath}/platform/role/saveOrUpdate",
                    data : $('#formBean').serialize(),
                    error : function(request) {
                        alert('操作失败');
                    },
                    success : function(data) {
                        alert(data.result.msg);
                        if (data.result.isSuccess) {
                            window.parent.location.reload();
                            var index = parent.layer.getFrameIndex(window.name);
                            parent.layer.close(index);
                        }
                    }
                });
            }
        });

		function builerParams() {
			var resourceIdArray = getALlCheckedReourceId();
			$("#resourceIds").val(JSON.stringify(resourceIdArray));
		}
	</script>
    
    
