import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDAO {
	public ArrayList<Book> listBooks() throws ClassNotFoundException, SQLException{
    	ArrayList<Book> bookList = new ArrayList<Book>();
    	DBConnection dbCon=new DBConnection();
        Connection con=dbCon.getConnection();
        try
        {
            Statement st=con.createStatement();
            //Excecute stament
            ResultSet r=st.executeQuery("select * from book");
            while(r.next())
            {
                bookList.add(new Book(r.getInt(1),r.getString(2),r.getString(3),r.getString(4),r.getDouble(5)));
            }
            //close connection
            con.close();
        }
        catch(Exception e)
		{
			System.out.println("bookDAO"+e);
		}
		return bookList;
    }
}
