package javaLearn;

public class Student {
	private String name;
	private String lastname;
	private int age;
	protected int id;
	
	Student(String name , String lastname , int age , int id) { 
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.id = id;

	}
	
	Student() {
		System.out.println("data is blanc");
	}
	
	
	String getData(boolean fullData) {
		if (fullData) {
			return "name : " + name + "\nlastname : " + lastname
					+"\nage : " + age + "\nID : " + id;
		}
		return 
				name + 
				"\n" +
		        lastname+
		        "\n" +
		        age +
		        "\n" +
		        id;
		      
			
	}
	
}
	
	


