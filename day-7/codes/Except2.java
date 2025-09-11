class Except2 
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
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("please provide min 2 cmd args");
		}
		catch(NumberFormatException ex){
			System.out.println("please provide only numbers as cmd args");
		}
		System.out.println("--- done ---");
	}
}
