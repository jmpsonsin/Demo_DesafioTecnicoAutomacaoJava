package Webpages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
	
public class enterData {
	
	//Enter Vehicle Data - WebElements utilizados para inserir os dados do veiculo
	//Legenda: ddb - drop down button, txt - text, btn - button, cb - check box
	
	By ddb_make_enterVehicleData = By.id("make");
	
	By ddb_model_enterVehicleData = By.id("model");
	
	By txt_cylindercapacity_enterVehicleData = By.id("cylindercapacity");
	
	By txt_engineperformance_enterVehicleData = By.xpath("//input[@id='engineperformance']");
	
	By btn_datemanufacture_enterVehicleData = By.xpath("//button[@id='opendateofmanufacturecalender']");
	
	By ddb_numberseatsa_enterVehicleData = By.id("numberofseats");
	
	By cb_righthand_enterVehicleData = By.xpath("//label[normalize-space()='No']");
	
	By ddb_numberseatsb_enterVehicleData = By.id("numberofseatsmotorcycle");
	
	By ddb_fueltype_enterVehicleData = By.id("fuel");
	
	By txt_payload_enterVehicleData = By.id("payload");
	
	By txt_totalweight_enterVehicleData = By.id("totalweight");
	
	By txt_listprice_enterVehicleData = By.id("listprice");
	
	By txt_licenseplate_enterVehicleData = By.id("licenseplatenumber");
	
	By txt_annualmileage_enterVehicleData = By.id("annualmileage");
	
	By btn_next_enterVehicleData = By.xpath("//button[@id='nextenterinsurantdata']");
	
	//Enter Insurant Data - WebElements utilizados para inserir os dados do segurado
	
	By txt_firstname_enterInsurantData = By.xpath("//input[@id='firstname']");
	
	By txt_lastname_enterInsurantData = By.xpath("//input[@id='lastname']");
	
	By btn_datebirth_enterInsurantData = By.xpath("//input[@id='birthdate']");
	
	By cb_gender_enterInsurantData = By.xpath("//label[normalize-space()='Male']//span[@class='ideal-radio']");//relative xpath
	
	By txt_address_enterInsurantData = By.xpath("//div[@class='field idealforms-field idealforms-field-text']//input[@id='streetaddress']");
	
	By ddb_country_enterInsurantData = By.xpath("//div[@class='field idealforms-field idealforms-field-select-one']//select[@id='country']");
	
	By txt_zipcode_enterInsurantData = By.xpath("//input[@id='zipcode']");
	
	By txt_city_enterInsurantData = By.xpath("//input[@id='city']");
	
	By ddb_occupation_enterInsurantData = By.xpath("//div[@class='field idealforms-field idealforms-field-select-one']//select[@id='occupation']");
	
	By cb_hobbies_enterInsurantData = By.xpath("(//span[@class='ideal-check'])[5]");//index path
	
	By txt_website_enterInsurantData = By.xpath("//input[@id='website']");
	
	By btn_next_enterInsurantData = By.xpath("//button[@id='nextenterproductdata']");
	
	//Enter Product Data - todos os webelements presentes na janela para inserir os dados do produto
	
	By txt_startdate_enterProductData = By.xpath("//input[@id='startdate']");
	
	By ddb_insurancesum_enterProductData = By.xpath("//select[@id='insurancesum']");
	
	By ddb_meritrating_enterProductData = By.xpath("//select[@id='meritrating']");
	
	By ddb_damageinsurance_enterProductData = By.xpath("//select[@id='damageinsurance']");
	
	By cb_optionalproducts_enterProductData = By.xpath("(//span[@class='ideal-check'])[6]");//index path
	
	By ddb_courtesycar_enterProductData = By.xpath("//select[@id='courtesycar']");
	
	By btn_next_enterProductData = By.xpath("//button[@id='nextselectpriceoption']");
	
	// Select Price Option - WebElements utilizados para selecionar o preco do seguro
	
	By cb_selectprice_selectPriceOption = By.xpath("(//span[@class='ideal-radio'])[6]");//index path
	
	By btn_next_selectPriceOption = By.xpath("//button[@id='nextsendquote']");
	
	// Send Quote - WebElements utilizados para registrar os dados e enviar a cotacao
	
	By txt_email_sendQuote = By.xpath("//input[@id='email']");
	
	By txt_phone_sendQuote = By.xpath("//input[@id='phone']");
	
	By txt_username_sendQuote = By.xpath("//input[@id='username']");
	
	By txt_password_sendQuote = By.xpath("//input[@id='password']");
	
	By txt_confirmpassword_sendQuote = By.xpath("//input[@id='confirmpassword']");
	
	By txt_comments_sendQuote = By.xpath("//textarea[@id='Comments']");
	
	By btn_send_sendQuote = By.xpath("//button[@id='sendemail']");
	
	By btn_confirm_sendQuote = By.xpath("//button[@class='confirm']");
	
	protected WebDriver driver;
	
	public enterData(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//Criar uma funcao separada para cada acao
	
	//Enter vehicle data functions
	
	public void enterMake() {
		
		WebElement make = driver.findElement(ddb_make_enterVehicleData);
		Select select_make = new Select(make);
		select_make.selectByValue("BMW");
	}
	
	public void enterModel() {
		
		WebElement model = driver.findElement(ddb_model_enterVehicleData);
		Select select_model = new Select(model);
		select_model.selectByValue("Motorcycle");
	}
	
	public void enterCylinder(String cylinder_capacity) {
		
		driver.findElement(txt_cylindercapacity_enterVehicleData).sendKeys(cylinder_capacity);
	}
	
	public void enterEngPerf(String engine_performance) {
		
		driver.findElement(txt_engineperformance_enterVehicleData).sendKeys(engine_performance);
	}
	
	public void enterDateMan() {
		
		WebElement date_man = driver.findElement(btn_datemanufacture_enterVehicleData);
		date_man.click();
		WebElement back_button = driver.findElement(By.xpath("//a[@title='Prev']"));
		back_button.click();
		WebElement back_button_1 = driver.findElement(By.xpath("//a[@title='Prev']"));
		back_button_1.click();
		WebElement select_date = driver.findElement(By.xpath("//a[normalize-space()='7']"));
		select_date.click();
	}
	
	public void enterNumSeatsA() {
		
		WebElement num_seat_a = driver.findElement(ddb_numberseatsa_enterVehicleData);
		Select select_seat_a = new Select(num_seat_a);
		select_seat_a.selectByIndex(2);
	}
	
	public void enterRightHand() {
		
		WebElement right_hand = driver.findElement(cb_righthand_enterVehicleData);
		right_hand.click();
	}
	
	public void enterNumSeatsB() {
		
		WebElement num_seat_b = driver.findElement(ddb_numberseatsb_enterVehicleData);
		Select select_seat_b = new Select(num_seat_b);
		select_seat_b.selectByIndex(1);
	}
	
	public void enterFuel() {
		
		WebElement fuel_type = driver.findElement(ddb_fueltype_enterVehicleData);
		Select select_fuel = new Select(fuel_type);
		select_fuel.selectByValue("Petrol");
	}
	
	public void enterPayload(String payload) {
		
		driver.findElement(txt_payload_enterVehicleData).sendKeys(payload);
	}
	
	public void enterTotalWeight(String total_weight) {
		
		driver.findElement(txt_totalweight_enterVehicleData).sendKeys(total_weight);
	}
	
	public void enterListPrice(String list_price) {
		
		driver.findElement(txt_listprice_enterVehicleData).sendKeys(list_price);
	}
	
	public void enterLicensePlate(String license_plate) {
		
		driver.findElement(txt_licenseplate_enterVehicleData).sendKeys(license_plate);
	}
	
	public void enterAnnualMileage(String annual_mileage) {
		
		driver.findElement(txt_annualmileage_enterVehicleData).sendKeys(annual_mileage);
	}
	
	public void clickNextButton1() {
		
		WebElement next_id = driver.findElement(btn_next_enterVehicleData);
		next_id.click();
	}
	
	//Enter Insurant Data functions
	
	public void enterFirstName(String first_name) {
		
		driver.findElement(txt_firstname_enterInsurantData).sendKeys(first_name);
	}
	
	public void enterLastName(String last_name) {
		
		driver.findElement(txt_lastname_enterInsurantData).sendKeys(last_name);
	}
	
	public void enterDateBirth(String date_birth ) {
		
		driver.findElement(btn_datebirth_enterInsurantData).sendKeys(date_birth);
	}
	
	public void enterGender() {
		
		WebElement gender_button = driver.findElement(cb_gender_enterInsurantData);
		gender_button.click();
	}
	
	public void enterAddress(String address) {
		
		driver.findElement(txt_address_enterInsurantData).sendKeys(address);
	}
	
	public void enterCountry() {
		
		WebElement country = driver.findElement(ddb_country_enterInsurantData);
		Select select_country = new Select(country);
		select_country.selectByValue("Brazil");
	}
	
	public void enterZipCode(String zip_code) {
		
		driver.findElement(txt_zipcode_enterInsurantData).sendKeys(zip_code);
	}
	
	public void enterCity(String city) {
		
		driver.findElement(txt_city_enterInsurantData).sendKeys(city);
	}
	
	public void enterOccupation() {
		
		WebElement occupation = driver.findElement(ddb_occupation_enterInsurantData);
		Select select_occupation = new Select(occupation);
		select_occupation.selectByValue("Employee");
	}
	
	public void enterHobbies() {
		
		WebElement hobbies = driver.findElement(cb_hobbies_enterInsurantData);
		hobbies.click();
	}
	
	public void enterWebsite(String website) {
		
		driver.findElement(txt_website_enterInsurantData).sendKeys(website);
	}
	
	public void enterPicture() throws AWTException {
		
		//Passo a passo para inserir a foto via Robot class
		WebElement button = driver.findElement(By.name("Open"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);//clicar no botao
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		//Copiar o arquivo
		String picturePath = System.getProperty("user.dir");
		System.out.println("The picture path is:"+picturePath);
		StringSelection ss = new StringSelection(picturePath+"\\src\\test\\resources\\Picture\\Test.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);//O arquivo do caminho que foi especificado acima sera copiado para o clipboard
		
		//Colar o arquivo - CTRL + V
		rb.keyPress(KeyEvent.VK_CONTROL); //Apertou a tecla CTRL
		rb.keyPress(KeyEvent.VK_V); //Apertou a tecla V
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL); //Soltar a tecla CTRL
		rb.keyRelease(KeyEvent.VK_V); //Soltar a tecla V
		rb.delay(2000);
		
		//Apertar a tecla Enter para fechar a janela
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	public void clickNextButton2() {
		
		WebElement next_pd = driver.findElement(btn_next_enterInsurantData);
		next_pd.click();
	}
	
	// Enter Product Data functions
	
	public void enterStartDate(String start_date) {
		
		driver.findElement(txt_startdate_enterProductData).sendKeys(start_date);
	}
	
	public void enterInsuranceSum() {
		
		WebElement insurance_sum = driver.findElement(ddb_insurancesum_enterProductData);
		Select select_insum = new Select(insurance_sum);
		select_insum.selectByIndex(3);
	}
	
	public void enterMeritRating() {
		
		WebElement merit_rating = driver.findElement(ddb_meritrating_enterProductData);
		Select select_merit = new Select(merit_rating);
		select_merit.selectByValue("Bonus 6");
	}
	
	public void enterDamageInsurance() {
		
		WebElement damage_insurance = driver.findElement(ddb_damageinsurance_enterProductData);
		Select select_damage = new Select(damage_insurance);
		select_damage.selectByValue("Full Coverage");
	}
	
	public void enterOptionalProducts() {
		
		WebElement optional_products = driver.findElement(cb_optionalproducts_enterProductData);
		optional_products.click();
	}
	
	public void enterCourtesyCar() {
		
		WebElement courtesy_car = driver.findElement(ddb_courtesycar_enterProductData);
		Select select_courtesy = new Select(courtesy_car);
		select_courtesy.selectByValue("Yes");
	}
	
	public void clickNextButton3() {
		
		WebElement next_po = driver.findElement(btn_next_enterProductData);
		next_po.click();
	}
	
	// Select Price functions
	
	public void selectPriceOption() {
		
		WebElement select_price = driver.findElement(cb_selectprice_selectPriceOption);
		select_price.click();
	
	}
	
	public void clickNextButton4() {
		
		WebElement next_sq = driver.findElement(btn_next_selectPriceOption);
		next_sq.click();
	}
	
	// Send Quote functions
	
	public void enterEmail(String email) {
		
		driver.findElement(txt_email_sendQuote).sendKeys(email);
	}
	
	public void enterPhone(String phone) {
		
		driver.findElement(txt_phone_sendQuote).sendKeys(phone);
	}
	
	public void enterUsername(String username) {
		
		driver.findElement(txt_username_sendQuote).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(txt_password_sendQuote).sendKeys(password);
	}
	
	public void confirmPassword(String confirm_password) {
		
		driver.findElement(txt_confirmpassword_sendQuote).sendKeys(confirm_password);
	}
	
	public void enterComments(String comments) {
		
		driver.findElement(txt_comments_sendQuote).sendKeys(comments);
	}
	
	public void clickSendButton() {
		
		WebElement send_b= driver.findElement(btn_send_sendQuote);
		send_b.click();
	}
	
	public void clickConfirmButton() {
		
		WebElement button_confirm = driver.findElement(btn_confirm_sendQuote);
		button_confirm.click();
	}
	
}
