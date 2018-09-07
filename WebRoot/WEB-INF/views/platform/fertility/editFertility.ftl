<#include "common/common.ftl">
<#include "common/validationCommon.ftl">
<#assign shiro=JspTaglibs["/WEB-INF/tlds/shiro.tld"]/>
<article class="page-container">
    <form id="formBean" class="form form-horizontal">
        <input type="hidden" id="id" name="id" value="${fertility.id}"/>
        <input type="hidden" id="status" name="status" value="${fertility.status}"/>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>生殖中心名称：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text radius" required minlength="2" maxlength="16"
                       placeholder="请输入生殖中心名称" id="name" value="${fertility.name}" name="name">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>生殖中心简称：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text radius" required minlength="2" maxlength="16"
                       placeholder="请输入生殖中心简称" id="code" value="${fertility.shortName}" name="shortName">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">生殖中心类型：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <span class="select-box radius">
                    <select class="select " size="1" name="type">
                        <option value="" selected>请选择生殖中心类型</option>
                        <option value="1">类型1</option>
                        <option value="2">类型2</option>
                        <option value="3">类型3</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">生殖中心等级：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <span class="select-box radius">
                    <select class="select " size="1" name="type">
                        <option value="" selected>请选择生殖中心等级</option>
                        <option value="1">三级甲等</option>
                        <option value="2">二级甲等</option>
                        <option value="3">一级甲等</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">联系人：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text radius" placeholder="" id="linkMan" value="${fertility.linkMan}"
                       name="linkMan">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">联系人电话：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text radius" placeholder="" id="linkPhone"
                       value="${fertility.linkPhone}" name="linkPhone">
            </div>
        </div>

        <div class="row cl pd-5 bg-1 bk-gray mt-20">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<@shiro.hasPermission name="fertility:edit:save">
          			<button class="btn btn-primary radius">&nbsp;&nbsp;保存&nbsp;&nbsp;</button>
                </@shiro.hasPermission>
            <#--<@shiro.hasPermission name="sys:resource:edit:cancel">
               <button class="btn btn-primary radius" onClick="openUrl('/platform/resource/list')">取消</button>
         </@shiro.hasPermission>-->
            </div>
        </div>
    </form>
</article>


	<script type="text/javascript">
        $("#formBean").validate({
            onkeyup: false,
            focusCleanup: true,
            success: "valid",
            submitHandler: function (form) {
                $(form).ajaxSubmit({
                    type: "POST",
                    url: "${basePath}/platform/fertility/saveOrUpdate",
                    data: $('#formBean').serialize(),
                    error: function (request) {
                        alert('操作失败');
                    },
                    success: function (data) {
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
    </script>