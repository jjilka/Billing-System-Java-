import java.sql.*;
class TableCreate
{
DBConnect d;
TableCreate()
{
try
{
d=new DBConnect();

d.s.execute("Create Table BillingLogin (Username text(15),Password text(10))");
}
catch(Exception e)
{
e.printStackTrace();
}
System.out.println("Table Created");
}
public static void main(String []args)
{
new TableCreate();
}}