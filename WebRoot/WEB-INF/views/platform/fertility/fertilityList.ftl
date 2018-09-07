<#include "common/common.ftl">
<#assign shiro=JspTaglibs["/WEB-INF/tlds/shiro.tld"]/>
<nav class="breadcrumb">
    生殖中心列表
    <a class="btn btn-primary radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" >
        <i class="Hui-iconfont">&#xe68f;</i>
    </a>
</nav>
<div class="page-container">
    <div class="text-c">
        <input type="text" name="searchValue" id="searchValue" placeholder="资源名称" style="width:250px" class="input-text">
        <button name="" id="" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
    </div>
    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <@shiro.hasPermission name="fertility:list:create">
                <a href="javascript:toAdd();" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i>新增</a>
            </@shiro.hasPermission>
            <@shiro.hasPermission name="fertility:list:update">
                <a href="javascript:toEdit();" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe60c;</i>修改</a>
            </@shiro.hasPermission>
            <@shiro.hasPermission name="fertility:list:delete">
                <a href="javascript:toDelete();" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe6e2;</i>删除</a>
            </@shiro.hasPermission>
        </span>
    </div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-bg table-hover table-sort table-responsive radius table-striped">
            <thead>
                <tr class="text-c">
                    <th width="25"><input id="checkAll" onclick="selectAll()" type="checkbox"></th>
                    <th width="50">序号</th>
                    <th>名称</th>
                    <th>简称</th>
                    <th>编码</th>
                    <th width="100">类型</th>
                    <th>等级</th>
                    <th width="100">联系人</th>
                    <th width="100">状态</th>
                </tr>
            </thead>
            <tbody id="tbody_data"></tbody>
        </table>
    </div>
</div>
<script type="text/javascript" src="${basePath}/platform/js/fertility/fertility.js"></script>
<script type="text/javascript" src="${basePath}/hui/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${basePath}/hui/lib/laypage/1.2/laypage.js"></script>