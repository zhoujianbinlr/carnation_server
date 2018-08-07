<#include "common/common.ftl">
<#assign shiro=JspTaglibs["/WEB-INF/tlds/shiro.tld"]/>
<link rel="stylesheet" href="${basePath}/platform/css/tree/metroStyle.css" type="text/css">
<script type="text/javascript" src="${basePath}/platform/tree/jquery.ztree.core.min.js"></script>
<script type="text/javascript" src="${basePath}/platform/tree/jquery.ztree.excheck.min.js"></script>
<article class="page-container">
    <form id="formBean" class="form form-horizontal">
        <input type="hidden" id="id" name="id" value="${resource.id}" />
        <input type="hidden" id="status" name="status" value="${resource.status}" />
        <input type="hidden" id="subResourcesJson" name="subResourcesJson" value="" />
        <input type="hidden" id="parentName" name="parentName" value="${resource.parentName}" />
        <input type="hidden" id="hadSub" name="hadSub" value="${resource.hadSub}" />
        <input type="hidden" id="parentId" name="parentId" value="${resource.parentId}" />
        <input type="hidden" id="subCount" name="subCount" value="${subCount}" />
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>资源名称：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text radius" required minlength="2" maxlength="16" placeholder="请输入资源名称"  id="name" value="${resource.name}" name="name">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>资源编码：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text radius" required minlength="2" maxlength="16"  placeholder="请输入资源编码"  id="code" value="${resource.code}" name="code">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">资源图标：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text radius" placeholder="请输入资源图标" id="icon" name="icon"  value="${resource.icon}" style="width: 50%;">&nbsp;&nbsp;&nbsp;&nbsp;<i class='Hui-iconfont ${resource.icon}'></i>
            </div>
        </div>
       <#-- <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">数据实体类：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text radius" placeholder="" id="className" name="className"  value="${resource.className}">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">数据权限字段：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text radius" placeholder="" id="dataAuthorityCode" name="dataAuthorityCode" value="${resource.dataAuthorityCode}">
            </div>
        </div>-->
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">上级资源：</label>
            <div class="formControls col-xs-8 col-sm-9" style="border:1px solid #ddd; width: 50%; margin-left: 15px;border-radius:4px;">
                <div id="resourceTree" class="ztree" ></div>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">资源URL：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text radius" placeholder="" id="value" value="${resource.value}" name="value">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">资源排序号：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="number" class="input-text radius" placeholder="" id="sort" value="${resource.sort}" name="sort">
            </div>
        </div>
       <#-- <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">按钮配置：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <#list subResources as button>
                    <div class="parameter-li"><i class="par-i"></i><input type="hidden" id="buttonId_${button_index}" value="${button.id}"><input type="text" id="buttonCode_${button_index}" style="width:15%;" class="span2" value="${button.code}"/><span>-</span><input type="text" id="buttonName_${button_index}" class="span2" style="width:15%;" value="${button.name}"/><span>-</span><input type="number" step="1" id="buttonSort_${button_index}"  class="span2" style="width:15%;" value="${button.sort}"/><span>-</span><select id="buttonOperation_${button_index}" class="mr10 span2" style="width:15%;"><option value="">选择操作类型</option><option value="1" <#if button.operationType == 1>selected="selected"</#if>>URL重定向</option><option value="2" <#if button.operationType == 2>selected="selected"</#if>>JS调转</option></select><span>-</span><input type="text" id="buttonUrl_${button_index}" class="span3" style="width:20%;" value="${button.value}"/><a href="#" class="parameter-delete" onclick="delButton(this);">删掉</a></div>
				</#list>
            </div>
            <a class="add-cat add-cat-con" href="#"><span onclick="addButton();"><em>添加按钮</em></span></a>
            </div>
        </div>-->

        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<@shiro.hasPermission name="sys:resource:edit:save">
          			<button class="btn btn-primary radius">&nbsp;&nbsp;保存&nbsp;&nbsp;</button>
				</@shiro.hasPermission>
       			<#--<@shiro.hasPermission name="sys:resource:edit:cancel">
          			<button class="btn btn-primary radius" onClick="openUrl('/platform/resource/list')">取消</button>
				</@shiro.hasPermission>-->
            </div>
        </div>
	</form>
</article>
<script type="text/javascript" src="${basePath}/hui/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="${basePath}/hui/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="${basePath}/hui/lib/jquery.validation/1.14.0/messages_zh.js"></script>

	<script type="text/javascript">
	var i = $("#subCount").val();
	var g = $("#subCount").val();
	
	var resourceId = '${resource.id}';
	var setting = {
            async: {
                enable: true,
                url: basePath + "/platform/common/loadMenuResources",
                otherParam:{"resourceId":resourceId},
                dataFilter: null
            },
            check: {
                enable: true,
                chkStyle:"radio",
                radioType: "all"
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
	//添加角色
	function addButton() {
		var html = '';
		html += '<div class="parameter-li">';
		html += '<i class="par-i"></i>';
		html += '<input type="text" class="span2" style="width:15%;" id="buttonCode_'
				+ i
				+ '" placeholder="按钮编号"/><span>-</span><input type="text" class="span2" style="width:15%;" id="buttonName_'
				+ i
				+ '" placeholder="按钮名称"/><span>-</span><input type="number" step="1" id="buttonSort_'
				+ i
				+ '" class="span2" style="width:15%;" placeholder="按钮排序"/><span>-</span><select id="buttonOperation_'
				+ i
				+ '" class="mr10 span2" style="width:15%;"><option value="">选择操作类型</option><option value="1">URL重定向</option><option value="2">JS调转</option></select><span>-</span><input type="text" id="buttonUrl_'
				+ i + '" class="span3" style="width:20%;" placeholder="按钮URL"/>';
		html += '<a href="#" class="parameter-delete" onclick="delButton(this);" style="right:3px;">删掉</a>';
		html += '</div>';
		$('.button-parameter').append(html);
		i++;
		g++;
	}

	//删除角色
	function delButton(obj) {
		$(obj).parents('.parameter-li').remove();
		g--;
	}

    $("#formBean").validate({
        onkeyup:false,
        focusCleanup:true,
        success:"valid",
        submitHandler:function(form){
            builerParams();
            $(form).ajaxSubmit({
                type : "POST",
                url : "${basePath}/platform/resource/saveOrUpdate",
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
		var subResources = [];
		for (var j = 0; j < i; j++) {
			var resource = new Object();
			var buttonId = $('#buttonId_' + j).val();
			if (buttonId == '' || typeof (buttonId) == "undefined") {
				buttonId = "";
			}
			resource.id = buttonId;
			var buttonCode = $('#buttonCode_' + j).val();
			if (buttonCode == '' || typeof (buttonCode) == "undefined") {
				continue;
			}
			resource.code = buttonCode;
			resource.name = $('#buttonName_' + j).val();
			resource.value = $('#buttonUrl_' + j).val();
			resource.sort = $('#buttonSort_' + j).val();
			resource.operationType = $('#buttonOperation_' + j).val();
			subResources.push(resource);
		}
		if(subResources.length > 0){
			$("hadSub").val(1);
		}
		$("#subResourcesJson").val(JSON.stringify(subResources));
		var treeObj = $.fn.zTree.getZTreeObj("resourceTree");
        var nodes = treeObj.getCheckedNodes(true);
         if(nodes.length>0){
         	$("#parentId").val(nodes[0].id);
			$("#parentName").val(nodes[0].name);
         } else{
         	$("#parentId").val("");
			$("#parentName").val("");
         }
         /*var dataJson = $('#formBean').serializeArray();
         console.log(JSON.stringify(dataJson))*/
	}
	</script>