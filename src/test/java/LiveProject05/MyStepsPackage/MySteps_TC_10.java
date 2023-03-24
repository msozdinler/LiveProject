package LiveProject05.MyStepsPackage;

import LiveProject05.pages.SamPomPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MySteps_TC_10 {


    public class Steps10 {
        SamPomPage elements=new SamPomPage();
        @And("Enter invalid {string} address")
        public void enterInvalidAddress(String email) {
            elements.sendKeysMethod(elements.getEmailInput(),email);
        }

        @Then("user should see the error message for email")
        public void userShouldSeeTheErrorMessageForEmail() {

        }

        @And("Enter all wanted places")
        public void enterAllWantedPlaces() {
            elements.sendKeysMethod(elements.getFirstNameInput(), "sami");
            elements.sendKeysMethod(elements.getLastNameInput(), "akkan");
            elements.sendKeysMethod(elements.getPhoneInput(), "2003004000");
            elements.sendKeysMethod(elements.getPasswordButton(), "Sa123");
            elements.sendKeysMethod(elements.getConfirmPasswordButton(), "Sa123");
            elements.clickMethod(elements.getCheckBox());
    }
}}
