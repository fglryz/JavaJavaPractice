package day38.browserTask;

public class SafariBrowser extends Browser{


    public SafariBrowser(String browserName) {
        super(browserName);
    }
    public void openBrowser(){
        System.out.println("opening safari browser");
    }
    public void closeBrowser(){
        System.out.println("closing safari browser");
    }
}
/*
4. Safari extends Browser
					methods:
						openBrowser(): prints "opening safari browser"
						closeBrowser(): prints "closing safari browser"
 */
