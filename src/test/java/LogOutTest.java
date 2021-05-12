import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutTest {

    private WebDriver driver ;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver=new ChromeDriver();
    }
    @Test
    public void loginWithValidCredentials(){
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
//        WebElement element = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
//        element.click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("anablandiana1@island.ro");
        driver.findElement(By.id("pass")).sendKeys("anaaremere");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Log Out']")).click();
    }

        

    @After
    public void close(){
        driver.quit();}
}
