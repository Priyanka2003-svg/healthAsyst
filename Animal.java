package com.basicProgram;
//this is class - blueprint
public class Animal {

		int legs =4;
		String color ="brown";
		String food ="meat";
	//this is method (behavior)
	public void behavior(){
		String speed= "fast";
		String location ="forest";
		System.out.println(speed);
		System.out.println(location);
		
	}
	//object we have to declare constructor mandetory to store
	public static void main(String[] args) {
		Animal tiger = new Animal(); //constructor
		System.out.println( tiger.legs);
		System.out.println(tiger.color);
		System.out.println(tiger.food);
		tiger.behavior();
	}
	
	
	

}

