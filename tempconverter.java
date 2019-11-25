package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tempconverter {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tempconverter window = new tempconverter();
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
	public tempconverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDegree = new JLabel("DEGREE");
		lblDegree.setBounds(86, 54, 46, 14);
		frame.getContentPane().add(lblDegree);
		
		textField = new JTextField();
		textField.setBounds(174, 51, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblResult = new JLabel("Result =");
		lblResult.setBounds(86, 135, 105, 20);
		frame.getContentPane().add(lblResult);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(214, 135, 86, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnCelsius = new JButton("CELSIUS");
		btnCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float x=Float.parseFloat(textField.getText());
				float cel=(float)(x-273.15);
				String res=String.valueOf(cel);
				lblNewLabel.setText(res);
				
				
			}
		});
		btnCelsius.setBounds(102, 176, 89, 23);
		frame.getContentPane().add(btnCelsius);
		
		JButton btnFhrnht = new JButton("FHRNHT");
		btnFhrnht.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float x=Float.parseFloat(textField.getText());
				float frn=(float)(((x-273.15)*9)/5)+32;
				String res=String.valueOf(frn);
				lblNewLabel.setText(res);
			}
		});
		btnFhrnht.setBounds(246, 176, 89, 23);
		frame.getContentPane().add(btnFhrnht);
		
		
	}

}
