package chapter_10;

public class Lab_1 {

	private String sentence;
	private int ind;
	
	public Lab_1(String s)
	{
		s = sentence;
		getIndex();
	}
	
	public void getIndex()
	{
		ind = sentence.indexOf(" ");
	}

	public String toString() {
		return "First: "+sentence.substring(0,ind)+"\nSecond: "+sentence.substring(ind)+ "\nAll: "+sentence;
	}
	
	public static void main(String args[])
	{
		Lab_1 lab = new Lab_1("hello world");
		System.out.println(lab);
	}
}
