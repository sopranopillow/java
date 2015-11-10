package chapter_8;

import java.util.Scanner;

public class Lab_1 {

	private static Scanner scan;

	public static double radius, total;
	
	private static void math() 
	{
		total = (Math.pow(radius, 2))* Math.PI;
	}
	
	private static void ask() 
	{
		scan = new Scanner(System.in);
		System.out.println("Type the radius");
		radius = scan.nextDouble();
		math();
	}
	
	public static void main(String[] args) {
		
		ask();
		System.out.println("The area of the circle is :: "+ 
		String.format("%.2f",total));
	}

}
