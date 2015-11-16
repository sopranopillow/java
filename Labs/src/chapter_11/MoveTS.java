package chapter_11;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class MoveTS extends Applet{
	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width = 800, height = 600, Xpos, Ypos;
	private boolean down = true, right = true;
	private Timer timer;
	private final static int SLEEP = 1;
	
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
		/*window.setColor(Color.BLACK);
		window.fillRect(0,0,width,height);*/
		choose_color(window);
		window.fillOval(x,y,50,50);
	}
	
	public void check(){
		if(Xpos+50 == width) right = false;
		else if(Xpos == 0) right = true;
		
		if(Ypos+50 == height) down = false;
		else if(Ypos == 0) down = true;
	}
	
	public MoveTS()
	{
		ActionListener paintCaller = new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				repaint();  //each time timer fires it will call paint
			}
		};
		timer = new Timer(SLEEP, paintCaller);
		timer.start();
	}
	
	public void move() {
		if(down == true && right == true) {
			Xpos+=1;
			Ypos+=1;
		} else if(down == false && right == true) {
			Xpos+=1;
			Ypos-=1;
		} else if(down == false && right == false) {
			Xpos-=1;
			Ypos-=1;
		} else if(down == true && right == false) {
			Xpos-=1;
			Ypos+=1;
		}
	}
	
	public void update(Graphics window)
	{
	   paint(window);	
	}
	
	public void paint( Graphics window )
	{
		setSize(width, height);
		setVisible(true);
		setBackground(Color.BLACK);
	    move();
	    check();
		random_color(window, Xpos, Ypos, 50, 50);
	}	
}
