package day38.browserTask;

public class OperaBrowser extends Browser{


    public OperaBrowser(String browserName) {
        super(browserName);
    }
    public void openBrowser(){
        System.out.println("opening opera browser");
    }
    public void closeBrowser(){
        System.out.println("closing opera browser");
    }
}
/*
3. Opera extends Browser
					methods:
						openBrowser(): prints "opening opera browser"
						closeBrowser(): prints "closing opera browser"

 */

