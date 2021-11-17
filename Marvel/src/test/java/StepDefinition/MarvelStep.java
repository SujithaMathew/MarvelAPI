package StepDefinition;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import POM.SearchpageLocators;
import POM.ShoppageLocators;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MarvelStep extends BaseClass {
	Actions acc_toys=new Actions(driver);
	SearchpageLocators searchpage=new SearchpageLocators();
	ShoppageLocators shoppage=new ShoppageLocators();
	@When("Launch browser")
	public void launch_browser() {
		try {
		implicit();
		explicit(searchpage.getsearch_icon());
		System.out.println("The browser has launched successfully");
		}catch(Exception e){
			
		}
		
	}

	@When("User search for charactar{string} in comics section")
	public void user_search_for_charactar_in_comics_section(String string) throws InterruptedException {
		try {
	    click(searchpage.getsearch_icon());
	    explicit(searchpage.getcomics());
	    click(searchpage.getcomics());
	    click(searchpage.getCharactars());
	    Thread.sleep(1000);
	    type(searchpage.getCharactars(),string);
	    searchpage.getCharactars().sendKeys(Keys.ENTER);
	}catch(Exception e){
		
	}
	}

	@When("to check and verify results{string}")
	public void to_check_and_verify_results(String string) {
		try {
	    int resultCount = searchpage.getresults().size();
	    String result=String.valueOf(resultCount);
	    if(result.equals(string)) {
	    	System.out.println(result+" --is displayed");
	    }else
	    {
	    	System.out.println(result+" --is not displayed");
	    }
	}catch(Exception e){
		
	}
	}

	@When("to check and verify pages{string}")
	public void to_check_and_verify_pages(String string) {
		try {
	    String pagesCount = searchpage.getPages().getText();
	    if(pagesCount.equals(string)) {
	    	System.out.println(pagesCount+"-- is displayed");
	    }else
	    {
	    	System.out.println(pagesCount+"-- is displayed");
	    }
}catch(Exception e){
			
		}
	}
	@When("User navigate to the shop section")
	public void user_navigate_to_the_shop_section() throws InterruptedException {
		try {
		explicit(shoppage.getmore());
		Actions action=new Actions(driver);
		action.moveToElement(shoppage.getmore()).perform();
		Thread.sleep(2000);
		action.moveToElement(shoppage.getshop()).build().perform();
		click(shoppage.getshop());
		Thread.sleep(2000);
}catch(Exception e){
			
		}
		
	}

	@When("select complete your selection option")
	public void select_complete_your_selection_option() throws InterruptedException {
		try {
		explicit(shoppage.getpopup());
		click(shoppage.getpopup());			
		explicit(shoppage.getToys());
		Actions acc_toys=new Actions(driver);
		acc_toys.moveToElement(shoppage.getToys()).build().perform();
		Thread.sleep(2000);
		acc_toys.moveToElement(shoppage.getAllToys()).build().perform();
		click(shoppage.getAllToys());
		Thread.sleep(2000);
}catch(Exception e){
			
		}
		
	}

	@When("Filter by Age Kids")
	public void filter_by_Age_Kids() {
		try {
		explicit(shoppage.getage());
		acc_toys.moveToElement(shoppage.getage()).build().perform();
		click(shoppage.getage());
		explicit(shoppage.getkids());
		acc_toys.moveToElement(shoppage.getkids()).build().perform();
		click(shoppage.getkids());
}catch(Exception e){
			
		}
		
	}

	@When("sort by price")
	public void sort_by_price() throws InterruptedException {
		try {
		Thread.sleep(2000);
		explicit(shoppage.getsortBy());
		acc_toys.moveToElement(shoppage.getsortBy()).build().perform();
		click(shoppage.getsortBy());
		explicit(shoppage.getpriceLow());
		click(shoppage.getpriceLow());
		Thread.sleep(3000);
}catch(Exception e){
			
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	@When("add items {string}")
	public void add_items(String string) {
		try {
	  List<WebElement> itemName= shoppage.getitem();
	  for( WebElement productName:itemName) {
		  String product=productName.getText();
		 // System.out.println(product);
		  if(product.contains(string)) {
			  explicit(productName);
			  click(productName);
			  break;
		  }
	  }
}catch(Exception e){
			
		}
	}

	@Then("Check and verify the basket total {string}")
	public void check_and_verify_the_basket_total(String string) throws InterruptedException {
		try {
		explicit(shoppage.getAdditem());
		acc_toys.moveToElement(shoppage.getAdditem()).build().perform();
		click(shoppage.getAdditem());
		explicit(shoppage.getAddBtn());
		click(shoppage.getAddBtn());
		Thread.sleep(2000);
		explicit(shoppage.getitemtotal());
		String item_subtotal = shoppage.getitemtotal().getText();
		if(item_subtotal.equals(string)) {
			System.out.println(item_subtotal+" --is displayed");
		}
}catch(Exception e){
			
		}
		
	}



}
