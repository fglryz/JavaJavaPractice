package day38.browserTask;

public class Browser {

    public String browserName;

    public Browser(String browserName) {
        this.browserName = browserName;
    }

    public void openBrowser(){
        System.out.println(browserName+" is opening");
    }
    public void closeBrowser(){
        System.out.println(browserName+ " is closing");
    }

    public String toString() {
        return "Browser{" +
                "browserName='" + browserName + '\'' +
                '}';
    }
}
/*
1. Create a class named Browser:

			Methods:
				openBrowser(): prints "opening chrome browser"
				closeBrowser():  prints "closing chrome browser"

	2. Create the following sub classes of Browser and override the methods if needed:



 */