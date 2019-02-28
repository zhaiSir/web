package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maptest {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "haha");
		map.put("2", "lala");
		map.put("3", "fafa");

		// 1.最常用的map遍历方法
		for (String k : map.keySet()) {
			System.out.println("key=" + k + " and value=" + map.get(k));
		}

		// 2.通过Map.entrySet使用iterator遍历key和value：
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println("key=" + entry.getKey() + "  value=" + entry.getValue());
		}

		// 3.推荐，尤其是容量大时
		for (Map.Entry<String, String> m : map.entrySet()) {
			System.out.println(m.getKey() + "=" + m.getValue());
		}

		// 通过Map.values()遍历所有的value，但不能遍历key
		for (String v : map.values()) {
			System.out.println("value=" + v);
		}
		// Maptest.contains();
		// Maptest.outCopy();
		// Maptest.split();
		mapAndList();
	}

	public static void contains() { // 数组contains的用法
		String result = "";
		ArrayList<String> ids = new ArrayList<String>();
		ids.add("123");
		ids.add("2324");
		ids.add("5555");
		for (String s : ids) {
			if (ids.contains(s)) {
				result += s + ";";
			}
		}
		if (result != "") {
			result = result.substring(0, result.length() - 1);
		}
		System.out.println(result);
	}

	public static void outCopy() { // 字符串数组去重

		String a = "lal;Lili;lulu;heihei;haha;haha;heihei;heihei"; // 把重复的去掉
		String[] b = a.split(";");
		String c = "";
		for (int i = 0; i < b.length; i++) {
			if (c.indexOf(b[i]) < 0) {
				c += b[i] + ";";
			}
		}
		System.out.println(c);
	}

	public static void split() { // 字符串数组去重

		String a = "lal;Li";

		System.out.print(a);
		String[] b = a.split("\n");
		System.out.println(b.length);
		System.out.println(b[0]);

		String c = "123[234]90";

		System.out.println(c.replace("\\[em(.+?)\\]", ""));
	}

	public static void mapAndList() { // 字符串出现次数
		
		System.out.println(System.currentTimeMillis()/1000);
		long time1 = System.currentTimeMillis()/1000;
		long time2 = 1545292085;
		if((time1-time2)>180) {
			System.out.println("已过期");
		}
				
				

		String a = "黎明，张晓芳，宅人贵，黎明，宅人贵，宅人贵，宅人贵，何必，何必";
		String[] b = a.split("，");
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		for (String c : b) {
			Integer num = m.get(c);
			m.put(c, num == null ? 1 : num + 1);
		}
		for(String d:m.keySet()) {
			 System.out.println(d+"："+m.get(d));
		}
      
      
	}

}
