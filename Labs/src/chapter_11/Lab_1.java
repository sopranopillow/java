package chapter_11;

import java.util.Scanner;

public class Lab_1 {
	
	//discount
	
	Scanner scan = new Scanner(System.in);
	
	private double num;
	
	public void ask()
	{
		System.out.println("Enter number");
		num=scan.nextDouble();
	}
	
	public void getPercentage()
	{
		double total = 0;
		if(num>=2000)
		{
			total = num*.85;
			System.out.printf("The number after the discount is %.2f\n", total);
		}else {
			System.out.println("No discount for you");
		}
	}
	
	public static void main(String args[])
	{
		Lab_1 lab = new Lab_1();
		lab.ask();
		lab.getPercentage();
	}
}
