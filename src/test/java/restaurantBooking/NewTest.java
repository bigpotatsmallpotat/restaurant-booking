package restaurantBooking;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  //define the chrome driver
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
	  
	  //define the driver instance
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  //navigate the browser to this url
	  driver.get("http://localhost:8090/restaurant-booking/RestaurantServlet/dashboard");
	  
	  //CREATE AND RETRIEVE FUNCTION	  
	  //browser look for link with text value "Add New Restaurant"
	  driver.findElement(By.linkText("Add New Restaurant")).click();
	  
	  //browser write Name for restaurant creation"
	  driver.findElement(By.cssSelector("body > form > input[type=text]:nth-child(1)")).sendKeys("Auto Name");
	  
	  //browser write Cuisine for restaurant creation"
	  driver.findElement(By.cssSelector("body > form > input[type=text]:nth-child(2)")).sendKeys("Auto Cuisine");
	  
	  //browser write Address for restaurant creation"
	  driver.findElement(By.cssSelector("body > form > input[type=text]:nth-child(3)")).sendKeys("Auto Address");
	  
	  //browser write Info for restaurant creation"
	  driver.findElement(By.cssSelector("body > form > input[type=text]:nth-child(4)")).sendKeys("Auto Info");
	  
	  //browser look for link with text value "Call Servlet"
	  driver.findElement(By.cssSelector("body > form > input[type=submit]:nth-child(5)")).click();
	  	  
	  //browser look for link with text value "Click here to go to restaurant management dashboard"
	  driver.findElement(By.linkText("Click here to go to restaurant management dashboard")).click();
	  
	  //UPDATE FUNCTION	  
	  //browser look for link with text value "Edit" for the newly created entry
	  driver.findElement(By.cssSelector("body > div > div > table > tbody > tr:nth-child(1) > td:nth-child(5) > a:nth-child(1)")).click();
	  
	  //browser update Name for newly created restaurant"
	  driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(3) > input")).clear();
	  driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(3) > input")).sendKeys("Updated Name");
	  
	  //browser update Cuisine for newly created restaurant"
	  driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(4) > input")).clear();
	  driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(4) > input")).sendKeys("Updated Cuisine");
	  
	  //browser update address for newly created restaurant"
	  driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(5) > input")).clear();
	  driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(5) > input")).sendKeys("Updated Address");
	  
	  //browser update info for newly created restaurant"
	  driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(6) > input")).clear();
	  driver.findElement(By.cssSelector("body > div > div > div > form > fieldset:nth-child(6) > input")).sendKeys("Updated Info");
	  
	  //browser look for save button
	  driver.findElement(By.cssSelector("body > div > div > div > form > button")).click();
	  
	  //DELETE FUNCTION
	  //browser look for delete button
	  driver.findElement(By.cssSelector("body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(5) > a:nth-child(2)")).click();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
