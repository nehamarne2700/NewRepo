import java.util.*;
import java.util.stream.Collectors; 
//Fill code here 

class Main
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        List<TicketBooking> tbList=new ArrayList<TicketBooking>();
        System.out.println("Enter number of bookings");
        int n=sc.nextInt();
        sc.nextLine();
        String customerName;
        int noOfTickets;
        Double price;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter customer name");
            customerName=sc.nextLine();
            System.out.println("Enter number of tickets");
            noOfTickets=Integer.parseInt(sc.nextLine());
            System.out.println("Enter the price");
            price=Double.parseDouble(sc.nextLine());
            tbList.add(new TicketBooking(customerName,noOfTickets,price));
        }
        System.out.format("%-10s %-15s %-15s\n", "Customer", "No Of Tickets", "Price");
        // tbList=tbList.stream().sorted().collect(Collectors.toList());
        // tbList.forEach( (tb) -> {tb.toString();} );
        // System.out.println(tbList.get(0).getPrice());
        tbList=tbList.stream().sorted((p1, p2)->p1.getPrice().compareTo(p2.getPrice())).collect(Collectors.toList());
        tbList.forEach( (tb) -> {System.out.println(tb.toString());;} );
        
    }
}
