/*
 * @author Martynas Razbadauskis
 * Program: Automatic web page test
 */

package Autogid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autogid {
	
	private static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new HtmlUnitDriver();
		
		// And now use this to visit Google
		//driver.get( "http://www.google.com" );

		
		 OpenPage();			// function open page
		 //SubmitLink();			// function open link
		//FoundText();			// function find text, open horoskopai
		//Thread.sleep(5000);	// wait 5 second 
		 //driver.quit();			// close chrome 

	}
	
	/*
	 * Function which open https://autogidas.lt/paieska/automobiliai/ on chrome web
	 * search "Kas vyksta kaune"
	 */
	public static void OpenPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\MR\\1-Me_project\\Search for car\\Search-for-car\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://autogidas.lt/paieska/automobiliai/");
		/*WebElement searchBox;
		searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Kas vyksta kaune");
		searchBox.submit();*/
	}

}
