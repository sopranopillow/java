package curves;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Curve extends Applet{
	
	private static final long serialVersionUID = 1L;
	
	private int thicknes;
	private int amplitud;
	private int width;
	private int x;
	private int y;
	private int space;

	public void setArgs(int s, int t, int amp, int w, int xp, int yp)
	{
		thicknes = t;
		amplitud = amp;
		space = s;
		width = w;
		x = xp;
		y = yp;
	}
	
	public void drawCurve(Graphics window) 
	{
		int i=0, un=1, a=0, b=-2;
		while(i <= width)
		{
			if(un==1)
			{
				while(a != amplitud)
				{
					Color(window);
					window.fillRect(x+b, y, thicknes, thicknes);
					x+= space;
					y++;
					b+=.01;
					a++;
					//System.out.println("1");
					un=2;
				}
				a-=amplitud;
				b=-2;
			}
			if(un==2)
			{
				while(a != amplitud)
				{
					Color(window);
					window.fillRect(x+b, y, thicknes, thicknes);
					x+= space;
					b+=.01;
					y--;
					a++;
					//System.out.println("2");
					un=3;
				}
				a-=amplitud;
				b=-2;
			}
			if(un==3)
			{
				while(a != amplitud)
				{
					Color(window);
					window.fillRect(x+b, y, thicknes, thicknes);
					x+= space;
					b+=.01;
					y--;
					a++;
					//System.out.println("3");
					un=4;
				}
				a-=amplitud;
				b=-2;
			}
			if(un==4)
			{
				while(a != amplitud)
				{
					Color(window);
					window.fillRect(x+b, y, thicknes, thicknes);
					x+= space;
					b+=.01;
					y++;
					a++;
					//System.out.println("4");
					un=1;
				}
				a-=amplitud;
				b=-2;
			}
			i=i+(amplitud*4);
		}
	}
	
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
	
	public void paint(Graphics window)
	{
		setSize(800, 600);
		setBackground(Color.black);
		setArgs(1, 2, 50, 200, 50, 100);
		drawCurve(window);
	}
}
