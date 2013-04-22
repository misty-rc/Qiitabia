package org.misty.rc.qiitabia;

/**
 * Created with IntelliJ IDEA.
 * User: arai
 * Date: 13/04/22
 * Time: 13:19
 * To change this template use File | Settings | File Templates.
 */
public class QiitaFactory {

    private Configuration conf;

    public QiitaFactory(Configuration conf) {
        this.conf = conf;
    }

    public Qiita getInstance(AuthorizeInterface auth) {

        Qiita ins = new Qiita();

        ins.setAuth(auth);


        return ins;
    }
}
