<%@ page language="java"
	import="java.util.*,
            com.mstf.bean.User,
            com.mstf.service.impl.UserServiceImpl,
            javax.servlet.http.HttpServletRequest"
	pageEncoding="UTF-8"%>
<%
	List<User> userlist = (List<User>) request.getSession().getAttribute("userlist");
%>


<html>
<head>
<title>用户管理</title>

<script src="./jq/jquery-1.7.2.js"></script>
<script>
	function selectall() {
		if ($("#selectAll").attr("checked")) {
			$(".checkone").attr("checked",true);
		} else {
			$(".checkone").removeAttr("checked");
		}
	}
</script>
</head>

<body>
	<table width="50%" align="center" border="1" bordercolordark="#FFFFFFF"
		bordercolorlight="#cccccc">
		<tr>
			<td><input type="checkBox" class="ckBtn" id="selectAll" onclick="selectall()"/></td>
			<td nowrap="nowrap" align="center">用户名</td>
			<td nowrap="nowrap" align="center">密码</td>
			<td nowrap="nowrap" align="center">地址</td>
			<td nowrap="nowrap" align="center">操作</td>
		</tr>
		<%
			if (userlist != null && userlist.size() > 0) {
				String username = "";
				String password = "";
				Integer id;
				Integer age;
				for (int i = 0; i < userlist.size(); i++) {
					User user = userlist.get(i);
					id = user.getUser_id();
					username = user.getUsername();
					password = user.getPassword();
					age = user.getAge();
		%>

		<tr>
			<td><input type="checkBox" class="checkone" name="checkone" /></td>
			<td nowrap="nowrap" align="center"><%=id%></td>
			<td nowrap="nowrap" align="center"><%=username%></td>
			<td nowrap="nowrap" align="center"><%=password%></td>
			<td nowrap="nowrap" align="center"><%=age%></td>
			<td nowrap="nowrap" align="center"><a href="user_editUi.action?user_id=<%=id%>">修改</a></td>
		</tr>

		<%
			}
			}
		%>


	</table>
</body>
</html>
