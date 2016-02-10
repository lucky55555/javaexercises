package com.hw.javamethods;

public class MethodsTest {

	public static void main(String[] args) {
		MethodsJava mj = new MethodsJava();
		mj.display();
     mj.setregNo(12484);
    mj.setName("laxman");
      System.out.println("your student is "+ mj.getregNo(12484));
      System.out.println("your name is "+ mj.getName("laxman"));
	}

}