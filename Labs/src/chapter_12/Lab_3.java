package chapter_12;

public class Lab_3 {
	
	String fwrd, swrd;
	
	//DICTIONARY COMPARE

	public Lab_3 (String f, String s)
	{
		fwrd = f;
		swrd = s;
	}
	
	public void getR()
	{
		if(swrd.compareTo(fwrd) >= 0) System.out.println(fwrd + " " + swrd);
		else System.out.println(swrd + " " + fwrd);
	}
	
	public static void main(String args[])
	{
		Lab_3 lb = new Lab_3("abe","ape");
		lb.getR();
	}
	
}
