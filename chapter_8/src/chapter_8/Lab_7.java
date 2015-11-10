package chapter_8;

import java.util.Scanner;

public class Lab_7 {

	private static Scanner scan;
	
	public static double f, total;
	
	private static void math() 
	{
		total = (f-32)*5/9;
	}
	
	private static void ask() 
	{
		scan = new Scanner(System.in);
		System.out.println("Type the fahrenheit");
		f = scan.nextDouble();
		math();
	}
	
	public static void main(String[] args) {
		ask();
		System.out.printf(f+"f in celsius :: %.2f\n",total);
	}

}
