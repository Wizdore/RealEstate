
package realEstate;

import java.sql.*;
import javax.swing.JOptionPane;

public class Connect {
    Connection conn = null;
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:state.sqlite");
            //JOptionPane.showMessageDialog(null, "Connect");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
