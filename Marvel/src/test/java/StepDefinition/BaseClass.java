package StepDefinition;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.io.Files;

import junit.framework.Assert;

public class BaseClass {

	public static WebDriver driver;
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RayappanRaja\\eclipseOxegen\\Marvel\\driver\\chromedriver_95.exe");
		 driver= new ChromeDriver();
		 
	}
	public static void max() {
		driver.manage().window().maximize();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void type(WebElement loc,String in) {
		loc.sendKeys(in);
	}
	public static void click(WebElement loc) {
		loc.click();
	}
	public static void implicit() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public static void explicit(WebElement e) {
		//WebDriverWait w=new WebDriverWait(driver,100);
		Wait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMinutes(7000)).pollingEvery(Duration.ofMillis(20)).ignoring(Throwable.class);
		
		//w.until(ExpectedConditions.elementToBeClickable(e));
	}
	public static void Javascript(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",e);
	}
	public static void pageDown(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].ScrollIntoView(true)",e);
	}
	public static void pageLoad() {
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
	}
	public static void close() {
		driver.close();
	}
@SuppressWarnings("deprecation")
public static void verifyText(WebElement e) {
	String text=e.getText();
	Assert.assertEquals("Sign in", text);
	
}
@SuppressWarnings("deprecation")
public static void verifyOverview(WebElement e) {
	String text=e.getText();
	Assert.assertEquals("About Modulr", text);
	
}

	 public static void capturescreen(WebDriver driver, String screenShotName, String status)
     {
         try {
             TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

             File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

             if (status.equals("FAILURE")) {
            	 FileUtils.copyFile(scrFile, new File("./ScreenshotsFailure/" + screenShotName + ".png"));
             }
             else if(status.equals("SUCCESS"))
             {
                 FileUtils.copyFile(scrFile, new File("./ScreenshotsSuccess/" + screenShotName + ".png"));
             }


             System.out.println("Printing screen shot taken for className "+ screenShotName);

         }
         catch (Exception e)
         {
             System.out.println("Exception while taking screenshot " + e.getMessage());
         }

     }
	 
 
}

