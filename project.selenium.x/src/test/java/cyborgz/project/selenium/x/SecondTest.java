package cyborgz.project.selenium.x;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SecondTest extends TestBaseThreadSafe {
	
	private int count=0;
	
	private SecondTest() {
		System.out.println("Inside Constructor");
	}
	
	@Test
    public void GOOGLE4() throws Exception {
        System.out.println("Yahoo Test Started! " + Thread.currentThread().getId());
        getDriver().navigate().to("http://www.yahoo.com");
        Thread.sleep(3000);
        System.out.println("Sleep over for "+Thread.currentThread().getId());
        System.out.println("Yahoo Test's Page title is: " + getDriver().getTitle() +" Thread ID: "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Yahoo");
        getDriver().quit();
        System.out.println("Yahoo Test Ended! " + Thread.currentThread().getId());
        System.out.println("Total Count : " + count++);
        System.out.println("HashCode 1 : " + this.hashCode());
    }

	@Test
    public void YANDEX() throws Exception {
		System.out.println("-------------------------------------------------------------------");
        System.out.println("Yandex Test Started! " + Thread.currentThread().getId());
        getDriver().navigate().to("http://www.yandex.com");
        Thread.sleep(3000);
        System.out.println("Yandex Test's Page title is: " + getDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Yandex");
        getDriver().quit();
        System.out.println("Yandex Test Ended! " + Thread.currentThread().getId());
        System.out.println("Total Count : " + count++);
        System.out.println("HashCode 2 : " + this.hashCode());
    }
}
