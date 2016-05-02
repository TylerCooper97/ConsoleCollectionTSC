package edu.saintjoe.cs.tcooper.consoledriver;

public class Console {

	private String name;
	private int age;
	
	
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int newAge){
		age = newAge;
	}
	public int getAge(){
		return age;
	}
	
	public Console(String newName, int newAge){
		name = newName;
		age = newAge;
	}
	
	public String toString(){
		return ("Name: " + name + " age: " + age);
	}
	
}
