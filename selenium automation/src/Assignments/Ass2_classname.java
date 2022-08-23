package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Ass2_classname {
	

	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./webdriver testing/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/dummy.html");
		driver.findElement(By.className("c1")).clear();
		driver.findElement(By.className("c1")).sendKeys("selenium2");
		driver.findElement(By.className("c2")).click();
		
	}
	}

