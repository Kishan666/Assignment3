package Question2Refactored.Build;

import Question2Refactored.Domain.TransportDetails;

/**
 * Created by Kishan on 2017-03-26.
 */
public class Ship {
    public TransportDetails getTransportDetails() {
        TransportDetails td = new TransportDetails("Ship",0,"White");
        return td;
    }
}
