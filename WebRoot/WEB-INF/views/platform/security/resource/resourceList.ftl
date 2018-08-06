<#include "common/common.ftl">
<#assign shiro=JspTaglibs["/WEB-INF/tlds/shiro.tld"]/>
<nav class="breadcrumb">
    资源列表
    <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" >
        <i class="Hui-iconfont">&#xe68f;</i>
    </a>
</nav>
<div class="page-container">
    <div class="text-c">
        <input type="text" name="searchValue" id="searchValue" placeholder="资源名称" style="width:250px" class="input-text">
        <button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
    </div>
    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <@shiro.hasPermission name="sys:resource:list:create">
                <a href="javascript:toAdd();" class="btn btn-primary   radius"><i class="Hui-iconfont">&#xe600;</i>新增资源</a>
            </@shiro.hasPermission>
            <@shiro.hasPermission name="sys:resource:list:update">
                <a href="javascript:toEdit();" class="btn btn-primary   radius"><i class="Hui-iconfont">&#xe60c;</i>修改资源</a>
            </@shiro.hasPermission>
            <@shiro.hasPermission name="sys:resource:list:delete">
                <a href="javascript:toDelete();" class="btn btn-primary   radius"><i class="Hui-iconfont">&#xe6e2;</i>删除资源</a>
            </@shiro.hasPermission>
        </span>
    </div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-bg table-hover table-sort table-responsive radius table-striped">
            <thead>
                <tr class="text-c">
                    <th width="25"><input id="checkAll" onclick="selectAll()" type="checkbox"></th>
                    <th width="100">序号</th>
                    <th width="100">资源编号</th>
                    <th>资源名称</th>
                    <th>资源操作值</th>
                    <th>父资源</th>
                    <th width="100">资源类型</th>
                    <th width="100">操作类型</th>
                </tr>
            </thead>
            <tbody id="tbody_data">
                <tr class="text-c">
                    <td><input type="checkbox" value="" name=""></td>
                    <td>10001</td>
                    <td class="text-l"><u style="cursor:pointer" class="text-primary" onClick="article_edit('查看','article-zhang.html','10001')" title="查看">资讯标题</u></td>
                    <td>行业动态</td>
                    <td>H-ui</td>
                    <td>2014-6-11 11:11:42</td>
                    <td class="td-status"><span class="label label-success radius">已发布</span></td>
                    <#--<td class="f-14 td-manage"><a style="text-decoration:none" onClick="article_stop(this,'10001')" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_edit('资讯编辑','article-add.html','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>-->
                </tr>
            </tbody>
        </table>
    </div>
</div>
<script type="text/javascript" src="${basePath}/platform/js/security/resource/resource.js"></script>
<script type="text/javascript" src="${basePath}/hui/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${basePath}/hui/lib/laypage/1.2/laypage.js"></script>