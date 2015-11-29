package chapter_13;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Canvas;

public class rockPaper {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rockPaper window = new rockPaper();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public rockPaper() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JButton btnRock = new JButton("Rock");
		btnRock.setBounds(182, 522, 117, 29);
		frame.getContentPane().add(btnRock);
		
		JButton btnPaper = new JButton("Paper");
		btnPaper.setBounds(375, 522, 117, 29);
		frame.getContentPane().add(btnPaper);
		
		JButton btnSissors = new JButton("Scissors");
		btnSissors.setBounds(555, 522, 117, 29);
		frame.getContentPane().add(btnSissors);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(0, 0, 800, 500);
		frame.getContentPane().add(canvas);
		
		
	}
}
