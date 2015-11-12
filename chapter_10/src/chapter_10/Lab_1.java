package chapter_10;

public class Lab_1 {
	
	public static String getFirst( String line )
	{
        int a=line.indexOf(" ");
        String b;
        b = line.substring(0,a);
		return b;
	}
	
	public static String getSecond( String line )
	{
        int a=line.indexOf(" ");
        String b;
        b = line.substring(a);
		return b;
	}

   public static void main( String args[] )
   {
		System.out.println("\nFirst: " +  getFirst("hello world") 
		+ "\nSecond: " +  getSecond("hello world") 
		+ "\nSum: hello world");   
		System.out.println("\nFirst: " +  getFirst("jim bob") 
		+ "\nSecond: " +  getSecond("jim bob")
		+ "\nSum: jim bob");   
		System.out.println("\nFirst: " +  getFirst("sally sue") 
		+ "\nSecond: " +  getSecond("sally sue")
		+ "\nSum: sally sue");  
		System.out.println("\nFirst: " +  getFirst("computer science") 
		+ "\nSecond: " +  getSecond("computer science")
		+ "\nSum: computer science");  
		System.out.println("\nFirst: " +  getFirst("uil contests") 
		+ "\nSecond: " +  getSecond("uil contests")
		+ "\nSum: uil contests");
   }
}
