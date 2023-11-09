/**
 *
 * @author ADAM ISKHANDAR
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Customer extends JFrame implements ActionListener {

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration                

    // phase 2 - make 3 Queue for counter and stack for completeCustomer
    LinkedList<CustomerInformation> customerList;
    Queue pendingCounterExpress;
    Queue pendingCounter3;
    Queue counter1 = new Queue();
    Queue counter2 = new Queue();
    Queue counter3 = new Queue();
    Stack completeCustomer = new Stack();
    int totalCurrentCust;
    Queue ticketsList;

    public Customer(LinkedList<CustomerInformation> customerList, Queue pendingCounterExpress, Queue pendingCounter3, Queue ticketsList) {
        // assign the value from parameter to the variable
        this.customerList = customerList;
        this.ticketsList = ticketsList;
        this.totalCurrentCust = customerList.size();
        this.pendingCounterExpress = pendingCounterExpress;
        this.pendingCounter3 = pendingCounter3;
        initComponents(customerList, pendingCounterExpress, pendingCounter3, ticketsList);
    }

    private void initComponents(LinkedList<CustomerInformation> customerList, Queue pendingCounterExpress, Queue pendingCounter3, Queue ticketsList) {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.black);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("CUSTOMER =");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText(Integer.toString(totalCurrentCust));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EUPHORIA WORLD");

        jLabel3.setText("                         COUNTER 1");

        jLabel4.setText("                           COUNTER 2");

        jLabel5.setText("                             COUNTER 3");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setText("COUNT CUST  :");

        jLabel7.setText("CUST QUEUE  : ");

        jLabel8.setText("CUST QUEUE :");

        jButton2.setText("PAY");

        jButton3.setText("PAY");

        jButton4.setText("PAY");

        jLabel10.setText(Integer.toString(counter2.size()));

        jLabel11.setText(Integer.toString(counter3.size()));

        jLabel12.setText(Integer.toString(counter1.size()));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jButton2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jButton3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jButton4)))
                                .addGap(0, 42, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel10))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel11))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel12)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(0, 28, Short.MAX_VALUE))))
        );

        jButton1.setText("START QUEUE");

        jButton5.setText("CUSTOMER COMPLETE");

        jButton6.setText("EXIT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(264, 264, 264))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);
        jButton5.addActionListener(this);
        jButton6.addActionListener(this);
    }// </editor-fold>                        

    // declare teh object
    CustomerInformation cust;
    TicketInformation ticket;

    public void actionPerformed(ActionEvent e)
    {
        // button for the Start Queue
        if (e.getSource() == jButton1) {
            //set the test to next queue
            jButton1.setText("NEXT QUEUE");

            // verify if have waiting user or not
            if(totalCurrentCust == 0)
            {
                JOptionPane.showMessageDialog(null, "No Waiting Customer");
            }

            // verify if all counter are full or not
            if((counter1.size() == 5) && (counter2.size() == 5) && (counter3.size() == 5))
            {
                JOptionPane.showMessageDialog(null, "All Counter are full!");
            }

            // for loop to looping the pendingCounter3 to enqueue to the counter 3
            for (int i = 0; i < pendingCounter3.size(); i++) {
                //if size counter3 < 5 it will enqueue the customer to the counter 3 
                if (counter3.size() < 5) {
                    totalCurrentCust--;
                    cust = (CustomerInformation) pendingCounter3.dequeue();
                    cust.setCounterPaid(3);
                    counter3.enqueue(cust);
                    // counter 1
                    jLabel11.setText(Integer.toString(counter3.size()));
                }
                // update the total Current Customer
                jLabel9.setText(Integer.toString(totalCurrentCust));
            }//end of if

            // verify if counter 1 and counter 2 is not full
            if(!(counter1.size() == 5) || !(counter2.size() == 5))
            {
                // for loop to looping the pendingCounterExpress to the counter 1 and 2
                for (int i = 0; i < pendingCounterExpress.size(); i++) {
                    if (counter1.size() < 5) {
                        totalCurrentCust--;
                        cust = (CustomerInformation) pendingCounterExpress.dequeue();
                        cust.setCounterPaid(1);
                        counter1.enqueue(cust);
                        // counter 1 text counter
                        jLabel12.setText(Integer.toString(counter1.size()));
                    }else if(counter2.size() < 5) {
                        totalCurrentCust--;
                        cust = (CustomerInformation) pendingCounterExpress.dequeue();
                        cust.setCounterPaid(2);
                        counter2.enqueue(cust);
                        // counter 2 text counter
                        jLabel10.setText(Integer.toString(counter2.size()));
                    }

                    // update the total current customer
                    jLabel9.setText(Integer.toString(totalCurrentCust));
                }//end of if
            }else{
                // display counetr express are full
                JOptionPane.showMessageDialog(null, "Counter Express are full!");
            }

        }//end of method

        // boolean to verify the choice
        boolean printChoose = false;

        // counter 1 - PAY BUTTON
        if(e.getSource() == jButton2)
        {
            //if counter 1 not empty
            if (!counter1.empty()) {
                // Joption show option
                String[] options = { "yes", "no"};
                var selection = JOptionPane.showOptionDialog(null, "Print All The Receipt?", "Print Receipt", 0, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (selection == 0) {
                    printChoose = true;
                }
                if (selection == 1) { 
                    printChoose = false;
                }
                // for loop to looping 5 customer to pay
                for(int i = 0; i < 5; i++){
                    cust = (CustomerInformation) counter1.dequeue();
                    ticket = (TicketInformation) ticketsList.dequeue();
                    cust.setTicket(ticket);

                    // calculate the amount paid for customer
                    double totalAmount = cust.getTicketsQuantity() * ticket.getTicketPrice();
                    cust.setTotalPay(totalAmount);

                    // update the counter count
                    jLabel12.setText(Integer.toString(counter1.size()));

                    // push the customer to completeCustomer stack
                    completeCustomer.push(cust);

                    // print all receipt if - yes
                    if(printChoose)
                    {
                        new Receipt(ticket, cust).setVisible(true);
                    }   
                }
            }

            // handling if no waiting customer
            if((totalCurrentCust == 0) && (counter1.empty()))
            {
                JOptionPane.showMessageDialog(null, "No Waiting Customer");
            }

        }

        // counter 2 = PAY BUTTON
        if(e.getSource() == jButton3)
        {
            //if counter 2 not empty
            if (!counter2.empty()) {
                // Joption show option
                String[] options = { "yes", "no"};
                var selection = JOptionPane.showOptionDialog(null, "Print All The Receipt?", "Print Receipt", 0, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (selection == 0) {
                    printChoose = true;
                }
                if (selection == 1) { 
                    printChoose = false;
                }
                // for loop to looping 5 customer to pay
                for(int i = 0; i < 5; i++){
                    cust = (CustomerInformation) counter2.dequeue();
                    ticket = (TicketInformation) ticketsList.dequeue();
                    cust.setTicket(ticket);

                    // calculate the amount paid for customer
                    double totalAmount = cust.getTicketsQuantity() * ticket.getTicketPrice();
                    cust.setTotalPay(totalAmount);

                    // update the counter count
                    jLabel10.setText(Integer.toString(counter2.size()));

                    // push the customer to completeCustomer stack
                    completeCustomer.push(cust);

                    // print all receipt if - yes
                    if(printChoose)
                    {
                        new Receipt(ticket, cust).setVisible(true);
                    }   
                }
            }

            // handling if no waiting customer
            if((totalCurrentCust == 0) && (counter2.empty()))
            {
                JOptionPane.showMessageDialog(null, "No Waiting Customer");
            }

        }

        // counter 3 = PAY BUTTON
        if(e.getSource() == jButton4)
        {
            //if counter 3 not empty
            if (!counter3.empty()) {
                // Joption show option
                String[] options = { "yes", "no"};
                var selection = JOptionPane.showOptionDialog(null, "Print All The Receipt?", "Print Receipt", 0, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (selection == 0) {
                    printChoose = true;
                }
                if (selection == 1) { 
                    printChoose = false;
                }
                // for loop to looping 5 customer to pay at one time
                for(int i = 0; i < 5; i++){
                    cust = (CustomerInformation) counter3.dequeue();
                    ticket = (TicketInformation) ticketsList.dequeue();
                    cust.setTicket(ticket);

                    // calculate the amount paid for customer
                    double totalAmount = cust.getTicketsQuantity() * ticket.getTicketPrice();
                    cust.setTotalPay(totalAmount);

                    // update the counter count
                    jLabel11.setText(Integer.toString(counter3.size()));

                    // push the customer to compleCustomer stack
                    completeCustomer.push(cust);

                    // print all receipt if - yes
                    if(printChoose)
                    {
                        new Receipt(ticket, cust).setVisible(true);
                    }   
                }
            }

            // handling if no waiting customer
            if((totalCurrentCust == 0) && (counter3.empty()))
            {
                JOptionPane.showMessageDialog(null, "No Waiting Customer");
            }
        }

        // Button for display complete customer stack
        if(e.getSource() == jButton5){
            new CompleteCustomer(completeCustomer).setVisible(true);
        }
        
        // function for button exit
        if(e.getSource() == jButton6)
        {
            setVisible(false);
        }
    }
}