package myaccounts;

import BaseTest.Basetest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class MyAccountsTest extends Basetest {

    String baseUrl = "https://tutorialsninja.com/demo/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    public void selectMyAccountOptions(String menu) {
driver.findElement(By.xpath(menu)).click();

    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //1.1 Click on My Account Link.
        driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a/span[1]")).click();

        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter Register
        selectMyAccountOptions("//nav[@id='top']/div[1]/div[2]/ul/li[2]/ul[1]/li[1]/a");

      //  driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a")).click();
//1.3 Verify the text “Register Account”.
        String actualText = driver.findElement(By.xpath("//div[@id='account-register']/div/div/h1")).getText();
        System.out.println(actualText);
        String expectedText = "Register Account";
        Assert.assertEquals(actualText, expectedText);

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {

        // 2.1 Click on My Account Link.
        driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a/span[1]")).click();

// 2.2 Call the method “selectMyAccountOptions” method and pass the parameter Login
        driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a")).click();
// 2.3 Verify the text “Returning Customer”.
//    Thread.sleep(1000);
//    String actualText = driver.findElement(By.xpath("//div[@id='account-login']/div/div/div/div[2]/div/h2")).getText();
//    System.out.println(actualText);

    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {

        //3.1 Click on My Account Link.
        driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a/span[1]")).click();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter Register
        driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a")).click();
        //3.3 Enter First Name
        driver.findElement(By.id("input-firstname")).sendKeys("Alka");
        //3.4 Enter Last Name
        driver.findElement(By.id("input-lastname")).sendKeys("Jadeja");
//        //3.5 Enter Email
        driver.findElement(By.id("input-email")).sendKeys("table@gmail.com");
//        //3.6 Enter Telephone
        driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
//        //3.7 Enter Password
        driver.findElement(By.id("input-password")).sendKeys("123456");
//        //3.8 Enter Password Confirm
        driver.findElement(By.id("input-confirm")).sendKeys("123456");
//        //3.9 Select Subscribe Yes radio button
        driver.findElement(By.xpath("//label[@class='radio-inline']/input")).click();

        //3.10 Click on Privacy Policy check box
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        //3.11 Click on Continue button
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        //3.12 Verify the message “Your Account Has Been Created!”
        Thread.sleep(1000);
String actualText = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
        System.out.println(actualText);

        //3.13 Click on Continue button
        driver.findElement(By.xpath("//div[@id='content']/div/div/a")).click();

        //3.14 Click on My Account Link.
        driver.findElement(By.xpath("//div[@id='content']/h2[1]")).click();

        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter logout

        //3.16 Verify the text “Account Logout”
        String actualText2 = driver.findElement(By.xpath("//div[@id='account-account']/div/aside/div/a[13]")).getText();
        System.out.println(actualText2);

        //3.17 Click on Continue button
        driver.findElement(By.xpath("//div[@id='content']/div/div/a")).click();
    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
//        4.1 Click on My Account Link.
        driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a/span[1]")).click();
//        4.2 Call the method “selectMyAccountOptions” method and pass the parameter login
selectMyAccountOptions("//div[@id='top-links']/ul/li[2]/ul/li[2]/a");
//        4.3 Enter Email address
        driver.findElement(By.id("input-email")).sendKeys("table@gmail.com");
//
//        4.5 Enter Password
        driver.findElement(By.id("input-password")).sendKeys("123456");
//        4.6 Click on Login button
driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/form/input")).click();
//        4.7 Verify text “My Account”
        String actualText1 = driver.findElement(By.xpath("//div[@id='content']/h2[1]")).getText();
        System.out.println(actualText1);
//        4.8 Click on My Account Link.
        driver.findElement(By.xpath("//div[@id='content']/h2[1]")).click();
//        4.9 Call the method “selectMyAccountOptions” method and pass the parameter logout
        selectMyAccountOptions("//nav[@id='top']/div[1]/div[2]/ul/li[2]/ul[1]/li[5]/a");
//        4.10 Verify the text “Account Logout”
        Thread.sleep(1000);
String actualText = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
        System.out.println(actualText);
//        4.11 Click on Continue button
        driver.findElement(By.xpath("//div[@id='content']/div/div/a")).click();
    }
}
