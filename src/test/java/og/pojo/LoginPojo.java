package og.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Baseclass;

public class LoginPojo extends Baseclass {
	
	public LoginPojo() {
	
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="email")
	private WebElement emailbox;
	 
	
	@FindBy(id="pass")
	private WebElement passBox;
	
	@FindBy(id = "login")
	private WebElement loginBox;

	public WebElement getEmailbox() {
		return emailbox;
	}

	public WebElement getPassBox() {
		return passBox;
	}

	public WebElement getLoginBox() {
		return loginBox;
	}
	
	
	

}
