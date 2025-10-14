
public class CharacterType {

	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch);

		ch = 65; //implicit typecasting
		System.out.println(ch);
		
		System.out.println("Hexadecimal value of 65 = " + Integer.toHexString(65));
		
		ch = '\u0041';
		System.out.println(ch);
	}

}
