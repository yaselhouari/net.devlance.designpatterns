package dp03singleton;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SingletonTest {
    @Test
    public void testIfBothInstancesAreTheSame() {
        Policy policy1 = Policy.Instance ();
        Policy policy2 = Policy.Instance ();

        assertEquals ( policy1, policy2 );
    }
}
