import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;
public class AddStock implements ActionListener
{
DBConnect d;
Statement s;
Frame f;
Label l1,l2,l3,l4,l5,l6;
TextField t1,t2,t3,t4;
Button b1,b2,b3,b4;
MenuBar mb;
MenuItem m1,m2,m3;
Menu m;
Dialog d1;
Panel p;
AddStock()
{
d=new DBConnect();
f=new Frame("Add Stock : Jaikit Jilka");
l1=new Label("Product ID:");
l2=new Label("Product Name:");
l3=new Label("Mrp:");
l4=new Label("Qty");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
t4=new TextField(10);
b1=new Button("Add Product");
b2=new Button("Back");
b3=new Button("Add Stock");
b4=new Button("OK");
l5=new Label(" SUPER MARKET BILLING SYSTEM");
l6=new Label("PROJECT BY JAIKIT JILKA");
d1=new Dialog(f);
mb=new MenuBar();
m=new Menu("File");
m1=new MenuItem("About");
m2=new MenuItem("Exit");
m3=new MenuItem("Help");
d1.setTitle("About");
p=new Panel();
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
t3.addActionListener(this);
m1.addActionListener(this);
m2.addActionListener(this);
m3.addActionListener(this);
b4.addActionListener(this);
p.add(l5);
p.add(l6);
p.add(b4);
d1.add(p);
m.add(m1);
m.add(m3);
m.add(m2);
mb.add(m);
f.setMenuBar(mb);
d1.setSize(500,100);
d1.setLocation(450,400);
f.setLayout(new FlowLayout());
f.setVisible(true);
f.setSize(800,500);
f.setLocation(350,350);
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(l3);
f.add(t3);
f.add(l4);
f.add(t4);
f.add(b1);
f.add(b2);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
String a=t1.getText();
String b=t2.getText();
String c=t3.getText();
String p=t4.getText();
try
{
d.s.executeUpdate("INSERT INTO Product(ID,product1,product2,Quantity)  VALUES ('"+a+"','"+b+"','"+c+"','"+p+"')");
}
catch(Exception z)
{
z.printStackTrace();
}

t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
}
else if(e.getSource()==b2)
{
new Stock();
f.dispose();
}
else if(e.getSource()==m1)
{
d1.setVisible(true);
}
else if(e.getSource()==m2)
{
f.dispose();
}
else if(e.getSource()==m3)
{
try
{
Runtime.getRuntime().exec("C:/Program Files/Internet Explorer/iexplore.exe"+" file:///D:/project/help.html");
}
catch(IOException z)
{}
}
else if(e.getSource()==b4)
{
d1.setVisible(false);
}
}
public static void main(String []args)
{
new AddStock();
}}