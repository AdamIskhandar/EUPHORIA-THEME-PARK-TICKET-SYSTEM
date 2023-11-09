/**
 * Program Description : Welcome Page
 *
 * Author : Emil Aiman
 * Date : 22/6/2023
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class WelcomePage extends JFrame implements ActionListener
{

    // Variables declaration                    
    private JButton btnStart;
    private JLabel lblImage, lblIcon, lblTitle;
    private JPanel welcomePanel;
    LinkedList<CustomerInformation> customerList;
    Queue pendingCounterExpress;
    Queue pendingCounter3;
    Queue ticketsList;
    // End of variables declaration    

    // welcome page method
    public WelcomePage( LinkedList<CustomerInformation> customerList, Queue pendingCounterExpress, Queue pendingCounter3, Queue ticketsList) 
    {
        this.customerList = customerList;
        this.ticketsList = ticketsList;
        this.pendingCounterExpress = pendingCounterExpress;
        this.pendingCounter3 = pendingCounter3;
        initComponents(customerList, pendingCounterExpress, pendingCounter3, ticketsList);
    }

    // init Components method
    private void initComponents( LinkedList<CustomerInformation> CustomerList, Queue pendingCounterExpress, Queue pendingCounter3, Queue ticketsList) {
        //set Title
        setTitle("Euphoria Theme Park");

        // new component
        welcomePanel = new JPanel();
        lblTitle = new JLabel();
        btnStart = new JButton();
        lblIcon = new JLabel();
        lblImage = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        //set Layout
        GroupLayout welcomePanelLayout = new GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 931, Short.MAX_VALUE)
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(welcomePanel);
        welcomePanel.setBounds(0, 0, 931, 0);

        lblTitle.setBackground(new Color(255, 255, 255));
        lblTitle.setFont(new Font("Gadugi", 1, 70));
        lblTitle.setForeground(new Color(204, 204, 204));
        lblTitle.setText("E U P H O R I A");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(40, 0, 600, 200);

        btnStart.setBackground(new Color(204, 204, 204));
        btnStart.setForeground(new Color(51, 51, 51));
        btnStart.setText("START");

        getContentPane().add(btnStart);
        btnStart.setBounds(48, 150, 90, 30);

        lblIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADAM ISKHANDAR\\Desktop\\delay.png"));
        getContentPane().add(lblIcon);
        lblIcon.setBounds(40, 220, 110, 50);

        lblImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADAM ISKHANDAR\\Desktop\\bg.jpg"));
        getContentPane().add(lblImage);
        lblImage.setBounds(0, 0, 1020, 460);

        pack();
        setSize (750, 498);
        btnStart.addActionListener(this);
    }      

    // to make action performed for the button
    public void actionPerformed(ActionEvent e)
    {
        // action for button 1
        if (e.getSource() == btnStart) {
            // close the current frame
            dispose();
            // make a new frame and open the frame
            new Customer( customerList, pendingCounterExpress, pendingCounter3, ticketsList).setVisible(true);
        }//end of if
    }//end of method
}