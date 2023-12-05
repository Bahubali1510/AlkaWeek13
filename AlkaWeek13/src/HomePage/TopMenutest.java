package HomePage;

import BaseTest.Basetest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenutest extends Basetest {

    String baseUrl = "https://tutorialsninja.com/demo/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    public void selectMenu(String menu) {

        driver.findElement(By.xpath("//a[text()='" + menu + "']")).click();
    }
    @Test

    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        driver.findElement(By.xpath("//a[text()='Desktops']")).click();
        selectMenu("Show AllDesktops");
// 1.2 call selectMenu method and pass the menu = “Show All Desktops”
        String ActualText = driver.findElement(By.xpath("//h2[text()='Desktops']")).getText();
        String ExpectedText = "Desktops";
        Assert.assertEquals(ActualText,ExpectedText);
    }
@Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        //Mouse hover on “Laptops & Notebooks” Tab and click
    driver.findElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[2]")).click();
    selectMenu("Show AllLaptops & Notebooks");
//   // 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
    String ActualText = driver.findElement(By.xpath("//div[@id='content']/h2")).getText();
    String ExpectedText = "Laptops & Notebooks";
    Assert.assertEquals(ActualText,ExpectedText);
}
@Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        //3.1 Mouse hover on “Components” Tab and click
    driver.findElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[3]")).click();
    selectMenu("Show AllComponents");

    //3.2 call selectMenu method and pass the menu = “Show All Components”
    String ActualText = driver.findElement(By.xpath("//div[@id='content']/h2")).getText();
    String ExpectedText = "Components";
    Assert.assertEquals(ActualText,ExpectedText);
}





    }

