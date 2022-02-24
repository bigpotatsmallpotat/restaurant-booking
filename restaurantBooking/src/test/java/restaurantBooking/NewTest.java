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
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
	  
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
      driver.findElement(By.cssSelector("body > form > input[type=password]:nth-child(3)")).sendKeys("Selenium Password");
      
      // browser automatically selects gender for user creation"
      Select selectGender = new Select(driver.findElement(By.name("gender")));
      selectGender.selectByVisibleText("Female");
    		   
      //browser automatically looks and clicks servlet button
      driver.findElement(By.cssSelector("body > form > input[type=submit]:nth-child(6)")).click();
	  
	  
	  // browser look for link with text value "Why RP"?
	  //driver.findElement(By.linkText("Why RP?")).click();
	  
	  // browser look for link with text value "Experience Real-World Learning"
	  //driver.findElement(By.linkText("Experience Real-World Learning")).click();
	  
	  // browser look for link with text value "Why RP"?
	  //driver.findElement(By.linkText("Why RP?")).click();
	  
	  // browser look for link with text value "Experience Real-World Learning"
	  //driver.findElement(By.linkText("Thrive in a Supportive Community")).click();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
