import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        driver.findElement(By.cssSelector("li.level0.nav-5.parent>a")).click();
        driver.findElement(By.cssSelector("[title = 'View Details']")).click();
        driver.findElement(By.id("swatch27")).click();
        driver.findElement(By.id("swatch81")).click();
        driver.findElement(By.cssSelector(".add-to-cart .button")).click();


        }
    @After
    public void close(){
        driver.quit();}





}


