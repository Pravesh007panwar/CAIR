package Repo;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listners implements ITestListener {
	public static WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Welcome To Innsight");
		

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		
		/*
		 * File File = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); try
		 * { FileUtils.copyFile(File, new
		 * File("D:\\selenium\\ScreenShots\\ScreenShot.jpeg")); } catch (IOException e)
		 * {
		 * 
		 * e.printStackTrace(); }
		 * 
		 * 
		 */
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
		

	}

}
