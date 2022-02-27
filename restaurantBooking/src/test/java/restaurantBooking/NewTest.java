package restaurantBooking;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest {
	@Test
	public void f() {
		// define the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");

		// define the drive instance
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// navigate the browser to this url
		driver.get("http://localhost:8090/restaurantBooking/index.jsp");

		// to run through CRUD functions, ensuring all functioning properly.
		// 'create' and 'retrieve' function
		// click register button
		driver.findElement(By.linkText("Register")).click();

		// browser automatically types name for user creation"
		driver.findElement(By.cssSelector("body > form > input[type=text]:nth-child(1)")).sendKeys("Selenium Name");

		// browser automatically types email for user creation"
		driver.findElement(By.cssSelector("body > form > input[type=text]:nth-child(2)")).sendKeys("Selenium Email");

		// browser automatically types password for user creation"
		driver.findElement(By.cssSelector("body > form > input[type=password]:nth-child(3)"))
				.sendKeys("Selenium Password");

		// browser automatically selects gender for user creation"
		Select selectGender = new Select(driver.findElement(By.name("gender")));
		selectGender.selectByVisibleText("Female");

		// browser automatically looks and clicks servlet button
		driver.findElement(By.cssSelector("body > form > input[type=submit]:nth-child(6)")).click();

		// update function
		// browser look for link with text value "Edit" for the newly created entry
		driver.findElement(
				By.cssSelector("body > div > div > table > tbody > tr:nth-child(4) > td:nth-child(6) > a:nth-child(1)"))
				.click();

		// browser update Name for newly created restaurant"
		driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(3) > input")).clear();
		driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(3) > input"))
				.sendKeys("SelUpda Name");

		// browser update Cuisine for newly created restaurant"
		driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(4) > input")).clear();
		driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(4) > input"))
				.sendKeys("SelUpda Email");

		// browser update address for newly created restaurant"
		driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(5) > input")).clear();
		driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(5) > input"))
				.sendKeys("SelUpda Password");

		// browser update info for newly created restaurant"
		driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(6) > input")).clear();
		driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(6) > input"))
				.sendKeys("SelUpda Gender");

		// browser look for save button
		driver.findElement(By.cssSelector("body > div > div > div > form > button")).click();

		// delete function
		// browser look for delete button
		driver.findElement(
				By.cssSelector("body > div > div > table > tbody > tr:nth-child(4) > td:nth-child(6) > a:nth-child(2)"))
				.click();

	}

	@Test
	public void LogOut() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");

		// define the drive instance
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// navigate the browser to this url
		driver.get("http://localhost:8090/restaurantBooking/index.jsp");

		// click login button
		driver.findElement(By.linkText("Login")).click();

		// browser automatically types email to sign in"
		driver.findElement(By.cssSelector("body > form > input[type=text]:nth-child(1)")).sendKeys("admin@gmail.com");

		// browser automatically types password to sign in"
		driver.findElement(By.cssSelector("body > form > input[type=text]:nth-child(3)")).sendKeys("admin");

		// browser automatically looks and clicks servlet button
		driver.findElement(By.cssSelector("body > form > input[type=submit]:nth-child(5)")).click();

		// browser automatically looks and clicks logout button
		driver.findElement(By.cssSelector("body > div > div > div > a.btn.btn-secondary.pl-2")).click();

	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
