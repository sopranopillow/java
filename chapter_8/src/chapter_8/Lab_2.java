package chapter_8;

import java.util.Scanner;

public class Lab_2 {

	private static Scanner scan;
	public static double x1, x2, y1, y2;
	public static double m;
	private static void ask()
	{
		scan = new Scanner(System.in);
		System.out.println("Type the first x point");
		x1 = scan.nextInt();
		System.out.println("Type the first y point");
		y1 = scan.nextInt();
		System.out.println("Type the second x point");
		x2 = scan.nextInt();
		System.out.println("Type the second y point");
		y2 = scan.nextInt();
		math();
	}
	private static void math()
	{
		m = (y2-y1)/(x2-x1);
	}
	
	public static void main(String[] args) {
		ask();
		System.out.println("The slope is :: "+
		String.format("%.2f",m));
	}

}
