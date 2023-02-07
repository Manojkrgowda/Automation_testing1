package QSel;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSS {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./Selenium/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		TakesScreenshot	ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dist=new File("D:\\ss\\amazon.jpg");
		FileUtils.copyFile(src, dist);	
		
		//System Date
		Date d= new Date();
		System.out.println(d);
		
}
}
