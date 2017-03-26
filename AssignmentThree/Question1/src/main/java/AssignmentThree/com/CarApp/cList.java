package AssignmentThree.com.CarApp;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Kishan on 2017-03-26.
 */

public class cList {
    List<String> list = new ArrayList<String>();
    public List<String> getList()
    {
        list.add("Ford Focus");
        list.add("Honda Civic");
        list.add("BMW M3");
        list.add("Toyota Supra");
        list.add("Audi A3");

        return list;

    }
}
