<%@page import="net.sf.json.JSONArray"%>
<%@ page language="java" import="java.util.*,
                                 net.sf.json.JSONObject" pageEncoding="UTF-8"%>
<% 
    String method = request.getParameter("method");
    JSONObject object = new JSONObject();
    
    JSONObject object1 = new JSONObject();
    JSONObject object2 = new JSONObject();
    JSONArray arr = new JSONArray();
    
    for(int i=0;i<5;i++){
    
    object1.put("title","帝京篇十首 一"+i);
    object1.put("content","秦川雄帝宅，函谷壮皇居。|绮殿千寻起，离宫百雉余。|连甍遥接汉，飞观迥凌虚。|云日隐层阙，风烟出绮疏。"+i);
    object1.put("authors","太宗皇帝"+i);
    object1.put("title","帝京篇十首 一"+"copys");  //json对象不放重复的键，会覆盖原始值
    
    arr.add(object1);                       //json数组添加
    
    }
    object.put("code","200");
    object.put("success","成功");            //json对象添加
    
    object.put("result",arr);               //json数组添加
    out.print(object);
%>