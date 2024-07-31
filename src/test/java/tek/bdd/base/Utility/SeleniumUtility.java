package tek.bdd.base.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import tek.bdd.base.Base.Basesetup;

public class SeleniumUtility extends Basesetup {
@Given("Open browser and navigate to retail app")
    public void openBrowserAndNavigate(){
    setupBrowser();
}
@Then("Validate top left corner is TEKSCHOOL"){
    public void validateTopLeftCorner() {
        String text = getElementText(By.className("top-nav__logo"));
        System.out.println(text);

}
@Then("Close the browswer")
        public void closeBrowser() {
        quitBroswer();
    }
}
}


