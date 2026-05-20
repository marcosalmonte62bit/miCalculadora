package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logic.Operaciones;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalculo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtResultado;

	/**
	 * Create the dialog.
	 */
	public VentanaCalculo(int valor1, int valor2, int selection) {
		setTitle("Result");
		setBounds(100, 100, 370, 162);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("El resultado de tu operaci\u00F3n es: ");
				lblNewLabel.setBounds(10, 23, 163, 31);
				panel.add(lblNewLabel);
			}
			{
				txtResultado = new JTextField();
				txtResultado.setText(String.valueOf(Operaciones.operation(valor1, valor2, selection)));
				txtResultado.setEditable(false);
				txtResultado.setBounds(169, 28, 144, 20);
				panel.add(txtResultado);
				txtResultado.setColumns(10);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}
