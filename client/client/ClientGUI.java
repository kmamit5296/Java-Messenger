package client;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.event.*;
public class ClientGUI extends JFrame {
	private static final long serialVersionUID = 1L;
	GridBagLayout gb1,gb2;
	GridBagConstraints gc1,gc2;
	JPanel jp;
	JTextField jtf;
	JButton jb;
	JScrollPane jsp;
	int po;
	String smsg;
	void properties(){
		setSize(700,600);
		setTitle("Chat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void stLyt(){
		gb1=new GridBagLayout();
		gc1=new GridBagConstraints();
		setLayout(gb1);
	}
	void addPanelLabel(String msg){
		JLabel jl=new JLabel(msg);
		jl.setFont(new Font("Verdana",Font.ITALIC,15));
		jl.setForeground(Color.BLUE);
		gc2.gridx=0;
		gc2.gridy=po++;
		gc2.insets=new Insets(0,0,0,550);
		gc2.fill=GridBagConstraints.HORIZONTAL;
		gb2.setConstraints(jl,gc2);
		jp.add(jl);
	}
	void addPanel(){
		jp=new JPanel();
		jp.setBackground(Color.LIGHT_GRAY);
		jsp=new JScrollPane(jp,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jsp.setBorder(new LineBorder(Color.BLUE,5));
		
	
		gc1.gridx=0;
		gc1.gridy=1;
		gc1.gridwidth=2;
		gc1.ipadx=640;
		gc1.ipady=300;
		gb1.setConstraints(jsp, gc1);
		add(jsp);
		gb2=new GridBagLayout();
		gc2=new GridBagConstraints();
		jp.setLayout(gb2);
	}
	void addTextBox(){
		jtf=new JTextField(40);
		jtf.setBorder(new LineBorder(Color.GREEN,5));
		gc1.gridx=0;
		gc1.gridy=2;
		gc1.gridwidth=1;
		gc1.ipadx=0;
		gc1.ipady=0;
		gb1.setConstraints(jtf, gc1);
		add(jtf);
	}
	void addButton(){
		jb=new JButton("   SEND   ");
		jb.setFont(new Font("Impact",Font.BOLD,20));
		getRootPane().setDefaultButton(jb);
		gc1.gridx=0;
		gc1.gridy=3;
		gb1.setConstraints(jb, gc1);
		add(jb);
		jb.addActionListener(new ChWork());
	}
	void addLabel(){
		JLabel jl=new JLabel("SMART CHAT");
		jl.setFont(new Font("Cambria Math",Font.BOLD,50));
		jl.setForeground(Color.RED);
		gc1.gridx=0;
		gc1.gridy=0;
		gb1.setConstraints(jl,gc1);
		add(jl);
	}
	void addComponents(){
		addLabel();
		addPanel();
		addTextBox();
		addButton();
	}
	public void control(){
		properties();
		stLyt();
		addComponents();
		setVisible(true);
	}
	class ChWork implements ActionListener{
		public void actionPerformed(ActionEvent e){
			smsg=jtf.getText();
			jtf.setText("");
			ChatClientDriver.ccl.run1();
			jsp.validate();
		}
	}


}
