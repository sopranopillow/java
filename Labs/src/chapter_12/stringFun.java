package chapter_12;

public class stringFun {
	String sentence;
	
	public stringFun(String s)
	{
		sentence = s;
	}
	
	public void getA()
	{
		System.out.println(sentence);
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.replaceAll(" ", "-"));
	}
	
	public static void main(String args[])
	{
		stringFun s = new stringFun("Hello World");
		s.getA();
	}
}
