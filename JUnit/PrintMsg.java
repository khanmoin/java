/**
 * Simple Class which implements a Constructor and a printMsg function
 */

package JUnit; 

public class PrintMsg {

    private String msg;

    //Constructor
    public PrintMsg(String msg) {
        this.msg = msg;
    }

    public String printMsg() {
        return msg;
    }
}

