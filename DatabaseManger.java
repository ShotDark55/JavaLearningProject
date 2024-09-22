package javaLearn;

import java.util.ArrayList;

public class DatabaseManger {
	
	private ArrayList<String> array;
	
	public DatabaseManger(ArrayList<String> array) {
			this.array = array;
	}
	
	
	public void update(int index,String value) {
		array.set(index, value);
	
	}
	
	public void delete(int index) {
		array.remove(index);
	}
	
	
	public ArrayList<String> getArray() {
		return array;
	}
	
	public void deleteAll() {
		array.clear();
	}
	
	
	public String check(String value) {
		if (array.contains(value)) {
			return "is avaliabe";
		}else {
			return "sorry your data doesn't exist !";
		}
		
	}
	
	

}
