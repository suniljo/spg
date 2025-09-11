package com.spg.java.oops;

import java.util.Scanner;

public class DrawingApp {
	
	//Driver method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape sh = null;
		
		System.out.print("which shape do you want to use [1.Rect | 2.Circle]? ");
		int shapeType = sc.nextInt();
		
		switch(shapeType) {
		 case 1:
			 System.out.print("enter color for rectangle: ");
			 String color = sc.next();
			 
			 System.out.print("enter length of rectangle: ");
			 int len = sc.nextInt();
			 
			 System.out.print("enter breadth of rectangle: ");
			 int bre = sc.nextInt();
			 
			 sh = new Rectangle(color, len, bre);
			 break;
		 case 2:
			 System.out.print("enter color for circle: ");
			 color = sc.next();
			 
			 System.out.print("enter radius of circle: ");
			 float radius = sc.nextFloat();	
			 
			 sh = new Circle(color, radius);
			 break;
		 default:
			 System.err.println("Invalid Shape Selection!!!");
			 System.exit(0);
		} //switch
		
		System.out.println();
		
		System.out.println("============ SHAPE SELECTED: " + sh.getClass().getSimpleName().toUpperCase() + " ============\n");
		
		System.out.println("color of \""+ sh.getClass().getSimpleName() + "\" = "  + sh.getColor());
		sh.area();
	}

}
