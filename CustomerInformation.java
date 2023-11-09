/**
 * Write a description of class avbd here.
 *
 * @author (Adam Haikal)
 */

import java.util.*;

class CustomerInformation 
{//declare variable
    private String custId;
    private String custName;
    private int counterPaid;
    private int ticketsQuantity;
    private double totalPay;
    private LinkedList<TicketInformation> ticketsPurchased = new LinkedList<TicketInformation>();

    public CustomerInformation()
    {//constructor without parameter
        this.custId = "";
        this.custName = "";
        this.counterPaid = 0;
        this.ticketsQuantity = 0;
        this.totalPay = 0.00;
    }

    public CustomerInformation(String custId, String custName, int counterPaid, int ticketsQuantity) 
    {//constructor with parameter
        this.custId = custId;
        this.custName = custName;
        this.counterPaid = counterPaid;
        this.ticketsQuantity = ticketsQuantity;
    }

    public void setCustId(String custId)
    {
        this.custId = custId;
    }

    public void setCustName(String custName)
    {
        this.custName = custName;
    }

    public void setCounterPaid(int counterPaid)
    {
        this.counterPaid = counterPaid;
    }

    public void setTicketsQuantity(int ticketQuantity)
    {
        this.ticketsQuantity = ticketsQuantity;
    }

    public void setTicket(TicketInformation ticket) 
    {
        this.ticketsPurchased.add(ticket);
    }
    
    public void setTotalPay(double total)
    {
        totalPay = total;
    }

    public String getCustId()
    {
        return this.custId;
    }

    public String getCustName()
    {
        return this.custName;
    }

    public int getCounterPaid()
    {
        return this.counterPaid;
    }

    public int getTicketsQuantity()
    {
        return this.ticketsQuantity;
    }
    
    public double getTotalPay()
    {
        return totalPay;
    }

    public LinkedList<TicketInformation> getTicketsPurchased() 
    {
        return this.ticketsPurchased;
    }

    public String toString(){
        
        TicketInformation ticket = (TicketInformation) ticketsPurchased.peek();
        return ("\nTicket ID : " + ticket.getTicketId() +
            "\nCustomer ID : " + custId +
            "\nCustomer Name : " + custName + 
            "\nCounter Paid : " + counterPaid +
            "\nTicket Quantity : " + ticketsQuantity +
            "\nTicket Ride Name : " + ticket.getRideName() +
            "\nTicket Price : " + ticket.getTicketPrice() +
            "\nTotal Pay : " + totalPay);
    }
}