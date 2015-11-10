
public class StarsAndStripes
{
	 public void printAll()
	 {
		 System.out.println("StarsAndStripes");
		 printTwoBlankLines();
		 printASmallBox();
		 printTwoBlankLines();
		 printABigBox();
	 }
	 public void printTwentyStars()
	 {
		 System.out.println("********************");
	 }
	 public void printTwentyDashes()
	 {
		 System.out.println("--------------------");
	 }
	 public void printTwoBlankLines()
	 {
		 System.out.println("\n\n");
	 }
	
	 public void printASmallBox()
	 {
		 printTwentyDashes();
		 printTwentyStars();
		 printTwentyDashes();
		 printTwentyStars();
		 printTwentyDashes();
		 printTwentyStars();
		 printTwentyDashes();
	 }
	 public void printABigBox()
	 {
		 printASmallBox();
		 printASmallBox();
	 }
	 public static void main(String args[])
	 {
		 StarsAndStripes s = new StarsAndStripes();
		 s.printAll();
	 }
}
