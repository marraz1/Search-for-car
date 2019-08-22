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
	
		 OpenPage();			// function open page
		
	}
	
	/*
	 * Function which open https://autogidas.lt/paieska/automobiliai/ on chrome web
	 */
	
	public static void OpenPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\MR\\1-Me_project\\Search for car\\Search-for-car\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://autogidas.lt/paieska/automobiliai/");
		//driver.findElement(By.name("f_1[]")).click();	
		driver.findElement(By.className("cookies-message")).findElement(By.id("cookies-close")).click();
		
		/*
		 * marke find and select auto marke and modeli
		 */
		WebElement marke;
		marke = driver.findElement(By.name("f_1[]"));
		marke.click();
		marke = driver.findElement(By.xpath("//div[text()='Volkswagen']"));
		marke.click();
		marke = driver.findElement(By.xpath("//div[text()='Passat']"));
		marke.click();
		
		/*
		 * find and select price and year
		 */
		Select kaina_nuo = new Select(driver.findElement(By.id("f_215")));
		kaina_nuo.selectByVisibleText("1000");
		
		Select kaina_iki = new Select(driver.findElement(By.id("f_216")));
		kaina_iki.selectByVisibleText("2000");
		
		Select metai_nuo = new Select(driver.findElement(By.id("f_41")));
		metai_nuo.selectByVisibleText("2004");
		
		Select metai_iki = new Select(driver.findElement(By.id("f_42")));
		metai_iki.selectByVisibleText("2008");
		
		/*
		 * find and select car type
		 */
		WebElement kebulas;
		kebulas = driver.findElement(By.id("f_3"));
		kebulas.click();
		kebulas = driver.findElement(By.id("f_3[3]"));
		kebulas.click();
		kebulas = driver.findElement(By.className("btn-action-close"));//driver.findElement(By.xpath("//div[@class='values-container']/div[@class='show-all toolbar-actions']/button[@class='btn-action-close']"));
		kebulas.click();
		
		WebElement body;
		body = driver.findElement(By.cssSelector("div.main-wrapper"));
		Actions builder1 = new Actions(driver); 
		
		/*
		 * find and select car fuel 
		 */
		WebElement kuras;
		kuras = driver.findElement(By.id("f_2"));
		kuras.click();
		kuras = driver.findElement(By.id("f_2[1]"));
		kuras.click();
		
		//driver.findElement(By.tagName("button")).click();//("btn-action-close")).click();//driver.findElement(By.xpath("//div[@class='values-container']/div[@class='show-all toolbar-actions']/button[@class='btn-action-close']"));
		//kuras = driver.findElement(By.xpath("//div[@class='values-container']/div[@class='show-all toolbar-actions']/button[@class='btn-action-close']"));
		//kuras.click();
		builder1.moveToElement(body, 300, 300 ).click().build().perform();
		
		/*
		 * find and select other car option
		 */
		Select P_deze = new Select(driver.findElement(By.id("f_10")));
		P_deze.selectByVisibleText("Mechaninė");
		
		Select turis_nuo = new Select(driver.findElement(By.id("f_61")));
		turis_nuo.selectByVisibleText("1.9");
		
		Select turis_iki = new Select(driver.findElement(By.id("f_62")));
		turis_iki.selectByVisibleText("2.0");
		
		Select galia_nuo = new Select(driver.findElement(By.id("f_63")));
		galia_nuo.selectByVisibleText("74 kW (100 AG)");
		
		Select galia_iki = new Select(driver.findElement(By.id("f_64")));
		galia_iki.selectByVisibleText("110 kW (150 AG)");
		
		Select dopor_number = new Select(driver.findElement(By.id("f_4")));
		dopor_number.selectByVisibleText("4/5");	
		
		driver.findElement(By.id("submit-button")).click();
		
		Thread.sleep(5000);
		driver.quit();			// close chrome 
		
	}


}
