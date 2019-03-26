import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal", 20);
        busStop = new BusStop("Tollcross");
        busStop.addToQueue(person);
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, bus.currentPassengers());
    }

    @Test
    public void hasDestination() {
        assertEquals("Ocean Terminal", bus.getDestination());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.currentPassengers());
    }

    @Test
    public void cannotAddPassenger() {
        bus = new Bus("Waverley Station", 1);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(1, bus.currentPassengers());
    }

    @Test
    public void removePassenger() {
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.currentPassengers());
    }

    @Test
    public void canPickUpFromBusStop() {
        bus.pickUp(busStop);
        assertEquals(1, bus.currentPassengers());
        assertEquals(0, busStop.currentQueue());
    }
}
