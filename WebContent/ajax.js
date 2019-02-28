/*$("input[name='checkall']").click(function() {
	if (this.checked) {
		$("input:checkbox").attr("checked", true);
	} else {
		$("input:checkbox").attr("checked", false);

	}
})
*/

function ajaxTest() {
    var i = $("#i").val();
	var params = {};
	params['operation'] = 'Search';
	$.ajax({
		async : false,
		type : "post",
		url : "test.jsp",
		dataType : 'json',
		success : function(data) {
			var result = data.result;
			var j = data.result.length;
			if(isNaN(i)||i==0){                                      // isNaN()判断是否是数字
				alert("要输入比0大的数字才可以哦!")
				$("#data").val("");
				$("#shi").val("");
				$("#biaoti").val("");
				$("#auth").val("");
			}else{
			if(i<=j){
			var data2 = JSON.stringify(data.result[i-1]);
			var biaoti = JSON.stringify(data.result[i-1].title);     //json对象转字符串
			var auth = JSON.stringify(data.result[i-1].authors);
			var shi = JSON.stringify(data.result[i-1].content);
			$("#data").val("总共"+j+"首诗，这是第"+i+"首：\n"+data2);    //  \反斜杆  \n换行      \\n  转义表示输出\n而不是换行
			$("#shi").val(shi);
			$("#biaoti").val(biaoti);
			$("#auth").val(auth);
			}else{
				$("#data").val("");
				$("#shi").val("");
				$("#biaoti").val("");
				$("#auth").val("");
				alert("没有那么多诗了，总共"+j+"首哦！");
			}
		}
		},
		error : function(xhr, error, errorType) {
			alert("xhr：" + xhr + "error:" + error + "errorType:" + errorType);
		}
	});

}

/*function alertTest() {

	$('#dialog').dialog({
				modal : true,
				draggable : true,
				id : 'frontIframe',
				title : "对象",
				width : 550,
				height : 370,
				open: function() {
				    $(this).parent().focus();  //重点语句
				},
				buttons : {
	                "ok" : {
	                    text : '保存',
	                    'class' : 'button button-minor',
	                    click : function() {              
	                    }
	                },
	                "cancel" : {
	                    text : '取消',
	                    'class' : 'button button-cancel',
	                    click : function() {
	                    }
	                }
	            }
			});

}*/