import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeClass {
    public static void main(String[] args) {
        String heroUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe");
        WebDriver driver_Edge = new EdgeDriver();
        driver_Edge.get(heroUrl);
        driver_Edge.manage().window().maximize();
        System.out.println("Title of the page : " + driver_Edge.getTitle());// Printing the title of the page
        System.out.println("Current Url Page : " + driver_Edge.getCurrentUrl());// printing the current Url
        System.out.println("Page Source : " + driver_Edge.getPageSource());// printing the page source
        WebElement emailField = driver_Edge.findElement(By.id("username"));// find email field element
        emailField.sendKeys("automation@hotmail.com");// Entering email id
        WebElement emailPassword = driver_Edge.findElement(By.name("password"));// find password field element
        emailPassword.sendKeys("is_FUN567");// entering password to password field*/
        driver_Edge.close();
    }
}
