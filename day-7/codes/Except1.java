class Except1 
{
	public static void main(String[] args) 
	{
		try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);

			int res = x / y;

			System.out.println(String.format("%d / %d = %d", x, y, res));
		}
		catch(ArithmeticException ex){
			System.out.println("Cannot divide a number by 0");
		}

		System.out.println("--- done ---");
	}
}
