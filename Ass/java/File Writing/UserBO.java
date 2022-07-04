import java.io.*;
import java.util.*;

public class UserBO {

	public void writeFile(ArrayList<User> userList, BufferedWriter bw) throws Exception {
		for(User u:userList)
		{
			String str=u.getName()+","+u.getMobileNumber()+","+u.getUsername()+","+u.getPassword();
			bw.append(str);
			bw.append("\n");
		}
		bw.close();
	}
}
