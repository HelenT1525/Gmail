package gmail;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helen
 */
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Gmail {
/**
* @param args the command line arguments
*/
public static void main(String[] args) throws InterruptedException {
// Create a new instance of the Firefox driver
System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
WebDriver driver;
driver = new FirefoxDriver();
//Launch the some site
driver.get("https://www.gmail.com");
 
// Print a Log In message to the screen
System.out.println("Successfully opened the website localhost");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']")); 
email_phone.sendKeys("0932......"); 
driver.findElement(By.id("identifierNext")).click(); 
WebElement password = driver.findElement(By.xpath("//input[@name='password']")); 
WebDriverWait wait = new WebDriverWait(driver, 20); 
wait.until(ExpectedConditions.elementToBeClickable(password));
password.sendKeys("**********"); 
driver.findElement(By.id("passwordNext")).click();

List<WebElement> unreademail = driver.findElements(By.className("zE"));
System.out.println(" No of unread mails: " + unreademail.size());

        
}
}

