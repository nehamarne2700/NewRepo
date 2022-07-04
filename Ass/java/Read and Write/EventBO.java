import java.io.*;
import java.lang.*;
import java.util.*;

public class EventBO {
	public ArrayList<Event> readFromFile(BufferedReader br) throws IOException
	{
        ArrayList<Event> eventList=new ArrayList<Event>();
		String str;
        while((str=br.readLine())!=null)
        {
            String[] arr=str.split(",");
			if(arr.length!=1)
            eventList.add(new Event(arr[0],Integer.parseInt(arr[1]),arr[2]));
        }
        return eventList;
	}
    public static void writeFile(ArrayList<Event> eventList, BufferedWriter bw) throws Exception {
		//System.out.println(eventList.get(0).getOwnerName().equals(eventList.get(2).getOwnerName()));
		for(int i=0;i<eventList.size();i++)
		{
			for(int j=i+1;j<eventList.size();j++)
			{
					if(eventList.get(i).getOwnerName().equals(eventList.get(j).getOwnerName()))
					{
						System.out.println(i+" "+j);
						eventList.remove(j);
					}
			}
		}
		//System.out.println(eventList);
		for(Event e:eventList)
		{
			String str=e.getEventName()+","+e.getAttendeesCount()+","+e.getOwnerName();
			bw.append(str);
			bw.append("\n");
		}
		bw.close();
	}
}
