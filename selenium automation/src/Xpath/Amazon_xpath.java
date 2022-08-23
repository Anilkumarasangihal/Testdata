package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_xpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./webdriver testing/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.amazon.in/HP-250-Bluetooth-Mouse-6CR73AA/dp/B084XM5N9W/ref=sw_img_sspa_dk_huc_pt_expsub_0?_"
			+ "encoding=UTF8&pd_rd_i=B084XM5N9W&pd_rd_w=z2VpI&content-id=amzn1.sym.210d6279-a2e9-42a5-"
			+ "80d4-97427a0e855c&pf_rd_p=210d6279-a2e9-42a5-80d4-97427a0e855c&pf_rd_"
			+ "r=058W9YJ5TV4WC0M38TPG&pd_rd_wg=hoEr6&pd_rd_r=950e812c-11b0-4640-84f3-5da8ad4cf26f&spLa="
			+ "ZW5jcnlwdGVkUXVhbGlmaWVyPUEyVE5OVDJBVE9XVlFGJmVuY3J5cHRlZElkPUEwOTYxNDc0MjVQSkVJMzJJNkY3TiZ"
			+ "lbmNyeXB0ZWRBZElkPUEwNzYxMjAyMTY0U0EzQkY3SFEzVCZ3aWRnZXROYW1lPXNwX2h1Y19tcmFpJmFjdGlvbj1jbGl"
			+ "ja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='nav-cart-count']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[1]/span[1]/span/span[1]/span/span/span/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='quantity_4']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[2]/span/input")).click();
	Thread.sleep(5000);
	driver.quit();
}
}//*[@id="quantity_4"]  //span[2]/span/input
//div[1]/span[1]/span/span[1]/span/span/span/span& //span/a/div/img