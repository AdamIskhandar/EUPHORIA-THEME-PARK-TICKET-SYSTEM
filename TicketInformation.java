/**
 * Write a description of class TicketInformation here.
 *
 * @author (Adam Haikal)
 * @version (a version number or a date)
 */
import java.util.*;

class TicketInformation {
    private String ticketId;
    private String rideName;
    private double ticketPrice;
    private String ticketCode;
    private Date purchaseDate;

    public TicketInformation()
    {//constructor without parameter
        this.ticketId = "";
        this.rideName = "";
        this.ticketPrice = 0.00;
        this.ticketCode = "";
        this.purchaseDate = new Date();
    }
    
    public TicketInformation(String ticketId, String rideName, double ticketPrice, String ticketCode) {
        this.ticketId = ticketId;
        this.rideName = rideName;
        this.ticketPrice = ticketPrice;
        this.ticketCode = ticketCode;
        this.purchaseDate = new Date();
    }

    public void setTicketId(String ticketId)
    {
        this.ticketId = ticketId;
    }
    
    public void setRideName(String rideName)
    {
        this.rideName = rideName;
    }
    
    public void setTicketPrice(double ticketPrice)
    {
        this.ticketPrice = ticketPrice;
    }
    
    public void setTicketCode(String ticketCode)
    {
        this.ticketCode = ticketCode;
    }
    
    public void setPurchaseDate(Date purchaseDate)
    {
        this.purchaseDate = purchaseDate;
    }
    
    public String getTicketId()
    {
        return this.ticketId;
    }
    
    public String getRideName()
    {
        return this.rideName;
    }
    
    public double getTicketPrice()
    {
        return this.ticketPrice;
    }
    
    public String getTicketCode()
    {
        return this.ticketCode;
    }
    
    public Date getPurchaseDate()
    {
        return this.purchaseDate;
    }
    
    
}