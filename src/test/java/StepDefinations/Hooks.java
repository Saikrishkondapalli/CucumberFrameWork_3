package StepDefinations;
	
	

	
	import java.io.IOException;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.github.dockerjava.api.model.Driver;

import Base_2.Base_2;
import io.cucumber.java.After;
	import io.cucumber.java.Before;

	public class Hooks extends Base_2{
		@Before(order=-1)
		public void methodsamp() {
			System.out.println("Hello world");
		}
		
		@Before(order=0)
		public void launhApp() {
			launhApp();
		}
		
		@Before(order=1)
		public void method1() {
			System.out.println("Hi");
		}
		@Before(order=2)
		public void method2() {
			System.out.println("Helllo");
		}
		
		@After(order=1)
		public void tearDown() {
			driver.close();
			System.out.println("driver closed");
		}
		@After(order = 0)
		public void quitDriver() {
		
			System.out.println("driver quit");
		}
		@After(order= 2)
		public void screenshot() throws IOException {
			screenshot();
		}


	}


