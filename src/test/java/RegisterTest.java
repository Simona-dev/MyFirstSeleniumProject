import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        driver.findElement(By.id("email_address")).sendKeys("anablandiana14@island.ro");
        driver.findElement(By.id("password")).sendKeys("anaaremere2");
        driver.findElement(By.id("confirmation")).sendKeys("anaaremere2");
        driver.findElement(By.id("is_subscribed")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        WebElement textMessage = driver.findElement(By.cssSelector(".page-title"));
        Assert.assertEquals("MY DASHBOARD", textMessage.getText());
    }

    @Test
    public void registerEmailAllreadyUsed(){

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title = 'Register']")).click();
        driver.findElement(By.id("firstname")).sendKeys("ana");
        driver.findElement(By.id("middlename")).sendKeys("oana");
        driver.findElement(By.id("lastname")).sendKeys("blandiana");
        driver.findElement(By.id("email_address")).sendKeys("anablandiana1@island.ro");
        driver.findElement(By.id("password")).sendKeys("anaaremere2");
        driver.findElement(By.id("confirmation")).sendKeys("anaaremere2");
        driver.findElement(By.id("is_subscribed")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        WebElement errorMessage = driver.findElement(By.cssSelector(".error-msg"));
        Assert.assertTrue(errorMessage.isDisplayed());

    }
    @Test
    public void verifyMandatoryFields(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title = 'Register']")).click();
        driver.findElement(By.id("firstname")).sendKeys("");
        driver.findElement(By.id("middlename")).sendKeys("");
        driver.findElement(By.id("lastname")).sendKeys("");
        driver.findElement(By.id("email_address")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.id("confirmation")).sendKeys("");
        driver.findElement(By.id("is_subscribed")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        WebElement firstNameError = driver.findElement(By.id("advice-required-entry-firstname"));
        Assert.assertEquals("This is a required field.", firstNameError.getText());
        WebElement lastNameError = driver.findElement(By.id("advice-required-entry-lastname"));
        Assert.assertEquals("This is a required field.", lastNameError.getText());
        WebElement passErrorMessage = driver.findElement(By.id("advice-required-entry-password"));
        Assert.assertEquals("This is a required field.", passErrorMessage.getText());
        WebElement confirmErrorMessage = driver.findElement(By.id("advice-required-entry-confirmation"));
        Assert.assertEquals("This is a required field.", confirmErrorMessage.getText());

    }
    @After
    public void close(){
        driver.quit();}

}

