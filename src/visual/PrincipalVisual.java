package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrincipalVisual {

	private JFrame frmCalculadora;
	private JTextField txtScreenDisplay;
	private JLabel keyOne;
	private JLabel keyTwo;
	private JLabel keyThree;
	private JLabel keyFour;
	private JLabel keyFive;
	private JLabel keySix;
	private JLabel keySeven;
	private JLabel keyNine;
	private JLabel keyEight;
	private JLabel keyZero;
	private JLabel keyPlus;
	private JLabel keyMinus;
	private JLabel keyTimes;
	private JLabel keyDivide;
	private JLabel keyEquals;
	private int operador = -1;
	private int valor1;
	private int valor2;
	private String[] separados;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalVisual window = new PrincipalVisual();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrincipalVisual() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setResizable(false);
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtScreenDisplay = new JTextField();
		txtScreenDisplay.setEditable(false);
		txtScreenDisplay.setBounds(20, 8, 242, 66);
		frmCalculadora.getContentPane().add(txtScreenDisplay);
		txtScreenDisplay.setColumns(10);
		
		keyOne = new JLabel("New label");
		keyOne.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtScreenDisplay.setText(txtScreenDisplay.getText() + "1");
			}
		});
		keyOne.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/image-2.png")));
		keyOne.setBounds(83, 85, 53, 60);
		frmCalculadora.getContentPane().add(keyOne);
		
		keyTwo = new JLabel("New label");
		keyTwo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtScreenDisplay.setText(txtScreenDisplay.getText() + "2");
			}
		});
		keyTwo.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/image-3.png")));
		keyTwo.setBounds(146, 90, 53, 50);
		frmCalculadora.getContentPane().add(keyTwo);
		
		keyThree = new JLabel("New label");
		keyThree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtScreenDisplay.setText(txtScreenDisplay.getText() + "3");
			}
		});
		keyThree.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/image-4.png")));
		keyThree.setBounds(209, 85, 53, 60);
		frmCalculadora.getContentPane().add(keyThree);
		
		keyFour = new JLabel("New label");
		keyFour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtScreenDisplay.setText(txtScreenDisplay.getText() + "4");
			}
		});
		keyFour.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/image-5.png")));
		keyFour.setBounds(20, 156, 53, 50);
		frmCalculadora.getContentPane().add(keyFour);
		
		keyFive = new JLabel("New label");
		keyFive.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtScreenDisplay.setText(txtScreenDisplay.getText() + "5");
			}
		});
		keyFive.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/image-6.png")));
		keyFive.setBounds(83, 156, 53, 50);
		frmCalculadora.getContentPane().add(keyFive);
		
		keySix = new JLabel("New label");
		keySix.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtScreenDisplay.setText(txtScreenDisplay.getText() + "6");
			}
		});
		keySix.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/image-7.png")));
		keySix.setBounds(146, 156, 53, 50);
		frmCalculadora.getContentPane().add(keySix);
		
		keySeven = new JLabel("New label");
		keySeven.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtScreenDisplay.setText(txtScreenDisplay.getText() + "7");
			}
		});
		keySeven.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/image-8.png")));
		keySeven.setBounds(209, 156, 53, 50);
		frmCalculadora.getContentPane().add(keySeven);
		
		keyNine = new JLabel("New label");
		keyNine.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtScreenDisplay.setText(txtScreenDisplay.getText() + "9");
			}
		});
		keyNine.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/image-10.png")));
		keyNine.setBounds(83, 212, 53, 60);
		frmCalculadora.getContentPane().add(keyNine);
		
		keyEight = new JLabel("New label");
		keyEight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtScreenDisplay.setText(txtScreenDisplay.getText() + "8");
			}
		});
		keyEight.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/image-9.png")));
		keyEight.setBounds(20, 217, 53, 50);
		frmCalculadora.getContentPane().add(keyEight);
		
		keyZero = new JLabel("New label");
		keyZero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtScreenDisplay.setText(txtScreenDisplay.getText() + "0");
			}
		});
		
		keyZero.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/image-1.png")));
		keyZero.setBounds(20, 90, 53, 50);
		frmCalculadora.getContentPane().add(keyZero);
		
		keyPlus = new JLabel("New label");
		keyPlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(operador == -1) {
				txtScreenDisplay.setText(txtScreenDisplay.getText() + "+");
				operador = 0;
				}
			}
		});
		keyPlus.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/suma.png")));
		keyPlus.setBounds(146, 212, 53, 60);
		frmCalculadora.getContentPane().add(keyPlus);
		
		keyMinus = new JLabel("New label");
		keyMinus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(operador == -1) {
				txtScreenDisplay.setText(txtScreenDisplay.getText() + "-");
				operador = 1;
				}
			}
		});
		keyMinus.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/1.png")));
		keyMinus.setBounds(209, 212, 53, 60);
		frmCalculadora.getContentPane().add(keyMinus);
		
		keyTimes = new JLabel("New label");
		keyTimes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(operador == -1) {
				txtScreenDisplay.setText(txtScreenDisplay.getText() + "x");
				operador = 2;
				}
			}
		});
		keyTimes.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/multi.png")));
		keyTimes.setBounds(83, 280, 53, 50);
		frmCalculadora.getContentPane().add(keyTimes);
		
		keyDivide = new JLabel("New label");
		keyDivide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(operador == -1) {
				txtScreenDisplay.setText(txtScreenDisplay.getText() + "/");
				operador = 3;
				}
			}
		});
		keyDivide.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/divi.png")));
		keyDivide.setBounds(146, 280, 53, 50);
		frmCalculadora.getContentPane().add(keyDivide);
		
		keyEquals = new JLabel("New label");
		keyEquals.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtScreenDisplay.getText().isEmpty() == false) {
					try {
				switch(operador) {
				case 0:
					separados = txtScreenDisplay.getText().split("\\+");
					valor1 = Integer.parseInt(separados[0]);
					valor2 = Integer.parseInt(separados[1]);
					break;
				case 1:
					separados = txtScreenDisplay.getText().split("\\-");
					valor1 = Integer.parseInt(separados[0]);
					valor2 = Integer.parseInt(separados[1]);
					break;
				case 2:
					separados = txtScreenDisplay.getText().split("x");
					valor1 = Integer.parseInt(separados[0]);
					valor2 = Integer.parseInt(separados[1]);
					break;
				case 3:
					separados = txtScreenDisplay.getText().split("\\/");
					valor1 = Integer.parseInt(separados[0]);
					valor2 = Integer.parseInt(separados[1]);
					break;
				default:
					valor1 = Integer.parseInt(txtScreenDisplay.getText());
					valor2 = 0;
					operador = 0;
					break;
				}
				
				VentanaCalculo ventana = new VentanaCalculo(valor1,valor2,operador);
				ventana.setVisible(true);
					} catch(ArrayIndexOutOfBoundsException ex) {
					  JOptionPane.showMessageDialog(null, "Expresión Inválida");
					}
					
					txtScreenDisplay.setText("");
					operador = -1;

				}
			}
		});
		keyEquals.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/igual.png")));
		keyEquals.setBounds(209, 280, 53, 50);
		frmCalculadora.getContentPane().add(keyEquals);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtScreenDisplay.setText("");
				operador = -1;
			}
		});
		lblNewLabel.setIcon(new ImageIcon(PrincipalVisual.class.getResource("/images/ac.png")));
		lblNewLabel.setBounds(20, 281, 53, 49);
		frmCalculadora.getContentPane().add(lblNewLabel);
		frmCalculadora.setBounds(100, 100, 300, 402);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
