package com.tests;


public class BasicJavaTest {
	public static int method1() {
		System.out.println("method1");
		return 1;
	}
	
	public int method2() {
		System.out.println("method2");
		return method1();
	}
	
	public static boolean method3() {
		System.out.println("method3");
		getInstance().method2();
		return false;
	}
	
	public static BasicJavaTest getInstance() {
		return new BasicJavaTest();
		
	}
	
	static {
		System.out.println("method4");
		method1();
	}

}
