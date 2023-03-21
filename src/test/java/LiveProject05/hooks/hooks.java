package LiveProject05.hooks;

import DriverPackage.BasicDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
    public class Hooks {

        @Before // This method runs before every scenario
        public void beforeScenario() {
            System.out.println("Scenario has started");
        }

        @After // This method runs after every scenario
        public void afterScenario() {
            BasicDriver.quitDriver();
            System.out.println("Scenario has ended");
        }
    }}
