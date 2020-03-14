/**
 * Driver class for TestPrintMsg.java
 * Runs tests defined in TestPrintMsg class for PrintMsg class
 */

package JUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class PrintMsgTestRunner {
    public static void main(String[] args) {
        Result r = JUnitCore.runClasses(PrintMsgTestClass.class);

        for(Failure f : r.getFailures()) {
            System.out.println(f.toString());
        }

        System.out.println(r.wasSuccessful());
    }
}