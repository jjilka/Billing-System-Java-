import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;
class BillingLogin  implements ActionListener
{
DBConnect d;
Statement s;
Frame bf;
Label bl1,bl2,bl3,l5,l6;
TextField blt1,blt2;
Button bb1,bb2,bb3,bb4,b4;
Panel p,p1;
Dialog d1,d2;
MenuBar mb;
MenuItem m1,m2,m3;
Menu m;
BillingLogin()
{
d=new DBConnect();
bf=new Frame("Billing : Jaikit Jilka");
p=new Panel();
d1=new Dialog(bf);
d1.setTitle("Error");
bl3=new Label("Invalid Credentials");
bl1=new Label("Username");
bl2=new Label("Password");
blt1=new TextField(10);
blt2=new TextField(10);
blt2.setEchoChar('*');
bb1=new Button("Login");
bb2=new Button("Reset");
bb3=new Button("Back");
bb4=new Button("ok");
b4=new Button("OK");
bf.setLayout(new FlowLayout());
bf.add(bl1);
bf.add(blt1);
bf.add(bl2);
bf.add(blt2);
bf.add(bb1);
bf.add(bb2);
bf.add(bb3);
bb1.addActionListener(this);
bb2.addActionListener(this);
bb3.addActionListener(this);
bb4.addActionListener(this);
l5=new Label(" SUPER MARKET BILLING SYSTEM");
l6=new Label("PROJECT BY JAIKIT JILKA");
d2=new Dialog(bf);
mb=new MenuBar();
m=new Menu("File");
m1=new MenuItem("About");
m2=new MenuItem("Exit");
m3=new MenuItem("Help");
d2.setTitle("About");
p1=new Panel();
m1.addActionListener(this);
m2.addActionListener(this);
m3.addActionListener(this);
b4.addActionListener(this);
p1.add(l5);
p1.add(l6);
p1.add(b4);
d2.add(p1);
m.add(m1);
m.add(m3);
m.add(m2);
mb.add(m);
bf.setMenuBar(mb);
d2.setSize(500,100);
d2.setLocation(450,400);
p.add(bl3);
p.add(bb4);
d1.add(p);
bf.setSize(800,500);
d1.setSize(200,90);
bf.setLocation(350,350);
d1.setLocation(450,450);
d1.setVisible(false);
bf.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==bb1)
{
String x=blt1.getText();
String y=blt2.getText();
try
{
ResultSet rs=d.s.executeQuery("select Username and Password From BillingLogin where Username='"+x+"' and Password='"+y+"'");
if(rs.next())
{
String N=rs.getString(1);
new Bill();
bf.dispose();
}
else
{
d1.setVisible(true);
bb1.setEnabled(false);
bb2.setEnabled(false);
bb3.setEnabled(false);
}
}
catch(Exception g)
{
g.printStackTrace();
}}
if(e.getSource()==bb2)
{
blt1.setText("");
blt2.setText("");
}
else if(e.getSource()==bb3)
{
Welcome w=new Welcome();
bf.dispose();
}
else if(e.getSource()==bb4)
{
d1.setVisible(false);
bb1.setEnabled(true);
bb2.setEnabled(true);
bb3.setEnabled(true);
}
else if(e.getSource()==m1)
{
d2.setVisible(true);
}
else if(e.getSource()==m2)
{
bf.dispose();
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
d2.setVisible(false);
}
}
public static void main(String []args)
{
new BillingLogin();
}}