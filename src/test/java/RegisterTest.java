import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    private WebDriver driver ;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();}

    @Test
    public void registerNewUser(){

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title = 'Register']")).click();
        driver.findElement(By.id("firstname")).sendKeys("ana");
        driver.findElement(By.id("middlename")).sendKeys("oana");
        driver.findElement(By.id("lastname")).sendKeys("blandiana");
        driver.findElement(By.id("email_address")).sendKeys("anablandiana4@island.ro");
        driver.findElement(By.id("password")).sendKeys("anaaremere2");
        driver.findElement(By.id("confirmation")).sendKeys("anaaremere2");
        driver.findElement(By.id("is_subscribed")).click();


    }
    @After
    public void close(){
        driver.quit();}

}

