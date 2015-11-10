package chapter_9;

import java.util.Scanner;

public class lab_3 {

	double A, B, C;
	Scanner scan = new Scanner(System.in);
	
	public void ask()
	{
		System.out.println("Enter A");
		A = scan.nextDouble();
		System.out.println("Enter B");
		B = scan.nextDouble();
		System.out.println("Enter C");
		C = scan.nextDouble();
	}
	
	public double calculate_root_1()
	{
		double total = 0;
		
		total = (-B+(Math.sqrt(Math.pow(B, 2)-4*(A*C))))/(2*A);
		return total;
		
	}
	
	public double calculate_root_2()
	{
		double total = 0;
		
		total = (-B-(Math.sqrt(Math.pow(B, 2)-4*(A*C))))/(2*A);
		
		return total;
		
	}
	
	public void print()
	{
		System.out.printf("\nrootone == %.2f\n",calculate_root_1());
		System.out.printf("roottwo == %.2f",calculate_root_2());
	}
	
	public static void main(String args[]) {
		lab_3 run = new lab_3();
		run.ask();
		run.print();
	}

}
