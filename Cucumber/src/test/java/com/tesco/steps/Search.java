package com.tesco.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Search {
private WebDriver driver;

        @Given("^I am on tesco home page$")
        public void i_am_on_tesco_home_page() {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                driver.get("https://www.tesco.com/");
                driver.manage().window().maximize();
                driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div[2]/form/button/span/span")).click();
        }

        @When("^I enter \"([^\"]*)\" as a product type in serch box$")
        public void i_enter_as_a_product_type_in_serch_box(String arg1) {
                driver.findElement(By.id("beans-masthead-desktop-search-input")).sendKeys("Chocolate");
        }


        @When("^I click on search button$")
        public void i_click_on_search_button() {
                driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/button")).click();
        }

        @Then("^I should be able to see all the results for \"([^\"]*)\"$")
        public void i_should_be_able_to_see_all_the_results_for(String arg1) {
                String expectedResult = "Results for \"Chocolate\"";
                String actualResult = driver.findElement(By.xpath("//*[@id=\"results\"]/h1")).getText();
                Assert.assertEquals(expectedResult,actualResult);
        }
}