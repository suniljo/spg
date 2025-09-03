
public class RealTypes {

	public static void main(String[] args) {
		//float sal = 2500.75; //Type mismatch: cannot convert from double to float
		//float sal = 2500.75f;
		//float sal = 2500.75F;
		float sal = (float) 2500.75;
		System.out.println("my salary = " + sal);
		
		double data = 2500.75;
		System.out.println(data);
		
		sal = 7895.6586f;
		System.out.println(sal);
		
		System.out.printf("%f\n", sal);
		System.out.printf("%.0f\n", sal);
		System.out.printf("%.1f\n", sal);
		System.out.printf("%.2f\n", sal);
		
		System.out.printf("%.3f\n", sal);
	}

}
