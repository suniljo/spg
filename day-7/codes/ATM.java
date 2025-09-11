import java.util.Scanner;

class ATM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Which Bank's Card [1.SBI | 2.ICICI]: ");
		int cardType = sc.nextInt();

		System.out.println();
		
		Bank bank = null;

		switch(cardType){
			case 1:
				bank = new SBI();
				break;
			case 2:
				bank = new ICICI();
				break;
			default:
				System.out.println("Card Read Error ... Try Again");
				return; //System.exit(0);				
		}//switch

		System.out.println("============= WELCOME TO " + bank.getClass().getSimpleName().toUpperCase() +" =============");
		
		bank.deposit(1000);
		bank.withdraw(500);

		System.out.println(bank.n);
		System.out.println(Bank.n);
		System.out.println(ICICI.n);
		System.out.println(SBI.n);

		//bank.n = 12; //error: cannot assign a value to final variable n
		bank.gstCalculations();

		Bank.staticMethod();
	}
}
