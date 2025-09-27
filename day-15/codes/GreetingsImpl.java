class GreetingsImpl 
{
	public static void main(String[] args) 
	{
		/*
		//--using anonymous class concept
		Greetings ref = new Greetings(){
			public void greetingMessage(){
				System.out.println("Greetings from S&P Global");
			}
		};
		ref.greetingMessage();
		System.out.println();
		*/


		//-- using lambda expression
		Greetings ref1 = () -> System.out.println("Greetings from S&P Global");
		ref1.greetingMessage();	
	}
}
