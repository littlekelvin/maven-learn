package annotation;

import com.kelvin.itest.CoscoTest;
import org.junit.experimental.categories.Category;

import java.lang.annotation.*;

@Category(CoscoTest.class)
//@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.TYPE, ElementType.METHOD})
public @interface CoscoITest {

}
