package encrypt;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login_Lizardous extends JFrame{

	private static final long serialVersionUID = -2854702904941570268L;
	private  JPanel contentPane;
	Encryptor encrypt = new Encryptor();
	private JTextField username;
	private JTextField password;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_Lizardous frame = new login_Lizardous();
					frame.setVisible(true);
					frame.setTitle("Lizardous");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public login_Lizardous() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.black);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(139, 6, 165, 16);
		lblNewLabel.setText("Please login to Lizardous");
		lblNewLabel.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel);
		
		username = new JTextField();
		username.setBackground(Color.BLACK);
		username.setForeground(Color.WHITE);
		username.setBounds(153, 64, 130, 26);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setForeground(Color.WHITE);
		password.setBackground(Color.BLACK);
		password.setBounds(153, 126, 130, 26);
		contentPane.add(password);
		password.setColumns(10);
		
		JLabel label_E = new JLabel("");
		label_E.setBackground(Color.BLACK);
		label_E.setForeground(Color.WHITE);
		label_E.setBounds(188, 202, 61, 16);
		contentPane.add(label_E);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( username.getText() !="esteban" && password.getText() != "123456")
				{
					Lizardous.main(null);
					dispose();
				}else{
					label_E.setText("Wrong password or username");
					System.out.println(username.getText()+ password.getText());
				}
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(424, 1, 20, 21);
		contentPane.add(btnNewButton);
		
		
	}
}
