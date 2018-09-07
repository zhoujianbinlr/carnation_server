$(function() {
	search();
	
	//hasButtonAuth();
});

/**
 * 搜索
 */

$("#search").click(function(){
	search(); 
});  

function search(){
	var searchValue = $("#searchValue").val();
    $.ajax({
        url: basePath + "/platform/fertility/findListByPage",
        success: function(data){
            var tbody = $("#tbody_data");
            var html="";
            // 清空
            tbody.empty();
            $(data.list).each(function(i, n) {
                html+='<tr class=\"text-c\">';
                html+='<td>' + "<input type='checkbox' name='check' value='"+n.id+"'>" + "</td>";
                html+='<td>' + (i+1) + "</td>";
                html+='<td>' + n.name + "</td>";
                html+='<td>' + n.shortName + "</td>";
                html+='<td>' + n.type + "</td>";
                html+='<td>' + n.level + "</td>";
                html+='<td>' + n.linkMan + "</td>";
                html+='<td>' + n.status + "</td>";
                html+='</tr>';
            });
            tbody.append(html);
        }
    });
}

function toDelete(){

	var i = 0;
    var ids = ""; 
    $("input[name='check']:checked").each(function(){
       ids+=$(this).val()+",";
       i++;
    })
    if(i == 0){
      alert("请选择选择一条记录");
      return;
    }
    ids = ids.substring(0,ids.length-1);
	if(confirm("删除该资源,将删除该资源下的所有子资源以及资源与角色的关系,是否确定删除")){
		$.ajax({
			url : basePath + "/platform/resource/toDelete",
			data: {id:ids},
	        type: 'POST',
	        error: function(request) {
                alert("操作失败");
	    },success: function (data) {
	            alert(data.message);
                window.parent.location.reload();
	        }
	    });
	 }
	
}

function toAdd(){
	/*$.ajax({
		url : basePath + "/platform/resource/toAdd",
        type: 'POST',
        error: function(request) {
        alert("操作失败");
    }, success: function (data) {
            console.log(data);
           $("#content").html(data);
        }
    });*/
	var url = basePath + "/platform/fertility/toEdit";
	var title = "资源增加";
	var index = layer.open({
        type:2,
        title:title,
        content:url
	});
	layer.full(index);
    /*layer_show(title,url,null,500);*/
}

function toEdit(){
	   var i = 0;
       var ids = ""; 
       $("input[name='check']:checked").each(function(){
          ids+=$(this).val()+",";
          i++;
       })
       if(i>1){
         alert("只能选择一条记录");
         return;
       }
       if(i == 0){
         alert("请选择选择一条记录");
         return;
       }
       ids=ids.substring(0,ids.length-1);
       /*$.ajax({
     	 url: tradeBasePath + "/platform/resource/toEdit?id="+ids,
         type: 'POST',
         error: function(request) {
            alert("操作失败");
         },
         success: function (data) {
              $("#content").html(data);
         }
     });*/

    var url = basePath + "/platform/resource/fertility?id="+ids;
    var title = "资源更新";
    var index = layer.open({
        type:2,
        title:title,
        content:url
    });
    layer.full(index);
}
