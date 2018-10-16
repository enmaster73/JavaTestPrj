package myalgol.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyTest {

	public static int test(int a) {
		return a;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		
		Object[] list = new Object[] {1,2,3,4};
		for (Object object : list) {
			System.out.println(object);
		}

		List<String> listA = new ArrayList<String>();
		List listB = new ArrayList();
		listB.add("1");
		listB.add("4");
		
		Iterator iterator = listB.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for (Object object : listB) {
			String str = (String) object;
			
		}
		
		
		
		
	}

}
