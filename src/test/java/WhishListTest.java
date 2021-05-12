import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhishListTest {
    private WebDriver driver ;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();}

    @Test
    public void addProductToWhishList(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("li.level0.nav-5.parent>a")).click();
        driver.findElement(By.cssSelector("[title = 'View Details']")).click();
        driver.findElement(By.cssSelector(".link-wishlist")).click();
            }


//    @Test
//    public void addProductToWishListLoggedUser(){
//       driver.get("http://testfasttrackit.info/selenium-test/");
//        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
//        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
//        driver.findElement(By.id("email")).sendKeys("anablandiana1@island.ro");
//        driver.findElement(By.id("pass")).sendKeys("anaaremere");
//        driver.findElement(By.cssSelector("#send2 > span > span")).click();
//        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
//        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > a")).click();
//        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
//
//       }
    @After
    public void close(){
        driver.quit();}
}
