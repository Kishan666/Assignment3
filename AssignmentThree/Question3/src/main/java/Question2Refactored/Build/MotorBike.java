package Question2Refactored.Build;

import Question2Refactored.Domain.TransportDetails;

/**
 * Created by Kishan on 2017-03-26.
 */
public class MotorBike {
    public TransportDetails getTransportDetails() {
        TransportDetails td = new TransportDetails("Motorbike",2,"Red");
        return td;
    }
}
