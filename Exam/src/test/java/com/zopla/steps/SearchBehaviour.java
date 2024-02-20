package com.zopla.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SearchBehaviour {
    private  WebDriver driver;
    @Given("^I am on the zoopla application home page$")
    public void i_am_on_the_zoopla_application_home_page()  {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.zoopla.co.uk");
    }

    @When("^I click on for sale button$")
    public void i_click_on_for_sale_button()  {
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/nav/ol/li[2]/a")).click();
    }

    @When("^I enter \"([^\"]*)\" as a post code in search box$")
    public void i_enter_as_a_post_code_in_search_box(String arg1)  {
driver.findElement(By.xpath("//*[@id=\"downshift-95-input\"]"));
    }

    @When("^I click on search button$")
    public void i_click_on_search_button() {
driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/div/div[2]/div/form/button/div")).sendKeys("pl46as");
    }

    @Then("^I should be able to see all for sale houses in the area$")
    public void i_should_be_able_to_see_all_for_sale_houses_in_the_area() {
        String expectedValue = "\" pl46as\"";
        String actualValue =driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[4]/div[2]/section/div[1]/h1")).getText();
        Assert.assertEquals(expectedValue,actualValue);
    }
}
