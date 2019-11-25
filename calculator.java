package swing;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Math;
public class calculator {

	private JFrame frame;
	private JTextField tf;
	private JButton sqrt;
	private JButton btnx;
	private JButton sin;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton div;
	private JButton percntge;
	private JButton pwr;
	private JButton sqr;
	private JButton exp;
	private JButton ln;
	private JButton fact;
	private JButton cos;
	private JButton sec;
	private JButton tan;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton mul;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton add;
	private JButton b0;
	private JButton bp;
	private JButton equals;
	private JButton sub;
	public String str1,str2,opp; 
	public int clr=0,df=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
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
		
		JLabel lblEditViewHelp = new JLabel(" Edit  View           help");
		lblEditViewHelp.setBounds(0, 0, 295, 14);
		frame.getContentPane().add(lblEditViewHelp);
		
		tf = new JTextField();
		tf.setBounds(10, 25, 414, 35);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		sqrt = new JButton("sqrt");
		sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clr=1;
				str1=tf.getText();
				float a=Float.parseFloat(str1);
				double c=Math.sqrt(a);
				String res=String.valueOf(c);
				tf.setText(res);
			}
		});
		sqrt.setBounds(8, 78, 65, 35);
		frame.getContentPane().add(sqrt);
		
		btnx = new JButton("1/X");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clr=1;
				str1=tf.getText();
				float a=Float.parseFloat(str1);
				float c=1/a;
				String res=String.valueOf(c);
				tf.setText(res);
				
			}
		});
		btnx.setBounds(81, 78, 65, 35);
		frame.getContentPane().add(btnx);
		
		sin = new JButton("sin");
		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clr=1;
				str1=tf.getText();
				tf.setText("");
				df=0;
				float a=Float.parseFloat(str1);
				float c=(float)Math.sin((a*Math.PI)/180);
				String res=String.valueOf(c);
				tf.setText(res);
				
				
			}
		});
		sin.setBounds(156, 78, 65, 35);
		frame.getContentPane().add(sin);
		
		b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(clr==1)
				{
					tf.setText("");
					clr=0;
				}
				tf.setText(tf.getText().concat(b7.getText()));
			}
		});
		b7.setBounds(231, 78, 43, 35);
		frame.getContentPane().add(b7);
		
		b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(clr==1)
				{
					tf.setText("");
					clr=0;
				}
				tf.setText(tf.getText().concat(b8.getText()));
			}
		});
		b8.setBounds(284, 78, 43, 35);
		frame.getContentPane().add(b8);
		
		b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(clr==1)
				{
					tf.setText("");
					clr=0;
				}
				tf.setText(tf.getText().concat(b9.getText()));
			}
		});
		b9.setBounds(337, 78, 43, 35);
		frame.getContentPane().add(b9);
		
		div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tf.getText();
				tf.setText("");
				df=0;
				opp="div";
			}
		});
		div.setBounds(390, 78, 43, 35);
		frame.getContentPane().add(div);
		
		percntge = new JButton("% ");
		percntge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tf.getText();
				tf.setText("");
				df=0;
				opp="per";
			}
		});
		percntge.setBounds(10, 124, 65, 35);
		frame.getContentPane().add(percntge);
		
		pwr = new JButton("x^y");
		pwr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tf.getText();
				tf.setText("");
				df=0;
				opp="Pow";
			}
		});
		pwr.setBounds(10, 170, 65, 35);
		frame.getContentPane().add(pwr);
		
		sqr = new JButton("x^2");
		sqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clr=1;
				str1=tf.getText();
				float a=Float.parseFloat(str1);
				float c=a*a;
				String res=String.valueOf(c);
				tf.setText(res);
			}
		});
		sqr.setBounds(10, 216, 65, 35);
		frame.getContentPane().add(sqr);
		
		exp = new JButton("Exp");
		exp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clr=1;
				str1=tf.getText();
				double a=Float.parseFloat(str1);
				double c=Math.exp(a);
				String res=String.valueOf(c);
				tf.setText(res);
			}
		});
		exp.setBounds(81, 124, 65, 35);
		frame.getContentPane().add(exp);
		
		ln = new JButton("ln");
		ln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clr=1;
				str1=tf.getText();
				double a=Float.parseFloat(str1);
				double c=Math.log(a);
				String res=String.valueOf(c);
				tf.setText(res);
			}
		});
		ln.setBounds(81, 170, 65, 35);
		frame.getContentPane().add(ln);
		
		fact = new JButton("n!");
		fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clr=1;
				str1=tf.getText();
				float a=Float.parseFloat(str1);
				float c=1;
				while(a>0)
				{
					c=c*a;
					a--;
				}
				String res=String.valueOf(c);
				tf.setText(res);
				
			}
				
			
		});
		fact.setBounds(81, 216, 65, 35);
		frame.getContentPane().add(fact);
		
		cos = new JButton("cos");
		cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clr=1;
				str1=tf.getText();
				tf.setText("");
				df=0;
				float a=Float.parseFloat(str1);
				float c=(float)Math.cos(a);
				float t=(float)((c*Math.PI)/180);		
				String res=String.valueOf(t);
				tf.setText(res);
			}
		});
		cos.setBounds(156, 124, 65, 35);
		frame.getContentPane().add(cos);
		
		sec = new JButton("sec");
		sec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clr=1;
				str1=tf.getText();
				tf.setText("");
				df=0;
				float a=Float.parseFloat(str1);
				double t=Math.cos(a);
				double c=1/t;
				String res=String.valueOf(c);
				tf.setText(res);
			}
		});
		sec.setBounds(156, 170, 65, 35);
		frame.getContentPane().add(sec);
		
		tan = new JButton("tan");
		tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clr=1;
				str1=tf.getText();
				tf.setText("");
				df=0;
				float a=Float.parseFloat(str1);
				float c=(float)Math.tan((a*Math.PI)/180);
				String res=String.valueOf(c);
				tf.setText(res);
			}
		});
		tan.setBounds(156, 216, 65, 35);
		frame.getContentPane().add(tan);
		
		b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(clr==1)
				{
					tf.setText("");
					clr=0;
				}
				tf.setText(tf.getText().concat(b4.getText()));
			}
			
		});
		b4.setBounds(231, 124, 43, 35);
		frame.getContentPane().add(b4);
		
		b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(clr==1)
				{
					tf.setText("");
					clr=0;
				}
				tf.setText(tf.getText().concat(b5.getText()));
			}
		});
		b5.setBounds(284, 124, 43, 35);
		frame.getContentPane().add(b5);
		
		b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(clr==1)
				{
					tf.setText("");
					clr=0;
				}
				tf.setText(tf.getText().concat(b6.getText()));
			}
		});
		b6.setBounds(337, 124, 43, 35);
		frame.getContentPane().add(b6);
		
		mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tf.getText();
				tf.setText("");
				df=0;
				opp="mul";
			}
		});
		mul.setBounds(390, 124, 44, 35);
		frame.getContentPane().add(mul);
		
		b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(clr==1)
				{
					tf.setText("");
					clr=0;
				}
				tf.setText(tf.getText().concat(b1.getText()));
			}
		});
		b1.setBounds(231, 170, 43, 35);
		frame.getContentPane().add(b1);
		
		b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(clr==1)
				{
					tf.setText("");
					clr=0;
					
				}
				tf.setText(tf.getText().concat(b2.getText()));
			}
		});
		b2.setBounds(284, 170, 47, 35);
		frame.getContentPane().add(b2);
		
		b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(clr==1)
				{
					tf.setText("");
					clr=0;
				}
				tf.setText(tf.getText().concat(b3.getText()));
			}
		});
		b3.setBounds(337, 170, 43, 35);
		frame.getContentPane().add(b3);
		
		add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tf.getText();
				tf.setText("");
				df=0;
				opp="add";
			}
		});
		add.setBounds(390, 170, 44, 35);
		frame.getContentPane().add(add);
		
		b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(clr==1)
				{
					tf.setText("");
					clr=0;
				}
				tf.setText(tf.getText().concat(b0.getText()));
				
		
			}
		});
		b0.setBounds(231, 216, 43, 35);
		frame.getContentPane().add(b0);
		
		bp = new JButton(".");
		bp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(clr==1)
				{
					tf.setText("");
					clr=0;
				}
				if(df==0)
				{
				tf.setText(tf.getText().concat(bp.getText()));
				df=1;
				
				}
			}
		});
		bp.setBounds(284, 216, 47, 35);
		frame.getContentPane().add(bp);
		
		equals = new JButton("=");
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str2=tf.getText();
				tf.setText("");
				df=0;
				clr=1;
				float a=Float.parseFloat(str1);
				float b=Float.parseFloat(str2);
				if(opp.equals("add"))
				{
					float c=a+b;
					String res=String.valueOf(c);
					tf.setText(res);
				}
				if(opp.equals("sub"))
				{
					float c=a-b;
					String res=String.valueOf(c);
					tf.setText(res);
				}
				if(opp.equals("div"))
				{
					float c=a/b;
					String res=String.valueOf(c);
					tf.setText(res);
				}
				if(opp.equals("mul"))
				{
					float c=a*b;
					String res=String.valueOf(c);
					tf.setText(res);
				}
				if(opp.equals("Pow"))
				{
					double c=Math.pow(a,b);
					String res=String.valueOf(c);
					tf.setText(res);
					
				}
				if(opp.equals("per"))
			      {
					float c=(a*b)/100;
					String res=String.valueOf(c);
					tf.setText(res);
					}
				
				
			}
		});
		equals.setBounds(335, 216, 45, 35);
		frame.getContentPane().add(equals);
		
		sub = new JButton("_");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tf.getText();
				tf.setText("");
				df=0;
				opp="sub";
			}
		});
		sub.setBounds(387, 216, 46, 35);
		frame.getContentPane().add(sub);
	}
}
