package chapter_10;

import java.util.Scanner;

public class Lab_3 
{
	private String word;
	private int ind;
	
	Scanner scan = new Scanner(System.in);
	
	public Lab_3(String s)
	{
		word = s;
	}
	
	public void check_Index(String s)
	{
		ind = word.indexOf(s);
		if(ind >= 0)
		{
			System.out.println("Looking for "+s+" true");
		}else {
			System.out.println("Looking for "+s+" false");
		}
	}
	
	public void ask(int a)
	{
		int i=0;
		while(i != a)
		{
			System.out.print("Enter what you are looking for: ");
			check_Index(scan.next());
		}
	}
	
	public static void main(String args[])
	{
		Lab_3 lab = new Lab_3("chicken");
		lab.ask(3);
	}
}
