/**
 * Created by Kishan on 2017-03-26.
 */
import org.junit.Assert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Question2Refactored.Configuration.AppConfig;
import Question2Refactored.Interface.ITransportModes;
import Question2Refactored.Domain.TransportDetails;
public class RefactoredAppTest {
    private ITransportModes transport;

    @BeforeMethod
    public void testConfig() throws Exception {

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        transport=(ITransportModes)ac.getBean("airplane");
    }

    @Test
    public void testMode() throws Exception {

        TransportDetails details = transport.getTransportDetails();

        Assert.assertEquals(details.getMode(),"Airplane");

    }

    @Test
    public void testNumWheels() throws Exception {

        TransportDetails details = transport.getTransportDetails();

        Assert.assertEquals(details.getWheels(),0);

    }

    @Test
    public void testColour() throws Exception {

        TransportDetails details = transport.getTransportDetails();

        Assert.assertEquals(details.getColour(),"White");

    }

}
