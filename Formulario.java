import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Formulario extends JFrame implements ActionListener {
	private JLabel l1,l2;
private JTextField tf1,tf2;
private JButton boton1;
private JMenuBar m;
private JMenu menu1;
private JMenuItem opcion1;
public Formulario ()
{
	setLayout(null);
	l1 = new JLabel ("Ancho");
	l1.setBounds(30,0,40,20);
	add(l1);
	l2 = new JLabel("Alto");
	l2.setBounds(95,0,40,20);
	add(l2);
	tf1=new JTextField();
	tf1.setBounds(20,20,60,40);
	add(tf1);
	tf2=new JTextField();
	tf2.setBounds(85,20,60,40);
	add(tf2);
	
	m=new JMenuBar();
	setJMenuBar(m);
	menu1 = new JMenu("Tamaño de la ventana");
	m.add(menu1);

	opcion1 = new JMenuItem("Redimencionar");
	menu1.add(opcion1);
    opcion1.addActionListener(this);
    boton1 = new JButton ("Finalizar");
    boton1.setBounds(150,185,120,50);
    add(boton1);
    boton1.addActionListener(this);

	
}

public void actionPerformed (ActionEvent e)
{
	if (e.getSource () == opcion1)
	{
		String a=tf1.getText();
	int ancho = Integer.parseInt(a);
	
	String b=tf2.getText();
	int alto = Integer.parseInt(b);
	
	setSize(ancho,alto);

	
	}
	if(e.getSource()==boton1)
	{
	System.exit(0);
	}
}
public static void main (String []ar)
{
	Formulario formulario1 = new Formulario();
	formulario1.setBounds(2,3,400,300);
	formulario1.setVisible(true);
	
}
}
