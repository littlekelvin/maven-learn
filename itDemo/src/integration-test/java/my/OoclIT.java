package my;

import annotation.OoclITest;
import com.kelvin.itest.CoscoTest;
import com.kelvin.itest.OoclTest;
import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
@Category(OoclTest.class)
@RunWith(JMockit.class)
public class OoclIT
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void ooclTest1()
    {
        assertTrue( true );
    }
}
