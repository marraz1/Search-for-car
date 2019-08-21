/*
 * @author Martynas Razbadauskis
 * Program: Automatic web page test
 */

package Autogid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;

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
		driver.manage().window().maximize();
		driver.get("https://autogidas.lt/paieska/automobiliai/");
		//driver.findElement(By.name("f_1[]")).click();		
	
		WebElement marke;
		marke = driver.findElement(By.name("f_1[]"));
		marke.click();
		marke = driver.findElement(By.xpath("//div[text()='Volkswagen']"));
		marke.click();
		marke = driver.findElement(By.xpath("//div[text()='Passat']"));
		marke.click();
		
		Select kaina_nuo = new Select(driver.findElement(By.id("f_215")));
		kaina_nuo.selectByVisibleText("1000");
		
		Select kaina_iki = new Select(driver.findElement(By.id("f_216")));
		kaina_iki.selectByVisibleText("2000");
		
		Select metai_nuo = new Select(driver.findElement(By.id("f_41")));
		metai_nuo.selectByVisibleText("2004");
		
		Select metai_iki = new Select(driver.findElement(By.id("f_42")));
		metai_iki.selectByVisibleText("2008");
	
		WebElement kebulas;
		kebulas = driver.findElement(By.id("f_3"));
		kebulas.click();
		kebulas = driver.findElement(By.id("f_3[3]"));
		kebulas.click();
		kebulas = driver.findElement(By.xpath("//div[@class='values-container']/div[@class='show-all toolbar-actions']/button[@class='btn-action-close']"));
		
		System.out.print(kebulas.getLocation());
		//driver.switchTo().frame(0);
		WebElement body;
		body = driver.findElement(By.cssSelector("div.main-wrapper"));
		Actions builder1 = new Actions(driver); 
		builder1.moveToElement(body, 300, 300 ).click().build().perform();
		
		//driver.findElement(By.cssSelector("div.values-container")).findElement(By.cssSelector("div.show-all.toolbar-actionsr")).findElement(By.("button")).click();
		//kebulas = driver.findElement(By.tagName("button"));
		//driver.execute_script("arguments[0].click();", kebulas);
	
		//driver.findElement(By.xpath("//button[text()='Pasirinkti']")).click();
		//kebulas.click();
		
		WebElement kuras;
		kuras = driver.findElement(By.id("f_2"));
		kuras.click();
		kuras = driver.findElement(By.id("f_2[1]"));
		kuras.click();
		builder1.moveToElement(body, 300, 300 ).click().build().perform();
		
		Select P_deze = new Select(driver.findElement(By.id("f_10")));
		P_deze.selectByVisibleText("Mechaninė");
		
		Select turis_nuo = new Select(driver.findElement(By.id("f_61")));
		turis_nuo.selectByVisibleText("1.9");
		
		Select turis_iki = new Select(driver.findElement(By.id("f_62")));
		turis_iki.selectByVisibleText("2.0");
		
		
		WebElement searchBox;
		searchBox = driver.findElement(By.id("submit-button"));
		searchBox.click();
	}


}
