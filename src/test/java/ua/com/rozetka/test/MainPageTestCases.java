package ua.com.rozetka.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ua.com.rozetka.MainPage;
import ua.com.rozetka.utils.GlobalConfig;

import java.util.concurrent.TimeUnit;

/**
 * Created by yegorm on 25.03.2017.
 */
public class MainPageTestCases {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        GlobalConfig.setUpBrowser();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.navigate().to(GlobalConfig.MAIN_PAGE_URL);
    }

    @AfterMethod
    public void postcondition() {
        driver.close();
    }

    @Test
    public void verifyNavigationToSmartphonesPage() {
        MainPage page = new MainPage(driver);
        page.selectSmartPhonesPage();
        Assert.assertEquals(driver.getCurrentUrl(), GlobalConfig.ONLY_SMARTPHONES_URL, "If test was faild then navigation to smartphones page is broken!");
    }

    @Test
    public void verifyNavigationToSmarthonAndTVpage() {
        MainPage page = new MainPage(driver);
        page.goToCategoryForSmartPhones();
        Assert.assertEquals(driver.getCurrentUrl(), GlobalConfig.SMARTPHONES_AND_TV_URL, "If test was faild then navigation to smartphones page is broken!");
    }
}
