package AssignmentThree.com.CarAppTest;

/**
 * Created by Kishan on 2017-03-26.
 */
import AssignmentThree.com.CarApp.cMap;
import org.junit.Assert;
import org.junit.Test;


import java.util.Map;
public class cMapTest {
    @Test
    public void testMap() throws Exception {


        cMap map = new cMap();
        Map m1 = map.getMap();

        Assert.assertFalse((m1.containsValue(1)));
    }
}