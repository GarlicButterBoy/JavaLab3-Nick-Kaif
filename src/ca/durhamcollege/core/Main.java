/*
 * Nick Sturch-Flint & Kaifkhan Vakil
 * December 5, 2020
 * Program: WorkTicket and ExtendedWorkTicket classes are created and showcased in the main
 */

package ca.durhamcollege.core;

import ca.durhamcollege.tickets.*;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //Declarations
        //Variables
        Scanner keyboard = new Scanner(System.in);
        boolean test = true;
        boolean endFlag = true;
        LocalDate currentDate = LocalDate.now();
        int ticketNumber = 123;
        String alphaCode = "F3g5cV";
        String desc = "Parameterized Ticket";
        WorkTicket ticket0 = new WorkTicket(123344, "D43FvC", currentDate, "WorkTicket Construction");
        ExtendedWorkTicket ticket = new ExtendedWorkTicket();
        ExtendedWorkTicket ticket1 = new ExtendedWorkTicket(ticketNumber, alphaCode, currentDate, desc, test);
        ExtendedWorkTicket ticket2 = new ExtendedWorkTicket(ticket0, test);

        do
        {

            try
            {
                System.out.println("WorkTicket Parameterized Constructor");
                System.out.println(ticket2.toString());
                System.out.println("Parameterized Constructor");
                System.out.println(ticket1.toString());
                System.out.println("Default Constructor");
                System.out.println(ticket.toString());
                //Setting the ticket
                ticket.SetWorkTicket();
                System.out.println(ticket.toString());

                ticket.closeTicket();
                System.out.println(ticket.toString());

                endFlag = false;
            }
            catch(IllegalArgumentException iae)
            {
                System.out.printf("\n INVALID: %s", iae.toString());
                keyboard.nextLine();
                endFlag = true;
            }
            catch(InputMismatchException ime)
            {
                System.out.print("\nINVALID: Your input was incorrect, try again.");
                keyboard.nextLine();
                endFlag = true;
            }

        } while (endFlag);

    }

}

