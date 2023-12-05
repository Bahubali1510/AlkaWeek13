package laptopsandnotebooks;

import BaseTest.Basetest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LaptopsAndNotebooksTest extends Basetest {
    String baseUrl = "https://tutorialsninja.com/demo/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a")).click();
        //1.2 Click on “Show All Laptops & Notebooks”
        driver.findElement(By.xpath("//ul[@class ='nav navbar-nav']/li[2]/div/a")).click();
        //1.3 Select Sort By "Price (High > Low)"
        driver.findElement(By.xpath("//div[@class='form-group input-group input-group-sm']/select/option[5]")).click();
        //1.4 Verify the Product price will arrange in High to Low order.
        String ActualText = driver.findElement(By.xpath("//div[@id='content']/h3")).getText();
        System.out.println(ActualText);
        String ExpectedText = "Refine Search";
        Assert.assertEquals(ActualText, ExpectedText);
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse hover on Laptops & Notebooks Tab.and click
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a")).click();
        //2.2 Click on “Show All Laptops & Notebooks”
        driver.findElement(By.xpath("//ul[@class ='nav navbar-nav']/li[2]/div/a")).click();
        //2.3 Select Sort By "Price (High > Low)"
        driver.findElement(By.xpath("//div[@class='form-group input-group input-group-sm']/select/option[5]")).click();
        //2.4 Verify the Product price will arrange in High to Low order.
        String ActualText = driver.findElement(By.xpath("//div[@id='content']/h3")).getText();
        System.out.println(ActualText);
        //String ExpectedText = "Refine Search";
        // Assert.assertEquals(ActualText,ExpectedText);

//2.4 Select Product “MacBook”
        driver.findElement(By.xpath("//div[@id='content']/div[4]/div[1]/div/div[2]/div[1]/h4/a")).click();
//2.5 Verify the text “MacBook”
        driver.findElement(By.xpath("//div[@id='content']/div/div[2]/h1")).getText();
//2.6 Click on ‘Add To Cart’ button
        driver.findElement(By.xpath("//button[@id='button-cart']")).click();
//2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        Thread.sleep(1000);
        String actualText1 = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
        System.out.println(actualText1);
        String expectedText1 = "Success: You have added MacBook Pro to your shopping cart!\n" +
                "×";
        Assert.assertEquals(actualText1, expectedText1);
//2.8 Click on link “shopping cart” display into success message
        driver.findElement(By.xpath("//ul[@class='list-inline']/li[4]/a")).click();
////2.9 Verify the text "Shopping Cart"
        String actualText2 = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
        System.out.println(actualText2);
        String expectedText2 = "Shopping Cart";
        Assert.assertEquals(actualText1, expectedText1);
//2.10 Verify the Product name "MacBook"
        driver.findElement(By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[2]/a")).getText();
////2.11 Change Quantity "2"
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[4]/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[4]/div/input")).sendKeys("2");
////2.12 Click on “Update” Tab

        driver.findElement(By.xpath("//i[@class='fa fa-refresh']")).click();
////2.13 Verify the message “Success: You have modified your shopping cart!”
        String actualText4 = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
        System.out.println(actualText4);
        String expectedText4 = "Success: You have modified your shopping cart!\n" +
                "×";
        Assert.assertEquals(actualText4, expectedText4);
////2.14 Verify the Total £737.45
        String actualText5 = driver.findElement(By.xpath("//div[@id='content']/form/div/table/thead/tr/td[6]")).getText();
        System.out.println(actualText5);
        String expectedText5 = "Total";
        Assert.assertEquals(actualText5, expectedText5);
//2.15 Click on “Checkout” button
        driver.findElement(By.xpath("//div[@id='top-links']/ul/li[5]/a/span")).click();
//2.16 Verify the text “Checkout”
        String actualText6 = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
        System.out.println(actualText6);
        String expectedText6 = "Checkout";
        Assert.assertEquals(actualText6, expectedText6);

//2.17 Verify the Text “New Customer”
        Thread.sleep(1000);
        String actualText7 = driver.findElement(By.xpath("//div[@id='collapse-checkout-option']/div/div/div[1]/h2")).getText();
        String expectedText7 = "New Customer";
        Assert.assertEquals(actualText7, expectedText7);

        //2.18 Click on “Guest Checkout” radio button
        driver.findElement(By.xpath("//div[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label")).click();
//2.19 Click on “Continue” tab
        driver.findElement(By.xpath("//input[@id='button-account']")).click();
//2.20 Fill the mandatory fields
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='input-payment-firstname']")).sendKeys("Alka");
        driver.findElement(By.id("input-payment-lastname")).sendKeys("Jadeja");
        driver.findElement(By.id("input-payment-email")).sendKeys("cb@gmail.com");
        driver.findElement(By.id("input-payment-telephone")).sendKeys("12345678");
        driver.findElement(By.id("input-payment-company")).sendKeys("hi");
        driver.findElement(By.id("input-payment-address-1")).sendKeys("xyz");
        driver.findElement(By.id("input-payment-city")).sendKeys("London");
        driver.findElement(By.id("input-payment-postcode")).sendKeys("123");
       // driver.findElement(By.id("input-payment-country")).sendKeys("United States ");
        //driver.findElement(By.id("input-payment-zone")).sendKeys("Bristol");
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='input-payment-zone']")); //
        Select select1 =new Select(dropdown);
        select1.selectByIndex(29);
//2.21 Click on “Continue” Button
        driver.findElement(By.id("button-guest")).click();
//2.22 Add Comments About your order into text area
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='collapse-shipping-method']/div/p[4]/textarea")).sendKeys("Hello");
//2.23 Click on “Continue” button
//        driver.findElement(By.xpath("//input[@id='button-shipping-method']")).click();
////2.24 Check the Terms & Conditions check box
//       Thread.sleep(1000);
//       driver.findElement(By.xpath("//div[@id='content']/div/div[5]/div[2]/div/div[2]/div/input[1]")).click();
//2.25 Verify the message “Warning: Payment method required!”
//String actualResult8= driver.findElement(By.xpath("//div[@id='collapse-payment-method']/div/div[1]")).getText();
//        System.out.println(actualResult8);
    }
}
