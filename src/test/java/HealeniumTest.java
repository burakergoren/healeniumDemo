import com.epam.healenium.SelfHealingDriver;

import jdk.jfr.Description;
import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HealeniumTest{
    private static SelfHealingDriver driver;

    @Test
    @Description("Button click with FindBy annotation")
    public void test() throws InterruptedException
    {
        WebDriver delegate = new ChromeDriver();
        driver = SelfHealingDriver.create(delegate);
        driver.manage().window().maximize();
        driver.navigate().to(getClass().getClassLoader().getResource("webpage/index.html"));

        Thread.sleep(3000);
        driver.findElement(By.id("inputText")).sendKeys("hello world");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        Thread.sleep(3000);
        Assertions.assertTrue(driver.findElement(By.id("displayArea")).isDisplayed());
    }


    @AfterAll
    public static void after() {
        if (driver != null) {
            driver.quit();
        }
    }
}
