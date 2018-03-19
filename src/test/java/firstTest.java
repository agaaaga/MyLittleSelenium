import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String actualTitle = "";

        driver.get("http://www.pracuj.pl");
        actualTitle = driver.getTitle();
        System.out.println("Tutaj nazwa strony: " + actualTitle);

        if(actualTitle.contentEquals("Oferty pracy - Pracuj.pl")){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }




        driver.quit();
    }
}
