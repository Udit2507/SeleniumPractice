package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportUtils {

    private ExtentSparkReporter sparkReporter;
    private ExtentReports extentReports;
    private ExtentTest extentTest;

    // Constructor
    public ReportUtils(String htmlReportFilename) {

        htmlReportFilename = htmlReportFilename.trim();

        // Initialize Spark Reporter (HTML report)
        sparkReporter = new ExtentSparkReporter(htmlReportFilename);

        // Initialize ExtentReports and attach reporter
        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
    }

    // Create a new test case
    public void createATestCase(String testCaseName) {
        extentTest = extentReports.createTest(testCaseName);
    }

    // Log a test step
    public void addTestLog(Status status, String comment) {
        extentTest.log(status, comment);
    }

    // Log a failure step
    public void testFail(String comment) {
        extentTest.log(Status.FAIL, comment);
    }

    // Log a success step
    public void testPass(String comment) {
        extentTest.log(Status.PASS, comment);
    }

    // Flush the report after execution
    public void flushReport() {
        extentReports.flush();
    }

    // Capture screenshot
    public String takeScreenshot(WebDriver driver, String screenshotName) {
        String date = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String path = System.getProperty("user.dir") + "/screenshots/" + screenshotName + "_" + date + ".png";

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(src, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }

    public void addScreenshotToReport(WebDriver driver, String screenshotName, String stepDescription) {
        String screenshotPath = takeScreenshot(driver, screenshotName);

        extentTest
                .log(Status.INFO, stepDescription)
                .addScreenCaptureFromPath(screenshotPath);
    }

}
