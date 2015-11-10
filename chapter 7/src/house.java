
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

//import javax.swing.JFrame;

public class house extends Applet
{
	private static final long serialVersionUID = 1L;
	/*public house()
	{
		super("Lab 2");
		setSize(800,600);
	    setBackground(Color.CYAN);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}*/
	
	public void house_complete(Graphics window, int x, int y)
	{
		int xpoints[] = {x+300, x+150, x};
	    int ypoints[] = {y, y-100, y};
	    int npoints = 3;
	    
		window.setColor(Color.DARK_GRAY);
		window.fillPolygon(xpoints, ypoints, npoints);
		window.setColor(Color.gray);
		window.fillRect(x, y, 300, 250);
		window.setColor(Color.black);
		window.fillRect(x+100, y+150, 50, 100);
		window.setColor(Color.black);
		window.drawRect(x+49, y+24, 52, 52);
		window.setColor(Color.yellow);
		window.fillRect(x+50, y+25, 50, 50);
		window.setColor(Color.black);
		window.drawRect(x+199, y+24, 52, 52);
		window.setColor(Color.yellow);
		window.fillRect(x+200, y+25, 50, 50);
	}
	
	public void trees(Graphics window, int x, int y)
	{
		window.setColor(Color.orange);
		window.fillRect(x+16, y+35, 15, 75);
		window.setColor(Color.green);
		window.fillOval(x, y, 50, 50);
		window.setColor(Color.red);
		window.fillOval(x+6, y+6, 7, 7);
		window.fillOval(x+20, y+6, 7, 7);
		window.fillOval(x+15, y+15, 7, 7);
	}
	
	public void playground(Graphics window, int x, int y)
	{
		int xpoints[] = {x-50, x-10, x+40, x};
	    int ypoints[] = { y, y, y-100, y-100,};
	    int npoints = 4;
		window.setColor(Color.gray);
		window.fillPolygon(xpoints, ypoints, npoints);
		window.setColor(Color.yellow);
		window.fillRect(x+40, y-100, 15, 100);
	}
	
	public void sun(Graphics window, int x, int y)
	{
		window.setColor(Color.yellow);
		window.fillOval(x, y, 50, 50);
	}
	
	public void grass(Graphics window, int x, int y)
	{
		window.setColor(Color.green);
		window.fillOval(x, y, 1000, 100);
	}
	
	public void paint(Graphics window) 
	{
		setSize(800,600);
	    setBackground(Color.CYAN);
		house_complete(window, 200, 310);
		grass(window, 0, 550);
		trees(window,35, 475);
		trees(window,85, 465);
		trees(window,700, 475);
		sun(window, 55, 55);
		playground(window, 600, 560);
	}
}
