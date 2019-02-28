function getNo(newsYear,newsNo){
	var params = {operateType:"newNo",newsYear:newsYear}
	$.post(url,params,function(data){
		$("#No").val(data);
	})
}

//url = "/gcbase/app/news/jsp/dataProces.jsp"          (内容在CreateNo..java)