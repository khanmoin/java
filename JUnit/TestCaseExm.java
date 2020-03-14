/**
 * Using JUnits TestCase Class
 */

 package JUnit;

 import junit.framework.TestCase;
 import org.junit.Test;


 public class TestCaseExm extends TestCase {
     
    @Test
    public void testAdd() {
        System.out.println("No of Test Cases = " + this.countTestCases());

        this.setName("Special Test");
        System.out.println("TestCase Name = " + this.getName());
    }
 }