package javaLearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SearchStractures {
	
	
		protected static final String pass = "000111";
		static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
			
		
		
		
		ArrayList<String> a = new ArrayList<>();
		ArrayList<String> b = new ArrayList<>();
		ArrayList<String> c = new ArrayList<>();
		ArrayList<String> d = new ArrayList<>();
		ArrayList<String> aa = new ArrayList<>();
		
		
		
		// programming categories
		
		a.add("java develepment");
		a.add("c++");
		a.add("oop");
		a.add("data strcture");
		a.add("computer scince");
		
		aa.add("java is programming language");
		aa.add("c++ is faster then java ");
		aa.add("programing is best job in the world");
		aa.add("c++ is opp ");
		aa.add("what is opp ? ");
		
		
		// animals categories
		b.add("animals");
		b.add("loin");
		b.add("hotdog");
		b.add("camel");
		b.add("ant");
		b.add("birds");
		b.add("birs");
		
		// sport staff
		c.add("push up");
		c.add("workout");
		c.add("training");
		c.add("parkour");
		c.add("apple");
		c.add("health");
		
		//email
		d.add("shotindark55@gmail.com");
		d.add("+213557216812");
		d.add("contect@payple.com");
		d.add("contect@facebook.com");
		
		//search engine
		
		HashMap<String, ArrayList<String>> searchEngine =
				new HashMap<>();
		
		 
			searchEngine.put("animals", b);
			searchEngine.put("insect", b);
			searchEngine.put("zoo", b);
			searchEngine.put("forest", b);
			
			searchEngine.put("sport", c);
			searchEngine.put("workout", c);
			searchEngine.put("orange", c);
			searchEngine.put("dait", c);
			searchEngine.put("lsirt", c);
			searchEngine.put("atlit", c);
			
			searchEngine.put("dev", a);
			searchEngine.put("develpoer", a);
			searchEngine.put("program", a);
			searchEngine.put("java", a);
			searchEngine.put("android", a);
			
			
			searchEngine.put("dev", aa);
			searchEngine.put("develpoer", aa);
			searchEngine.put("program", aa);
			searchEngine.put("java", aa);
			searchEngine.put("android", aa);
			
			searchEngine.put("what is oop", a);
			searchEngine.put("about dev", a);
			searchEngine.put("about programming", a);
			searchEngine.put("java", a);
			searchEngine.put("android", a);
			
			
			
			
			searchEngine.put("email", d);
			searchEngine.put("emails", d);
			searchEngine.put("phone", d);
			searchEngine.put("phones", d);
			searchEngine.put("contect", d);
			searchEngine.put("numbers", d);
			searchEngine.put("number", d);
			
		
		
		boolean isSearch = true;
		String value = null;
		while(isSearch) {
			System.out.println("tips if you want to stop search type no or false !\n\nsearch :    ");
			value = scanner.nextLine();
			if( (value.equals("false")) || (value.equals("no")) ) {
				isSearch = false;
				System.out.println("search operation stop");
			}else {
				
				System.out.println(searchEngine.get(value));
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
			
	}


 