package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import URL.LaunchUrl;
import Components.BrowserAction;
import org.apache.commons.lang3.StringUtils;

public class signInSteps {

    @Steps
    LaunchUrl user;
    BrowserAction browserPage;

    @Given("I launched the browser")
    public void iLaunchedTheBrowser() throws InterruptedException {
        user.launchBrowser();
    }

    @When("I search the {string}")
    public void iSearchThe(String keyword) throws InterruptedException {
        browserPage.searchKeyword(StringUtils.deleteWhitespace(keyword));
    }

    @Then("I get the wikipedia results for the {string}")
    public void iGetTheWikipediaResultsForThe(String keyword) throws InterruptedException {
        browserPage.clickWiki(StringUtils.deleteWhitespace(keyword));
    }
}
