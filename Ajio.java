package week3Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		// TO MAXIMIZE THE WINDOW
		driver.manage().window().maximize();

		// IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// TO LOAD THE URL
		driver.get("http://www.ajio.com/");
		
		//To type bags in search
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		
		//to press search icon
		driver.findElement(By.className("ic-search")).click();
		
		//to select gender as men
		driver.findElement(By.xpath("//label[contains(@class,' facet-linkname-Men')]")).click();
		Thread.sleep(4000);
		
		//to select fashion bag
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		
		Thread.sleep(4000);

		
		//to print matching result
		String matches = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("No Of Matches" +matches);
		
		//to print brand
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("-------------Brands--------- ");
		System.out.println("____________________________");
		for(int i =0;i<brands.size();i++) 
		{
		 String brandname = brands.get(i).getText(); 
		 System.out.println(brandname); 
		}
		
		//to print bags
		List<WebElement> bags = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("-------------Bags--------- ");
		System.out.println("____________________________");
		for(int i =0;i<bags.size();i++) 
		{
		 String bagname = bags.get(i).getText(); 
		 System.out.println(bagname); 
		}
		
		
		
		
	}

}
