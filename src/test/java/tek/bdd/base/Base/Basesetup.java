package tek.bdd.base.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basesetup {
        public void setupBrowser () {

        /*
        Webdriver instance
        Navigation retail
        maximize
        implicity wait

         */
            WebDriver driver = new ChromeDriver();
            driver.get("https://retail.tekschool-students.com/");
            driver.manage().window().maximize();


        }
    }
