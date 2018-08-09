<#assign shiro=JspTaglibs["/WEB-INF/tlds/shiro.tld"]/>
<ul>
 <#list childMenuList as childMenus>
       <@shiro.hasPermission name="${childMenus.code}"> 
        <#--  <li id='${childMenus.id}'><a href='#' onclick="openMenu('${childMenus.id}','${childMenus.value}')">${childMenus.name}</a></li>-->
            <li id='menu_${childMenus.id}'><a data-href='${basePath}${childMenus.value}' data-title='${childMenus.name}' href='javascript:;'><i class='Hui-iconfont ${childMenus.icon}'></i>${childMenus.name}</a></li>
       </@shiro.hasPermission>
 </#list>
</ul>