package ua.com.rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by yegorm on 25.03.2017.
 */
public class MainPage {

    private WebDriver driver;

    private By categoryForSmartPhones = By.xpath("//li[@id='3361']/a");
    private By onlySmartPhones = By.xpath("//a[text()=' Смартфоны ']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectSmartPhonesPage() {
        Actions action = new Actions(driver);
        action.moveToElement(getMainCategorySmartPhones()).build().perform();
        action.moveToElement(getSmartPhones())
                .click(getSmartPhones())
                .build()
                .perform();
    }

    private WebElement getMainCategorySmartPhones() {
        driver.manage().timeouts().equals(driver.findElement(categoryForSmartPhones));
        return driver.findElement(categoryForSmartPhones);
    }

    private WebElement getSmartPhones() {
        driver.manage().timeouts().equals(driver.findElement(onlySmartPhones));
        return driver.findElement(onlySmartPhones);
    }
}
