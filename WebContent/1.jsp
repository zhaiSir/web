<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<script src="jquery-1.7.2.js"></script>
<!-- <script src="jquery.ui.dialog.js"></script>
<script src="jquery-ui-1.7.2.custom.min.js"></script> -->
<script type="text/javascript" src="ajax.js"></script>

</head>
<body>

<div id="login">
获取第<input id="i" size="2"></input>首诗
 <button onClick="ajaxTest()">开始</button>
 <textarea  type="textarea" id="data" rows="5" cols="70" placeholder="返回数据"></textarea ></br>
 <input id="biaoti" placeholder="标题"></input></br>
 <input id="auth" placeholder="作者"></input>
 <textarea  type="textarea" id="shi" rows="3" cols="70" placeholder="一首诗"></textarea ></br>
 <button onClick="alertTest()">弹窗测试</button>
</div>


<div id="caidan" title="彩蛋" >  <!-- hidden="hidden" -->
            <table style="border:0px solid red;width:250px">
                <tr>
                    <td>序号</td>
                    <td>姓名</td>
                    <td>年龄</td>
                    <td>性别</td>
                </tr>
                <tr>
                    <td>1</td>
                    <td>李易峰</td>
                    <td>24</td>
                    <td>男</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>杨洋</td>
                    <td>25</td>
                    <td>男</td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>赵雅芝</td>
                    <td>50</td>
                    <td>女</td>
                </tr>
                <tr>
                    <td>4</td>
                    <td>何洁</td>
                    <td>30</td>
                    <td>女</td>
                </tr>
            </table>
        </div>

</body>
</html>