import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeDriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Bat");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Man");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Batman");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-3"));
        radioButton1.click();

        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        checkBox1.click();

        driver.findElement(By.cssSelector("option[value='4']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("04/20/2069");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement((By.cssSelector(".btn.btn-lg.btn-primary"))).click();

        driver.quit();
    }
}
