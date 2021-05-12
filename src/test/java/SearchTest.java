import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
    private WebDriver driver ;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver=new ChromeDriver();

    }
    @Test
    public void Search(){

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.id("search")).sendKeys("vase");
        driver.findElement(By.cssSelector(".button.search-button")).click();
    }
    @After
    public void close(){
        driver.quit();}
    
//    public void testButtonDelete(){
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://testfasttrackit.info/selenium-test/");
//        driver.findElement(By.id("search")).sendKeys("A tale of two cities");
//        driver.findElement(By.cssSelector(".button.search-button")).click();
//        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(11) > div > h2 > a")).click();
//        driver.findElement(By.cssSelector("#downloadable-links-list > li > span > label")).click();
//        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();
//        driver.findElement(By.cssSelector(".product-cart-info .btn-remove2")).click();//pt tema button delete}

    }

