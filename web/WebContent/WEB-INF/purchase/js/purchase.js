function selectSuppliers(){
	var hidden_donework = document.getElementById("hidden_donework");
	if(hidden_donework.value == 'y'){
		alert("流程已经结束，不能更改供应商");
		return;		
	}
	
    var supplierName = $("#supplierName").val();
    var supplierId = $("#supplierId").val();
    var projectId = $("#projectId").val();
    
    var openURI = encodeURI()
    
    var w = screen.availWidth;
    var h = screen.availHeight;
    	
	open_windows(openURL,w,h,"_blank");            //_blank 新打开窗口
	
}