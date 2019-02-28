<%@ page language="java" import="java.util.*,
                                com.mstf.bean.User"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<%
	User user = (User) request.getSession().getAttribute("userL");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>修改<%user.getUsername(); %>信息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


</head>

<body>
	<br>
	<br>
	<br>
	<h3 align="center">
		请修改信息：
		<h3>
			<hr>
			<form action="user_update.action" method="post">
				<table align="center">
					<s:hidden name="id" />
					<br>
					<tr>
						<td>name:</td>
						<td><input value="<%=user.getUsername()%>"></td>
					</tr>
					<br>
					<tr>
						<td>password:</td>
						<td><input value="<%=user.getPassword()%>"></td>
					</tr>
					<br>
					<tr>
						<td>age:</td>
						<td><input value="<%=user.getAge()%>"></td>
					</tr>
					<br>
					<tr>
						<td><input type="submit" value="提交"></td>
					</tr>
					</form>
				</table>
</body>
</html>
