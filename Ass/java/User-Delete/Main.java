import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Main{
    
    public static void main(String [] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        UserDAO userDAO=new UserDAO();
        System.out.println("Before the Delete");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n","Id","Name","Email","Password","Age","Role","CreatedDate","Status");
        ArrayList<User> ulist=userDAO.listUsers();
        for(User u:ulist)
        {
            System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n",u.getId(),u.getName(),u.getEmail(),u.getPassword(),u.getAge(),u.getRole(),u.getCreatedDate(),u.getStatus());
        }
        System.out.println("Enter the Id :");
        int id=sc.nextInt();
        userDAO.deleteUser(id); 
        System.out.println("After the Delete");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n","Id","Name","Email","Password","Age","Role","CreatedDate","Status");
        ulist=userDAO.listUsers();
        for(User u:ulist)
        {
            System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n",u.getId(),u.getName(),u.getEmail(),u.getPassword(),u.getAge(),u.getRole(),u.getCreatedDate(),u.getStatus());
        }
        userDAO.deleteUser(id); 
    }

}