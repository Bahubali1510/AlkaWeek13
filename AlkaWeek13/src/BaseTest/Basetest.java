package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl) {
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php");
        String titleOfPage = driver.getTitle();
        System.out.println(titleOfPage);
        driver.manage().window().maximize();
    }



    public void closeBrowser() {
        driver.quit();
    }

}
