import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeClass {
    public static void main(String[] args) {
        String heroUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver_Chrome = new ChromeDriver();
        driver_Chrome.get(heroUrl);
        driver_Chrome.manage().window().maximize();
        System.out.println("Title of the page : " + driver_Chrome.getTitle());// Printing the title of the page
        System.out.println("Current Url Page : " + driver_Chrome.getCurrentUrl());// printing the current Url
        System.out.println("Page Source : " + driver_Chrome.getPageSource());// printing the page source
        WebElement emailField = driver_Chrome.findElement(By.id("username"));// find email field element
        emailField.sendKeys("myChrome@hotmail.com");// Entering email id
        WebElement emailPassword = driver_Chrome.findElement(By.name("password"));// find password field element
        emailPassword.sendKeys("abcdef567");// entering password to password field*/
        driver_Chrome.close();


    }
}
