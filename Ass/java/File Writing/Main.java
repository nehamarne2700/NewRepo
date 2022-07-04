import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of users:");
		int n=sc.nextInt();
		sc.nextLine();
		ArrayList<User> list=new ArrayList<User>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of user :"+(i+1));
			String[] arr=sc.nextLine().split(",");
			list.add(new User(arr[0],arr[1],arr[2],arr[3]));
		}
		UserBO user=new UserBO();
		BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
		user.writeFile(list,bw);
	}
}
