<html>
<head>
<script language="javascript">
	function getDemandStatus(currentPge) {
		totalCount = 1;
		codeStr = "";
		var params = {};
		params['operation'] = "getDemands";
		params['submitCode'] = "";
		params['user'] = "";
		params['pageSize'] = "";
		params['currPage'] = "";
		$.ajax({
			type : 'post',
			data : params,
			url : "dataPrecess.jsp",
			async : false,
			dataType : 'text',
			success : function(data) {

			},
			error : function() {

			}

		});

	}
</script>
<body>
</body>
</head>
</html>

