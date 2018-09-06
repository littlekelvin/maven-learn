package my;

import annotation.CoscoITest;
import annotation.OoclITest;
import com.kelvin.itest.CoscoTest;
import com.kelvin.itest.OoclTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class MutilpleIT {
    /**
     * Rigorous Test :-)
     */
    @Test
    @Category(OoclTest.class)
    public void ooclTest() {
        assertTrue(true);
    }

    @Test
    @Category(CoscoTest.class)
    public void coscoTest() {
        assertTrue(true);
    }
}
