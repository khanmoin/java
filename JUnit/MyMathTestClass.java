/**
 * Basics of JUnit Testing
 * Defining Tests for MyMath Java Class
 */

package JUnit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyMathTestClass {
    @Test
    public void addToZero() {
        MyMath test = new MyMath();
        assertEquals(10, test.add(10, 0));
    }
}