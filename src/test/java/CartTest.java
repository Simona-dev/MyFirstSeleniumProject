import org.apache.http.util.Asserts;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartTest {
    private WebDriver driver ;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver=new ChromeDriver();}


    @Test
    public void addItemToCart(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a[href*='sale.html'].level0")).click();
        driver.findElement(By.cssSelector("[title = 'View Details']")).click();
        driver.findElement(By.id("swatch27")).click();
        driver.findElement(By.id("swatch81")).click();
        driver.findElement(By.cssSelector(".add-to-cart .button")).click();
        WebElement textMessage = driver.findElement(By.cssSelector(".success-msg"));
        Assert.assertEquals("Slim fit Dobby Oxford Shirt was added to your shopping cart.",textMessage.getText());
        WebElement element = driver.findElement(By.cssSelector(".checkout-types.top"));
        Assert.assertTrue(element.isDisplayed());

        }
        @Test
        public void removeItemFromCart(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a[href*='sale.html'].level0")).click();
        driver.findElement(By.cssSelector("[title = 'View Details']")).click();
        driver.findElement(By.id("swatch27")).click();
        driver.findElement(By.id("swatch81")).click();
        driver.findElement(By.cssSelector(".add-to-cart .button")).click();
        driver.findElement(By.cssSelector(".skip-cart .label")).click();
        driver.findElement(By.cssSelector(".cart-link")).click();
        driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.a-center.product-cart-remove.last > a")).click();
        WebElement textMessage = driver.findElement(By.cssSelector(".page-title h1"));
        Assert.assertEquals("SHOPPING CART IS EMPTY", textMessage.getText());


        }

    @After
    public void close(){
        driver.quit();}





}


