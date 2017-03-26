package AssignmentThree.com.CarApp;

import javax.swing.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Kishan on 2017-03-26.
 */
public class App {
    public static void main(String[] args) {
        String value1 = "";
        String value2 = "";

        cSet carReg = new cSet();
        Set reg = carReg.getSet();

        value1 = JOptionPane.showInputDialog(null, "Enter car registration number:");
        if (reg.contains(value1) == true) {
            cMap map = new cMap();
            Map driver = map.getMap();

            value2 = JOptionPane.showInputDialog(null, "Driver name & cars owned") + driver.toString();
            if (driver.containsKey(value2) == true) {
                cList list = new cList();
                List cars = list.getList();
                int num = Integer.parseInt(driver.get(value2).toString());
                if (num == 4) {

                    JOptionPane.showMessageDialog(null, "cars" + cars.get(0) + "\n" + cars.get(1) + "\n" + cars.get(2) + "\n" + cars.get(3));


                }
                if (num == 1) {

                    JOptionPane.showMessageDialog(null, "cars" + cars.get(0));


                }
                if (num == 3) {

                    JOptionPane.showMessageDialog(null, "cars" + cars.get(2) + "\n" + cars.get(1) + "\n" + cars.get(4));


                }
                if (num == 2) {

                    JOptionPane.showMessageDialog(null, "cars" + cars.get(5) + "\n" + cars.get(6));


                }
            }
        }


    }
}