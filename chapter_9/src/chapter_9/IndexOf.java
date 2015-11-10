package chapter_9;


import static java.lang.System.*;

public class IndexOf
{
	/*
	 *method getFirstChunk() should return
	 *all letters up to the first @ sign
	 */
	public static String getFirstChunk( String line )
	{
        int a=line.indexOf("@");
        String b;
        b = line.substring(0,a);
		return b;
	}

   public static void main( String args[] )
   {
		System.out.println( getFirstChunk("elephants@are@big") );    //outs elephants
		System.out.println( getFirstChunk("computer@science") );    //outs computer
		System.out.println( getFirstChunk("dogs@are@smarte@than@cats") );   //outs dogs
		System.out.println( getFirstChunk("chickens@are@kewl") );   //outs chickens
   }
}