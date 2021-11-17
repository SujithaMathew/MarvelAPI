package POM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.BaseClass;

public class ShoppageLocators extends BaseClass {
	public ShoppageLocators() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='mvl-flyout-button-7']")
	private WebElement clk_more;
	@FindBy(xpath="(//ul[@class='mvl-flyout__secondary-links--more']//li[@class='mvl-flyout__secondary-link'])[4]")
	private WebElement clk_shop;
	@FindBy(xpath="//button[@class='close focusClass no-thanks']/span")
	private WebElement clk_popup;
	@FindBy(xpath="(//*[@class='layout--maxWidth nav-item__content']/div[1]/div/a)[1]")
	private WebElement clk_shopAll;
	@FindBy(xpath="(//a[@id='toys'])[1]")
	private WebElement clk_toys;
	@FindBy(xpath="(//div[@class='mobilecolor_fff desktopcolor_fff']/h3)[1]/p[2]/span")
	private WebElement clk_shopAllToys;
	
	@FindBy(xpath="//div[@class='refinement refinement--age']/header/button")
	private WebElement clk_age;
	@FindBy(xpath="(//div[@id='refinement--age']/ul/li)[3]/a")
	private WebElement clk_kids;
	@FindBy(xpath="(//*[local-name()='svg' and @class='icon__filter_dropdown_arrow']//*[local-name()='use'])[1]")
	private WebElement clk_sortBy;
	@FindBy(xpath="//li[@id='sortListBox-price-low-to-high']")
	private WebElement clk_priceLow;
	@FindBy(xpath="//div[@class='product__tile_body product__tile_body--quickview']/div[@class='product__tile_name']/a[@class='product__tile_link']")
	private List<WebElement> clk_item;
	@FindBy(xpath="(//*[local-name()='svg' and @class='icon-stepper']//*[local-name()='use'])[2]")
	private WebElement clk_addItem;
	@FindBy(xpath="//button[@class='add-to-cart button--primary button--small-radius']")
	private WebElement clk_addbtn;
	@FindBy(xpath="//span[@class='minibag__subtotal_value']")
	private WebElement chk_total;
	
	
	public WebElement getmore() {
		return clk_more;
	}
	public WebElement getshop() {
		return clk_shop;
	}
	public WebElement getpopup() {
		return clk_popup;
	}
	public WebElement getshopAll() {
		return clk_shopAll;
	}
	public WebElement getage() {
		return clk_age;
	}
	public WebElement getkids() {
		return clk_kids;
	}
	public WebElement getsortBy() {
		return clk_sortBy;
	}
	public WebElement getpriceLow() {
		return clk_priceLow;
	}
	public List<WebElement> getitem() {
		return clk_item;
	}
	public WebElement getAdditem() {
		return clk_addItem;
	}
	public WebElement getAddBtn() {
		return clk_addbtn;
	}
	public WebElement getitemtotal() {
		return chk_total;
	}
	public WebElement getToys() {
		return clk_toys;
	}
	public WebElement getAllToys() {
		return clk_shopAllToys;
	}
}
