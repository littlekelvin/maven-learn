package annotation;

import com.kelvin.itest.OoclTest;
import org.junit.experimental.categories.Category;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Category(OoclTest.class)
//@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.TYPE, ElementType.METHOD})
public @interface OoclITest {

}
