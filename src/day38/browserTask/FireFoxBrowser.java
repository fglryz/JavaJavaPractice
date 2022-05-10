package day38.browserTask;

public class FireFoxBrowser extends Browser{

    public FireFoxBrowser(String browserName) {
        super(browserName);
    }
    public void openBrowser(){
        System.out.println("opening firefox browser");
    }
    public void closeBrowser(){
        System.out.println("closing fire fox browser");
    }
}
/*
2. FireFox extends Browser
					methods:
						openBrowser(): prints "opening firefox browser"
						closeBrowser(): prints "closing fire fox browser"


 */