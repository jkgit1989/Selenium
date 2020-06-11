import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintGoogleSuggestions {
	public static void main(String args[]) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("Google");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.switchTo().activeElement();
		element.sendKeys("Apple");
		List<WebElement> lstGoogle = driver.findElement(By.xpath("//ul[@role='listbox']"))
	.findElements(By.xpath("//li[@role='presentation']"));
		for (int i = 0; i < lstGoogle.size(); i++) {
			System.out.println(lstGoogle.get(i).getText());
		}
		element.submit();
		System.out.println("Page title is: " + driver.getTitle());
		//getScreenShot(driver);
	}
}


