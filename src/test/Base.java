package test;

import java.net.URLEncoder;

import org.apache.commons.codec.digest.DigestUtils;


public class Base {

	public static void main(String[] args) {
		String secret = "6842d64ec97666cad19b9e59beacb1be90e788d8";
		String key = "api@test.eyou.net";
		String email = "test@test.eyou.net";
		String authorization = getAuth(secret,email,key);
		System.out.println(authorization);
	}

	@SuppressWarnings("deprecation")
	private static String getAuth(String secret,String email,String key) {
	    StringBuffer auth = new StringBuffer();
	    auth.append("auth_key="+"\""+URLEncoder.encode(email)+"\""+",");
	    auth.append("auth_timestamp="+"\""+URLEncoder.encode(getTimestamp())+"\""+",");
	    auth.append("auth_signature="+"\""+URLEncoder.encode(getSignature(secret,key))+"\"");
	    
	    return auth.toString();
		
	}
	
	private static String getTimestamp() {
		long time = System.currentTimeMillis();
		time /= 1000L;
		return String.valueOf(time);
	}
	
	private static String getSignature(String secret,String key) {
		StringBuffer signature =  new StringBuffer();
		signature.append(secret);
		signature.append(key);
		signature.append(getTimestamp());
		return DigestUtils.md5Hex(signature.toString());
	}

}
