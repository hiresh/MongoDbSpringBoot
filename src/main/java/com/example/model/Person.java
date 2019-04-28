package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Id
	private String name;
	private int age;
	
	public Person(){
		
	}
	
	public Person(String s,int a){
		this.name=s;
		age=a;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		return this.name+" age : "+this.age;
	}
}
