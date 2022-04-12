import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxClass {

    public static void main(String[] args) {
        String heroUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(heroUrl);
        driver.manage().window().maximize();

        System.out.println("Title of the page : " + driver.getTitle());// Printing the title of the page
        System.out.println("Current Url Page : " + driver.getCurrentUrl());// printing the current Url
        System.out.println("Page Source : " + driver.getPageSource());// printing the page source
        WebElement emailField = driver.findElement(By.id("username"));// find email field element
        emailField.sendKeys("myChrome@hotmail.com");// Entering email id
        WebElement emailPassword = driver.findElement(By.name("password"));// find password field element
        emailPassword.sendKeys("abcdef567");// entering password to password field*/
        //driver.close();
    }
}
