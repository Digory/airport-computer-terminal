import java.util.ArrayList;
public class Database { // This class uses 2 ArrayLists to keep track of planes and flights.
    
    private final ArrayList<Aeroplane> myPlanes;
    private final ArrayList<Flight> myFlights;

    public Database() {
        myPlanes = new ArrayList<Aeroplane>();
        myFlights = new ArrayList<Flight>();
    }
    
    
    public void addPlane(Aeroplane plane){ 
        myPlanes.add(plane);
    }
    
    public void addFlight(Flight flight){
        myFlights.add(flight);
    }
    
    public Aeroplane searchPlane(String ID){
        for (Aeroplane planes : myPlanes){
            if (planes.getID().equals(ID)){
                return planes;
            }
        } return null;
    }
    
    public void printFlights(){
        for (Flight flights : myFlights){
            System.out.println(flights.toString());
        }
    }
    
    public void printPlanes(){
        for (Aeroplane planes : myPlanes){
            System.out.println(planes.toString()+"\n");
        }
    }
    
}
