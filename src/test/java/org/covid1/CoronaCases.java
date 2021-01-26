package org.covid1;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoronaCases {

	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver",
	//			"C:\\Users\\marag\\eclipse-workspace\\maven\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("");
//
//		Thread.sleep(3000);
//		//WebElement table = driver.findElement(By.xpath("(//table[@id='tablepress-96'])"));
//		List<WebElement> states = driver.findElements(By.xpath("//div[@class='state-name fadeInUp']"));
//		int size = states.size();
//		System.out.println(size);
//		List<WebElement> confirmedCases = driver.findElements(By.xpath("//div[@class='cell statistic']"));
//		int size2 = confirmedCases.size(); 
//		System.out.println(size2);
//		Map<String, String> m = new LinkedHashMap<String, String>();
//		for (WebElement allStates : states) {
//			String text = allStates.getText();
//		for (WebElement allConfirm : confirmedCases) {
//			String text2 = allConfirm.getText();
//				m.put(text, text2);
//			}
//		}
//		System.out.println(m);
//		Thread.sleep(3000);
//		String string = m.get("Delhi");
//		System.out.println(string);
//
//	}
//


System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\marag\\eclipse-workspace\\maven\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.covidindia.org/");
Map<String, String> mp=new LinkedHashMap<String,String>();
Thread.sleep(3000);
WebElement table=driver.findElement(By.id("tablepress-96"));
Thread.sleep(2000);
List<WebElement> stateName=driver.findElements(By.xpath("//td[@class='column-1']"));
List<WebElement> confirmedcases=driver.findElements(By.xpath("//td[@class='column-2']"));

for (int i = 0; i < stateName.size(); i++) {
	String put = mp.put(stateName.get(i).getText(),confirmedcases.get(i).getText() );
	}
String coronaCount = mp.get("Goa");
System.out.println(coronaCount);
	}
}



























