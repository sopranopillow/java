import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Main_runner extends Applet
{
	private static final long serialVersionUID = 1L;
	
	private float WIDTH, HEIGHT;
	
	public Main_runner() 
	{
		
	}
	
	public void paint(Graphics window)
	{
		setSize(800,600);
	    setBackground(Color.RGBtoHSB(r, g, b, hsbvals));
	}
}