package chapter_9;

import java.util.Scanner;

public class lab_4 {

	double y1, y2, x1, x2;
	Scanner scan = new Scanner(System.in);
	
	public void ask()
	{
		System.out.println("Enter x1");
		x1 = scan.nextDouble();
		System.out.println("Enter y1");
		y1 = scan.nextDouble();
		System.out.println("Enter x2");
		x2 = scan.nextDouble();
		System.out.println("Enter y2");
		y2 = scan.nextDouble();
	}
	
	public double calculate()
	{
		double total;
		
		total = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		return total;
		
	}
	
	public void print()
	{
		System.out.printf("\ndistance == %.3f\n",calculate());
	}
	
	public static void main(String args[]) {
		lab_4 run = new lab_4();
		run.ask();
		run.print();
	}

}
