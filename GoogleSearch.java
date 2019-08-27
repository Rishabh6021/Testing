package com.training;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Rishabh\\Testing\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		int ch=4;
		switch(ch){
		case 1:
			
		String [] mobiles = {"Apple XS" , "Samsung Note 10", "One Plus 7 Pro", "Redmi K20", "Pixel 3"}; 
		String [] res = new String[mobiles.length];
		int j=0;
		
		for(int i=0; i<mobiles.length; i++) {
			myD.get("http://www.google.co.in");
			myD.findElement(By.name("q")).sendKeys(mobiles[i]);
			myD.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			myD.findElement(By.cssSelector(".gLFyf.gsfi")).click();
			res[j++] = myD.findElement(By.xpath("//*[@id='resultStats']")).getText();
		}
		
		for (String re : res)
			System.out.println(re);

		myD.close();
		break;
		
		case 2:
			myD.get("http://echoecho.com/htmlforms10.htm");
			myD.findElement(By.xpath("//input[@value='Water']")).click();
			//Boolean VRadio = myD.findElement(By.xpath("//input[@value='Water']")).isSelected();
			//System.out.println(myD.findElement(By.xpath("//input[@type='radio']")).getSize());
			List<WebElement> VRadio = myD.findElements(By.xpath("//input[@type='radio']"));
			
			
			for(int i=0;i<VRadio.size();i++)
			{
				System.out.println(VRadio.get(i).getAttribute("value"));
				if(VRadio.get(i).getAttribute("value").equals("Water"))
				{
					VRadio.get(i).click();
				}
			}
			break;
			case 3:myD.get("http://google.co.in");
			
			List<WebElement> VRadio2 = myD.findElements(By.tagName("a"));
			
			
			for(int i=0;i<VRadio2.size();i++)
			{
				
				if(VRadio2.get(i).getText().matches("[A-Za-z0-9]+"))
				{
				System.out.println(VRadio2.get(i).getText());
				
//				if(VRadio2.get(i).getAttribute("value").equals("Water"))
//				{
//					VRadio2.get(i).click();
//				}
			}
			}
			break;
			
			case 4:
				myD.get("http://register.rediff.com/register/register.php?FormName=user_details");
				Select s = new Select(myD.findElement(By.id("country")));
				s.selectByIndex(3);
				Thread.sleep(4000);
				s.selectByValue("99");
				Thread.sleep(4000);
				s.selectByVisibleText("United States");
				System.out.println(s.isMultiple());

				myD.findElement(By.xpath("//input[@type='checkbox']")).click();
				Thread.sleep(4000);
				Select s1 = new Select(myD.findElement(By.xpath("//select[@name='hintq023f4383']")));
//				Select s1 = new Select(myD.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select")));
				s1.selectByValue("What is your favourite food?");
				
		}
		
		}
	
	
		}

	