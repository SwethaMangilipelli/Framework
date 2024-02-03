package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[text()=' Home']")
	private WebElement pageHeader;
	
	@FindBy(xpath="//span[text()='Users']")
	private WebElement usersTab;
	
	@FindBy(xpath="//span[text()='Courses']")
	private WebElement courseTab;
	
	@FindBy(xpath="//a[text()='Course List']")
	private WebElement courseListLink;
	
	@FindBy(xpath="//a[text()='Category']")
	private WebElement categoryLink;


public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	
}
public String getPageHeader()
{
	return pageHeader.getText();
}
public void clickUsersTab()
{
	usersTab.click();
	
}
public void clickCoursesTab()
{
	courseTab.click();
	
}
public void clickCoursesListLink()
{
	courseListLink.click();
}
public void clickCategoryLink()
{
	categoryLink.click();
}
}
