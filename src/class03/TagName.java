package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
    public static void main(String[] args) {

        /*
        Task: Print all the links in the amazon.com
         */
        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();

        //Print all the links in the amazon.com
        driver.findElements(By.tagName("a"));

        // To be continued in the next class

    }
}
