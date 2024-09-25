package javaLearn;

import java.util.ArrayList;

public class ArrayOfObjectClass {
	
	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student("oussama", "salmi", 24, 101));
		list.add(new Student("shot","dark",22,102));
		list.add(new Student());
		list.add(new Student("dark", "team55", 30, 109));
		
		
		
		String _data = "";
		for (int x = 0 ; x < list.size() ; x++ ) {
			_data += list.get(x).getData(true).toString()+"\n";
		}
		
		
		System.out.println(_data);
		
	}
	
	
	
	
	

}




