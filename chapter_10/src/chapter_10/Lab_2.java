package chapter_10;

public class Lab_2 
{
	String textToLookIn, index;
	int b=0;
	
	public Lab_2(String text, String ind)
	{
		textToLookIn = text;
		index = ind;
	}
	
	public void getRange(int a)
	{
		int range1=a, range2=a, i=0;
		while(textToLookIn.charAt(a-i) != ' ')
		{
			i++;
			range1--;
		}
		i=0;
		while(textToLookIn.charAt(a+i) != ' ')
		{
			i++;
			range2++;
		}
		b++;
		System.out.println(textToLookIn.substring(range1, range2+1)+b);
	}
	
	public void lookForWord()
	{
		for(int i = 0; i < textToLookIn.length(); i++)
		{
			if(textToLookIn.indexOf(index)>= 0)
			{
				
				getRange(textToLookIn.indexOf(index));
			}
		}
	}
	
	public static void main(String args[])
	{
		Lab_2 lab = new Lab_2("Hold fast to dreams For if dreams die Life is a broken-winged"+
		" bird That cannot fly. Hold fast to dreams For when dreams go Life is a barren field "+
		"Frozen with snow.", "ea");
		lab.lookForWord();
	}
}
