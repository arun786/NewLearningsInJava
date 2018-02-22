# Remove Null from List

    package Collection;

    import com.google.common.base.Predicates;
    import com.google.common.collect.Iterables;
    import com.google.common.collect.Lists;
    import org.junit.Test;
    import org.junit.runner.RunWith;
    import org.junit.runners.JUnit4;

    import java.util.Collections;
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

        /**
         * remove Nulls using method removeAll from List class
         */
        @Test
        public void RemoveNullUsingRemoveAll() {
            List<Integer> users = Lists.newArrayList(null, 10, null);
            users.removeAll(Collections.singleton(null));
            assertEquals(users.size(), 1);
        }

        /**
         * Using Google Gauva.
         */
        @Test
        public void RemoveNullUsingGoogleGuava() {
            List<Integer> users = Lists.asList(null, 10, null);
            Iterables.removeIf(users, Predicates.isNull());
            assertEquals(users.size(), 1);
        }

    }
