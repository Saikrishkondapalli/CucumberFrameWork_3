package StepDefinations;

import io.cucumber.java.en.Given;
import pageObjects.AllPages;
import pageObjects.Indexpage;

public class IndexStepDefi extends AllPages{
	
	

@Given("User open the indexpage")
public void user_open_the_indexpage() throws Exception {
	LaunchApp() ;
	Indexpage i1=new Indexpage();
	i1.openlogin(driver);
	System.out.println("the click botton is working");
	
	
}
@Given("User should be on Login")
public void user_should_be_on_login() {
  
}


}
