package com.hw.javamethods;

public class MethodsJava {
	
	private String name;
	private int regNo;
	
	public MethodsJava(){
		this.name=name;
		this.regNo=regNo;
	}
	
	public void setName(String name){
		this.name=name;
		
	}
	
	public String getName(String name){
		return name;
		
	}
	public void setregNo(int regNo){
		this.regNo=regNo;
		
	}
	
	public int getregNo(int regNo){
		return regNo;
		
	}
	
	
	public void display(){
		System.out.println("Iam from parent");
	}
		

}
