import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyBook {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Panar\\IdeaProjects\\NewBook\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://raamatukogu.herokuapp.com/catalog/books");
        WebElement book = driver.findElement(By.linkText("Fiction book ever"));
        System.out.print("The book of interest is in the library: ");
        System.out.println(book.isDisplayed());  //Book is displayed

        driver.quit();
    }
}
