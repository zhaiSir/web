package test;

public class Genner {

	public static void main(String[] args) {
	
		makeCode();
		
	}

	public static void makeCode() {
		String intCode = "";
		byte codeLength = 6;
		for (int i = 0; i < codeLength; i++) {
			intCode = intCode + (int)(Math.random()*10);
		}
		System.out.println("生成6位验证码:"+intCode);
	}

}
