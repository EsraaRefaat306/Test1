package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Generate new random username and password
        String username = RandomDataGenerator.generateUsername(8);
        String password = RandomDataGenerator.generatePassword(10);

        // Saving username and password which already exist for using in re-signUp with Same user and password
        final String ExistUserName="esr99";
        final String ExistPassword="esr123456";


        //Code for  SignUp  page with new username and password
        /*
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d ->driver.findElement(By.id("sign-username")).isDisplayed());
        wait.until(d ->driver.findElement(By.id("sign-password")).isDisplayed());

        driver.findElement(By.id("sign-username")).sendKeys(username);
        driver.findElement(By.id("sign-password")).sendKeys(password);

        wait.until(d ->driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Alert alert =driver.switchTo().alert();
        String AlertMessage= alert.getText();
        if(AlertMessage.contains("Sign up successful."))
        {
            System.out.print("Sign up successful.");
        }
        */



/*
//Code for  SignUp  page with empty username and valid password

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d ->driver.findElement(By.id("sign-password")).isDisplayed());
        driver.findElement(By.id("sign-password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Alert alert =driver.switchTo().alert();
        String AlertMessage= alert.getText();
        if(AlertMessage.contains("Please fill out Username and Password."))
        {
            System.out.print("Test passed successfully.");
        }
*/

        /*
//Code for  SignUp  page with valid username and empty password

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d ->driver.findElement(By.id("sign-username")).isDisplayed());
        driver.findElement(By.id("sign-username")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Alert alert =driver.switchTo().alert();
        String AlertMessage= alert.getText();
        if(AlertMessage.contains("Please fill out Username and Password."))
        {
            System.out.print("Test passed successfully.");
        }

       */

//Code for  SignUp  page with empty username and password
       /*
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Alert alert =driver.switchTo().alert();
        String AlertMessage= alert.getText();
        if(AlertMessage.contains("Please fill out Username and Password."))
        {
            System.out.print("Test passed successfully.");
        }
       */

        //Code for  SignUp  page with exist username and password
       /*
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d ->driver.findElement(By.id("sign-username")).isDisplayed());
        wait.until(d ->driver.findElement(By.id("sign-password")).isDisplayed());

        driver.findElement(By.id("sign-username")).sendKeys(ExistUserName);
        driver.findElement(By.id("sign-password")).sendKeys(ExistPassword);
        wait.until(d ->driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Alert alert =driver.switchTo().alert();
        String AlertMessage= alert.getText();
        if(AlertMessage.contains("This user already exist."))
        {
            System.out.print("Test passed successfully.");
        }
        */

        //Verify that the password field is masked in Sign up page
        /*
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        driver.findElement(By.id("sign-password"));
        WebElement Masked =driver.findElement(By.id("sign-password"));
        String PasswordType=Masked.getDomAttribute("type");
        if(PasswordType.equals("password"))
        {
            System.out.println("✅ Password field is masked.");
        } else {
            System.out.println("❌ Password field is NOT masked.");
        }
       */


//Verify Close button functionality  on SighUp page
        /*
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d ->driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]")).click();
        */

//Verify Close (X) button functionality  on SighUp page
      /*
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d ->driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[1]/button/span")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[1]/button/span")).click();
      */





//Login Page  -Verify user can Log in successfully with correct username and correct password
        /*
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d ->driver.findElement(By.id("loginusername")).isDisplayed());
        wait.until(d ->driver.findElement(By.id("loginpassword")).isDisplayed());
        driver.findElement(By.id("loginusername")).sendKeys(ExistUserName);
        driver.findElement(By.id("loginpassword")).sendKeys(ExistPassword);
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
        if (ExistUserName.contentEquals("esr99") && ExistPassword.contentEquals("esr123456"))
        {
            System.out.print("login Successfully");
        }
        else
            System.out.print("login Failed");
       */



//Verify error for incorrect username and incorrect password
      /*
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d ->driver.findElement(By.id("loginusername")).isDisplayed());
        wait.until(d ->driver.findElement(By.id("loginpassword")).isDisplayed());
        driver.findElement(By.id("loginusername")).sendKeys("9656");
        driver.findElement(By.id("loginpassword")).sendKeys("9699");
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Alert alert= driver.switchTo().alert();
        String AlertMessage= alert.getText();
        if(AlertMessage.contains("User does not exist."))
        {
           System.out.print("Test Passed");
       }
     */


//Verify error for incorrect username and correct password
      /*
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d ->driver.findElement(By.id("loginusername")).isDisplayed());
        wait.until(d ->driver.findElement(By.id("loginpassword")).isDisplayed());
        driver.findElement(By.id("loginusername")).sendKeys("9656");
        driver.findElement(By.id("loginpassword")).sendKeys(ExistPassword);
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Alert alert= driver.switchTo().alert();
        String AlertMessage= alert.getText();
        if(AlertMessage.contains("User does not exist."))
        {
           System.out.print("Test Passed");
       }
     */



//Verify error for correct username and incorrect password
        /*
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d ->driver.findElement(By.id("loginusername")).isDisplayed());
        wait.until(d ->driver.findElement(By.id("loginpassword")).isDisplayed());
        driver.findElement(By.id("loginusername")).sendKeys(ExistUserName);
        driver.findElement(By.id("loginpassword")).sendKeys("8986");
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Alert alert= driver.switchTo().alert();
        String AlertMessage= alert.getText();
        if(AlertMessage.contains("Wrong password."))
        {
           System.out.print("Test Passed");
       }
        */

//Verify Close button functionality  on Login page
       /*
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d ->driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]")).click();
       */

//Verify Close (X) button functionality  on Login  page
       /*
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d ->driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[1]/button/span")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[1]/button/span")).click();
       */

//Verify that the password field is masked in log in page
       /*
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        WebElement Masked =driver.findElement(By.id("loginpassword"));
        String PasswordType=Masked.getDomAttribute("type");
        if(PasswordType.equals("password"))
        {
            System.out.println("✅ Password field is masked.");
        } else {
            System.out.println("❌ Password field is NOT masked.");
        }
        */


    }
}