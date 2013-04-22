package org.misty.rc.qiitabia;

/**
 * Created with IntelliJ IDEA.
 * User: arai
 * Date: 13/04/22
 * Time: 11:21
 * To change this template use File | Settings | File Templates.
 */
public class Qiita {
    public Qiita() {

    }

    private AuthorizeInterface auth;
    private Configuration conf;

    public void setAuth(AuthorizeInterface auth) {
        this.auth = auth;
    }


    public int testint() {
        return 1;
    }
}
