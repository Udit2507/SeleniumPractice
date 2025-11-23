package base;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utilities.ReportManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    protected WebDriver driver;
    protected Properties config;

    @BeforeSuite
    public void setUpSuite() {

        // -------------------------
        // 1. Initialize Reporting
        // -------------------------
        String reportPath = System.getProperty("user.dir") + "/reports/AutomationReport.html";
        ReportManager.init(reportPath);
        System.out.println("📄 Extent Report Initialized at: " + reportPath);

        // -------------------------
        // 2. Load Config File
        // -------------------------
        config = new Properties();
        try {
            FileInputStream fis = new FileInputStream(
                    "D:\\AutomationProject\\src\\main\\resources\\config\\config.properties"
            );
            config.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("❌ Unable to load config.properties", e);
        }

        // -------------------------
        // 3. Start WebDriver Once
        // -------------------------
        driver = DriverFactory.initDriver(config.getProperty("browser"));
        driver.manage().window().maximize();
        driver.get(config.getProperty("appUrl"));

        System.out.println("🔥 Browser launched and URL opened.");
    }

    @AfterSuite
    public void tearDownSuite() {

        // Flush report once
        ReportManager.getReport().flushReport();
        System.out.println("📄 Extent Report Generated.");

        // Quit browser once
        DriverFactory.quitDriver();
        System.out.println("🛑 Browser closed.");
    }
}
