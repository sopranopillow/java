
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class robot extends Applet
{
	private static final long serialVersionUID = 1L;
	
	public void head(Graphics window, int x, int y)
	{
		random_color(window, x, y, 75, 75);
		choose_color(window);
		window.fillOval(x+15, y+15, 20, 20);
		window.fillOval(x+40, y+15, 20, 20);
		choose_color(window);
		window.fillRect(x+25, y+25, 5, 5);
		window.fillRect(x+50, y+25, 5, 5);
		choose_color(window);
		window.fillRoundRect(x+15, y+40, 45, 10, 5, 5);
		choose_color(window);
		window.drawLine(x+15, y+45, x+60, y+45);
		window.drawLine(x+20, y+40, x+20, y+50);
		window.drawLine(x+25, y+40, x+25, y+50);
		window.drawLine(x+30, y+40, x+30, y+50);
		window.drawLine(x+35, y+40, x+35, y+50);
		window.drawLine(x+40, y+40, x+40, y+50);
		window.drawLine(x+45, y+40, x+45, y+50);
		window.drawLine(x+50, y+40, x+50, y+50);
		window.drawLine(x+55, y+40, x+55, y+50);
	}
	
	public void body(Graphics window, int x, int y)
	{
		random_color(window, x, y, 175, 250);
		choose_color(window);
		window.fillRoundRect(x+25, y+20, 125, 30, 5, 5);
		window.setColor(Color.green);
		window.fillOval(x+50, y+25, 20, 20);
		choose_color(window);
		window.fillOval(x+75, y+25, 20, 20);
		choose_color(window);
		window.fillOval(x+100, y+25, 20, 20);
		choose_color(window);
		window.drawRoundRect(x+25, y+70, 125, 160, 3, 3);
		choose_color(window);
		window.fillOval(x+35, y+100, 10, 10);
	}

	public void arm(Graphics window, int x, int y)
	{
		random_color(window, x, y, 40, 125);
	}
	
	public void foot(Graphics window, int x, int y)
	{
		random_color(window, x, y, 40, 125);
	}
	
	public void choose_color(Graphics window)
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
	
	public void random_color(Graphics window, int x, int y, int x2, int y2)
	{
		for(int i = 0; i<x2; i++)
		{
			for(int a = 0; a<y2; a++)
			{
				choose_color(window);
				window.fillRect(x+i, y+a, 1, 1);
			}
		}
	}
	
	public void paint(Graphics window)
	{
		setSize(800,600);
	    setBackground(Color.gray);
	    head(window, 350, 50);
	    body(window, 300, 125);
	    arm(window, 260, 90);
	    arm(window, 475, 90);
	    foot(window, 330, 375);
	    foot(window, 400, 375);
	    choose_color(window);
	    window.drawString("Exterminate!! Exterminate!!", 10, 550);
	}
}
