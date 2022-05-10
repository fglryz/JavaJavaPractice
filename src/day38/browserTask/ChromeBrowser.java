package day38.browserTask;

public class ChromeBrowser extends Browser{


    public ChromeBrowser(String browserName) {
        super(browserName);
    }
    public void openBrowser(){
        System.out.println("Opening chrome browser");
    }
    public void closeBrowser(){
        System.out.println("closing chrome browser");
    }
}
/*
1. ChromeBrowser
					methods:
						openBrowser(): prints "opening chrome browser"
						closeBrowser():  prints "closing chrome browser"



 */