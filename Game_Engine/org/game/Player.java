package game;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Player extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private int X, Y;
	
	public int getX()
	{
		return X;
	}
	
	public int getY()
	{
		return Y;
	}
}
