package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class DemandService {
	public static String permissionSearch(String operation, String submitCode, String user, String pageSize,
			String currPage) throws Exception {
		String result = "-1";
		HttpClient httpClient = new HttpClient();
		PostMethod postMethod = new PostMethod();

		NameValuePair[] data = { new NameValuePair("operation", operation), new NameValuePair("submitCode", submitCode),
				new NameValuePair("user", user), new NameValuePair("pageSize", pageSize),
				new NameValuePair("currentPage", currPage), // eclipse中选中一个单词的快捷键：ctrl+shift+左右箭头键。
																// eclipse复制一行到上下：ctrl+alt+上下箭头键。
		};
		postMethod.setRequestBody(data);
        httpClient.executeMethod(postMethod);
        
        result = postMethod.getResponseBodyAsString();
        postMethod.releaseConnection();
		
		return result;

	}
	
	public String doPost(String url, Map<String,String> map, String charset){
	    CloseableHttpClient httpClient = null;
	    HttpPost httpPost = null;
	    String result = null;
	    try{
	        httpClient = HttpClients.createDefault();
	        httpPost = new HttpPost(url);
	        //设置参数
	        List<NameValuePair> list = new ArrayList<NameValuePair>();
	        Iterator iterator = map.entrySet().iterator();
	        while(iterator.hasNext()){
	            Map.Entry<String,String> elem = (Map.Entry<String, String>) iterator.next();
	            list.add(new BasicNameValuePair(elem.getKey(),elem.getValue()));
	        }
	        if(list.size() > 0){
	            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list,charset);
	            httpPost.setEntity(entity);
	        }
	        HttpResponse response = httpClient.execute(httpPost);
	        if(response != null){
	            HttpEntity resEntity = response.getEntity();
	            if(resEntity != null){
	                result = EntityUtils.toString(resEntity,charset);
	            }
	        }
	    }catch(Exception ex){
	        ex.printStackTrace();
	    }
	    return result;
	}

}
