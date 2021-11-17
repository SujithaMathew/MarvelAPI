package POM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.BaseClass;

public class SearchpageLocators extends BaseClass {
	public SearchpageLocators() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//*[local-name()='svg' and @fill-rule='evenodd'])[2]")
	private WebElement search_icon;
	@FindBy(xpath="(//li[@class='tabs__btns '])[3]/a")
	private WebElement clk_comics;
	@FindBy(xpath="//input[@class='typeahead__input']")
	private WebElement txt_charactars;
	@FindBy(xpath="//div[@class='mvl-card mvl-card--search']")
	private List<WebElement> results;
	
	@FindBy(xpath="(//li[@class='pagination__item '])[5]/span")
	private WebElement pages;
	
	public WebElement getsearch_icon() {
		return search_icon;
	}
		public WebElement getcomics() {
			return clk_comics;
		}
		public WebElement getCharactars() {
			return txt_charactars;
		}
		public List<WebElement> getresults() {
			return  results;
		}
		public WebElement getPages() {
			return pages;
		}
	}

