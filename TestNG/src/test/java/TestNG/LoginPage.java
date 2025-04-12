package TestNG;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginPage {

    final String ExistUserName="esr99";
    final String ExistPassword="esr123456";
    WebDriver driver;
    Wait<WebDriver> wait;

@BeforeMethod
    public void OpenWebsite() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        wait.until(d ->driver.findElement(By.id("loginusername")).isDisplayed());
        wait.until(d ->driver.findElement(By.id("loginpassword")).isDisplayed());
    }
@AfterMethod
    public void CloseWebsite() {
        driver.quit();
    }


    @Test(priority = 1)
    public void CorrectUserAndpassword ()
    {
       //Verify Log in with correct username and correct password
        driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys(ExistUserName);
        driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys(ExistPassword);
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
    }


    @Test(priority = 2)
    public void incorrectUsernameAndPassword ()
    {

        //Verify error for incorrect username and incorrect password
        driver.findElement(By.id("loginusername")).sendKeys("9656");
        driver.findElement(By.id("loginpassword")).sendKeys("9699");
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert= driver.switchTo().alert();
        String AlertMessage= alert.getText();
        Assert.assertTrue(AlertMessage.contains("User does not exist."));
    }

    @Test(priority = 3)
    public void incorrectUser()
    {
       //Verify error for incorrect username and correct password
        driver.findElement(By.id("loginusername")).sendKeys("9656");
        driver.findElement(By.id("loginpassword")).sendKeys(ExistPassword);
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert= driver.switchTo().alert();
        String AlertMessage= alert.getText();
        Assert.assertTrue(AlertMessage.contains("User does not exist."));
    }


    @Test(priority = 4)
    public void IncorrectPassword()
    {
        //Verify error for correct username and incorrect password
        driver.findElement(By.id("loginusername")).sendKeys(ExistUserName);
        driver.findElement(By.id("loginpassword")).sendKeys("8986");
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert= driver.switchTo().alert();
        String AlertMessage= alert.getText();
        Assert.assertTrue(AlertMessage.contains("Wrong password."));
    }

    @Test(priority = 5)
    public void CloseButton()
    {
        //Verify Close button functionality  on Login page
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
          boolean  CloseButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]")).isDisplayed();
        Assert.assertFalse(CloseButton, "Login page should be closed after clicking Close button.");

    }


    @Test(priority = 6)
    public void CloseXButton()
    {
        //Verify Close (X) button functionality  on Login  page
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[1]/button/span")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        boolean XButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[1]/button/span")).isDisplayed();
        Assert.assertFalse(XButton, "Login page should be closed after clicking Close button.");

    }

    @Test(priority = 7)
    public void MaskedPassword()
    {
        //Verify that the password field is masked in log in page
        WebElement Masked =driver.findElement(By.id("loginpassword"));
        String PasswordType=Masked.getDomAttribute("type");
        Assert.assertEquals(PasswordType, "password");
    }
}
