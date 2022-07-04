import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class AirportDAO {
    public void insertAirport(Airport airportIns) throws ClassNotFoundException, SQLException{
        DBConnection dbCon=new DBConnection();
        Connection con=dbCon.getConnection();
        try
        {
            //Excecute stament
            PreparedStatement ps=con.prepareStatement("insert into airport values(DEFAULT,?,?,?,?)");
            ps.setString(1,airportIns.getIataAirportCode());
            ps.setString(2,airportIns.getName());
            ps.setString(3,airportIns.getCity());
            ps.setString(4,airportIns.getCountry());
            
            ps.execute();
            //close connection
            con.close();
        }
        catch(Exception e)
		{
			System.out.println("TravelDAO"+e);
		}
    }
    public ArrayList<Airport> listAirport() throws ClassNotFoundException, SQLException{
        ArrayList<Airport> airportList= new ArrayList<Airport>();
        DBConnection dbCon=new DBConnection();
        Connection con=dbCon.getConnection();
        try
        {
            Statement st=con.createStatement();
            //Excecute stament
            ResultSet r=st.executeQuery("select * from airport");
            while(r.next())
            {
                airportList.add(new Airport(r.getString(2),r.getString(3),r.getString(4),r.getString(5)));
            }
            //close connection
            con.close();
        }
        catch(Exception e)
		{
			System.out.println("AirportDAO"+e);
		}
        return airportList;
    }
}
