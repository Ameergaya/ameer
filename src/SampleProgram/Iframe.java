package SampleProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium'\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement btn1 = driver .findElement(By.id("click"));
		btn1.click();
		
		String text = driver .findElement(By.id("click")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement btn2 = driver.findElement(By.id("Click1"));
		btn2.click();
		
		driver.switchTo().defaultContent();
		  List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		  
		  int size = totalframes.size();
		  System.out.println("size");
	}

}
