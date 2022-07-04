import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TravelClassDAO {
    ArrayList<TravelClass> listAllTravelClassess() throws ClassNotFoundException, SQLException {
        
        ArrayList<TravelClass> travelClassList= new ArrayList<TravelClass>();
        DBConnection dbCon=new DBConnection();
        Connection con=dbCon.getConnection();
        try
        {
            Statement st=con.createStatement();
            //Excecute stament
            ResultSet r=st.executeQuery("select * from travel_class order by name desc");
            while(r.next())
            {
                travelClassList.add(new TravelClass(r.getString(2),r.getString(3)));
            }
            //close connection
            con.close();
        }
        catch(Exception e)
		{
			System.out.println("TravelDAO"+e);
		}
        return travelClassList;
    }
    public void updateDetail(String name, String description) throws ClassNotFoundException, SQLException {
    	//System.out.println("in update");
        DBConnection dbCon=new DBConnection();
        Connection con=dbCon.getConnection();
        try
        {
            //Excecute stament
            PreparedStatement ps=con.prepareStatement("update travel_class set description=? where name=?");
            ps.setString(2,name);
            ps.setString(1,description);
            ps.execute();
            //close connection
            con.close();
        }
        catch(Exception e)
		{
			System.out.println("TravelDAO"+e);
		}
    }
}
