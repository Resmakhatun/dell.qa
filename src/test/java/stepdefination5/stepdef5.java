package stepdefination5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdef5 {
	WebDriver driver;
	@Given("^Users able to Launch Chrome Drive$")
	public void users_able_to_Launch_Chrome_Drive() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		  driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
	}

	@Then("^:  Users able to Nevigate www\\.dell\\.com$")
	public void users_able_to_Nevigate_www_dell_com() throws Throwable {
	   driver.get("https://www.dell.com/");
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
	   Actions support=new Actions(driver);
	   support.moveToElement(driver.findElement(By.id("l4")));
	}

	@Then("^:  Users able to Mouse over on Support link$")
	public void users_able_to_Mouse_over_on_Support_link() throws Throwable {
	  driver.findElement(By.xpath("/html/body/main/header/div[3]/nav/ul/li[4]/ul/li[1]/a"));
	}

	@Then("^:  Users able to see dropdown list$")
	public void users_able_to_see_dropdown_list() throws Throwable {
	   
	}

	@Then("^:  Users able to Click on view all Support link from DropDown$")
	public void users_able_to_Click_on_view_all_Support_link_from_DropDown() throws Throwable {
	  
	}

	@Then("^:  Users able to verify All Support home page$")
	public void users_able_to_verify_All_Support_home_page() throws Throwable {
	    
	}

	@Then("^:  Users able to Click on product support button$")
	public void users_able_to_Click_on_product_support_button() throws Throwable {
	   
	}

	@Then("^:  Users are able to verify product support home page$")
	public void users_are_able_to_verify_product_support_home_page() throws Throwable {
	   
	}

	@Then("^:  User are able to click on knowledge base link$")
	public void user_are_able_to_click_on_knowledge_base_link() throws Throwable {
	    
	}

	@Then("^:  Users are able to verify knowledge base home page$")
	public void users_are_able_to_verify_knowledge_base_home_page() throws Throwable {
	   
	}

	@Then("^:  User are able to click on warranty & Contractes link$")
	public void user_are_able_to_click_on_warranty_Contractes_link() throws Throwable {
	   
	}

	@Then("^:  Users are able to verify warranty & Contractes home page$")
	public void users_are_able_to_verify_warranty_Contractes_home_page() throws Throwable {
	    
	}

	@Then("^:  User are able to click on Service Request link$")
	public void user_are_able_to_click_on_Service_Request_link() throws Throwable {
	  
	}

	@Then("^:  Users are able to verify Service Request home page$")
	public void users_are_able_to_verify_Service_Request_home_page() throws Throwable {
	   
	}

	@Then("^:  User are able to click on Order Support link$")
	public void user_are_able_to_click_on_Order_Support_link() throws Throwable {
	   
	}

	@Then("^:  Users are able to verify Order Support home page$")
	public void users_are_able_to_verify_Order_Support_home_page() throws Throwable {
	   
	}

	@Then("^:  User are able to click on Contact Us link$")
	public void user_are_able_to_click_on_Contact_Us_link() throws Throwable {
	  
	}

	@Then("^:  Users are able to verify Contact Us home page$")
	public void users_are_able_to_verify_Contact_Us_home_page() throws Throwable {
	 
	}

}
