package magentoWomen;

import static org.testng.AssertJUnit.assertTrue;
import java.time.Duration;
import java.util.List;
import java.util.Random;
 import java.awt.geom.CubicCurve2D.Double;
 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.stream.Collectors;
import java.util.Scanner;
public class testWomen {
	WebDriver driver = new ChromeDriver();
	String websit = "https://magento.softwaretestingboard.com/";
	String logout = "https://magento.softwaretestingboard.com/customer/account/logout/\"";
	String top = "https://magento.softwaretestingboard.com/women/tops-women.html";
	String art = "https://magento.softwaretestingboard.com/checkout/cart/";
	String bag="https://magento.softwaretestingboard.com/gear/bags.html";
	Random rand = new Random();
	int ndomname = rand.nextInt(3);
String Company="atypon";
String StreetAdress="A.B.N";
String City="alfarq";
String State="alkhaldiha";
String Post="0000";
String PhoneNumber="078200226";
	@BeforeTest
	public void sutup() {
		driver.get(websit);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	

	}

	@Test(priority = 1, enabled = false)
	public void singnup() throws InterruptedException {
		WebElement reat = driver.findElement(By.partialLinkText("Create an Account"));
		reat.click();
		WebElement nae1 = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		WebElement nae2 = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		WebElement ee = driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement pass2 = driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]"));
		WebElement onfor = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span"));
		nae1.sendKeys("batool");
		nae2.sendKeys("hikat");
		ee.sendKeys("batool2@gmail.com");
		pass.sendKeys("batool@205");
		pass2.sendKeys("batool@205");
		onfor.click();
		Thread.sleep(3000);

		WebElement see = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div"));
		Assert.assertEquals(see.getText(), "Thank you for registering with Main Website Store.");
		driver.get(logout);
	}

	@Test(priority = 1)
	public void login() throws InterruptedException {
		WebElement Login = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
		Login.click();
		WebElement e = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement p = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		e.sendKeys("batool2@gmail.com");
		p.sendKeys("batool@205");
		WebElement s = driver.findElement(By.xpath("//*[@id=\"send2\"]/span"));
		s.click();

		WebElement welo = driver.findElement(By.tagName("div"));
		Thread.sleep(3000);
		// Assert.assertEquals(welo.getText().contains("Welcome,"),true);
		// Assert.assertEquals(welo.getText().contains("Welcome"), true);//,"this test
		// hek wole aseeg "
	}

	@Test(priority = 2, enabled = false)
	public void sectionofwomen() throws InterruptedException {
		// make assertion that the total items in the cart are 3 and create one assert
		// that the price is the sume of the three items.
		WebElement wone = driver.findElement(By.xpath("//a[@id='ui-id-4']"));
		wone.click();

		WebElement tops = driver.findElement(By.xpath("//*[@id=\"narrow-by-list2\"]/dd/ol/li[1]/a"));
		tops.click();
		WebElement gatoary = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]"));
		gatoary.click();
		WebElement teets = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[3]/a"));
		teets.click();
		WebElement item1 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[1]/div"));
		item1.click();
		Thread.sleep(3000);
		WebElement sai1 = driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-169\"]"));
		sai1.click();
		WebElement olor1 = driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-60\"]"));
		olor1.click();
		WebElement addto1 = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
		addto1.click();
		driver.get(top);
		WebElement item2 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[2]"));
		item2.click();
		WebElement sai2 = driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-170\"]"));
		sai2.click();
		WebElement olor2 = driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-60\"]"));
		olor2.click();
		WebElement addto2 = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
		addto2.click();
		driver.get(top);
		WebElement item3 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[3]"));
		item3.click();
		Thread.sleep(3000);
		WebElement sai3 = driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-168\"]"));
		sai3.click();
		WebElement olor3 = driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-53\"]"));
		olor3.click();
		WebElement addto3 = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
		addto3.click();

		WebElement Actualite = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a/span[2]"));
		String Expectedite = Actualite.getText();
		Assert.assertEquals(Expectedite.contains("3"), true);
	}

	@Test(priority = 2,enabled = false)
	public void sectionofman() throws InterruptedException {
		// add any random item from men section and check the price
		WebElement man = driver.findElement(By.cssSelector("#ui-id-5"));
		man.click();
		WebElement topp = driver.findElement(By.xpath("//a[contains(text(),'Tops')]"));
		topp.click();
		WebElement TheITemsContainer = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol"));
		List<WebElement> allITems = TheITemsContainer.findElements(By.tagName("li"));
		int RandomitemToSelect = rand.nextInt(allITems.size());

		allITems.get(RandomitemToSelect).click();
		Thread.sleep(2000);

		WebElement SizeContainer = driver
				.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));

		List<WebElement> AllSized = SizeContainer.findElements(By.tagName("div"));
		int RandomSizeToSelect = rand.nextInt(AllSized.size());
		AllSized.get(ndomname).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement olorContainer = driver
				.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
		List<WebElement> Allolor = olorContainer.findElements(By.tagName("div"));// 3shan edor bkl aloan oehqh b list
		int Randomolor = rand.nextInt(Allolor.size());
		Allolor.get(Randomolor).click();
		WebElement lik = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
		lik.click();

		WebElement Expectedite = driver.findElement(By.className("price-wrapper"));
		String ee = Expectedite.getText();

		driver.get(art);

		WebElement Asual = driver.findElement(By.className("price-excluding-tax"));
		String aa = Asual.getText();

		Assert.assertEquals(ee, aa);

	}
@Test(priority =2,enabled = false)
public void bagssection() throws InterruptedException {
//go to bags section add the first,third ,fifth item etc.. ( one element is added next one is skipped) 
//4- then do one assertion that the total number of bags that were added is equal to the total number of bags inside this page / 2 
//https://magento.softwaretestingboard.com/gear/bags.html 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement Grae = driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/li[4]"));
	Grae.click();
	driver.get(bag);
WebElement TheITemsContainer = driver.findElement(By.className("products-grid"));
List<WebElement> allITems = TheITemsContainer.findElements(By.className("product-item"));
	for (int i=0; i<allITems.size();i+=2) {	
	allITems.get(4).click();
	WebElement addto = driver.findElement(By.cssSelector("#product-addtocart-button"));
	Thread.sleep(2000);
	addto.click();
	Thread.sleep(5000);
	driver.get(bag);
	}
	int Expectedite=allITems.size()/2;
	 driver.get("https://magento.softwaretestingboard.com/checkout/cart/");
     List<WebElement> cartItems = driver.findElements(By.cssSelector(".cart.item"));
     int actualAddedCount = cartItems.size();
     Assert.assertEquals(Expectedite, actualAddedCount);

}
	
@Test(priority = 2,enabled = false)
public void checkoutProcess () throws InterruptedException {
	//5- complete the checkout process 
WebElement pasket=driver.findElement(By.cssSelector(".action.showcart"));	
pasket.click();
WebElement ProceedtoCheckout=driver.findElement(By.id("top-cart-btn-checkout"));	
ProceedtoCheckout.click();

Thread.sleep(9000);
////inforation
//WebElement Companytet=driver.findElement(By.name("company"));	
//Companytet.sendKeys(Company);
//WebElement adrees=driver.findElement(By.name("street[0]"));	
//adrees.sendKeys(StreetAdress);	
//WebElement ity=driver.findElement(By.name("city"));	
//ity.sendKeys(City);	
//WebElement ontr=driver.findElement(By.name("country_id"));	
//ontr.click();
//Select select = new Select(ontr);
//select.selectByVisibleText("Jordan");
//WebElement state=driver.findElement(By.name("region"));	
//state.sendKeys(State);
//WebElement post=driver.findElement(By.name("postcode"));	
//post.sendKeys(Post);
WebElement li=driver.findElement(By.xpath("//button[@class='button action continue primary']"));
li.click();
Thread.sleep(9000);
WebElement order=driver.findElement(By.xpath("//button[@title='Place Order']"));
order.click();

WebElement pageTitleWrapper = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span"));


String actualText = pageTitleWrapper.getText();

String Expectedite = "Thank you for your purchase!";
Assert.assertEquals(actualText, Expectedite, "this is for end pross");

}

@Test(priority = 2,enabled = false)
public void threerandomitems () throws InterruptedException {
	driver.get("https://magento.softwaretestingboard.com/gear/fitness-equipment.html");

	
     for (int i = 0; i < 3; i++) {
    	 List<WebElement> products = driver.findElements(By.className("products-grid"));	
	 Random random = new Random();
    	 products = driver.findElements(By.className("product-item"));
    	 int index = random.nextInt(products.size());
         WebElement product = products.get(index);
         product.click();
         WebElement lik=driver.findElement(By.id("product-addtocart-button"));
   	lik.click();
   	driver.get("https://magento.softwaretestingboard.com/gear/fitness-equipment.html");
     }
}

@Test(priority = 2)
public void itemsbyprice  () {

	driver.get("https://magento.softwaretestingboard.com/women/tops-women/tanks-women.html?product_list_order=name ");
	WebElement sort=driver.findElement(By.id("sorter"));
	sort.click();
	Select select = new Select(sort);
	select.selectByVisibleText("Price");
//	WebElement lowerprie=driver.findElement(By.xpath("//body/div[@class='page-wrapper']/main[@id='maincontent']/div[@class='columns']/div[@class='column main']/div[@class='products wrapper grid products-grid']/ol[@class='products list items product-items']/li[1]/div[1]/div[1]/div[2]"));
//	lowerprie.getText();
//	System.out.println(lowerprie);
//driver.get("https://magento.softwaretestingboard.com/women/tops-women/tanks-women.html?p=2&product_list_order=price");
//	WebElement higstprie=driver.findElement(By.xpath("//body/div[@class='page-wrapper']/main[@id='maincontent']/div[@class='columns']/div[@class='column main']/div[@class='products wrapper grid products-grid']/ol[@class='products list items product-items']/li[2]/div[1]/div[1]/div[2]"));
//	higstprie.getText();
//	System.out.println(higstprie);
  
	
	 List<WebElement> prices = driver.findElements(By.cssSelector(".price-container .price-wrapper .price"));
//	for (int i=0;i<prices.size();i++)
//	{  String prie1 = prices.get(0).getText();
//	 String prie2 = prices.get(13).getText();
//     double prieone =double.parseDouble(prie1);
//     double prietwo = Double.parseDouble(prie2);

     WebElement rightSection = driver.findElement(By.xpath("//div[@class='sc-htpNat KtFsv col-9']"));
		List<WebElement> Prices = rightSection.findElements(By.className("Price__Value"));

		int LowestPrice = 0;
		int HighestPrice = 0;

		for (int i1 = 0; i1 < Prices.size(); i1++) {

			LowestPrice = Integer.parseInt(Prices.get(0).getText());
			HighestPrice = Integer.parseInt(Prices.get(Prices.size() - 1).getText());

			Assert.assertEquals(LowestPrice < HighestPrice, true);

		}
		System.out.println(LowestPrice + " this is the lowest price ");
		System.out.println(HighestPrice + " this is the highest price ");}
     // Assert that the first price is lower than the last price
     //Assert.assertTrue(prieone<=prietwo,"The first item's price is not lower than the last item's price.");}
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		@AfterTest
	public void enftest() {
	}
}
