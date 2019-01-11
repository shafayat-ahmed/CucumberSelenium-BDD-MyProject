package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MainPageSteps {
    WebDriver driver;
    @Given("^user in the main page$")
    public void user_in_the_main_page(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\Desktop\\BDD-Cucumber1\\SpiritAirlines\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.spirit.com/");
    }
    @Then("^click book$")
    public void click_book() throws Throwable {
        driver.findElement(By.xpath("//a[@class='book-travel active']")).click();
    }
    @Then("^click flight$")
    public void click_flight() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"book-tab-content\"]/ul/li[1]/a/span")).click();
    }
    @Then("^click round trip$")
    public void click_round_trip() throws Throwable {
        driver.findElement(By.xpath("//label[@for='journeyRoundTrip']")).click();
    }
    @Then("^choose starting city$")
    public void choose_starting_city() throws Throwable {
        Select make = new Select(driver.findElement(By.id("departCityCodeSelect")));
        make.selectByVisibleText("Atlanta, GA (ATL)");
        Thread.sleep(2000);
    }
    @Then("^choose ending city$")
    public void choose_ending_city() throws Throwable {
        Select make1 = new Select(driver.findElement(By.id("destCityCodeSelect")));
        make1.selectByVisibleText("New York, NY - LaGuardia  (LGA)");
        Thread.sleep(2000);
    }
    @Then("^choose depart date$")
    public void choose_depart_date() throws Throwable {
        driver.findElement(By.id("departDate")).sendKeys("03/03/2019");
    }
    @Then("^choose return date$")
    public void choose_return_date() throws Throwable {
        driver.findElement(By.id("returnDate")).sendKeys("03/04/2019");
    }
    @Then("^choose how many adults$")
    public void choose_how_many_adults() throws Throwable {
        Select make2 = new Select(driver.findElement(By.id("paxAdults")));
        make2.selectByVisibleText("2 adults");
    }
    @Then("^click search flight button$")
    public void click_search_flight_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"book-travel-form\"]/div/p/button")).click();
        driver.close();
    }
}
