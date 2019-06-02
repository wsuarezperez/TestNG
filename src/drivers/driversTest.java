package drivers;

import utils.CommonMethods;

public class driversTest extends CommonMethods{
public static void main(String[] args) {
	CommonMethods.setUpDriver("chrome", "https://google.com");
	driver.manage().window().maximize();
}
}
