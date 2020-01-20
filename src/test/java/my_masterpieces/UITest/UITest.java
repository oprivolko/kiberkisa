package my_masterpieces.UITest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UITest {

    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Xiaomi\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
                .pageLoadTimeout(10, TimeUnit.SECONDS)
                .setScriptTimeout(10, TimeUnit.SECONDS);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement searchField = driver.findElement(By.cssSelector("[id*='search_query_top']"));
        searchField.sendKeys("dresses");
        WebElement searchIcon = driver.findElement(By.name("submit_search"));
        searchIcon.click();

        driver.findElement(By.className("logo img-responsive")).click();
        driver.close();
    }
}

