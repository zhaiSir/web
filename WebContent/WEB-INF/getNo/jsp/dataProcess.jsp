
<%@page import="test.DemandService"%>
<%
	String result = "";
	String operatetion = request.getParameter("operateType");

	if ("newsNo".equals(operatetion)) {
		result = getnewsNo(request);
	} else if ("getDemand".equals(operatetion)) {
		result = getDemand(request);
	}

	out.clear();
	out.print(result);
%>

<%!public String getnewsNo(HttpServletRequest request) throws Exception {
		String newsYear = request.getParameter(request, "newYear");
		String sql = "select * from GA_NEWSISSUANCE where newsNo like '" + newsYear + "%' order by newsNo desc";
		// String sql = "insert into student values ( " + student.getId() + " ,' " + student.getUsername() + " ',  " + student.getAge() + " ,' " + student.getClassnumber()+" ')";
		String datasourceId = "workflow_data";
		//jdbcOperation
		WFHDBCOperation jdbcOperation = WFSessionImpl.getTDBCOperation(datasourceId);
		DBResult getNewsNo = jdbcOperation.getResultSet(sql);

		String num = "-1";
		List<String> newsNolist = new ArrayList<String>();
		while (getNewsNo.next()) {
			num = getNewsNO.getString("newsNo");
			newsNolist.add(num);
		}

		if (newsNoList.size() > 0) {
			num = newsNoList.get(0);
			num = num.substring(4, 8);
			num = String.valueOf(Integer.parseInt(num) + 1);//等价于  num = Integer.parseInt(num)+1+"";

		}

		return num;

	}

	public String getDemand(HttpServletRequest request) throws Exception {
		String operation = request.getParameter("operation");
		String submitCode = request.getParameter("submitCode");
		String user = request.getParameter("user");
		String pageSize = request.getParameter("pageSize");
		String currPage = request.getParameter("currPage");
		String result = DemandService.permissionSearch(operation, submitCode, user, pageSize, currPage);
		return result;
	}%>