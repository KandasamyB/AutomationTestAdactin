package com.stepDefinitionPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinStep {
	
	  WebDriver driver;
		@Given("User is on the Adactinhotel Page")
		public void user_is_on_the_Adactinhotel_Page() {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
			
		}

		@When("User should Login with {string},{string}")
		public void user_should_Login_with(String user, String pass) {
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(user);
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(pass);
			WebElement log = driver.findElement(By.id("login"));
			log.click();
		}

		@When("User should Search the Hotel with {string},{string},{string},{string},{string},{string},{string},{string}")
		public void user_should_Search_the_Hotel_with(String location, String hotel, String roomtype, String noofrooms, String checkin, String checkout, String adult, String children) {
		
			 driver.findElement(By.id("location")).sendKeys(location);
			 driver.findElement(By.id("hotels")).sendKeys(hotel);
			 driver.findElement(By.id("room_type")).sendKeys(roomtype);
			 driver.findElement(By.id("room_nos")).sendKeys(noofrooms);
			 driver.findElement(By.id("datepick_in")).sendKeys(checkin);
			 driver.findElement(By.id("datepick_out")).sendKeys(checkout);
			 driver.findElement(By.id("adult_room")).sendKeys(adult);
			 driver.findElement(By.id("child_room")).sendKeys(children);
			 driver.findElement(By.id("Submit")).click();
			
			
		}

		@When("User should Select the hotel using Continue")
		public void user_should_Select_the_hotel_using_Continue() {
		
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		}

		@When("User Should Book the Hotel using {string},{string},{string},{string},{string},{string},{string} , {string}")
		public void user_Should_Book_the_Hotel_using(String firstname, String lastname, String address, String ccno, String cctype, String month, String year, String cvv) {	
			
			driver.findElement(By.id("first_name")).sendKeys(firstname);
			driver.findElement(By.id("last_name")).sendKeys(lastname);
			driver.findElement(By.id("address")).sendKeys(address);
			driver.findElement(By.id("cc_num")).sendKeys(ccno);
			driver.findElement(By.id("cc_type")).sendKeys(cctype);
			driver.findElement(By.id("cc_exp_month")).sendKeys(month);
			driver.findElement(By.id("cc_exp_year")).sendKeys(year);
			driver.findElement(By.id("cc_cvv")).sendKeys(cvv);
			driver.findElement(By.id("book_now")).click();;
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
		}

		@Then("user should Confirm the booking using order id")
		public void user_should_Confirm_the_booking_using_order_id() {
			String attribute = driver.findElement(By.id("order_no")).getAttribute("value");
			System.out.println(attribute);
			
		}
	

}
