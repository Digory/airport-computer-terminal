import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*String input = "1\n"+"HA-LOL\n"+"42\n"
                +"1\n"+"G-OWAC\n"+"101\n"
                +"2\n"+"HA-LOL\n"+"HEL\n"+"BAL\n"
                +"2\n"+"G-OWAC\n"+"JFK\n"+"BAL\n"
                +"2\n"+"HA-LOL\n"+"BAL\n"+"HEL\n"
                +"x\n"+"1\n"+"2\n"+"3\n"+"G-OWAC\n"; */ 
        
        // ^ The above is code for testing the program)
                
        Scanner reader = new Scanner(System.in);
        UserInterface myInterface = new UserInterface(reader);
        myInterface.userEntry();
    }
}
