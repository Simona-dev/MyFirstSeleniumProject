import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {

    }

    public void loginWithValidCredentials(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
//        WebElement element = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
//        element.click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("anablandiana1@island.ro");
        driver.findElement(By.id("pass")).sendKeys("anaaremere");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();


        driver.quit();
}
}
