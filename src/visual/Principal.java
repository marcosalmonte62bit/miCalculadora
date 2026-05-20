package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 244);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spn_num1 = new JSpinner();
		spn_num1.setBounds(82, 24, 46, 20);
		contentPane.add(spn_num1);
		
		
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero 1");
		lblNewLabel.setBounds(24, 27, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero 2");
		lblNewLabel_1.setBounds(24, 104, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JSpinner spn_num2 = new JSpinner();
		spn_num2.setBounds(82, 101, 46, 20);
		contentPane.add(spn_num2);
		
		
		JLabel lblNewLabel_2 = new JLabel("Operaci\u00F3n");
		lblNewLabel_2.setBounds(24, 63, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox cbx_operacion = new JComboBox();
		cbx_operacion.setModel(new DefaultComboBoxModel(new String[] {"Suma", "Resta", "Multiplicaci\u00F3n", "Divisi\u00F3n"}));
		cbx_operacion.setBounds(82, 60, 76, 20);
		contentPane.add(cbx_operacion);
	
		JButton btn_calcular = new JButton("Calcular");
		btn_calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor1 = (int) spn_num1.getValue();
				int valor2 = (int) spn_num2.getValue();
				int selection = cbx_operacion.getSelectedIndex();
				
				VentanaCalculo ventana = new VentanaCalculo(valor1,valor2,selection);
				ventana.setVisible(true);
			}
		});
		btn_calcular.setBounds(242, 171, 89, 23);
		contentPane.add(btn_calcular);
	}
}
