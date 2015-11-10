package chapter_9;

import java.util.Scanner;

public class lab_2 {

	static double distance;
	static double hours;
	static double minutes;
	Scanner scan = new Scanner(System.in);
	
	public void ask()
	{
		System.out.println("Enter distance");
		distance = scan.nextDouble();
		System.out.println("Enter hours");
		hours = scan.nextDouble();
		System.out.println("Enter minutes");
		minutes = scan.nextDouble();
	}
	
	public int calculate()
	{
		int total;
		
		total= (int) Math.round(distance/(hours+(minutes/60)));
		
		return total;
		
	}
	
	public static void main(String args[]) {
		lab_2 run = new lab_2();
		run.ask();
		System.out.println("\n"+(int)distance+" miles in "+
		(int)hours+" hour and "+(int)minutes+" minutes = "+
		run.calculate()+" MPH");
	}

}
