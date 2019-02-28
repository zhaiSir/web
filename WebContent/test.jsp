<%@ page contentType="text/html;charset=UTF-8" %>

<%@page import="org.apache.commons.httpclient.Header"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.apache.commons.httpclient.NameValuePair"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="org.apache.commons.httpclient.methods.GetMethod"%>
<%@page import="java.io.InputStream"%>
<%@page import="org.apache.commons.httpclient.HttpStatus"%>
<%@page import="org.apache.commons.httpclient.methods.PostMethod"%>
<%@page import="org.apache.commons.httpclient.HttpClient"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<% 
    System.out.println("进入");
    String result;
    result = dopost();
    out.clear();
    out.print(result);
    
%>

<%! 
    public static String dopost(){
	/* String count="1";
    String page="1"; */
	String result = "-1";
	String url = "https://api.apiopen.top/getTangPoetry";
	HttpClient httpclient = new HttpClient();
	/* String params ="page="+page+"&count="+count;
	url = url+"?"+params;	 */	
    PostMethod postMethod = new PostMethod(url);
	postMethod.addRequestHeader("Authorization", "AUTH的值");
	postMethod.addRequestHeader("Content-Type","application/x-www-form-urlencoded");
	
	Header[] heads = postMethod.getRequestHeaders();
	for(Header h : heads){
		System.out.print(h.getName()+":");
		System.out.println(h.getValue());
	}
	
    NameValuePair[] data = {new NameValuePair("page","1"),
                            new NameValuePair("count","100") 
}; 
	postMethod.setRequestBody(data);
	
	try {
		int statusCode = httpclient.executeMethod(postMethod);
		if(statusCode != HttpStatus.SC_OK){
			System.out.println("Method failed："+statusCode);
		}
        InputStream inputStream = postMethod.getResponseBodyAsStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
        
        StringBuffer sb = new StringBuffer();
        String str = "";
        while((str=br.readLine()) != null){
        	sb.append(str);
        }
        result = sb.toString();
        System.out.println(result);
        System.out.println(postMethod.getResponseCharSet());
        return result;
	}catch(Exception e){
		e.printStackTrace();
	}finally {
		postMethod.releaseConnection();
	}
	return null;
}
%>
