<#assign oscache=JspTaglibs["/WEB-INF/tlds/oscache.tld"]/>
<@oscache.cache  time=0  scope="application"></@oscache.cache>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="renderer" content="webkit"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <link href="${basePath}/hui/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}/hui/h-ui.admin/css/style.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}/hui/lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}/hui/h-ui.admin/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
    <link href="${basePath}/hui/h-ui.admin/skin/default/skin.css" id="skin" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${basePath}/hui/lib/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="${basePath}/hui/h-ui/js/H-ui.min.js"></script>

    <script type="text/javascript" src="${basePath}/hui/lib/layer/2.4/layer.js"></script>
    <script type="text/javascript" src="${basePath}/hui/h-ui.admin/js/H-ui.admin.js"></script>
    <script type="text/javascript">
        var ip = '${hostIP}';
        var basePath = '${basePath}';
        var currentuser = {
            userId: '${platformUser.name}',
            account: '${platformUser.account}',
            name: '${platformUser.name}'
        }
    </script>