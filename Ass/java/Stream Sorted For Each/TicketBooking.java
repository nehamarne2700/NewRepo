public class TicketBooking{
    private String customerName;
    private Integer noOfTickets;
    private Double price;
    
    TicketBooking(String customerName, Integer noOfTickets, Double price){
        this.customerName=customerName;
        this.noOfTickets=noOfTickets;
        this.price=price;
    }
    String getCustomerName(){
        return this.customerName;
    }
    Integer getNoOfTickets(){
        return this.noOfTickets;
    }
    Double getPrice(){
        return this.price;
    }
    public String toString() {
        return String.format("%-10s %-15s %-15s\n", this.customerName,this.noOfTickets,this.price);
    } 
}
