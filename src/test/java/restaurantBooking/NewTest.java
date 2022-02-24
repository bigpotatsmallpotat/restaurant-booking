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
	   
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
