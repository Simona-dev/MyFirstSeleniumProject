import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        WebElement element = driver.findElement(By.cssSelector(".page-title h1"));
        Assert.assertEquals("SEARCH RESULTS FOR 'VASE'",element.getText() );

    }
    @After
    public void close(){
        driver.quit();}


    }

