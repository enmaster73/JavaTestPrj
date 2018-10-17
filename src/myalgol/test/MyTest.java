 package myalgol.test;

import java.util.ArrayList;
import java.util.HashMap;

public class MyTest {

	public static void testList() {
		System.out.println("#### test List ####");
		
        ArrayList<String> pitches = new ArrayList<String>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        System.out.println(pitches.get(1));
        System.out.println(pitches.size());
        System.out.println(pitches.contains("142"));

        System.out.println(pitches.remove("129"));
        System.out.println(pitches.size());
        System.out.println(pitches.remove(0));	
        
        System.out.println("#### end ####");
	}
	
	public static void testString() {
		System.out.println("#### test String ####");
		String ret = new String("A test program in my call");
		
		int idx = ret.indexOf("program");
		if (idx > 0) {
			String new1 = ret.replaceAll("program", "changed program");
			System.out.println(new1);
		}
		else {
			System.out.println(ret);
		}
		
		System.out.println("test functions");
		
		int start = idx;
		int end = idx + "program".length();
		
		System.out.println(ret.substring(start, end));
	
		System.out.println(String.valueOf(start));
		System.out.println(String.valueOf(end));
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello1");
		sb.append(" ");
		System.out.println(sb);
		
		String strA = "This is simple test..";
		String strB = new String ("hello2");
		
		strA.equals(strB);
		
		System.out.println(strB.equals(strA));

		System.out.println(strA.indexOf("simple"));
		
		String result = strA.replaceAll("test", "final test");

		System.out.println(strA);
		System.out.println(result);
		
		System.out.println("out from test function");
		
		System.out.println("#### end ####");
	
	}
	
	public static void testArray() {
		System.out.println("#### test Array ####");
		int[] odds = {1,2,3,4,5};
		String[] weeks = {"월", "화"};
		String[] weeks2 = new String[7];
		// error 
//		String[] week3 = new String[];
		
		for (String string : weeks) {
			System.out.println(string);
		}
		
		if (odds.length > 0) {
			System.out.println("this array had values");
		}
		
		System.out.println("array value when init is null");
		for (String string : weeks2) {
			System.out.println(string);
		}
		System.out.println("#### end ####");
	}
	
	
	public static void testMap() {
		System.out.println("####test Map ####");
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		System.out.println(map.get(1));
		
		if (map.containsKey(2)) {
			System.out.println("this map have number key 2");
		}

		int before_size = map.size();
		
		map.remove(2);
		
		if (map.size() < before_size) {
			System.out.println("size is smaller than befroe cause by remove key 2");
		}
		
		
		System.out.println("#### end ####");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testMap();
		testString();
		testArray();
		testList();

		
		
	}

}

