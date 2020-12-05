/*
 * Nick Sturch-Flint & Kaifkhan Vakil
 * December 5, 2020
 * Program: ExtendedWorkTicket class is created
 */

package ca.durhamcollege.tickets;

import java.time.LocalDate;

public class ExtendedWorkTicket extends WorkTicket
{


    //Private Instance Variables
    public boolean myOpen;

    //Public Properties

    //Constructors
    //Parameterized constructor using parameters from base class
    public ExtendedWorkTicket(int number, String id, LocalDate date, String description, boolean myOpen)
    {
        this.number = number;
        this.id = id;
        this.date = date;
        this.description = description;
        this.myOpen = myOpen;
    }

    //Default Constructor
    public  ExtendedWorkTicket()
    {
        super();
        openTicket();
    }
    //Parameterized Constructor using a workticket object
    public ExtendedWorkTicket(WorkTicket ticket, boolean myOpen)
    {
        this.number = ticket.number;
        this.id = ticket.id;
        this.date = ticket.date;
        this.description = ticket.description;
        this.myOpen = myOpen;
    }

    //Private Methods

    //Public Methods (Getters and Setters)
    //myOpen getter
    public boolean getOpen()
    {
        return myOpen;
    }
    //myOpen setter
    public void setOpen(boolean open)
    {
        myOpen = open;
    }

    //Method to open a ticket
    public void openTicket()
    {
        this.myOpen = true;
    }

    //Method to close a ticket
    public void closeTicket()
    {
        this.myOpen = false;
    }

    //Method to return the status of the ticket
    public String isOpen()
    {
        String status = "";

        if (myOpen == true)
        {
            status = "This ticket is open!";
        }
        else
        {
            status = "This ticket is closed!";
        }

        return status;
    }

    //SetWorkTicket Override
    public void SetWorkTicket()
    {
        setNumber();
        setId();
        setDate();
        setDescription();
        openTicket();
    }

    public String toString()
    {
        String outputStr = "";
        outputStr += "\n========================================\n";
        outputStr += "Ticket Number: " + (getNumber()) + "\n";
        outputStr += "Ticket Date: " + getDate() + "\n";
        outputStr += "Ticket ID: " + getId() + "\n";
        outputStr += "Ticket Description: " + getDescription() + "\n";
        outputStr += "Ticket Status: " + isOpen() + "\n";
        outputStr += "========================================\n";

        return outputStr;
    }
    //Static Methods






}
