package chapter_13;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class MorseCode
{
	private char letter;

	public void Morse(char let)
	{
		switch(let)
		{
		case 65 : System.out.println(letter + " in morse is " + ".-"); break;
		case 66 : System.out.println(letter + " in morse is " + "-..."); break;
		case 67 : System.out.println(letter + " in morse is " + "-.-."); break;
		case 68 : System.out.println(letter + " in morse is " + "-.."); break;
		case 69 : System.out.println(letter + " in morse is " + "."); break;
		case 70 : System.out.println(letter + " in morse is " + "..-."); break;
		case 71 : System.out.println(letter + " in morse is " + "--."); break;
		case 72 : System.out.println(letter + " in morse is " + "...."); break;
		case 73 : System.out.println(letter + " in morse is " + ".."); break; 
		case 74 : System.out.println(letter + " in morse is " + ".---"); break;
		case 75 : System.out.println(letter + " in morse is " + "-.-"); break;
		case 76 : System.out.println(letter + " in morse is " + ".-.."); break; 
		case 77 : System.out.println(letter + " in morse is " + "--"); break;
		case 78 : System.out.println(letter + " in morse is " + "-."); break;
		case 79 : System.out.println(letter + " in morse is " + "---"); break;
		case 80 : System.out.println(letter + " in morse is " + ".--."); break;
		case 81 : System.out.println(letter + " in morse is " + "--.-"); break;
		case 82 : System.out.println(letter + " in morse is " + ".-."); break;
		case 83 : System.out.println(letter + " in morse is " + "..."); break;
		case 84 : System.out.println(letter + " in morse is " + "..-"); break;
		case 85 : System.out.println(letter + " in morse is " + "...-"); break;
		case 86 : System.out.println(letter + " in morse is " + ".--"); break;
		case 87 : System.out.println(letter + " in morse is " + "-..-"); break;
		case 88 : System.out.println(letter + " in morse is " + "-.--"); break;
		case 89 : System.out.println(letter + " in morse is " + "--.."); break;
		case 90 : System.out.println(letter + " in morse is " + "----"); break;
		case 48 : System.out.println(letter + " in morse is " + ""); break;
		case 49 : System.out.println(letter + " in morse is " + ""); break;
		case 50 : System.out.println(letter + " in morse is " + ""); break;
		case 51 : System.out.println(letter + " in morse is " + ""); break;
		case 52 : System.out.println(letter + " in morse is " + ""); break;
		case 53 : System.out.println(letter + " in morse is " + ""); break;
		case 54 : System.out.println(letter + " in morse is " + ""); break;
		case 55 : System.out.println(letter + " in morse is " + ""); break;
		case 56 : System.out.println(letter + " in morse is " + ""); break;
		case 57 : System.out.println(letter + " in morse is " + ""); break;
		default : System.out.println("error 404 morse not found"); break;
		}
	}

	public void setChar(char let)
	{
		letter = let;
		Morse(let);
	}
	
	public static void main (String args[])
	{
		MorseCode m = new MorseCode();
		int i = 65;
		while(i != 90)
		{
			m.setChar((char)(i));
			i++;
		}
	}
}