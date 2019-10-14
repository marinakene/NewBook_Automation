import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DeleteBook {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Panar\\IdeaProjects\\NewBook\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://raamatukogu.herokuapp.com/catalog/books");

        WebElement book = driver.findElement(By.linkText("Fiction book ever"));
        System.out.println(book.isDisplayed());  //Book is displayed
        book.click();

        WebElement book_delete = driver.findElement(By.linkText("Delete Book"));
        book_delete.click();
        WebElement delete_button = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button"));
        delete_button.click();

        driver.quit();

    }
}