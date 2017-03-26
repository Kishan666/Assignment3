package AssignmentThree.com.CarApp.Domain;

/**
 * Created by Kishan on 2017-03-26.
 */
import java.io.Serializable;
public class TransportDetails implements Serializable {
    private String transport;
    private int numWheels;
    private String colour;

    public TransportDetails(String transport,int numWheels,String colour)
    {
        this.transport = transport;
        this.numWheels = numWheels;
        this.colour = colour;

    }

    public String getColour()
    {
        return colour;
    }

    public String getMode()
    {
        return transport;
    }

    public int getWheels()
    {
        return numWheels;
    }

}
