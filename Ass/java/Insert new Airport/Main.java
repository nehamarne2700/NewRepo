
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String countryName,airportCode,airportName,city;
        System.out.println("Enter the Airport Code :");
        airportCode = br.readLine();
        System.out.println("Enter the Airport name :");
        airportName = br.readLine();
        System.out.println("Enter the City :");
        city = br.readLine();
	    System.out.println("Enter the Country name :");
        countryName = br.readLine();
        Airport airport=new Airport(airportCode,airportName,city,countryName);
        AirportDAO airportDAO=new AirportDAO();
        airportDAO.insertAirport(airport); 
        ArrayList<Airport> alist=airportDAO.listAirport();
        System.out.format("%-10s %-40s %-10s %s\n","IATA Code","Name","City","Country");
        for(Airport a:alist)
        {
            System.out.format("%-10s %-40s %-10s %s\n",a.getIataAirportCode(),a.getName(),a.getCity(),a.getCountry());
        }
    }
}

