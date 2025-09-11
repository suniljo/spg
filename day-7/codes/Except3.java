class Except3 
{
	public static void main(String[] args) 
	{
		try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);

			int res = x / y;

			System.out.println(String.format("%d / %d = %d", x, y, res));
		}
		catch(Exception ex){
			System.out.println("exception occured!!");
			System.out.println("message = " + ex.getMessage());
			System.out.println("toString() = " + ex.toString());
			System.out.println();
			ex.printStackTrace();
			System.out.println();
		}
		
		System.out.println("--- done ---");
	}
}
