class NumsImpl 
{
	public static void main(String[] args) 
	{
		Nums ref1 = (int x, int y) -> { 
										return x + y; 
									};
		System.out.println("Sum = " + ref1.add(12,34));

		Nums ref2 = (x, y) -> (x + y);
		System.out.println("Sum = " + ref2.add(13,35));

		System.out.println(ref1);
		System.out.println(ref2);
	}
}
