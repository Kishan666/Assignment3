package AssignmentThree.com.CarAppTest;

/**
 * Created by Kishan on 2017-03-26.
 */
import AssignmentThree.com.CarApp.cSet;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
public class cSetTest {
    @Test
    public void testSet() throws Exception {

        cSet set = new cSet();
        Set s = set.getSet();


        Assert.assertEquals(3, s.size());
    }
}