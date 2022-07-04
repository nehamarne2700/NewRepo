import java.io.*;
import java.util.ArrayList;
import java.sql.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        BookDAO book=new BookDAO();
        ArrayList<Book> booklist=book.listBooks();
        System.out.println("List of Books");
        System.out.format("%-5s %-20s %-20s %-10s %s\n","Id","Title","Category","Author","Price");
        for(Book b:booklist)
        {
            System.out.format("%-5s %-20s %-20s %-10s %s\n",b.getId(),b.getTitle(),b.getCategory(),b.getAuthor(),b.getPrice());
        }
    }
}

