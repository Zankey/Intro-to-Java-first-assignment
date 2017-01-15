package cis232.a1;

import java.util.ArrayList;

public class A1232TMar
{

    public static void main(String [] args)
    {

        //single ArrayList used to store all created shapes and perform sorts
        ArrayList<Shape> storage = new ArrayList<>();

        //sentry for recurring menu loop
        boolean stop = false;

        // will only be false when the exit option is chosen
        while (!stop)
        {

            //displays menu after every case that doesn't exit
            mainMenu();
            int menuChoice = A1232TMarProcesses.menuSelection();

            //enforces options 1 - 8 only
            if (menuChoice > 8 || menuChoice < 1)
                System.out.println("Invalid Input, Please enter 1 - 8:");

            //in cases 1 - 5 the menuOption functions return a new Shape object
            //then add it to the ArrayList
            switch (menuChoice)
            {
                case 1:
                    storage.add(menuOption1());
                    break;

                case 2:
                    storage.add(menuOption2());
                    break;

                case 3:
                    storage.add(menuOption3());
                    break;

                case 4:
                    storage.add(menuOption4());
                    break;

                case 5:
                    storage.add(menuOption5());
                    break;

                case 6:

                    // enforces ascending/descending option after every sort choice
                    boolean sentry = false;
                    while (!sentry)
                    {
                        int sortChoice = menuOption6();
                        if (sortChoice == 1)
                        {
                            A1232TMarProcesses.ascendSort(storage);
                            A1232TMarProcesses.displayContents(storage);
                            sentry = true;
                        }
                        else if (sortChoice == 2)
                        {
                            A1232TMarProcesses.descendSort(storage);
                            A1232TMarProcesses.displayContents(storage);
                            sentry = true;
                        }
                        else
                            System.out.println("Invalid Input, Please select 1 or 2");
                    }
                    break;

                case 7:

                    // enforces ascending/descending after every sort choice
                    // will always sort by area before sorting by type
                    boolean sentry2 = false;
                    while (!sentry2)
                    {
                        int sortChoice = menuOption7();
                        if (sortChoice == 1)
                        {
                            A1232TMarProcesses.ascendSort(storage);
                            A1232TMarProcesses.typeSort(storage);
                            A1232TMarProcesses.displayContents(storage);
                            sentry2 = true;
                        }
                        else if (sortChoice == 2)
                        {
                            A1232TMarProcesses.descendSort(storage);
                            A1232TMarProcesses.typeSort(storage);
                            A1232TMarProcesses.displayContents(storage);
                            sentry2 = true;
                        }
                        else
                            System.out.println("Invalid Input, Please select 1 or 2");
                    }
                    break;
                case 8:
                    System.out.println("Exiting Program...");
                    stop = true;
            }
        }
    }

    public static void mainMenu(){

        System.out.println("\n----------MENU----------\n" +
                "1) Create Circle\n" + "2) Create Hexagon\n" + "3) Create Octagon\n" +
                "4) Create Rectangle\n" + "5) Create Square\n" + "6) Sort by Area\n" +
                "7) Sort by Shape then Area\n" + "8) Exit Program\n\n" +
                "Please Select 1 - 8 and press Enter: ");
    }

    // all menu options that create a new object
    // will call the same input method from the Processes Class to set parameters
    // and use those parameters to construct the object

    public static Circle menuOption1()
    {
        System.out.println("Please enter a radius value (must be positive): ");

        double newRadius = A1232TMarProcesses.userInput();
        Circle circleObj = new Circle(newRadius);

        return circleObj;
    }

    public static A1232TMarRegHex menuOption2()
    {
        System.out.println("Please enter a Side value (must be positive): ");

        double newSide = A1232TMarProcesses.userInput();
        A1232TMarRegHex hexObj = new A1232TMarRegHex(newSide);

        return hexObj;
    }

    public static A1232TMarRegOct menuOption3()
    {
        System.out.println("Please enter a Side value (must be positive): ");

        double newSide = A1232TMarProcesses.userInput();
        A1232TMarRegOct octObj = new A1232TMarRegOct(newSide);

        return octObj;
    }

    public static Rectangle menuOption4()
    {
        System.out.println("Please enter a Length value (must be positive): ");
        double newLength = A1232TMarProcesses.userInput();

        System.out.println("Please enter a Width value (must be positive): ");
        double newWidth = A1232TMarProcesses.userInput();

        Rectangle rectObj = new Rectangle(newLength, newWidth);

        return rectObj;
    }

    public static A1232TMarSquare menuOption5()
    {
        System.out.println("Please enter a Side value (must be positive): ");

        double newSide = A1232TMarProcesses.userInput();
        A1232TMarSquare sqObj = new A1232TMarSquare(newSide);

        return sqObj;
    }

    //cases 6 and 7 call these methods which return and int
    //that determines what methods will be called in main
    //depending on if ascending or descending is chosen
    public static int menuOption6()
    {
        System.out.println("------Sort Options------\n" +
                "1) Ascending Order\n" + "2) Descending Order\n" +
                "In what order would you like to sort? (1-2): ");

        int sortChoice = A1232TMarProcesses.menuSelection();

        return sortChoice;
    }

    public static int menuOption7()
    {
        System.out.println("------Sort Options------\n" +
                "1) Ascending Order\n" + "2) Descending Order\n" +
                "In what order would you like to sort? (1-2): ");

        int sortChoice = A1232TMarProcesses.menuSelection();

        return sortChoice;
    }
}

