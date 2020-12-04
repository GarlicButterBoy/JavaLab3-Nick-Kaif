package ca.durhamcollege;

import org.jetbrains.annotations.NotNull;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class WorkTicket
{


    //private instance variables/Attributes
    public int number;
    public String id;
    public LocalDate date;
    public String description;

    //public properties (setters/getters)
    public int getNumber()
    {
        return number;
    }

    public void setNumber()
    {
        //Declarations
        Scanner keyboard = new Scanner(System.in);
        boolean dirtyFlag = true;
        int number = 0;
        while(dirtyFlag)
        {
            System.out.print("\nPlease enter a ticket number: ");
            number = keyboard.nextInt();
            if(number <= 0)
            {
                throw new IllegalArgumentException("ERROR! only positive numbers");
            }
            else
            {
                this.number = number;
                dirtyFlag = false;
            }
        }

    }

    public String getId()
    {
        return id;
    }

    public void setId()
    {
        //Declarations
        Scanner keyboard = new Scanner(System.in);
        boolean dirtyFlag = true;
        String id = null;
        while(dirtyFlag)
        {
            System.out.print("\nPlease enter a custom ID: ");
            id = keyboard.nextLine();
            if (id.length() <= 0)
            {
                throw new IllegalArgumentException("Please do not keep it empty");
            }
            else
            {
                this.id = id;
                dirtyFlag = false;
            }
        }


    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate()
    {
        //Constants
        final int MAX_YEAR = 2099;
        final int MIN_YEAR = 2000;
        final int MAX_MONTH = 12;
        final int MIN_MONTH = 1;
        final int MAX_DAY = 30;
        final int MIN_DAY = 1;
        //Variables
        Scanner keyboard = new Scanner(System.in);
        boolean dirtyFlag = true;
        int day = 0, month = 0, year = 0;

        try
        {



        while(dirtyFlag)
        {
            System.out.print("\nPlease enter the day: ");
            day = keyboard.nextInt();
            if (day >= MIN_DAY && day <= MAX_DAY)
            {
                dirtyFlag = false;
            }
            else
            {
                System.out.print("\nSorry, that day was invalid. Must be between 1 and 30. Try Again.\n");
            }
        }
        dirtyFlag = true;
        System.out.printf("Day is: %d\n", day);

        while(dirtyFlag)
        {
            System.out.print("\nPlease enter the month: ");
            month = keyboard.nextInt();
            if (month >= MIN_MONTH && month <= MAX_MONTH)
            {
                dirtyFlag = false;
            }
            else
            {
                System.out.print("\nSorry, that month was invalid. Must be between 1 and 12. Try Again.\n");
            }
        }
        dirtyFlag = true;
        System.out.printf("Month is: %d\n", month);

        while(dirtyFlag)
        {
            System.out.print("\nPlease enter the Year: ");
            year = keyboard.nextInt();
            if (year >= MIN_YEAR && year <= MAX_YEAR)
            {
                dirtyFlag = false;
            }
            else
            {
                System.out.print("\nSorry, that year was invalid. Must be between 2000 and 2099. Try Again.\n");
            }
        }
        dirtyFlag = true;
        System.out.printf("Year is: %d\n", year);

        LocalDate date;
        date = LocalDate.of(year, month, day);
    //    System.out.printf("The Date is: %s", date.toString());

        this.date = date;

        }
        catch(DateTimeException dte)
        {
            System.out.print("\nDATE EXCEPTION: Something went wrong, try again.");
            keyboard.nextLine();
        }
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription()
    {

        //Declarations
        Scanner keyboard = new Scanner(System.in);
        boolean dirtyFlag = true;
        String description = null;
        while(dirtyFlag)
        {
            System.out.print("\nPlease enter the reason for making a ticket: ");
            description = keyboard.nextLine();
            if(description.length() <= 0)
            {
                throw new IllegalArgumentException("Please do not keep it empty");
            }
            else
            {
                this.description = description;
                dirtyFlag = false;
            }
        }

    }

    public void SetWorkTicket()
    {

        setNumber();
        setId();
        setDate();
        setDescription();
    }

    @Override
    public String toString()
    {
        String outputStr = "";
        outputStr += "\n========================================\n";
        outputStr += "Ticket Number: " + (getNumber()) + "\n";
        outputStr += "Ticket Date: " + getDate() + "\n";
        outputStr += "Ticket ID: " + getId() + "\n";
        outputStr += "Ticket Description: " + getDescription() + "\n";
        outputStr += "\n========================================\n";

        return outputStr;
    }


    //Default Constructor
    WorkTicket()
    {
        this.number = 0;
        this.id = null;
        this.date = null;
        this.description = null;
    }
    //Object Constructor
    WorkTicket(@NotNull WorkTicket ticket)
    {
        this.number = ticket.number;
        this.id = ticket.id;
        this.date = ticket.date;
        this.description = ticket.description;
    }
    //Full Constructor
    WorkTicket(int number, String id, LocalDate date, String desc)
    {
        this.number = number;
        this.id = id;
        this.date = date;
        this.description = desc;
    }

}
