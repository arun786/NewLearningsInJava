package Collection;

import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adwiti on 2/21/2018.
 */

@RunWith(JUnit4.class)
public class RemovingNullsFromAList {


    /**
     * We can remove nulls from a list using remove method of list
     */
    @Test
    public void RemoveNullsFromListUsingPlainJava() {

        List<Integer> users = Lists.newArrayList(null, 10, null);
        while (users.remove(null)) ;
        assertEquals(users.size(), 1);
    }

}
