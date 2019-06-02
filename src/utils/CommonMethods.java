package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	public static WebDriver driver;

	public static void setUpDriver(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("browser given is wrong");
		}
		driver.get(url);
		driver.manage().window().fullscreen();
	}

	public static void selectValueFromDD(WebElement element, String text) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement option : options) {
			String optionText = option.getText();
			if (optionText.equals(text)) {
				select.selectByVisibleText(text);
				break;
			} else {
				System.out.println("Option with text " + text + " is not available");
			}
		}
	}

	public static void selectValueFromDD(WebElement element, int index) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		if (options.size() > index) {
			select.selectByIndex(index);
		} else {
			System.out.println("Invalid index has been passed");
		}
	}

	public static void sendText1(String locator, String element, String value) {
		if (locator.equalsIgnoreCase("css")) {
			driver.findElement(By.cssSelector(element)).sendKeys(value);
		} else if (locator.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(element)).sendKeys(value);
		} else {
			System.out.println("you f#$d up");
		}
	}

	public static void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public static void checkBox(WebDriver driver, WebElement webElement) {
		WebElement chckbox = webElement;
		chckbox.isDisplayed();// true
		chckbox.isEnabled();// true
		chckbox.isSelected();// false
		chckbox.click();
		chckbox.isSelected();
	}

	public static void linkClick(String cssOrXpath, String location) {
		if (cssOrXpath.equalsIgnoreCase("css")) {
			WebElement element = driver.findElement(By.cssSelector(location));
			element.click();
		} else if (cssOrXpath.equalsIgnoreCase("xpath")) {
			WebElement element = driver.findElement(By.xpath(location));
			element.click();

		}
	}
}