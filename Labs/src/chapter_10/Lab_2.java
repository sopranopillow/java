package chapter_10;

public class Lab_2 
{
	String txt, index;
	String[] array = new String[100];
	int numAr;
	String word;
	
	public Lab_2 (String txtTL, String ind)
	{
		txt = txtTL;
		index = ind;
	}
	
	public void getArray()
	{
		int a=0, c=0;
		for(int i = 0; i < txt.length(); i++)
		{
			if(txt.charAt(i) ==' ')
			{
				array[c] = txt.substring(a, i);
				a=i+1;
				c++;
			}
			if(i==txt.length())
			{
				array[c] = txt.substring(a, i);
				continue;
			}
		}
		numAr = c;
	}
	
	public void print()
	{
		int a=0;
		while(a!=numAr)
		{
			if(array[a].indexOf(index)>= 0) System.out.println(array[a]);
			a++;
		}
	}
	
	public static void main(String args[])
	{
		Lab_2 lab = new Lab_2("Hold fast to dreams For if dreams die Life is a broken-winged"+
		" bird That cannot fly. Hold fast to dreams For when dreams go Life is a barren field "+
		"Frozen with snow", "re");
		lab.getArray();
		lab.print();
	}
}