package Components;

import Common.CommonMethods;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ScreenOrientation;

import java.util.List;
import java.util.Locale;


public class BrowserAction extends UIInteractionSteps {
    CommonMethods common = new CommonMethods();

    public void searchKeyword(String keyword) throws InterruptedException {
        $(BrowserLocator.SEARCH).sendKeys(keyword, Keys.ENTER);
    }

    public void clickWiki(String keyword) throws InterruptedException {

        switch (keyword) {
            case "SoftwareTesting":
                common.scrollDown($(BrowserLocator.WIKIPEDIA));
                $(BrowserLocator.WIKIPEDIA).waitUntilPresent().click();
                break;
            case "NZFLAG":
                common.scrollDown($(BrowserLocator.NZFLAG));
                $(BrowserLocator.NZFLAG).waitUntilPresent().click();
                break;
            default:
                System.out.println("SCsCsCXSACSA");
        }
    }

}
