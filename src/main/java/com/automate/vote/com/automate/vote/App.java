package com.automate.vote.com.automate.vote;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws InterruptedException
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mycutebaby.in/contest/participant/631495cdd9b0c");
		WebElement voteButton = driver.findElement(By.xpath("//a[@id='vote_btn']"));
		WebElement enterName = driver.findElement(By.xpath("//input[@id='v']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//WebElement voteButton = By.xpath(xpathExpression)
		wait.until(ExpectedConditions.visibilityOf(voteButton));
		System.out.println(voteButton.isEnabled());
		Actions action = new Actions(driver);
		action.moveToElement(enterName);
		enterName.sendKeys("Mathesh");
		voteButton.click();
		System.out.println( "success");
		driver.close();
		driver.quit();


	}
}
