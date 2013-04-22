package org.misty.rc.qiitabia;

/**
 * Created with IntelliJ IDEA.
 * User: arai
 * Date: 13/04/22
 * Time: 13:28
 * To change this template use File | Settings | File Templates.
 */
public interface AuthorizeInterface {
    public void setUser(String user);
    public void setPassword(String password);
    public String getToken();
}
