package chapter_9;

import java.util.Scanner;

public class lab_1 {

	double sideA, sideB, sideC;
	Scanner scan = new Scanner(System.in);
	
	public void ask()
	{
		System.out.println("Enter side A");
		sideA = scan.nextDouble();
		System.out.println("Enter side B");
		sideB = scan.nextDouble();
		System.out.println("Enter side C");
		sideC = scan.nextDouble();
	}
	
	public double calculate()
	{
		double total, perimeter, s;
		
		perimeter = sideA+sideB+sideC;
		
		s= perimeter/2;
		
		total = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
		
		return total;
		
	}
	
	public void print()
	{
		System.out.println((int)sideA+" "+(int)sideB+" "+(int)sideC);
		System.out.printf("Area == %.3f",calculate());
	}
	
	public static void main(String args[]) {
		lab_1 run = new lab_1();
		run.ask();
		run.print();
	}

}
