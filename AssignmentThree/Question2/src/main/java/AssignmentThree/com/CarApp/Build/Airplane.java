package AssignmentThree.com.CarApp.Build;

/**
 * Created by Kishan on 2017-03-26.
 */
import AssignmentThree.com.CarApp.Domain.TransportDetails;
public class Airplane {
    public TransportDetails getTransportDetails() {
        TransportDetails td = new TransportDetails("Airplane",2,"White");
        return td;
    }
}
