package StepsDefinition;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Webpages.enterData;
import io.cucumber.java.en.*;

public class EnterVehicleData {
	
	private static WebDriver driver = null;
	enterData fill_data;
	
	//Enter Vehicle Data window - Janela para inserir os dados do veiculo
	
	@Given("browser is opened")
	public void browser_is_opened() {
	    
		System.out.println("=== INSIDE EnterVehicleData_POM ===");
		System.out.println("Inside Step - browser is opened");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("The project path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@And("user is on Enter Vehicle Data page")
	public void user_is_on_enter_vehicle_data_page() {
	    
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
	}

	@When("^user enters make,model,(.*),(.*),date_manufacture,number_seats_a,right_hand,number_seats_b,fuel_type,(.*),(.*),(.*),(.*),(.*)$")
	public void user_enters_make_model_cylinder_capacity_engine_performance_date_manufacture_number_seats_a_right_hand_number_seats_b_fuel_type_payload_total_weight_list_price_license_plate_annual_mileage(String cylinder_capacity,String engine_performance, String payload, String total_weight,String list_price, String license_plate, String annual_mileage) throws InterruptedException {
	    
		fill_data = new enterData(driver);
		
		fill_data.enterMake();
		fill_data.enterModel();
		fill_data.enterCylinder(cylinder_capacity);
		fill_data.enterEngPerf(engine_performance);
		fill_data.enterDateMan();
		fill_data.enterNumSeatsA();
		fill_data.enterRightHand();
		Thread.sleep(2000);
		
		//Page Scroll Down - Fazer a pagina descer
		Actions action_down = new Actions(driver);
		action_down.keyDown(Keys.PAGE_DOWN).perform();
		
		fill_data.enterNumSeatsB();
		fill_data.enterFuel();
		fill_data.enterPayload(payload);
		fill_data.enterTotalWeight(total_weight);
		fill_data.enterListPrice(list_price); 
		fill_data.enterLicensePlate(license_plate);
		fill_data.enterAnnualMileage(annual_mileage);
		Thread.sleep(2000);
				
	}

	@And("user clicks on NEXT button to enter in the new window")
	public void user_clicks_on_next_button_to_enter_in_the_new_window() {
	    
		fill_data.clickNextButton1();
	}

	@Then("user is navigated to the Enter Insurant Data window")
	public void user_is_navigated_to_the_enter_insurant_data_window() {
	    
		//Page Scroll Up - Fazer a pagina subir
		Actions action_up = new Actions(driver);
		action_up.keyDown(Keys.PAGE_UP).perform();
		
		driver.getTitle().contains("Enter Insurant Data");
	}

	//Enter Insurant Data window - Janela para inserir os dados do segurador
	
	@Given("that all the previous data of Enter Vehicle window was filled")
	public void that_all_the_previous_data_of_enter_vehicle_window_was_filled() {
	    
		System.out.println("=== Enter vehicle data was filled correctly ===");
	}

	@And("user is on the Enter Insurant Data window")
	public void user_is_on_the_enter_insurant_data_window() {
	    
		System.out.println("=== Current window: Enter Insurant Data ===");
	}
		
	@When("^user enters (.*),(.*),(.*),gender,(.*),country,(.*),(.*),occupation,hobbies,(.*),picture$")
	public void user_enters_first_name_last_name_date_birth_gender_address_country_zip_code_city_occupation_hobbies_website_picture(String first_name, String last_name, String date_birth, String address, String zip_code, String city, String website) throws InterruptedException, AWTException {
		
		fill_data = new enterData(driver);
		
		fill_data.enterFirstName(first_name);
		fill_data.enterLastName(last_name);
		fill_data.enterDateBirth(date_birth);
		fill_data.enterGender();
		fill_data.enterAddress(address);
		fill_data.enterCountry();
		fill_data.enterZipCode(zip_code);
		Thread.sleep(2000);
		
		//Page Scroll Down - Fazer a pagina descer
		Actions action_sd = new Actions(driver);
		action_sd.keyDown(Keys.PAGE_DOWN).perform();
		
		fill_data.enterCity(city);
		fill_data.enterOccupation();
		fill_data.enterHobbies();
		fill_data.enterWebsite(website);
		fill_data.enterPicture();
		Thread.sleep(2000);
		
	}

	@And("user clicks on NEXT button to proceed to the new window")
	public void user_clicks_on_next_button_to_proceed_to_the_new_window() {
	    
		fill_data.clickNextButton2();
	}

	@Then("user is navigated to the Enter Product Data window")
	public void user_is_navigated_to_the_enter_product_data_window() {
	    
		driver.getTitle().contains("Enter Product Data");
	}
	
	//Enter Product Data window - Janela para inserir os dados do produto
	
	@Given("that all the previous data of Enter Insurant window was filled")
	public void that_all_the_previous_data_of_enter_insurant_window_was_filled() {
	    
		System.out.println("=== Enter insurant data was filled correctly ===");
	}

	@And("user is on the Enter Product Data window")
	public void user_is_on_the_enter_product_data_window() {
	    
		System.out.println("=== Current window: Enter Product Data ===");
	}

	@When("^user enters (.*),insurance_sum,merit_rating,damage_insurance,optional_products,courtesy_car$")
	public void user_enters_start_date_insurance_sum_merit_rating_damage_insurance_optional_products_courtesy_car(String start_date) throws InterruptedException {
	    
		fill_data = new enterData(driver);
		
		fill_data.enterStartDate(start_date);
		fill_data.enterInsuranceSum();
		fill_data.enterMeritRating();
		fill_data.enterDamageInsurance();
		fill_data.enterOptionalProducts();
		fill_data.enterCourtesyCar();
		Thread.sleep(2000);
		
	}

	@And("user clicks on the NEXT button to go to the new window")
	public void user_clicks_on_the_next_button_to_go_to_the_new_window() {
	    
		fill_data.clickNextButton3();
	}

	@Then("user is navigated to the Select Price Option window")
	public void user_is_navigated_to_the_select_price_option_window() {
	    
		driver.getTitle().contains("Select Price Option");
	}
	
	//Select Price Option window - Janela para selecionar o preco do seguro, de acordo com os tipos de seguro
	
	@Given("that all the previous data of Enter Vehicle window, Enter Insurant window and Enter Product window were filled")
	public void that_all_the_previous_data_of_enter_vehicle_window_enter_insurant_window_and_enter_product_window_were_filled() {
	    
		System.out.println("=== Enter vehicle data was filled correctly ===");
		System.out.println("=== Enter insurant data was filled correctly ===");
		System.out.println("=== Enter product data was filled correctly ===");
		
	}

	@And("user is on the Select Price option window")
	public void user_is_on_the_select_price_option_window() {
	    
		System.out.println("=== Current window: Select Price Option ===");
	}

	@When("^user clicks to select the insurance option$")
	public void user_clicks_to_select_the_insurance_option() throws InterruptedException {
	    
		fill_data = new enterData(driver);
		
		fill_data.selectPriceOption();
		Thread.sleep(2000);
	}
	
	@And("user clicks on the NEXT button to advance to the new window")
	public void user_clicks_on_the_next_button_to_advance_to_the_new_window() {
	    
		fill_data.clickNextButton4();
	}
	
	@Then("user is navigated to the Send Quote window")
	public void user_is_navigated_to_the_send_quote_window() {
	    
		driver.getTitle().contains("Send Quote");
	}

	//Send Quote window - Janela para realizar o registro e enviar os dados da cotacao por email
	
	@Given("that the insurance price option was selected")
	public void that_the_insurance_price_option_was_selected() {
	    
		System.out.println("=== Insurance price option was selected ===");
	}

	@And("user is on the Send Quote window")
	public void user_is_on_the_send_quote_window() {
	    
		System.out.println("=== Current window: Send Quote ===");
	}

	@When("^user provides (.*),(.*),(.*),(.*),(.*),(.*)$")
	public void user_enters_email_phone_username_password_confirm_password_comments(String email, String phone, String username, String password, String confirm_password, String comments) throws InterruptedException {
	    
		fill_data = new enterData(driver);
		
		fill_data.enterEmail(email);
		fill_data.enterPhone(phone);
		fill_data.enterUsername(username);
		fill_data.enterPassword(confirm_password);
		fill_data.confirmPassword(confirm_password);
		fill_data.enterComments(comments);
		Thread.sleep(2000);
	}

	@And("user clicks on the SEND button")
	public void user_clicks_on_the_send_button() {
	    
		fill_data.clickSendButton();
	}

	@Then("the window Sending e-mail success is displayed")
	public void the_window_sending_e_mail_success_is_displayed() {
	    
		System.out.println("=== Sending e-mail success window is displayed ===");
	}
	
	@And("user clicks on the Ok button")
	public void user_clicks_on_the_ok_button() throws InterruptedException {
	    
		Thread.sleep(3000);
		fill_data.clickConfirmButton();
		
	}

	@Then("the message is closed")
	public void the_message_is_closed() {
	    
		System.out.println("=== The message Sending e-mail success is closed ===");
	}

	@And("the navigator is closed")
	public void the_navigator_is_closed() {
	    
		driver.close();
	}

}
