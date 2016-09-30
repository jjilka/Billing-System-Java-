import java.awt.*;
import java.awt.event.*;
import java.io.*;
class Welcome  implements ActionListener
{
Frame f;
Label l1,l2,l3,l4;
Button wb1,wb2,wb3,wb4;
MenuBar mb;
MenuItem m1,m2,m3;
Menu m,me;
Dialog d1;
Panel p;
Welcome()
{
f=new Frame("Welcome : Jaikit Jilka");
l1=new Label("Welcome To The Super Market");
wb1=new Button("Manager");
wb2=new Button("Billing");
wb3=new Button("Exit");
wb4=new Button("OK");
l3=new Label(" SUPER MARKET BILLING SYSTEM");
l4=new Label("PROJECT BY JAIKIT JILKA");
d1=new Dialog(f);
mb=new MenuBar();
m=new Menu("File");
m1=new MenuItem("About");
m2=new MenuItem("Exit");
m3=new MenuItem("Help");
d1.setTitle("About");
p=new Panel();
wb1.addActionListener(this);
wb2.addActionListener(this);
wb3.addActionListener(this);
m1.addActionListener(this);
m2.addActionListener(this);
m3.addActionListener(this);
wb4.addActionListener(this);
p.add(l3);
p.add(l4);
p.add(wb4);
d1.add(p);
m.add(m1);
m.add(m3);
m.add(m2);
mb.add(m);
f.setMenuBar(mb);
d1.setSize(500,100);
d1.setLocation(450,400);
f.setLayout(null);
f.setSize(800,500);
f.setLocation(350,350);
f.setVisible(true);
f.add(l1);
f.add(wb1);
f.add(wb2);
f.add(wb3);

l1.setBounds(330,100,250,20);

wb1.setBounds(250,250,100,20);
wb2.setBounds(370,250,100,20);
wb3.setBounds(490,250,100,20);

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==wb1)
{
ManagerLogin Ml=new ManagerLogin();
f.dispose();
}
if(e.getSource()==wb2)
{
BillingLogin BL=new BillingLogin();
f.dispose();
}
else if(e.getSource()==wb3)
{
System.exit(0);
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
else if(e.getSource()==wb4)
{
d1.setVisible(false);
}
}
public static void main(String []args)
{
new Welcome();

}}

