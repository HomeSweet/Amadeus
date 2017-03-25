package ua.com.rozetka.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.com.rozetka.MainPage;
import ua.com.rozetka.utils.GlobalConfig;

import java.util.concurrent.TimeUnit;

/**
 * Created by yegorm on 25.03.2017.
 */
public class MainPageTestCases {

    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        GlobalConfig.setUpBrowser();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.navigate().to(GlobalConfig.MAIN_PAGE_URL);
    }

    @Test
    public void verifyNovigationToSmartphonesPage() {
        MainPage page = new MainPage(driver);
        page.selectSmartPhonesPage();
        Assert.assertEquals(driver.getCurrentUrl(), GlobalConfig.ONLY_SMARTPHONES_URL, "If test was faild then novigation to smartphones page is broken!");
    }
}
