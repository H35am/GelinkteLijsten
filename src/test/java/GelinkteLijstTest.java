import nl.hr.cmi.infdev226a.GelinkteLijst;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GelinkteLijstTest {
    GelinkteLijst lijst;


    @Before
    public void setup() {
        lijst = new GelinkteLijst();
        lijst.insertFirst(1);
    }

    @Test
    public void getFirstNotEmpty() {
        assertEquals(1, lijst.getFirst());
    }

    @Test
    public void getFirstEmpty() {
        lijst = new GelinkteLijst();
        assertEquals(null, lijst.getFirst());
    }

    @Test
    public void getLastNotEmpty() {
        assertEquals(1, lijst.getLast());
    }

    @Test
    public void getLastEmpty() {
        lijst = new GelinkteLijst();
        assertEquals(null, lijst.getLast());
    }


    @Test
    public void insertFirstEmpty() {
        lijst = new GelinkteLijst();
        lijst.insertFirst(1);
        assertEquals(1, lijst.getFirst());
    }

    @Test
    public void insertFirstNotEmpty() {
        lijst.insertFirst(2);
        assertEquals(2, lijst.getFirst());
    }

    @Test
    public void insertLastEmpty() {
        lijst = new GelinkteLijst();
        lijst.insertLast(2);
        assertEquals(2, lijst.getLast());
    }

    @Test
    public void insertLastNotEmpty() {
        lijst.insertLast(2);
        assertEquals(2, lijst.getLast());
    }

    @Test
    public void getSizeTest(){
        assertEquals(1 , lijst.getSize());
    }

    @Test
    public void removeTest(){
        lijst.remove(1);
        assertEquals(null, lijst.getFirst());

        lijst.insertFirst(1);
        lijst.insertFirst(2);
        lijst.insertFirst(3);
        lijst.remove(2);
        assertEquals(3, lijst.getSize());
    }


    @Test
    public void insertBeforeTest() {
        lijst.insertBefore(2, 1);
        assertEquals(2, lijst.getFirst());
    }

    @Test
    public void insertAfsterTest() {
        lijst.insertAfter(2, 1);
        assertEquals(2, lijst.getLast());
    }
}
