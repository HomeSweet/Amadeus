package ua.com.rozetka.utils;

/**
 * Created by yegorm on 25.03.2017.
 */
public class GlobalConfig {

    public static final String MAIN_PAGE_URL = "http://rozetka.com.ua";
    public static final String ONLY_SMARTPHONES_URL = MAIN_PAGE_URL + "/mobile-phones/c80003/preset=smartfon/";

    public static void setUpBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
    }

    private GlobalConfig() {
    }
}
