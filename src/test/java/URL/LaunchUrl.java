package URL;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class LaunchUrl extends UIInteractionSteps {
    public void launchBrowser() {
        openPageNamed("google");
    }
}
