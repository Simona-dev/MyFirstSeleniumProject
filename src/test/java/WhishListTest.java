import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhishListTest {

    private WebDriver driver;

    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

//    @Test
//    public void addProductToWhishList(){
//        driver.get("http://testfasttrackit.info/selenium-test/");
//        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("a[href*='sale.html'].level0")).click();
//        driver.findElement(By.cssSelector("[title = 'View Details']")).click();
//        driver.findElement(By.cssSelector(".link-wishlist")).click();
//        WebElement element = driver.findElement(By.cssSelector(""));
//            }


    @Test
    public void addProductToWishListLoggedUser() {
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("anablandiana1@island.ro");
        driver.findElement(By.id("pass")).sendKeys("anaaremere");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector("a[href*='sale.html'].level0")).click();
        driver.findElement(By.cssSelector("[title = 'View Details']")).click();
        driver.findElement(By.cssSelector(".link-wishlist")).click();
        WebElement element = driver.findElement(By.cssSelector(".btn-remove"));
        Assert.assertTrue(element.isDisplayed());

    }
    @Test
    public void removeProductToWishListLoggedUser() {
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("anablandiana1@island.ro");
        driver.findElement(By.id("pass")).sendKeys("anaaremere");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector("a[href*='sale.html'].level0")).click();
        driver.findElement(By.cssSelector("[title = 'View Details']")).click();
        driver.findElement(By.cssSelector(".link-wishlist")).click();
        driver.findElement(By.cssSelector("a[href*='remove']")).click();


    }
    @After
    public void close() {
        driver.quit();
    }
}
