package swing;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class progressreport {

	private JFrame frame;
	private JTextField sid;
	private JTextField fn;
	private JTextField sn;
	private JTextField ts;
	private JTextField av;
	private JTextField rk;
	private JTextField mt;
	private JTextField en;
	private JTextField bi;
	private JTextField cp;
	private JTextField ch;
	private JTextField ph;
	private JTextField ta;
	private JTextField mal;
	private JTable table;
	public String str;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progressreport window = new progressreport();
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
	public progressreport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBackground(Color.BLUE);
		frame.setBounds(100, 100, 966, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 479, 331);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentid.setBounds(10, 29, 73, 14);
		panel.add(lblStudentid);
		
		sid = new JTextField();
		sid.setBounds(110, 27, 101, 20);
		panel.add(sid);
		sid.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Firstname");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 68, 73, 14);
		panel.add(lblNewLabel);
		
		fn = new JTextField();
		fn.setBounds(110, 66, 101, 20);
		panel.add(fn);
		fn.setColumns(10);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSurname.setBounds(10, 104, 79, 14);
		panel.add(lblSurname);
		
		sn = new JTextField();
		sn.setBounds(110, 102, 101, 20);
		panel.add(sn);
		sn.setColumns(10);
		
		JLabel lblCorseCode = new JLabel("Corse Code");
		lblCorseCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCorseCode.setBounds(10, 142, 73, 14);
		panel.add(lblCorseCode);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 180, 207, -11);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 188, 201, 2);
		panel.add(separator_1);
		
		JComboBox cb = new JComboBox();
		cb.setModel(new DefaultComboBoxModel(new String[] {"select", "114M", "106EC", "105CS", "103EEE"}));
		cb.setBounds(110, 140, 101, 20);
		panel.add(cb);
		
		JLabel lblT = new JLabel("Total Score");
		lblT.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblT.setBounds(10, 207, 91, 20);
		panel.add(lblT);
		
		ts = new JTextField();
		ts.setBounds(110, 208, 101, 20);
		panel.add(ts);
		ts.setColumns(10);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAverage.setBounds(10, 242, 73, 20);
		panel.add(lblAverage);
		
		av = new JTextField();
		av.setBounds(110, 239, 101, 20);
		panel.add(av);
		av.setColumns(10);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRanking.setBounds(10, 276, 91, 20);
		panel.add(lblRanking);
		
		rk = new JTextField();
		rk.setBounds(110, 277, 101, 19);
		panel.add(rk);
		rk.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Maths");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(264, 28, 85, 20);
		panel.add(lblNewLabel_1);
		
		mt = new JTextField();
		mt.setBounds(359, 29, 110, 20);
		panel.add(mt);
		mt.setColumns(10);
		
		en = new JTextField();
		en.setBounds(359, 66, 110, 20);
		panel.add(en);
		en.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("English");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(264, 66, 73, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Biology");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(265, 100, 84, 25);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Computer");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(264, 138, 73, 25);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Chemistry");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(264, 176, 73, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(" Physics");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(262, 211, 87, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel(" Tamil");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(264, 243, 85, 20);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(" Malayalam");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(264, 279, 78, 16);
		panel.add(lblNewLabel_8);
		
		bi = new JTextField();
		bi.setBounds(359, 102, 110, 20);
		panel.add(bi);
		bi.setColumns(10);
		
		cp = new JTextField();
		cp.setBounds(359, 142, 110, 18);
		panel.add(cp);
		cp.setColumns(10);
		
		ch = new JTextField();
		ch.setBounds(359, 170, 110, 20);
		panel.add(ch);
		ch.setColumns(10);
		
		ph = new JTextField();
		ph.setBounds(359, 208, 110, 20);
		panel.add(ph);
		ph.setColumns(10);
		
		ta = new JTextField();
		ta.setBounds(359, 242, 110, 20);
		panel.add(ta);
		ta.setColumns(10);
		
		mal = new JTextField();
		mal.setBounds(359, 277, 110, 20);
		panel.add(mal);
		mal.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panel_1.setBounds(499, 11, 441, 331);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(10, 23, 421, 257);
		panel_1.add(ta1);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta1.setText("");
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.setBounds(181, 297, 89, 23);
		panel_1.add(btnClear);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"  Student ID", "Course name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "  Malayalam", " Total", "Average", "Ranking"},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Student ID", "Course name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total", "Average", "Ranking"
			}
		));
		table.setBounds(10, 353, 930, 152);
		frame.getContentPane().add(table);
		
		JButton btnAddReport = new JButton("Add Report");
		btnAddReport.addActionListener(new ActionListener() {
			private String str13;

			public void actionPerformed(ActionEvent arg0) {
				String str1=sid.getText();
				String str2=(String) cb.getSelectedItem();
				String str3=mt.getText();
				String str4=en.getText();
				String str5=bi.getText();
				String str6=cp.getText();
				String str7=ch.getText();
				String str8=ph.getText();
				String str9=ta.getText();
				String str10=mal.getText();
				float maths=Float.parseFloat(str3);
				float english=Float.parseFloat(str4);
				float biology=Float.parseFloat(str5);
				float computer=Float.parseFloat(str6);
				float chemistry=Float.parseFloat(str7);
				float physics=Float.parseFloat(str8);
				float tamil=Float.parseFloat(str9);
				float malayalam=Float.parseFloat(str10);
				float total=maths+english+biology+computer+chemistry+physics+tamil+malayalam;
				if(total>=400) 
				{
					str="pass";
				}
				else
				{
					str="fail";
				}
				String str11=String.valueOf(total);
				float avrge=(maths+english+biology+computer+chemistry+physics+tamil+malayalam)/8;
				String str12=String.valueOf(avrge);
				ts.setText(str11);
				av.setText(str12);
				rk.setText(str);
				String[]row= {str1,str2,str3,str4,str5,str6,str7,str8,str9,str10,str11,str12,str};
				DefaultTableModel a=(DefaultTableModel)table.getModel();
				a.addRow(row);
					
			}
		});
		btnAddReport.setForeground(new Color(0, 153, 102));
		btnAddReport.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddReport.setBounds(152, 516, 114, 23);
		frame.getContentPane().add(btnAddReport);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*int row=table.getSelectedRow();
				DefaultTableModel a=(DefaultTableModel) table.getModel();
				a.removeRow(row);*/
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1)
				{
				if(table.getRowCount()==0)
				{
				JOptionPane.showMessageDialog(null, "NO data to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				else {
				JOptionPane.showMessageDialog(null, "Select a row to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				}
				else {
				model.removeRow(table.getSelectedRow());
				}

			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setForeground(new Color(255, 51, 51));
		btnDelete.setBounds(317, 516, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnShowReport = new JButton("Show Report");
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta1.append("Student Record \n");
				String name=fn.getText();
				String nam=sn.getText();
				ta1.append("\nStudent Name\t\t\t\t"+name+" "+nam);
				ta1.append("\n===============================");
				ta1.append("\nMaths\t\t\t\t"+mt.getText());
				ta1.append("\n English\t\t\t\t"+en.getText());
				ta1.append("\n Biology\t\t\t\t"+bi.getText());
				ta1.append("\n Computer\t\t\t\t"+cp.getText());
				ta1.append("\n Chemistry\t\t\t\t"+ch.getText());
				ta1.append("\n Physics\t\t\t\t"+ph.getText());
				ta1.append("\n Tamil\t\t\t\t"+ta.getText());
				ta1.append("\n Malayalam\t\t\t\t"+mal.getText());
				ta1.append("\n================================");
				ta1.append("\n Total Score\t\t\t\t"+ts.getText());
				ta1.append("\n Average\t\t\t\t"+av.getText());
				ta1.append("\n Ranking\t\t\t\t"+rk.getText());
				
				
				
				
				
			}
			
		});
		btnShowReport.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnShowReport.setBounds(448, 516, 114, 23);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setForeground(new Color(255, 51, 0));
		btnExit.setBounds(606, 516, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				sid.setText("");
				fn.setText("");
				sn.setText("");
				ts.setText("");
				rk.setText("");
				ta.setText("");
				mt.setText("");
				en.setText("");
				bi.setText("");
				cp.setText("");
				ch.setText("");
				ph.setText("");
				ta.setText("");
				mal.setText("");
				av.setText("");
				cb.setSelectedIndex(0);
				
				
			}
		});
		btnReset.setForeground(new Color(153, 102, 255));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.setBounds(750, 516, 89, 23);
		frame.getContentPane().add(btnReset);
	}
}
