interface Bank
{
	int n = 12;

	void deposit(float amt);
	void withdraw(float amt);

	default void gstCalculations(){
		System.out.println("GST Calculations");
	}

	static void staticMethod(){
		System.out.println("a helpler functionality");
	}
}