package com.selenium.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
	
	static WebDriver driver;
	static WebDriverWait wait;
	
	
	@Given("^when user enter the login Id and Password$")
	public void when_user_enter_the_login_Id_and_Password() throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:8181/ManagementOfHotels/");
		//Assert.assertEquals(driver.getTitle(), "Home");
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.name("BodyFrame")));
		driver.findElement(By.name("UserID")).sendKeys("admin");
		driver.findElement(By.name("Password")).sendKeys("admin");
		    
	}

	@Then("^the system should enter the Admin Landing page\\.$")
	public void the_system_should_enter_the_Admin_Landing_page() throws Throwable {

		
		driver.findElement(By.xpath("/html/body/form/fieldset[1]/table/tbody/tr[4]/td[3]/input")).click();
		System.out.println("System is at the Admin Landing Page");

		
	}

	@Given("^when user navigate to Location Tab$")
	public void when_user_navigate_to_Location_Tab() throws Throwable {

		driver.switchTo().frame(driver.findElement(By.name("MFrame")));
		Thread.sleep(2000);
		driver.findElement(By.name("Accommodation")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("BodyFrame")));
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.name("RFrame")));
	}

	@Then("^User needs to add new location name, Image and description$")
	public void user_needs_to_add_new_location_name_Image_and_description() throws Throwable {
		
		driver.findElement(By.name("LocationName")).sendKeys("Las Vegas Resort");
		driver.findElement(By.name("PhotoPath")).sendKeys("images\\1.jpeg");
		driver.findElement(By.id("FUBtn")).click();
		driver.findElement(By.name("LocationDesc")).sendKeys("test description");
	    
	}

	@Then("^sumbit to have new location updated into the system$")
	public void sumbit_to_have_new_location_updated_into_the_system() throws Throwable {

		driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[5]/th[1]/input")).click();
	    
	}

	@Given("^user navigates to Resort page$")
	public void user_navigates_to_Resort_page() throws Throwable {

		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.name("BodyFrame")));
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.name("MFrame")));
		driver.findElement(By.name("Resorts")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("BodyFrame")));
		driver.switchTo().frame(driver.findElement(By.name("RFrame")));
		
	}

	@Then("^choose location from the dropdown and click on addResort button$")
	public void choose_location_from_the_dropdown_and_click_on_addResort_button() throws Throwable {
		WebElement dropdown=driver.findElement(By.name("LocationName"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("LV");
		driver.findElement(By.xpath("//*[@id='Resort']/table/tbody/tr[3]/th/input")).click();
	}

	@Given("^I navigate to Rooms application$")
	public void i_navigate_to_Rooms_application() throws Throwable {

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("BodyFrame")));
		driver.switchTo().frame(driver.findElement(By.name("MFrame")));
		driver.findElement(By.name("AddRooms")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("BodyFrame")));
		driver.switchTo().frame(driver.findElement(By.name("RFrame")));
		Thread.sleep(2000);
		
		
	}

	@When("^I choose the resort and click on add room$")
	public void i_choose_the_resort_and_click_on_add_room() throws Throwable {

		WebElement ele=driver.findElement(By.name("ResortID"));
		Select s=new Select(ele);
		s.selectByVisibleText("Goa");
		driver.findElement(By.xpath("//*[@id='Rooms']/table/tbody/tr[3]/th/input")).click();
		Thread.sleep(3000);
		
	}

	@Then("^I choose add resort properties like charges, type and area$")
	public void i_choose_add_resort_properties_like_charges_type_and_area() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("RoomArea")).sendKeys("200");
		driver.findElement(By.name("RoomCharges")).sendKeys("3000");
		

	    
	}

	@Then("^click on Add Room$")
	public void click_on_Add_Room() throws Throwable {

		driver.findElement(By.xpath("//input[@value='AddRoom']")).click();
	}

	@Given("^user is in the add room page$")
	public void user_is_in_the_add_room_page() throws Throwable {

		if(driver.findElements(By.xpath("/html/body/table/tbody/tr/td/a/img")).size()>0){
			
			System.out.println("User is on the View Room pag");
		}else{
			System.out.println("Am not in the view rooms page");
		}
	}

	@When("^user clicks on view room link$")
	public void user_clicks_on_view_room_link() throws Throwable {

		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/a/img")).click();
	}

	@When("^choose the resort/location$")
	public void choose_the_resort_location() throws Throwable {


		WebElement d=driver.findElement(By.name("ResortID"));
		Select s=new Select(d);
		s.selectByVisibleText("Goa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Rooms']/table/tbody/tr[3]/th/input")).click();
		
	}

	@Then("^system should display all the resorts and available rooms$")
	public void system_should_display_all_tge_resorts_and_available_rooms() throws Throwable {

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("BodyFrame")));
		driver.switchTo().frame(driver.findElement(By.name("RFrame")));
		Assert.assertEquals(driver.findElement(By.xpath("/html/body/h3")).getText(), "Room Details");
	}

	@Given("^I am not currently logged in$")
	public void i_am_not_currently_logged_in() throws Throwable {

		driver.navigate().to("http://localhost:8181/ManagementOfHotels/");
		
	}

	@When("^I am on the signup page$")
	public void i_am_on_the_signup_page() throws Throwable {

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("BodyFrame")));
		
	}

	@Then("^I should click on Register Now link$")
	public void i_should_click_on_Register_Now_link() throws Throwable {

		driver.findElement(By.xpath("/html/body/form/fieldset[2]/table/tbody/tr/td/a/img")).click();
		
	}

	@Then("^I fill in Choose UserName \\(required\\)$")
	public void i_fill_in_Choose_UserName_required() throws Throwable {

		driver.findElement(By.name("UserID")).sendKeys("johnSmith");
	
	}

	@Then("^I fill in Password \\(required with password$")
	public void i_fill_in_Password_required_with_password() throws Throwable {
		
		driver.findElement(By.name("upassword")).sendKeys("admin");
	    
	}

	@Then("^I fill in Password confirmation with password$")
	public void i_fill_in_Password_confirmation_with_password() throws Throwable {

		driver.findElement(By.name("retypepassword")).sendKeys("admin");
	}

	@Then("^I fill in FirstName, Last Name and age \\(required\\)$")
	public void i_fill_in_FirstName_Last_Name_and_age_required() throws Throwable {

		driver.findElement(By.name("FirstName")).sendKeys("John");
		driver.findElement(By.name("LastName")).sendKeys("Smith");
		driver.findElement(By.name("Age")).sendKeys("40");
	    
	}

	@Then("^I enter Email Address, Address ,Contact Number, Occupation$")
	public void i_enter_Email_Address_Address_Contact_Number_Occupation() throws Throwable {

		driver.findElement(By.name("EmailAddress")).sendKeys("a@g.com");
		driver.findElement(By.name("Address")).sendKeys("13 st Avenue 145- piano");
		driver.findElement(By.name("ContactNumber")).sendKeys("2090897865");
		driver.findElement(By.name("Occupation")).sendKeys("Business");
		Thread.sleep(2000);
			
	}

	@Then("^I add my Credit Card Number, PIN and MemberType$")
	public void i_add_my_Credit_Card_Number_PIN_and_MemberType() throws Throwable {

		driver.findElement(By.name("cardnum")).sendKeys("4386 0000 8871 2234");
		driver.findElement(By.name("pin")).sendKeys("xxxx");
		WebElement dropDown=driver.findElement(By.name("MemberType"));
		Select s=new Select(dropDown);
		s.selectByVisibleText("Gold");
		driver.findElement(By.name("AmountDeposited")).sendKeys("55,100");
	    
	}

	@Then("^I click on Register Button$")
	public void i_click_on_Register_Button() throws Throwable {

			driver.close();	    
	}

	@Given("^I land into the sign in page$")
	public void i_land_into_the_sign_in_page() throws Throwable {

	System.setProperty("webdriver.ie.driver", "lib\\IEDriverServer32.exe");
		
		driver=new InternetExplorerDriver();
		driver.get("http://localhost:8181/ManagementOfHotels/");
		driver.manage().window().maximize();
		//Assert.assertEquals(driver.getTitle(), "Home");
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.name("BodyFrame")));
	    
	}

	@When("^I verify that login form exist$")
	public void i_verify_that_login_form_exist() throws Throwable {

	if(driver.findElements(By.name("")).size()>0){
			
			System.out.println("Login firm exist");
		}else{
			System.out.println("Am not in the login page");
		}
		
	    
	}

	@Then("^I enter my credential and choose my privilege as Guest$")
	public void i_enter_my_credential_and_choose_my_privilege_as_Guest() throws Throwable {

		driver.findElement(By.name("UserID")).sendKeys("tsupport");
		driver.findElement(By.name("Password")).sendKeys("admin");
		WebElement ele=driver.findElement(By.name("Auth"));
		Select s=new Select(ele);
		s.selectByVisibleText("Guest");
		driver.findElement(By.xpath("/html/body/form/fieldset[1]/table/tbody/tr[4]/td[3]/input")).click();
		Thread.sleep(2000);	    
	}

	@Given("^from the homePage I navigate to Hotel Reservation page$")
	public void from_the_homePage_I_navigate_to_Hotel_Reservation_page() throws Throwable {
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("BodyFrame")));
		driver.switchTo().frame(driver.findElement(By.name("MFrame")));
		driver.findElement(By.name("Home")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("BodyFrame")));
		driver.switchTo().frame(driver.findElement(By.name("RFrame")));
		driver.switchTo().frame(driver.findElement(By.name("ResFrame")));
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/a[3]/p/img")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("BodyFrame")));
		driver.switchTo().frame(driver.findElement(By.name("RFrame")));
		driver.switchTo().frame(driver.findElement(By.name("ResFrame")));
			    
	}

@Given("^I choose a location to proceed to check if the rooms are available$")
public void i_choose_a_location_to_proceed_to_check_if_the_rooms_are_available() throws Throwable {


	WebElement resort=driver.findElement(By.name("ResortID"));
	Select select=new Select(resort);
	select.selectByVisibleText("Goa");
	driver.findElement(By.xpath("//input[@value='ViewRooms']")).click();
	driver.findElement(By.xpath("//img[@alt='BookNow']")).click();
	
    
}

@Given("^I finalise the reservation$")
public void i_finalise_the_reservation() throws Throwable {
	driver.switchTo().defaultContent();
	driver.switchTo().frame(driver.findElement(By.name("BodyFrame")));
	driver.switchTo().frame(driver.findElement(By.name("RFrame")));
	driver.switchTo().frame(driver.findElement(By.name("ResFrame")));
	String parent=driver.getWindowHandle();
	driver.findElement(By.xpath("//input[@value='BookNow']")).click();
	driver.close();
}

}

