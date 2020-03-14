/**
 * Defining the driver class for the TestClass.java
 * Runs tests written for the MyMath Class in TestClass Class
 */

package JUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class MyMathTestRunner {
    public static void main(String[] args) {
        Result result =  JUnitCore.runClasses(MyMathTestClass.class);
        for(Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}

class MyMath {
    public int add(int i, int j){
        return i+j;
    }
}