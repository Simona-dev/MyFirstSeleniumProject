
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {

    private WebDriver driver;

    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void loginWithValidCredentials() {
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
//        WebElement element = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
//        element.click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("anablandiana15@island.ro");
        driver.findElement(By.id("pass")).sendKeys("anaaremere");
        driver.findElement(By.id("send2")).click();
        WebElement welcomeText = driver.findElement(By.cssSelector(".welcome-msg"));
        Assert.assertEquals("WELCOME, ANA BLANDIANA!", welcomeText.getText());
    }

    @Test
    public void logOutTest() {
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("anablandiana1@island.ro");
        driver.findElement(By.id("pass")).sendKeys("anaaremere");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Log Out']")).click();
        WebElement welcomText = driver.findElement(By.cssSelector(".welcome-msg"));
        Assert.assertEquals("WELCOME", welcomText.getText());

    }

    @Test
    public void loginWithInvalidCredentials() {
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("anablandian1@island.ro");
        driver.findElement(By.id("pass")).sendKeys("anaaremere");
        driver.findElement(By.id("send2")).click();
        WebElement errorText = driver.findElement(By.cssSelector(".error-msg"));
        Assert.assertEquals("Invalid login or password.", errorText.getText());
    }

    @Test
    public void loginWithoutMandatoryFields() {
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("");
        driver.findElement(By.id("pass")).sendKeys("");
        driver.findElement(By.id("send2")).click();
        WebElement errorEmailMessage = driver.findElement(By.id("advice-required-entry-email"));
        Assert.assertEquals("This is a required field.", errorEmailMessage.getText());
        WebElement errorPassMessage = driver.findElement(By.id("advice-required-entry-pass"));
        Assert.assertEquals("This is a required field.", errorPassMessage.getText());
        WebElement displayMessage = driver.findElement(By.cssSelector(".page-title h1"));
        Assert.assertEquals("LOGIN OR CREATE AN ACCOUNT", displayMessage.getText());

    }


    @After
    public void close() {
        driver.quit();
    }

}
