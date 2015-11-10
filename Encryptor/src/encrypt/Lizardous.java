package encrypt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Lizardous extends JFrame {

	private static final long serialVersionUID = -2854702904941570268L;
	private  JPanel contentPane;
	Encryptor encrypt = new Encryptor();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lizardous frame = new Lizardous();
					frame.setVisible(true);
					frame.setTitle("Lizardous");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Lizardous() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(Color.black);
		setContentPane(contentPane);
		
		JLabel lblWelcomeToLizardous = new JLabel("Welcome to Lizardous % usr %");
		lblWelcomeToLizardous.setForeground(Color.WHITE);
		contentPane.add(lblWelcomeToLizardous, BorderLayout.NORTH);
	}

}
