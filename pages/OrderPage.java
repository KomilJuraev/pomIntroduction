package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

	public OrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"ctl00_menu\"]/li[3]/a")
	public WebElement orderPageLink;

	@FindBy(xpath = "//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']/option")
	public WebElement productSelection;

	@FindBy(name = "ctl00$MainContent$fmwOrder$txtQuantity")
	public WebElement quantity;

	@FindBy(name = "ctl00$MainContent$fmwOrder$txtDiscount")
	public WebElement discount;

	@FindBy(name = "ctl00$MainContent$fmwOrder$txtName")
	public WebElement customerName;

	@FindBy(name = "ctl00$MainContent$fmwOrder$TextBox2")
	public WebElement street;

	@FindBy(name = "ctl00$MainContent$fmwOrder$TextBox3")
	public WebElement city;

	@FindBy(name = "ctl00$MainContent$fmwOrder$TextBox4")
	public WebElement state;

	@FindBy(name = "ctl00$MainContent$fmwOrder$TextBox5")
	public WebElement zip;

	@FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
	public WebElement visaCard;

	@FindBy(name = "ctl00$MainContent$fmwOrder$TextBox6")
	public WebElement cardNumber;

	@FindBy(name = "ctl00$MainContent$fmwOrder$TextBox1")
	public WebElement experitionDate;

	@FindBy(linkText = "Process")
	public WebElement processButton;

	@FindBy(linkText = "View all orders")
	public WebElement goToAllOrdersPage;

	@FindBy(xpath = "//table[@class='SampleTable']/tbody/tr[2]/td[2]")
	public WebElement verifyOnAllOrdersPage;
}
