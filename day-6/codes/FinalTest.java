//final class A {
class A {
	final void display(){}
}

class B extends A{
	void display(){} //error: display() in B cannot override display() in A
}

class FinalTest 
{
	final String name; //blank final variable
	
	FinalTest(){
		name = "S&P Global";
	}

	final int n = 20; //instance variable
	public static void main(String[] args) 
	{
		final int n = 12; //local variable
		//n = 13; //error: cannot assign a value to final variable n
		System.out.println(n);

		FinalTest obj = new FinalTest();
		//obj.n=20; //error: cannot assign a value to final variable n

	}
}
