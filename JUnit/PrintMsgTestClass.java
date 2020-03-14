/**
 * Defines JUnit Test cases for the PrintMsg Class
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrintMsgTestClass {
    String msg = "Some Message";
    PrintMsg pm = new PrintMsg(msg);

    @Test
    public void testPrintMsg() {
        assertEquals(msg, pm.printMsg());
    }
}