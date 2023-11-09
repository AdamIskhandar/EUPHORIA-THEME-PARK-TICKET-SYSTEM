import java.io.*;
import java.util.*;

public class EuphoraThemePark
{
    public static void main(String [] args)
    {
        try{
            //Phase 1 - make linkedlist customerList
            LinkedList<CustomerInformation> customerList = new LinkedList<CustomerInformation>();
            Queue ticketsList = new Queue();

            //Read from the input file customer.txt and ticket.txt
            BufferedReader inCustomer = new BufferedReader( new FileReader("customer.txt"));
            BufferedReader inputTicket = new BufferedReader(new FileReader("Tickets.txt"));

            // declare variable
            String indata = null;
            CustomerInformation cust;
            TicketInformation ticket;

            // while loop to looping the data in Tickets.txt to enqueue in ticketList
            while((indata = inputTicket.readLine()) != null)
            {
                // tokenizer
                StringTokenizer st = new StringTokenizer(indata, ";");

                // assign the value to the variable
                String ticketId = st.nextToken();
                String rideName = st.nextToken();
                double ticketPrice = Double.parseDouble(st.nextToken());
                String ticketCode = st.nextToken();

                //create object for the ticket
                ticket = new TicketInformation(ticketId, rideName, ticketPrice, ticketCode);

                //enqueue in ticketList
                ticketsList.enqueue(ticket);
            }

            // while loop to looping the data in customer.txt to add in customerList- linkedlist
            while((indata = inCustomer.readLine()) != null){
                //make tokenizer
                StringTokenizer str = new StringTokenizer(indata, ";");

                // assign the value to the variable
                String custID = str.nextToken();
                String custName = str.nextToken();
                int counterPaid = Integer.parseInt(str.nextToken());
                int ticketQuantity = Integer.parseInt(str.nextToken());
            
                // create the object for the customer
                cust = new CustomerInformation(custID, custName, counterPaid, ticketQuantity);
                
                // add the customer object to customerList
                customerList.add(cust);
            }

            // make 2 queue pending for Counter Express and counter 3
            Queue pendingCounterExpress = new Queue();
            Queue pendingCounter3 = new Queue();
            
            // for loop to looping the data in customerList - linkedlist
            for(int i = 0; i < customerList.size(); i++)
            {
                // if statement to divide data to counter Express or counter 3
                if(customerList.get(i).getTicketsQuantity() <= 5)
                {
                    pendingCounterExpress.enqueue(customerList.get(i));
                }else if(customerList.get(i).getTicketsQuantity() > 5)
                {
                    pendingCounter3.enqueue(customerList.get(i));
                }
            }
    
            // close the reader 
            inCustomer.close();
            inputTicket.close();
            
            // make a new Frame and assign the value to the parameter for the next class
            new WelcomePage(customerList, pendingCounterExpress, pendingCounter3, ticketsList).setVisible(true);
            
        }
        // error file not found
        catch(FileNotFoundException e){
            System.out.print("Sorry!! The file is not found..");
        }

        // input output error handling
        catch(IOException e)
        {
            System.out.print("Sorry! you got error");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}