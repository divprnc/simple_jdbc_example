package examples;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DatabaseQuery 
{
    static  Connection con = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    static int rowCount;
    static int CompanyCode = 19;
    static String BranchCode = "MA";
    static String CreatedBy = "U0001";
    static SimpleDateFormat format = new SimpleDateFormat("MMM dd,yyyy");
    static String CreationDate = format.format(new Date());
    static String UserId = "U0001";
    
    public static void GetConnection() throws SQLException
    {
        con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-LVMFGO9; databaseName = FinSoft", "sa", "");
    }
    
    public static void CloseConnection() throws SQLException
    {
        if (rs != null)
        { rs.close(); }
        if (stmt != null)
        { stmt.close(); }
        con.close();
    }
    
    public static ResultSet ExecuteQuery(String query) throws SQLException
    {
        stmt = null;
        rs = null;
        stmt = con.createStatement();
        rs = stmt.executeQuery(query);
        return rs;
        
    }
    
    public static int ExecuteUpdate(String query) throws SQLException
    {
        stmt = null;
        rs = null;
        rowCount = 0;
        stmt = con.createStatement();
        rowCount = stmt.executeUpdate(query);
        return rowCount;
    }    
    
    public static String GetDate(Date d)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd mmm, yyyy");
        return dateFormat.format(d);
    }
}
