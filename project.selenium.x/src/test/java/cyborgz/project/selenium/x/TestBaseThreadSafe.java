package cyborgz.project.selenium.x;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public abstract class TestBaseThreadSafe {
	
	ThreadLocal<WebDriver> driver = new ThreadLocal();
	
	public TestBaseThreadSafe() {
		
		System.out.println("Inside Test Base Cons");
		//setWebDriver();
	}
	
	@BeforeMethod
	public void setWebDriver() {
		driver.set(new FirefoxDriver());
		System.out.println("Thread Base driver :---->" + Thread.currentThread().getId() + "");
		System.out.println("driver got created..." + "driver hash..." + driver.hashCode());
	}
	
	protected WebDriver getDriver() {
    	//driver = driver== null ? new FirefoxDriver() : driver;
    	System.out.println("Thread ID within getDriver: "+ Thread.currentThread().getId() + " WebDriver HashCode: " + driver.hashCode()+ " Class Hash: " + this.hashCode());
		return driver.get();
	}
}