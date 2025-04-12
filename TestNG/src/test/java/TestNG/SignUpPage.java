package TestNG;
import org.example.RandomDataGenerator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;

import java.time.Duration;



public class SignUpPage {
    String username = RandomDataGenerator.generateUsername(8);
    String password = RandomDataGenerator.generatePassword(10);
    // Saving username and password which already exist for using in re-signUp with Same user and password
    final String ExistUserName="esr99";
    final String ExistPassword="esr123456";
    WebDriver driver;
    Wait<WebDriver> wait;

@BeforeMethod
    public void OpenWebsite() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d ->driver.findElement(By.id("sign-username")).isDisplayed());
        wait.until(d ->driver.findElement(By.id("sign-password")).isDisplayed());
    }

   @AfterMethod
    public void CloseWebsite() {
        driver.quit();
    }

    @Test (priority = 1)
    public void ValidUserAndPassword()
    {
        //Code for  SignUp  page with new username and password
        driver.findElement(By.id("sign-username")).sendKeys(username);
        driver.findElement(By.id("sign-password")).sendKeys(password);
        wait.until(d ->driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert =driver.switchTo().alert();
        String AlertMessage= alert.getText();
        Assert.assertTrue( AlertMessage.contains("Sign up successful."));
    }

    @Test (priority = 2)
    public void EmptyUserName()
    {

      //Code for  SignUp  page with empty username and valid password
        driver.findElement(By.id("sign-password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert =driver.switchTo().alert();
        String AlertMessage= alert.getText();
        Assert.assertTrue(AlertMessage.contains("Please fill out Username and Password."));

    }


    @Test (priority = 3)
    public void EmptyPassword()
    {
        //Code for  SignUp  page with valid username and empty password
        driver.findElement(By.id("sign-username")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert =driver.switchTo().alert();
        String AlertMessage= alert.getText();
        Assert.assertTrue(AlertMessage.contains("Please fill out Username and Password."));
    }


    @Test (priority = 4)
    public void EmptyUserAndPassword()
    {
        //Code for  SignUp  page with empty username and password
        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert =driver.switchTo().alert();
        String AlertMessage= alert.getText();
        Assert.assertTrue(AlertMessage.contains("Please fill out Username and Password."));
    }

    @Test (priority = 5)
    public void ExistUser()
    {
        //Code for  SignUp  page with exist username and password
        driver.findElement(By.id("sign-username")).sendKeys(ExistUserName);
        driver.findElement(By.id("sign-password")).sendKeys(ExistPassword);
        wait.until(d ->driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert =driver.switchTo().alert();
        String AlertMessage= alert.getText();
        Assert.assertTrue(AlertMessage.contains("This user already exist."));
    }



    @Test (priority = 6)
    public void MaskedPassword()
    {
        //Verify that the password field is masked in Sign up page
        WebElement Masked =driver.findElement(By.id("sign-password"));
        String PasswordType=Masked.getDomAttribute("type");
        Assert.assertEquals(PasswordType, "password");
    }

    @Test (priority = 7)
    public void CloseButton ()
    {
        //Verify Close button functionality  on SighUp page
        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        boolean XButton = driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]")).isDisplayed();
        Assert.assertFalse(XButton, "Login page should be closed after clicking Close button.");

    }

    @Test (priority = 8)
    public void CloseXbutton ()
    {
        //Verify Close (X) button functionality  on SighUp page
      driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[1]/button/span")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        boolean XButton = driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[1]/button/span")).isDisplayed();
        Assert.assertFalse(XButton, "Login page should be closed after clicking Close button.");
    }

}
