package cis232.a1;

import java.util.ArrayList;
import java.util.Scanner;


public class A1232TMarProcesses
{

    //returns a double to be used as dimensions in shape constructors
    public static double userInput()
    {

        Scanner scan = new Scanner(System.in);

        boolean sentry = false;
        double input = 0;

        // makes sure dimensions are not negative
        while (!sentry)
        {
            input = scan.nextDouble();

            if (input >= 0)
            {
                sentry = true;
            }
            else
            {
                System.out.println("Value must be positive, Please Enter a new value:");
            }

        }
        return input;
    }

    //used by main to select case in switch block
    public static int menuSelection()
    {
        Scanner scan2 = new Scanner(System.in);
        int menuChoice = scan2.nextInt();
        return menuChoice;
    }

    //insertion sort (Ascending order) based on area
    public static void ascendSort( ArrayList<Shape> al )
    {

        for ( int i = 1; i < al.size(); i++ )
        {
            Shape temp = al.get( i );
            int j = i;

            for ( ;( j > 0 ) && temp.compareTo( al.get(j - 1) ) < 0; j-- )
            {
                al.set(j, al.get( j - 1 ) );
            }
            al.set( j, temp );
        }
    }

    //insertion sort (Descending order) based on area
    public static void descendSort( ArrayList<Shape> al )
    {

        for ( int i = 1; i < al.size(); i++ )
        {
            Shape temp = al.get( i );
            int j = i;

            for ( ;( j > 0 ) && temp.compareTo( al.get(j - 1) ) > 0; j-- )
            {
                al.set(j, al.get( j - 1 ) );
            }
            al.set( j, temp );
        }
    }

    //insertion sort that gets Class type of element in ArrayList
    //converts that type toString
    //then compares string values to group them while keeping sorted order within groups
    public static void typeSort( ArrayList<Shape> al )
    {
        for ( int i = 1; i < al.size(); i++ )
        {
            Shape temp = al.get( i );
            int j = i;

            for ( ;( j > 0 ) && temp.getClass().toString().compareTo
                    ( al.get(j - 1).getClass().toString() ) < 0; j-- )
            {
                al.set(j, al.get( j - 1 ) );
            }
            al.set( j, temp );
        }
    }


    public static void displayContents( ArrayList<Shape> arr )
    {

        for ( int i = 0; i < arr.size(); i++ )
        {
            Shape disp = arr.get(i);

            //displays areas first for easy readability / comparability
            System.out.format("Area: %.2f", disp.area());
            System.out.print(", " + disp + "\n");
        }

    }

}
