package LiveProject06.Hooks;

import DriverPackage.BasicDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

        @Before // This method runs before every scenario
        public void beforeScenario6() {
            System.out.println("Scenario has started");
        }

        @After // This method runs after every scenario
        public void afterScenario6() {
          //  BasicDriver.quitDriver();
            System.out.println("Scenario has ended");
        }
    }
