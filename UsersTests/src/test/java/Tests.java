import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


    public class Tests {

        @Test
        public void test1() {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("http://solar.schoolnewgen.com/websolar/login");
            driver.findElement(By.id("email")).sendKeys("super_admin@gmail.com");
            driver.findElement(By.id("password")).sendKeys("secret");
            driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[3]/div[2]/button")).click();
            driver.findElement(By.xpath("//*[@id=\"companiesModal\"]/div/div/div/form/button")).click();
            driver.findElement(By.xpath("/html/body/div[1]/aside/div/div[4]/div/div/nav/ul/li[3]/a/p")).click();
            driver.close();
        }
        @Test
        public void test2() {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("http://solar.schoolnewgen.com/websolar/login");
            driver.findElement(By.id("email")).sendKeys("super_admin@gmail.com");
            driver.findElement(By.id("password")).sendKeys("secret");
            driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[3]/div[2]/button")).click();
            driver.findElement(By.xpath("//*[@id=\"companiesModal\"]/div/div/div/form/button")).click();
            driver.findElement(By.xpath("/html/body/div[1]/aside/div/div[4]/div/div/nav/ul/li[3]/a")).click();
            driver.findElement(By.xpath("/html/body/div[1]/aside/div/div[4]/div/div/nav/ul/li[3]/ul/li[1]")).click();
        }
        @Test
        public void test3() {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("http://solar.schoolnewgen.com/websolar/login");
            driver.findElement(By.id("email")).sendKeys("super_admin@gmail.com");
            driver.findElement(By.id("password")).sendKeys("secret");
            driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[3]/div[2]/button")).click();
            driver.findElement(By.xpath("//*[@id=\"companiesModal\"]/div/div/div/form/button")).click();
            driver.findElement(By.xpath("/html/body/div[1]/aside/div/div[4]/div/div/nav/ul/li[3]/a")).click();
            driver.findElement(By.xpath("/html/body/div[1]/aside/div/div[4]/div/div/nav/ul/li[3]/ul/li[2]")).click();
        }
    }




