package AssignmentThree.com.CarApp;
import AssignmentThree.com.CarApp.Build.*;

import javax.swing.*;

/**
 * Created by Kishan on 2017-03-26.
 */
public class tApp {
    public static void main( String[] args )
    {
        String value ="";



        value = JOptionPane.showInputDialog(null,"Transport Mode\n1. Airplane\n2. Car \n3. MotorBike \n4. Ship\n Enter a Number:");

        while(!value.equalsIgnoreCase("1")&&!value.equalsIgnoreCase("2")&&!value.equalsIgnoreCase("3")&&!value.equalsIgnoreCase("4"));
        {
            value = JOptionPane.showInputDialog(null,"Transport Mode\n1. Airplane\n2. Car \n3. MotorBike \n4. Ship\n Enter a Number:");

        }
        if (value.equalsIgnoreCase("1"))
        {
            Airplane ap = new Airplane();

            JOptionPane.showMessageDialog(null,"Transport: "+ap.getTransportDetails().getMode()+"\nNumber Of Wheels: "+ap.getTransportDetails().getWheels()+"\nColour: "+ap.getTransportDetails().getColour());

        }
        if (value.equalsIgnoreCase("2"))
        {
           Car c = new Car();

            JOptionPane.showMessageDialog(null,"Transport: "+c.getTransportDetails().getMode()+"\nNumber Of Wheels: "+c.getTransportDetails().getWheels()+"\nColour: "+c.getTransportDetails().getColour());

        }
        if (value.equalsIgnoreCase("3"))
        {
            MotorBike bike = new MotorBike();

            JOptionPane.showMessageDialog(null,"Transport: "+bike.getTransportDetails().getMode()+"\nNumber Of Wheels: "+bike.getTransportDetails().getWheels()+"\nColour: "+bike.getTransportDetails().getColour());
        }

        if (value.equalsIgnoreCase("4"))
        {
           Ship ship = new Ship();

            JOptionPane.showMessageDialog(null,"Transport: "+ship.getTransportDetails().getMode()+"\nNumber Of Wheels: "+ship.getTransportDetails().getWheels()+"\nColour: "+ship.getTransportDetails().getColour());
        }



        System.exit(0);

    }
}
