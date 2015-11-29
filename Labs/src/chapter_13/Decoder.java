package chapter_13;
//65-90 may
//97-122 min
//32 -dif
//48-57 num
//65-74 ne
//17 dif
public class Decoder {
	char ch;
	
	public Decoder(char a)
	{
		ch = a;
	}
	
	public char getA()
	{
		if(ch>=65 && ch<=90) return (char) (ch+32);
		else if(ch>=97 && ch<=122) return (char) (ch-32);
		else if(ch>=48 && ch<=57) return (char) (ch+17);
		else if(ch>=45 && ch<=74) return (char) (ch-17);
		else return '#';
	}
	
	public static void main(String args[])
	{
		Decoder dec = new Decoder('1');
		System.out.println(dec.getA());
	}
}
