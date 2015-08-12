package properties;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import realEstate.Login;

public class Flat
{
    private String country,city,street,details;
    private double price,size;
    private boolean gas,water,elect,lift,generator;
    
    private int sellerID,buyerID;
    Flat()
    {
        buyerID = 0;
        sellerID = Login.userID;
    }
    
    public void setStrings(String co,String ci,String str, String det)
    {
        country = co;
        city = ci;
        street = str;
        details = det;
    }
    public void setBooleans(boolean g,boolean w,boolean e,boolean l, boolean gen)
    {
        gas = g;
        water = w;
        elect = e;
        lift = l;
        generator = gen;
    }
    public void setdoubles(double p,double s)
    {
        price = p;
        size = s;
    }
    public boolean runQuery()
    {
        String sql = "";
        try {
            sql =   "INSERT INTO flats(\"country\",\"city\","
                    + "\"street\",\"details\",\"price\",\"size\",\"gas\",\"water\","
                    + "\"elect\",\"lift\",\"generator\",\"SellerID\",\"BuyerID\")"
                    + " VALUES (\""+country+"\",\""+city+"\",\""+street+"\","
                    + "\""+details+"\",\""+price+"\",\""+size+"\",\""+gas+"\",\""+water+"\","
                    + "\""+elect+"\",\""+lift+"\",\""+generator+"\",\""+sellerID+"\","
                    + "\""+buyerID+"\")";
            Login.stmt.execute(sql);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, sql);
            return false;
        }
    }
}
