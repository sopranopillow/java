package encrypt;

public class Encryptor {
	
	private char letter[];
	private int letters;
	private int changeNum;
	
	public void number_Change()
	{
		int a=0;
		if(a==0)
		{
			changeNum = (int) (Math.PI*10/2);
			a++;
		}
		if(a==1)
		{
			changeNum = (int) (Math.PI*20/2);
			a++;
		}
		if(a==2)
		{
			changeNum = (int) (Math.PI*30/2);
			a++;
		}
		if(a==3)
		{
			changeNum = (int) (Math.PI*40/2);
			a++;
		}
		if(a==4)
		{
			changeNum = (int) (Math.PI*50/2);
			a=0;
		}
	}
	
	public String encrypt(String textToEncrypt)
	{
		letter = textToEncrypt.toCharArray();
		letters = letter.length-1;
		for(int i=0; i<= letters; i++)
		{
			number_Change();
			letter[i] = (char) (letter[i]+changeNum);			
			System.out.print(letter[i]);
		}
		return textToEncrypt;
	}
	
	public String Return(boolean encrypt, String textToEncrypt)
	{
		if(encrypt == false)
			return de_encrypt(textToEncrypt);
		else
			return encrypt(textToEncrypt);
	}
	
	public String de_encrypt(String textToEncrypt)
	{
		letter = textToEncrypt.toCharArray();
		letters = letter.length-1;
		for(int i=0; i<= letters; i++)
		{
			number_Change();
			letter[i] = (char) (letter[i]-changeNum);
			System.out.print(letter[i]);
		}
		return textToEncrypt;
	}
}
