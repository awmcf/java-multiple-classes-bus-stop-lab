import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int currentPassengers() {
        return this.passengers.size();
    }

    public String getDestination() {
        return this.destination;
    }

    public void addPassenger(Person person) {
        if ( this.currentPassengers() < this.capacity) {
        this.passengers.add(person);
        }
    }

    public Person removePassenger() {
        return this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop) {
        if (this.currentPassengers() < this.capacity) {
            Person person = busStop.removeFromQueue();
            this.passengers.add(person);
        }
    }
}
