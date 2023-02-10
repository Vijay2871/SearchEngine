package Common;

import Components.BrowserLocator;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommonMethods extends UIInteractionSteps {

    public String scrollDown(WebElement webElement) throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor) getDriver();
        waitForCondition().until(ExpectedConditions.visibilityOf(webElement));
        js.executeScript("arguments[0].scrollIntoView",webElement);
        return webElement.getText();
    }

}
