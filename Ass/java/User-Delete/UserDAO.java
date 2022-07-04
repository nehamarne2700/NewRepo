
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.*;
public class UserDAO{

    public ArrayList<User> listUsers() throws Exception{
    	ArrayList<User> userList = new ArrayList<User>();
    	DBConnection dbCon=new DBConnection();
      Connection con=dbCon.getConnection();
      try
      {
          Statement st=con.createStatement();
          //Excecute stament
          ResultSet r=st.executeQuery("select * from \"user\"");
          while(r.next())
          {
              userList.add(new User(r.getInt(1),r.getString(2),r.getString(3),r.getString(4),r.getInt(5),r.getString(6),r.getDate(7),r.getString(8)));
          }
          //close connection
          con.close();
      }
      catch(Exception e)
      {
          System.out.println("UserDAO"+e);
      }
    
		return userList;
    }
    public void deleteUser(Integer id) throws Exception{
    	DBConnection dbCon=new DBConnection();
        Connection con=dbCon.getConnection();
        try
        {
            //Excecute stament
            PreparedStatement ps=con.prepareStatement("delete from \"user\" where id=?");
            ps.setInt(1,id);
           
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