import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    public static void main(String[] args) {

    }

    public void registerNewUser(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("ana");
        driver.findElement(By.id("middlename")).sendKeys("oana");
        driver.findElement(By.id("lastname")).sendKeys("blandiana");
        driver.findElement(By.id("email_address")).sendKeys("anablandiana4@island.ro");
        driver.findElement(By.id("password")).sendKeys("anaaremere2");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("anaaremere2");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();

        driver.close();




    }
}
