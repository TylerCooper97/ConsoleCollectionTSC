package edu.saintjoe.cs.tcooper.consoledriver;

public class Consoles {

	private String name;
	private String age;
	
	
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(String newAge){
		age = newAge;
	}
	public String getAge(){
		return age;
	}
	
	public Consoles(String newName, String newAge){
		name = newName;
		age = newAge;
	}
	
	public String toString(){
		return ("Name: " + name + "age: " + age);
	}
	
}
