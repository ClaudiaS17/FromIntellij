package com.fatface.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AddProduct {
private WebDriver driver;

    @Given("^I am on fatface home page$")
    public void i_am_on_fatface_home_page() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.fatface.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("wps-overlay-close-button")).click();
    }
    @When("^I click on women menu$")
    public void i_click_on_women_menu() {
        driver.findElement(By.xpath("//*[@id=\"megamenu-1691611881726-6\"]/div/div[1]/div[2]/div[1]/div[2]/a")).click();
    }

    @When("^I click on dresses$")
    public void i_click_on_dresses() {

    }

    @When("^I click on short dresses$")
    public void i_click_on_short_dresses() {

    }

    @When("^I add Danica Jersey Wrap Dress in the shopping bag$")
    public void i_add_Danica_Jersey_Wrap_Dress_in_the_shopping_bag() {

    }

    @When("^I click on shopping bag$")
    public void i_click_on_shopping_bag() {

    }

    @Then("^I should be able to see the product in the shopping basket$")
    public void i_should_be_able_to_see_the_product_in_the_shopping_basket() {

    }

}


