import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		EventBO event=new EventBO();
		ArrayList<Event> eventList=new ArrayList<Event>();
		eventList=event.readFromFile(br);
		BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
		event.writeFile(eventList,bw);
	}
}
