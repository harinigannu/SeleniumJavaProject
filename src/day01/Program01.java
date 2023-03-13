package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {

	public static void main(String[] args) {
	WebDriver driver;
	
	driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Enter Fname");
	driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Enter Address");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Enter Lname");
	driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("Enter Email");
	driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("Enter PhoneNumber");
	driver.findElement(By.xpath("//input[@value='FeMale']")).click();
	driver.findElement(By.xpath("//input[@value='Cricket']")).click();
	driver.findElement(By.xpath("//div[@id='msdd']")).click();
	driver.findElement(By.xpath("//select[@id='countries']")).click();
	driver.findElement(By.xpath("//option[@value='APIs']")).click();
	driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("Enter pwd");
	driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("cnfrm pwd");
	//driver.findElements(By.id("firstpassword"));
	//driver.findElements(By.id("secondpassword"));
	
	}

}


//input[@placeholder='Last Name']
//textarea[@rows='3']
//input[@type='email']
//input[@ng-model='EmailAdress']
//input[@type='tel']
//input[@ng-model='Phone']
//input[@value='FeMale']
//input[@value='Cricket']
//div[@id='msdd']
//select[@id='Skills']
//option[@value='APIs']
//select[@id='countries']
//input[@ng-model="Password"]
//input[@ng-model='FirstName']
//input[@id="firstpassword"]
//input[@id="secondpassword"]


//driver.findElements(By.xpath("")).sendKeys("");
//driver.findElement(By.xpath("")).click();
//driver.findElement(By.xpath("")).clear();





//driver.findElement(By.className(“(//input[@class=’form-control’])[1])”);
