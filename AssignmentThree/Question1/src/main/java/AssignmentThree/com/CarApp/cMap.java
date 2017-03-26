package AssignmentThree.com.CarApp;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by Kishan on 2017-03-26.
 */
public class cMap {
    Map<String, Integer> map = new HashMap<String, Integer>();
public void insertCars()
{
    map.put("Jacob",4);
    map.put("Baron",2);
    map.put("Zack",6);
    map.put("Sparky",7);
    map.put("Ash",8);

}
public Map<String, Integer> getMap()
{
    insertCars();
    return map;
}
}
