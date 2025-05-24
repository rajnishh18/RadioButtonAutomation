import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleRdioButton {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://echoecho.com/htmlforms10.htm");
	//WebElement table = driver.findElement(By.xpath("//input[@type='radio']"));
	List<WebElement> radiobuttonlist = driver.findElements(By.tagName("input"));
	System.out.println("Availabe website radio button:" + radiobuttonlist.size());
	//for(int i=0; i<radiobuttonlist.size(); i++) {
	for(WebElement radio : radiobuttonlist) {
		String name = radio.getAttribute("name");
		String value = radio.getAttribute("value");
		 System.out.println("Name: " + name + ", Value: " + value);
	}
	 driver.close();
	}
	}
