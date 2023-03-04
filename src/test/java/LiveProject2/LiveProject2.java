package LiveProject2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LiveProject2 {


    @Test
    void testBox(){

        /**TS-01 Validate the working of Test Box Functionality*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demoqa.com/text-box");

        WebElement fullNameElement = driver.findElement(By.id("userName"));
        fullNameElement.click();
        fullNameElement.sendKeys("Automation");

        WebElement email = driver.findElement(By.cssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("Testing@gmail.com");

        WebElement currentAddress = driver.findElement(By.cssSelector(".form-control[placeHolder='Current Address']"));
        currentAddress.click();
        currentAddress.sendKeys("Testing Current Address");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("Testing permanent Address");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        driver.quit();


    }

    @Test
    void checkBox() {

        /**TS-02 Validate the working of Check Box Functionality*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/checkbox");

        WebElement ClickPlus = driver.findElement(By.cssSelector("button.rct-option-expand-all"));
        ClickPlus.click();

        WebElement checkedPublic = driver.findElement(By.cssSelector("label[for='tree-node-public']"));
        checkedPublic.click();

        WebElement checkedPrivate = driver.findElement(By.cssSelector("label[for='tree-node-private']"));
        checkedPrivate.click();

        WebElement unCheckedPublic = driver.findElement(By.cssSelector("label[for='tree-node-public']"));
        unCheckedPublic.click();

        WebElement unCheckedPrivate = driver.findElement(By.cssSelector("label[for='tree-node-private']"));
        unCheckedPrivate.click();

    }

        @Test
        void radioButton() {

        /**TS-03 Validate the working of Radio Button Functionality*/

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://demoqa.com/radio-button");

            WebElement clickAnswerButton = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
            clickAnswerButton.click();



    }

    @Test
    void ValidateTitle(){
        /**ID-01 Validate the title of demoqa.com    */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        String title= driver.getTitle();

        System.out.println(title);
    }

    @Test
    void Resizable() throws InterruptedException {
        /** ID-09 Validate resizing the element vertically  */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/resizable/");
        Actions actions = new Actions(driver);

        WebElement dragMe = driver.findElement(By.xpath("//span[@class='react-resizable-handle react-resizable-handle-se']"));
        Thread.sleep(3000);
        actions.dragAndDropBy(dragMe, 100, 100).build().perform();

    }

    @Test
    void Droppable(){
       /**ID-11 Validate dragging the element to the target   */
         /*
        1. Go to the url: https://demoqa.com/droppable/
2. Drag the element to the target;
After dragging the element to the target, you should see the element
 is within the target square and the target square
 is colored blue with inscription „Dropped!”
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(" https://demoqa.com/droppable/");

        //<div id="draggable" class="drag-box mt-4 ui-draggable ui-draggable-handle"
        // style="position: relative;">Drag me</div>
        WebElement drag = driver.findElement(By.id("draggable"));

        //<div id="droppable" class="drop-box ui-droppable"><p>Drop here</p></div>
        WebElement drop = driver.findElement(By.id("droppable"));
        String beforeBackgroundColor = drop.getCssValue("background-color");

        Actions actions = new Actions(driver);
        Action dragAndDrop = actions.dragAndDrop(drag, drop).build();
        dragAndDrop.perform();

        String afterBackgroundColor = drop.getCssValue("background-color");

        Assert.assertNotEquals(beforeBackgroundColor, afterBackgroundColor, "Test background color is not successful");
        Assert.assertTrue(drop.getText().equals("Dropped!"), "Test is not successful");

    }

    @Test
    void DatePicker(){
            /**ID-16 Validate if the today’s date is highlighted  */
        /*
        1. Go to the url: https://demoqa.com/date-picker/ 
        2. Click on the input field;
        3. Check if the highlighted date is today’s date;
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/date-picker/");

// <input type="text" id="datePickerMonthYearInput" class="" value="03/01/2023">
        WebElement calender=driver.findElement(By.id("datePickerMonthYearInput"));
        calender.click();

        String expectedResult="https://demoqa.com/date-picker/";
        String actualResult=driver.getCurrentUrl();
        if(actualResult.equals(expectedResult)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        System.out.println(actualResult);

        // driver.quit();

    }
    @Test
    void selectMenu() throws InterruptedException {
        /**ID-12 Validate selecting drop down functionalities  */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu/");


    }
    @Test
    void SliderDemo() throws InterruptedException {
        /**ID-02 Validate the working of interaction button functionality*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/slider/");

        WebElement slider = driver.findElement(By.className("range-slider__wrap"));

        int sliderWidth = slider.getSize().getWidth();

        Actions move = new Actions(driver);
        move.moveToElement(slider)
                .clickAndHold()
                .moveByOffset((int) (sliderWidth * 0.3), 0)
                .release()
                .perform();

        Thread.sleep(3000);
    }
    @Test
    void multipleSelectable(){

        /**ID-07 Validate selecting multiple items with ctrl/cmd button and selecting the selected item*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/selectable/");

        // Find the selectable items
        WebElement item1 = driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[1]"));
        WebElement item2 = driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[2]"));
        WebElement item3 = driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[3]"));

        Actions action = new Actions(driver);

        action.keyDown(Keys.CONTROL)
                .click(item1)
                .click(item2)
                .click(item3)
                .click(item2)
                .keyUp(Keys.CONTROL)
                .perform();
    }

    @Test
    void resizableMin() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/resizable/");

        WebElement resizable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/span"));


        int initialWidth = resizable.getSize().getWidth();
        int initialHeight = resizable.getSize().getHeight();

        Actions resize = new Actions(driver);

        resize.moveToElement(resizable)
                .clickAndHold()
                .moveByOffset(-(initialWidth - 300), - (initialHeight - 300))
                .release()
                .perform();

        Thread.sleep(3000);

    }

}


