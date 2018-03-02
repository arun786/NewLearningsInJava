package Collection;

import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Adwiti on 2/21/2018.
 */

@RunWith(JUnit4.class)
public class UseOfCollectionsSingleton {

    /**
     * Collections.singleton returns an immutable set of the specified element, the returned set in serializable
     */
    @Test
    public void RemoveSpecifiedElementFromAList() {
        List<String> games = Lists.newArrayList("cricket", "cricket", "chess", "table tennis", "football");
        games.removeAll(Collections.singleton("cricket"));
        games.forEach(game -> {
            if (game.equals("chess") || game.equals("table tennis") || game.equals("football")) {
                assertTrue(true);
            } else {
                assertFalse(true);
            }
        });
    }



}
