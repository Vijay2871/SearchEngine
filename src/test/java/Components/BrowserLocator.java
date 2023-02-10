package Components;

import org.openqa.selenium.By;

public class BrowserLocator {

    public static By SEARCH=By.xpath("//input[@title='Search']");
    public static By WIKIPEDIA=By.xpath("//h3[normalize-space()='Software testing - Wikipedia']");
    public static By NZFLAG=By.xpath("//a[@href='https://en.wikipedia.org/wiki/Flag_of_New_Zealand']//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Flag of New Zealand - Wikipedia']");
}
