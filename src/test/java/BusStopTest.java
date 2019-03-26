import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before() {
        busStop = new BusStop("Tollcross");
    }

    @Test
    public void hasQueue() {
        assertEquals(0, busStop.currentQueue());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addToQueue(person);
        assertEquals(1, busStop.currentQueue());
    }

    @Test
    public void removePersonFromQueue() {
        busStop.addToQueue(person);
        busStop.removeFromQueue();
        assertEquals(0, busStop.currentQueue());
    }

}
