package javaexp;

import java.util.*;

public class ComparatorExp {
	public static void main(String[] args){
		List<Users> l = new ArrayList();
		Users user = new Users();
		user.setName("Suresh");
		user.setPassword("asdf");

		Users user1 = new Users();
		user1.setName("Suresh");
		user1.setPassword("asdf");
		l.add(user);
		l.add(user1);
		
		List<String> strList = new ArrayList();
		strList.add("");
		
		Collections.sort(strList);
		
//		Collections.sort(l, new Comparator<String>() {
//			@Override
//			public int compare(String str, String str1){
//				return str.compareTo(str1);
//			}
//		});
	}
}
