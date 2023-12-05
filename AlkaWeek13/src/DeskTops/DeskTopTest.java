package DeskTops;

import BaseTest.Basetest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class DeskTopTest extends Basetest {
    String baseUrl = "https://tutorialsninja.com/demo/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
//1.1 Mouse hover on Desktops Tab.and click
        driver.findElement(By.xpath("//a[text()='Desktops']")).click();
        //1.2 Click on “Show All Desktops”
driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[1]/div/a")).click();
//        //1.3 Select Sort By position "Name: Z to A"
        driver.findElement(By.xpath("//select[@id='input-sort']/option[3]")).click();

//        //1.4 Verify the Product will arrange in Descending order.
        String ActualText = driver.findElement(By.xpath("//div[@id='product-category']/div/div/h3")).getText();
    String ExpectedText = "Refine Search";
        Assert.assertEquals(ActualText,ExpectedText);
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        //2.1 Mouse hover on Desktops Tab. and click
        driver.findElement(By.xpath("//a[text()='Desktops']")).click();
        //2.2 Click on “Show All Desktops”
        driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[1]/div/a")).click();
        //2.3 Select Sort By position "Name: A to Z"
        driver.findElement(By.xpath("//select[@id='input-sort']/option[2]")).click();
//      *  //2.4 Select product “HP LP3065”
        driver.findElement(By.xpath("//div[@id='content']/div[4]/div[3]/div/div[2]/div[1]/h4/a")).click();
//        //2.5 Verify the Text "HP LP3065"
        String ActualText = driver.findElement(By.xpath("//div[@id='product-product']/div/div/div/div[2]/h1")).getText();
        String ExpectedText = "HP LP3065";
        Assert.assertEquals(ActualText,ExpectedText);
//        //2.6 Select Delivery Date "2022-11-30"
driver.findElement(By.xpath("//input[@id='input-option225']")).sendKeys("2022-11-30");
//        //2.7.Enter Qty "1” using Select class.
       driver.findElement(By.xpath("//input[@id='input-quantity']")).sendKeys("1");
//        //2.8 Click on “Add to Cart” button
       driver.findElement(By.xpath("//button[@id='button-cart']")).click();
//        //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
      //  Thread.sleep(1000);
        String ActualText1 = driver.findElement(By.xpath("//div[@id='product-product']/div[1]")).getText();
        System.out.println(ActualText1);
        String ExpectedText1 = "Success: You have added HP LP3065 to your shopping cart!";

//        //2.10 Click on link “shopping cart” display into success message
       driver.findElement(By.xpath("//ul[@class='list-inline']/li[4]/a")).click();
//        //2.11 Verify the text "Shopping Cart"
        String ActualText2 = driver.findElement(By.xpath("//div[@id='top-links']/ul/li[4]/a/span")).getText();
        System.out.println(ActualText2);

//        //2.12 Verify the Product name "HP LP3065"
        String ActualText3 = driver.findElement(By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[2]/a")).getText();
        System.out.println(ActualText3);
       String ExpectedText3 = "HP LP3065";
       Assert.assertEquals(ActualText3,ExpectedText3);
//        //2.13 Verify the Delivery Date "2022-11-30"
      String ActualText4=  driver.findElement(By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[2]/small[1]")).getText();
        System.out.println(ActualText4);
        String ExpectedText4 = "Delivery Date:2011-04-22";
      Assert.assertEquals(ActualText4,ExpectedText4);
//        //2.14 Verify the Model "Product21"
        String ActualText5=  driver.findElement(By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[3]")).getText();
        System.out.println(ActualText5);

        String ExpectedText5 = "Product 21";
        Assert.assertEquals(ActualText5,ExpectedText5);
//        //2.15 Verify the Total "£74.73"
        String ActualText6=  driver.findElement(By.xpath("//div[@id='content']/form/div/table/thead/tr/td[6]")).getText();
        System.out.println(ActualText6);
        String ExpectedText6 = "Total";
        Assert.assertEquals(ActualText6,ExpectedText6);
    }
}