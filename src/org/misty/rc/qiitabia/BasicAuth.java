package org.misty.rc.qiitabia;

/**
 * Created with IntelliJ IDEA.
 * User: arai
 * Date: 13/04/22
 * Time: 13:29
 * To change this template use File | Settings | File Templates.
 */
public class BasicAuth implements AuthorizeInterface {
    private String _user;
    private String _password;

    public BasicAuth() {
        new BasicAuth(null,null);
    }

    public BasicAuth(String user, String password) {
        _user = user;
        _password = password;
    }

    @Override
    public void setUser(String user) {
        _user = user;
    }

    @Override
    public void setPassword(String password) {
        _password = password;
    }

    @Override
    public String getToken() {
        //TODO: gettoken from api

        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
