package resouces;

import java.awt.Color;
import java.awt.Graphics;

public class Colors {
	
	public void Color(Graphics window)
	{
		int color;
		color = (int) (Math.random()*13);
		if (color==1)
		{
			window.setColor(Color.black);
		}
		if (color==2)
		{
			window.setColor(Color.blue);
		}
		if (color==3)
		{
			window.setColor(Color.cyan);
		}
		if (color==4)
		{
			window.setColor(Color.darkGray);
		}
		if (color==5)
		{
			window.setColor(Color.gray);
		}
		if (color==6)
		{
			window.setColor(Color.green);
		}
		if (color==7)
		{
			window.setColor(Color.lightGray);
		}
		if (color==8)
		{
			window.setColor(Color.magenta);
		}
		if (color==9)
		{
			window.setColor(Color.orange);
		}
		if (color==10)
		{
			window.setColor(Color.pink);
		}
		if (color==11)
		{
			window.setColor(Color.red);
		}
		if (color==12)
		{
			window.setColor(Color.white);
		}
		if (color==13)
		{
			window.setColor(Color.yellow);
		}
	}
}
