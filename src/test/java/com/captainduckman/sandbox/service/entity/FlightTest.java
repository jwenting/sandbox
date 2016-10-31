package com.captainduckman.sandbox.service.entity;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Flight Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Oct 18, 2016</pre>
 */
public class FlightTest {

    Flight flight;

    @Before
    public void before() throws Exception {
        flight = new Flight();
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testCreate() {
        flight = new Flight("EHAM", "EDDM");
        assertNotNull(flight.getDestination());
        assertNotNull(flight.getOrigin());
        assertEquals("EHAM", flight.getOrigin());
        assertEquals("EDDM", flight.getDestination());
    }

    /**
     * Method: getId()
     */
    @Test
    public void testGetId() throws Exception {
        flight.setId(1L);
        assertNotNull(flight.getId());
    }

    /**
     * Method: setId(Long id)
     */
    @Test
    public void testSetId() throws Exception {
        flight.setId(1L);
        assertNotNull(flight.getId());
    }

    /**
     * Method: getOrigin()
     */
    @Test
    public void testGetOrigin() throws Exception {
        flight.setOrigin("EHAM");
        assertNotNull(flight.getOrigin());
        assertEquals("EHAM", flight.getOrigin());
    }

    /**
     * Method: setOrigin(String origin)
     */
    @Test
    public void testSetOrigin() throws Exception {
        flight.setOrigin("EHAM");
        assertNotNull(flight.getOrigin());
        assertEquals("EHAM", flight.getOrigin());
    }

    /**
     * Method: setOrigin(String origin)
     */
    @Test
    public void testSetOriginNull() throws Exception {
        flight.setOrigin(null);
        assertNull(flight.getOrigin());
    }

    /**
     * Method: getOrigin()
     */
    @Test
    public void testGetOriginNull() throws Exception {
        flight.setOrigin(null);
        assertNull(flight.getOrigin());
    }

    /**
     * Method: getOrigin()
     */
    @Test
    public void testGetOriginLowercase() throws Exception {
        flight.setOrigin("eham");
        assertNotNull(flight.getOrigin());
        assertEquals("EHAM", flight.getOrigin());
    }

    /**
     * Method: setOrigin(String origin)
     */
    @Test
    public void testSetOriginLowercase() throws Exception {
        flight.setOrigin("eham");
        assertNotNull(flight.getOrigin());
        assertEquals("EHAM", flight.getOrigin());
    }

    /**
     * Method: getDestination()
     */
    @Test
    public void testGetDestination() throws Exception {
        flight.setDestination("EDDM");
        assertNotNull(flight.getDestination());
        assertEquals("EDDM", flight.getDestination());
    }

    /**
     * Method: setDestination(String destination)
     */
    @Test
    public void testSetDestination() throws Exception {
        flight.setDestination("EDDM");
        assertNotNull(flight.getDestination());
        assertEquals("EDDM", flight.getDestination());
    }

    /**
     * Method: getDestination()
     */
    @Test
    public void testGetDestinationLowercase() throws Exception {
        flight.setDestination("eddm");
        assertNotNull(flight.getDestination());
        assertEquals("EDDM", flight.getDestination());
    }

    /**
     * Method: setDestination(String destination)
     */
    @Test
    public void testSetDestinationLowercase() throws Exception {
        flight.setDestination("eddm");
        assertNotNull(flight.getDestination());
        assertEquals("EDDM", flight.getDestination());
    }
    /**
     * Method: getDestination()
     */
    @Test
    public void testGetDestinationNull() throws Exception {
        flight.setDestination(null);
        assertNull(flight.getDestination());
    }

    /**
     * Method: setDestination(String destination)
     */
    @Test
    public void testSetDestinationNull() throws Exception {
        flight.setDestination(null);
        assertNull(flight.getDestination());
    }
}
