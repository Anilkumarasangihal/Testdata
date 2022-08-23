package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Ass2_name {
		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "./webdriver testing/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///D:/dummy.html");
			driver.findElement(By.name("n1")).clear();
			driver.findElement(By.name("n1")).sendKeys("selenium3");
			driver.findElement(By.name("n2")).click();
			
		}
}
