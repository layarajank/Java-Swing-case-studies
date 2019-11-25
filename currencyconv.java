package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class currencyconv {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	public float result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currencyconv window = new currencyconv();
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
	public currencyconv() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("CURRENCY CONVERTER");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCurrencyConverter.setBounds(135, 11, 197, 25);
		frame.getContentPane().add(lblCurrencyConverter);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInput.setBounds(94, 62, 104, 25);
		frame.getContentPane().add(lblInput);
		
		tf1 = new JTextField();
		tf1.setBounds(238, 101, 104, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAmount.setBounds(94, 98, 86, 25);
		frame.getContentPane().add(lblAmount);
		
		JComboBox<Object> cb1 = new JComboBox<Object>();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"INR", "YEN", "DOLLAR"}));
		cb1.setBounds(238, 63, 104, 25);
		frame.getContentPane().add(cb1);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOutput.setBounds(94, 138, 86, 20);
		frame.getContentPane().add(lblOutput);
		
		JComboBox<Object> cb2 = new JComboBox<Object>();
		cb2.setModel(new DefaultComboBoxModel<Object>(new String[] {"INR", "YEN", "DOLLAR"}));
		cb2.setBounds(238, 137, 104, 25);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*Object selectedItem1=cb1.getSelectedItem();
                String str1=( selectedItem1.toString());
				
				Object selectedItem2=cb2.getSelectedItem();
				String str2=( selectedItem2.toString());*/
				String amt=tf1.getText();
				float input=Float.parseFloat(amt);
				if(cb1.getSelectedItem()=="INR")
				{
					if(cb2.getSelectedItem()=="INR")
					{
						tf2.setText(tf1.getText());
					}
					else if(cb2.getSelectedItem()=="DOLLAR")
					{
						result =(float) (input * 0.014);
						String res=String.valueOf(result);
			            tf2.setText("$ "+res);
					}
					else
					{
						if(cb2.getSelectedItem()=="YEN")
						{
							result = (float)(input * 1.51);
							String res=String.valueOf(result);
				            tf2.setText(res);
						}

					}
				}
					else if(cb1.getSelectedItem()=="YEN")
					{
						if(cb2.getSelectedItem()=="YEN")
						{
							tf2.setText(tf1.getText());
						}
						else if(cb2.getSelectedItem()=="INR")
						{
							result =(float) (input * 0.66);
							String res=String.valueOf(result);
				            tf2.setText(res);
						}
						else
						{
							if(cb2.getSelectedItem()=="DOLLAR")
							{
								result = (float)(input * 0.013);
								String res=String.valueOf(result);
					            tf2.setText("$"+res);
							}
						}
					
				    }
					else
					{
					if(cb1.getSelectedItem()=="DOLLAR")
					{
						if(cb2.getSelectedItem()=="DOLLAR")
						{
							tf2.setText(tf1.getText());
						}
						else if(cb2.getSelectedItem()=="INR")
						{
							result =(float)(input * 71.78);
							String res=String.valueOf(result);
				            tf2.setText(res);
						}
						else
						{
							if(cb2.getSelectedItem()=="YEN")
							{
								result = (float)(input * 76.7);;
								String res=String.valueOf(result);
					            tf2.setText(res);
							}
						}
					
				    }
					}
				
				
				
			
			}
			
		});
		btnNewButton.setBounds(143, 177, 104, 25);
		frame.getContentPane().add(btnNewButton);
		
		tf2 = new JTextField();
		tf2.setBounds(255, 216, 104, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);;
			}
		});
		btnNewButton_1.setBounds(158, 254, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblTotalAmountConvert = new JLabel("Total Amount convert to");
		lblTotalAmountConvert.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotalAmountConvert.setBounds(28, 219, 181, 17);
		frame.getContentPane().add(lblTotalAmountConvert);
	}

}
