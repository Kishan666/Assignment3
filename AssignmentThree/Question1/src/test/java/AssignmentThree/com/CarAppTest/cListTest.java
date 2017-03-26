package AssignmentThree.com.CarAppTest;

/**
 * Created by Kishan on 2017-03-26.
 */
import AssignmentThree.com.CarApp.cList;

import junit.framework.Assert;
import org.junit.Test;


import java.util.Collections;




public class cListTest {
    @Test
    public void testList() throws Exception {

        cList list = new cList();
        int freq = Collections.frequency(list.getList(),"Honda Civic");
        Assert.assertEquals(2,freq);

    }
}
