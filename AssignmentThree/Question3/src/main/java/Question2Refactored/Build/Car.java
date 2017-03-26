package Question2Refactored.Build;

/**
 * Created by Kishan on 2017-03-26.
 */

import Question2Refactored.Domain.TransportDetails;

public class Car {
    public TransportDetails getTransportDetails() {
        TransportDetails td = new TransportDetails("Car",4,"Black");
        return td;
    }
}
