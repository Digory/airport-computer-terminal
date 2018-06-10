public class Flight { // This class keeps track of a flight's details including the departure airport, destination, and the specific plane that is flying.
    
    private final Aeroplane myPlane;
    private final String depFrom;
    private final String arrAt;
 
    public Flight(Aeroplane myPlane, String depFrom, String arrAt) {
        this.myPlane = myPlane;
        this.depFrom = depFrom;
        this.arrAt = arrAt;
    }
    public Aeroplane getPlane(){
        return myPlane;
    }
    
    @Override public String toString(){
        return myPlane.toString()+"("+depFrom+"-"+arrAt+")";
    }
    
}
