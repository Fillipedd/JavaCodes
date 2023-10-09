package drivers;

import drivers.WebDriver;

public class FirefoxDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("Run Firefox webdriver");
    }

    @Override
    public void findElementBy() {
        System.out.println("Find element with Firefox webdriver");
    }

}
