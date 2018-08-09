<#include "common/common.ftl">
<#assign shiro=JspTaglibs["/WEB-INF/tlds/shiro.tld"]/>
<html>
<head>
    <meta name="mobile-agent" content="format=html5">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <title>首页</title>
</head>
<body>
<header class="navbar-wrapper">
    <div class="navbar navbar-fixed-top">
        <div class="container-fluid cl">
            <a class="logo navbar-logo f-l mr-10 hidden-xs" href="javascrpt:window.location.reload(true);">康乃馨APP管理后台</a>
           <#-- <a class="logo navbar-logo f-l mr-10 hidden-xs" href="/aboutHui.shtml">H-ui.admin</a>
            <a class="logo navbar-logo-m f-l mr-10 visible-xs" href="/aboutHui.shtml"> H-ui</a>
            <span class="logo navbar-slogan f-l mr-10 hidden-xs">v3.1</span>
            <a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>-->

           <#-- <nav class="nav navbar-nav">
                <ul class="cl">
                    <li class="dropDown dropDown_hover"><a href="javascript:;" class="dropDown_A"><i class="Hui-iconfont">&#xe600;</i> 新增 <i class="Hui-iconfont">&#xe6d5;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" onclick="article_add('添加资讯','article-add.html')"><i class="Hui-iconfont">&#xe616;</i> 资讯</a></li>
                            <li><a href="javascript:;" onclick="picture_add('添加资讯','picture-add.html')"><i class="Hui-iconfont">&#xe613;</i> 图片</a></li>
                            <li><a href="javascript:;" onclick="product_add('添加资讯','product-add.html')"><i class="Hui-iconfont">&#xe620;</i> 产品</a></li>
                            <li><a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')"><i class="Hui-iconfont">&#xe60d;</i> 用户</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>-->
            <nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
                <ul class="cl">
                    <li>${user.name}</li>
                    <li class="dropDown dropDown_hover">
                        <a href="#" class="dropDown_A">${user.account} <i class="Hui-iconfont">&#xe6d5;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <#--<li><a href="javascript:;" onClick="myselfinfo()">个人信息</a></li>-->
                            <li><a href="${basePath}/cs_toLogin">切换账户</a></li>
                            <li><a href="${basePath}/cs_toLogin">退出</a></li>
                        </ul>
                    </li>
                    <#--<li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>-->
                    <li id="Hui-skin" class="dropDown right dropDown_hover"> <a href="javascript:;" class="dropDown_A" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
                            <li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
                            <li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
                            <li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
                            <li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
                            <li><a href="javascript:;" data-val="orange" title="橙色">橙色</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</header>
<aside class="Hui-aside">
    <div class="menu_dropdown bk_2">
        <#list menuList as resource>
            <@shiro.hasPermission name="${resource.code}">
                <dl id="menu-article">
                    <dt onclick="childMenu(this,'${resource.id}')"><i class="Hui-iconfont ${resource.icon}"></i> ${resource.name}<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
                    <dd id="menu_${resource.id}"></dd>
                </dl>
            </@shiro.hasPermission>
        </#list>
    </div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
    <div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
        <div class="Hui-tabNav-wp">
            <ul id="min_title_list" class="acrossTab cl">
                <li class="active">
                    <span title="我的桌面" data-href="welcome.html">我的桌面</span>
                    <em></em></li>
            </ul>
        </div>
        <div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
    </div>
    <div id="iframe_box" class="Hui-article">
        <div class="show_iframe">
            <div style="display:none" class="loading"></div>
            <iframe scrolling="yes" frameborder="0" src="${basePath}/welcome"></iframe>
        </div>
    </div>
</section>

<div class="contextMenu" id="Huiadminmenu">
    <ul>
        <li id="closethis">关闭当前 </li>
        <li id="closeall">关闭全部 </li>
    </ul>
</div>
</body>
</html>
<script type="text/javascript">
    function childMenu(obj,id){
        if(!$(obj).hasClass("selected")) {
            $.ajax({
                url: '${basePath}/platform/resource/findMenuListByParentId',
                data:'resourceId='+id,
                type: 'POST',
                success: function (data) {
                   /* var html = "";
                    if(data.length > 0){
                        html += "<ul>";
                        for (var i = 0; i < data.length; i++){
                           /!* <shiro.hasPermission name=\"" + data[i].code + "\">*!/
                                html += "<li id='menu_"+data[i].id+"'><a data-href='"+basePath+data[i].value+"' data-title='"+data[i].name+"' href='javascript:;'><i class='Hui-iconfont " + data[i].icon + "'></i> "+data[i].name+"</a></li>";
                            /!*</shiro.hasPermission>*!/
                        }
                        html += "</ul>";*/
                        //console.log(data);
                        $("#menu_" + id).html(data);
                   // }
                }
            });
        }
    }
</script>
