
import java.util.Scanner;

public class UserInterface { 

    private final Scanner reader;
    private Flight myFlight;
    private Aeroplane myPlane;
    private final Database myDatabase = new Database(); // <-- Database object for adding information about flights and planes. 

    public UserInterface(Scanner reader) {
        this.reader = reader;
    }

    public void userEntry() { // Method for displaying options and obtaining input.
        System.out.println("Airport panel\n-----------------------\n");
        while (true) { // <-- Continues to display the first menu until the user exits by pressing x.
            System.out.print("Choose operation:\n"
                    + "[1] Add aeroplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit\n"
                    + "> ");
            if (this.reader.hasNextInt()) {
                int userInt = Integer.parseInt(this.reader.nextLine());
                if (userInt == 1) {
                    addPlane();
                } else if (userInt == 2) {
                    addFlight();
                }
            } else {
                String userString = this.reader.nextLine();
                if (userString.equals("x")) {
                    break;
                }
            }
        }
        while (true) { // <-- Continues to display the second menu until the user exits by pressing x.
            System.out.print("Flight service\n-----------\n"
                    + "Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit\n> ");
            if (this.reader.hasNextInt()) {
                int userInt = Integer.parseInt(this.reader.nextLine());
                if (userInt == 1) {
                    myDatabase.printPlanes();
                }
                else if (userInt == 2) {
                    myDatabase.printFlights();
                }
                else if (userInt == 3){
                    System.out.print("Give plane ID: ");
                    String userString = reader.nextLine();
                    System.out.println(myDatabase.searchPlane(userString).toString());
                    
                }
            } else {
                String userString = reader.nextLine();
                if (userString.equals("x")) {
                    break;
                }
            }
        }
    }

    public void addFlight() { 
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        if (myDatabase.searchPlane(planeID) != null) {
            this.myPlane = myDatabase.searchPlane(planeID);
            System.out.print("Give departure airport code: ");
            String depFrom = reader.nextLine();
            System.out.print("Give destination airport code: ");
            String arrAt = reader.nextLine();
            this.myFlight = new Flight(this.myPlane, depFrom, arrAt);
            myDatabase.addFlight(this.myFlight);
        }
    }

    public void addPlane() { 
        System.out.print("Give plane ID: ");
        String planeID = this.reader.nextLine();
        System.out.print("Give plane capacity: ");
        int planeCapacity = Integer.parseInt(reader.nextLine());
        myPlane = new Aeroplane(planeID, planeCapacity);
        myDatabase.addPlane(myPlane);
    }
}
