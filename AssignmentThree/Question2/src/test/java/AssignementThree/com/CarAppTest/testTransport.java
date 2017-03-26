package AssignementThree.com.CarAppTest;

/**
 * Created by Kishan on 2017-03-26.
 */
import AssignmentThree.com.CarApp.Build.*;
import AssignmentThree.com.CarApp.Domain.TransportDetails;
import junit.framework.Assert;
import org.junit.Test;
public class testTransport {
    @Test
    public void testAirplane() throws Exception {

        TransportDetails td = new Airplane().getTransportDetails();

        Assert.assertEquals("White",td.getColour());

    }

    @Test
    public void testCar() throws Exception {

        TransportDetails td = new Car().getTransportDetails();

        Assert.assertEquals(4,td.getWheels());

    }

    @Test
    public void testMotorBike() throws Exception {

        TransportDetails td = new MotorBike().getTransportDetails();

        Assert.assertNotSame("MotorBike",td.getMode());

    }

    @Test
    public void testShip() throws Exception {

        TransportDetails td = new Ship().getTransportDetails();

        Assert.assertEquals("Ship",td.getMode());

    }
}
