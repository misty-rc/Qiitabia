package org.misty.rc.qiitabia;

/**
 * Created with IntelliJ IDEA.
 * User: arai
 * Date: 13/04/22
 * Time: 13:19
 * To change this template use File | Settings | File Templates.
 */
public class Configuration {
    private boolean _ssl = false;
    private boolean _page_default = true;

    public Configuration() {

    }

    public void setSSL(boolean ssl) {
        this._ssl = ssl;
    }

    public void setPagenationDefault(boolean page_default) {
        this._page_default = page_default;
    }
}
