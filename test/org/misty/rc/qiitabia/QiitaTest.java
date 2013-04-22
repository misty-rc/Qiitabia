package org.misty.rc.qiitabia;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created with IntelliJ IDEA.
 * User: arai
 * Date: 13/04/22
 * Time: 11:22
 * To change this template use File | Settings | File Templates.
 */

@RunWith(JUnit4.class)
public class QiitaTest extends TestCase {
    private static Qiita qiita;

    @Test
    public void initTest() throws Exception {
        Configuration conf = new Configuration();
        conf.setSSL(true);
        QiitaFactory factory = new QiitaFactory(conf);

        qiita = factory.getInstance(new BasicAuth());
    }

    @Test
    public void testTestint() throws Exception {
        int val = qiita.testint();
        assertEquals(val, 2);
    }
}
