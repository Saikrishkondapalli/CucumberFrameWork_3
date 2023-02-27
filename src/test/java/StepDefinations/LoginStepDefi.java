package StepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AllPages;
import pageObjects.Loginpage;

public class LoginStepDefi extends AllPages{
	
	
	

@Given("User open the browser")
public void user_open_the_browser() {
	Loginpage l1=new Loginpage();
	l1.logo(driver);
	System.out.println("Here the logo is Original");
  
}
@Given("User should be on Indexpage")
public void user_should_be_on_indexpage() {
 
}
@When("User should click on login button")
public void user_should_click_on_login_button() {
   
}
@Then("user should be on Loginpage")
public void user_should_be_on_loginpage() {

}



}
