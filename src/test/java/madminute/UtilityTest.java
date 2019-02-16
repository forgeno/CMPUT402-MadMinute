package madminute;

import junit.framework.TestCase;
import madminute.Utility;

public class UtilityTest extends TestCase {

    private Utility utility = new Utility();

    public void testMultiply() {
        assert utility.multiply(1, 1) == 1;
    }
}