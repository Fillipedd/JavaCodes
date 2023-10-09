package drivers;

public class ChromeDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("Run Chrome webdriver");
    }

    @Override
    public void findElementBy() {
        System.out.println("Find element with Chrome webdriver");
    }
}
