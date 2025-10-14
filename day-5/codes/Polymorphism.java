class A {
	void display(){
		System.out.println("class A");
	}
}

class B extends A {
	void display(){
		System.out.println("class B");
	}
}

class C extends A {
	void display(){
		System.out.println("class C");
	}
}

class Polymorphism 
{
	public static void main(String[] args) 
	{
		//A obj = new A();
		//B obj = new B();
		A obj = new B();
		obj.display();
		

		System.out.println(obj instanceof A); //true
		System.out.println(obj instanceof B); //true
		System.out.println(obj instanceof C); //false
	}
}
