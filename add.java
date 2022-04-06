//Wap to enter two and perform add operation on that no
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class add implements ActionListener
{
  JFrame fr;
  JLabel l1,l2,l3;
  JTextField t1,t2;
  JButton b1,b2;
  add()
  {
    //Creating Frame.
    fr=new JFrame("ADD TWO NO");
	l1=new JLabel("ENTER 1ST NO");
	l2=new JLabel("ENTER 2nd No");
	l3=new JLabel();
	t1=new JTextField();
	t2=new JTextField();
	b1=new JButton("ADD");
	b2=new JButton("CLEAR");
	l1.setBounds(30,30,140,20);
	l2.setBounds(30,70,140,20);
	t1.setBounds(190,30,60,20);
	t2.setBounds(190,70,60,20);
	l3.setBounds(50,100,200,20);
	b1.setBounds(30,140,60,30);
	b2.setBounds(120,140,90,30);
	fr.setVisible(true);
	fr.setLayout(null);
	//add component on frame.
	fr.add(t2);
	fr.add(b1);
	fr.add(b2);
	fr.add(l1);
	fr.add(l2);
	fr.add(l3);
	fr.add(t1);
	fr.setResizable(false);
	//set color of frame and all other component(button,textfield,level).
	fr.getContentPane().setBackground(Color.green);
	l1.setBackground(Color.red);
	l2.setBackground(Color.yellow);
	t1.setBackground(Color.yellow);
	t1.setForeground(Color.green);
	t2.setBackground(Color.yellow);
	t2.setForeground(Color.green);
	l3.setBackground(Color.red);
	b1.setBackground(Color.yellow);
	b2.setBackground(Color.yellow);
	l3.setForeground(Color.red);
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fr.setBounds(100,100,300,300);
	b1.addActionListener(this);
	b2.addActionListener(this);
  }
  //perform action on button.
  public void actionPerformed(ActionEvent e)
  {
    int a,b,s=0;
	if(e.getSource()==b1)
	{
	  a=Integer.valueOf(t1.getText());
	  b=Integer.valueOf(t2.getText());
	  s=a+b;
	 l3.setText(String.valueOf(s));
	}
	if(e.getSource()==b2)
	{
	  t1.setText("");
	  t2.setText("");
	  l3.setText("");
	  s=0;
	  a=0;
	  b=0;
	 }
	}
	public static void main(String ar[])
	{
	  new add();
	 }
}

	
	
	
  