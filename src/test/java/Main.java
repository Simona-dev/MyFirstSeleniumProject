import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        LoginTest test = new LoginTest();
        test.loginWithValidCredentials();

        RegisterTest test1 = new RegisterTest();
        test1.registerNewUser();
        WhishListTest wish = new WhishListTest();
        wish.addProductToWhishList();
        wish.addProductToWishListLoggedUser();


    }


}
