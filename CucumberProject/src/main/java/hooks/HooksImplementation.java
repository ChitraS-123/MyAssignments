package hooks;

import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import steps.BaseClass;

public class HooksImplementation extends BaseClass {
    @Before
    public void preConditions() {
        System.setProperty("webdriver.edge.driver", "C:\\Webdriver\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
    }

    @After
    public void postConditions() {
        if (driver != null) {
            driver.quit();
        }
    }
}
