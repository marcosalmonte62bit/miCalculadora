package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PrincipalPrueba {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalPrueba window = new PrincipalPrueba();
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
	public PrincipalPrueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(20, 8, 242, 66);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(PrincipalPrueba.class.getResource("/images/image-2.png")));
		lblNewLabel_1.setBounds(83, 85, 53, 60);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(PrincipalPrueba.class.getResource("/images/image-3.png")));
		lblNewLabel.setBounds(146, 90, 53, 50);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(PrincipalPrueba.class.getResource("/images/image-4.png")));
		lblNewLabel_2.setBounds(209, 85, 53, 60);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(PrincipalPrueba.class.getResource("/images/image-5.png")));
		lblNewLabel_3.setBounds(20, 156, 53, 50);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(PrincipalPrueba.class.getResource("/images/image-6.png")));
		lblNewLabel_4.setBounds(83, 156, 53, 50);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(PrincipalPrueba.class.getResource("/images/image-7.png")));
		lblNewLabel_5.setBounds(146, 156, 53, 50);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(PrincipalPrueba.class.getResource("/images/image-8.png")));
		lblNewLabel_6.setBounds(209, 156, 53, 50);
		frame.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(PrincipalPrueba.class.getResource("/images/image-10.png")));
		lblNewLabel_7.setBounds(83, 212, 53, 60);
		frame.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon(PrincipalPrueba.class.getResource("/images/image-9.png")));
		lblNewLabel_8.setBounds(20, 217, 53, 50);
		frame.getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon(PrincipalPrueba.class.getResource("/images/image-1.png")));
		lblNewLabel_9.setBounds(20, 90, 53, 50);
		frame.getContentPane().add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon(PrincipalPrueba.class.getResource("/images/suma.png")));
		lblNewLabel_10.setBounds(146, 212, 53, 60);
		frame.getContentPane().add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon(PrincipalPrueba.class.getResource("/images/1.png")));
		lblNewLabel_11.setBounds(209, 212, 53, 60);
		frame.getContentPane().add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon(PrincipalPrueba.class.getResource("/images/multi.png")));
		lblNewLabel_12.setBounds(83, 280, 53, 50);
		frame.getContentPane().add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon(PrincipalPrueba.class.getResource("/images/divi.png")));
		lblNewLabel_13.setBounds(146, 280, 53, 50);
		frame.getContentPane().add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon(PrincipalPrueba.class.getResource("/images/igual.png")));
		lblNewLabel_14.setBounds(209, 280, 53, 50);
		frame.getContentPane().add(lblNewLabel_14);
		frame.setBounds(100, 100, 300, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
