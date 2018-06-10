public class Aeroplane { 
    
    private final String ID;
    private final int capacity;

    public Aeroplane(String ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }
    
    @Override public String toString() {
        return ID + " (" + capacity + " ppl) ";
    }
    
    public String getID() {
        return ID;
    }
    
    
}
