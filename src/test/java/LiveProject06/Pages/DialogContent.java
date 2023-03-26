package LiveProject06.Pages;

import DriverPackage.BasicDriver;
import DriverPackage.Methods;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Methods {

    public DialogContent() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }
}
