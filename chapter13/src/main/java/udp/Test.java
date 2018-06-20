package udp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Lovell on 9/29/16.
 */

public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);

    @org.junit.Test
    public void test1() throws Exception {
        Server.initServer();
    }

    @org.junit.Test
    public void test2() throws Exception {
        Client client = new Client(8080);
        client.sendPackage();
    }
}