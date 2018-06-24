import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    Guest guest1;
    private Object assertEquals;

    @Before
    public void setUp() throws Exception {
        guest1 = new Guest("Derek");
    }

    @Test
    public void getName() {
        assertEquals("Derek", guest1.getName());
    }

}
