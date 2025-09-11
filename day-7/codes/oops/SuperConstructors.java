package com.spg.java.oops;

class A {
	A(int n){
		System.out.println("in class A constructor");
	}
}

class B extends A {
	B(){
		super(25);
		System.out.println("in class B constructor");
	}
}


public class SuperConstructors {

	public static void main(String[] args) {
		B obj = new B();
	}

}
