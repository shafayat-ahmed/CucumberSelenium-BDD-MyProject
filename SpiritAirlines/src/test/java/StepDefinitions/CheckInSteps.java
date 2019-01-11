package StepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
    public class CheckInSteps {
        WebDriver driver;
        @Given("^user in the main page to check logIn$")
        public void user_in_the_main_page_to_check_logIn() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\Desktop\\BDD-Cucumber1\\SpiritAirlines\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.spirit.com/");
        }
        @Then("^click on checkIn$")
        public void click_on_checkIn() throws Throwable {
            driver.findElement(By.xpath("//*[@id=\"check-in-tab\"]/a")).click();
        }
        @Then("^input travelers last name for checkIn$")
        public void input_travelers_last_name_for_checkIn() throws Throwable {
            driver.findElement(By.xpath("//*[@id=\"checkinLastName\"]")).sendKeys("Ahmed");
        }
        @Then("^input confirmation code$")
        public void input_confirmation_code() throws Throwable {
            driver.findElement(By.xpath("//*[@id=\"checkinConfirmationCode\"]")).sendKeys("13232132132");
        }
        @Then("^click on checkIn button$")
        public void click_on_checkIn_button() throws Throwable {
            driver.findElement(By.xpath("//*[@id=\"check-in-button\"]")).click();
        }
        @Then("^close the checkIn browser$")
        public void close_checkIn_browser() throws Throwable {
            driver.close();
        }
    }
