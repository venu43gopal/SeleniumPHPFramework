package SeleniumPHPFramework.SeleniumPHPFramework;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://34.68.154.135/content/about-us.php");
        if(driver.getPageSource().contains("Lorem Ipsum Dipsum"))
        {
        	System.out.println("Text Present");
        }
        else{
        System.out.println("Text not Present");
        }
		
	}
	

}
