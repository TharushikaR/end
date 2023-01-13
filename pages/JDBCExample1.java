import java.sql.*;

public class JDBCExample1 {
    public static void main(String[] args) throws SQLException {

        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@staysure-uni-qa-19c.c5b84rrs1lhx.eu-west-2.rds.amazonaws.com:1521/STA","UAT02EXP","east_663!");
        Statement stmt=con.createStatement();
        String s="insert into AD_USER values(1520,'Tharushi Unification','Ms','Tharushi','Unification','livetesttharushiunification@gmail.com','Y','Test@123','31-JAN-22','16','','','3','0','','','')";
        stmt.executeQuery(s);
        con.close();
        System.out.println("Program executed.");
    }
}
