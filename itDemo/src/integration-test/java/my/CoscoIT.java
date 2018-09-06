package my;

import annotation.CoscoITest;
import com.kelvin.itest.CoscoTest;
import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import java.lang.annotation.Inherited;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
//@CoscoITest
@Category(CoscoTest.class)
@RunWith(JMockit.class)
public class CoscoIT
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void coscoTest1()
    {
        assertTrue( true );
    }
}
