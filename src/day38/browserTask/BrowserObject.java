package day38.browserTask;

public class BrowserObject {

    public static void main(String[] args) {

        ChromeBrowser chromeBrowser =new ChromeBrowser("Chrome");

        FireFoxBrowser fireFoxBrowser =new FireFoxBrowser("fireFox");

        OperaBrowser operaBrowser = new OperaBrowser("Opera");

        SafariBrowser safariBrowser = new SafariBrowser("Safari");

        chromeBrowser.openBrowser();
        chromeBrowser.closeBrowser();

        fireFoxBrowser.openBrowser();
        fireFoxBrowser.closeBrowser();

        operaBrowser.openBrowser();
        operaBrowser.closeBrowser();

        safariBrowser.openBrowser();
        safariBrowser.closeBrowser();
    }
}
