package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyTripsSteps {
    WebDriver driver;
    @Given("^user in the main page to check myTrips$")
    public void user_in_the_main_page_to_check_myTrips() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\Desktop\\BDD-Cucumber1\\SpiritAirlines\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.spirit.com/");
    }
    @Then("^click on my trips$")
    public void click_on_my_trips() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"manage-travel-tab\"]/a")).click();
    }
    @Then("^input travelers last name$")
    public void input_travelers_last_name() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"changeLastName\"]")).sendKeys("Ahmed");
    }
    @Then("^input travelers confirmation code$")
    public void input_travelers_confirmation_code() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"changeConfirmationCode\"]")).sendKeys("321231321");
    }
    @Then("^click on continue button$")
    public void click_on_continue_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"change-flight-button\"]")).click();
    }
    @Then("^close the myTrips browser$")
    public void close_the_myTrips_browser() throws Throwable {
        driver.close();
    }

}
