package COM.KOTAKPFMS.QA.UTIL;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import COM.KOTAKPFMS.QA.FACTORY.DriverFactory;

/**
 * @Author -- Suvarna Prabhumatkari
 **/
public class ElementUtil {
	private DriverFactory driverFactory;
	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = DriverFactory.getDriver();
	}

	// Click to an Element
	public void clickElement(WebElement element) {
		element.click();
	}

	// Enter into TextField
	public void enterText(WebElement element, String Text) {
		//		System.out.println("Text Entered");
		element.sendKeys(Text);
	}

	// Switching the Frame
	public void GoToFrame(String FrameIDName) {
		driver.switchTo().frame(FrameIDName);
	}

	// Clear TextField
	public void clearText(WebElement element) {

		element.clear();
	}

	// Checking element is present
	public void isElementPresent(WebElement element) {

		element.isDisplayed();
	}

	// Checking element is enabled
	public void isElementEnabled(WebElement element) {

		element.isEnabled();
	}

	// MouseHover
	public void moveToElement(WebElement element) {

		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();

	}

	// Context Click or Right Click on element
	public void rightClickOnElement(WebElement element) {

		Actions action = new Actions(driver);
		action.contextClick().build().perform();
	}

	// Selecting dropdown values by visible Text
	public void selectDropDownByVisibleText(WebElement element, String visibleText) {

		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}

	// Selecting dropdown values by value
	public void selectDropDownByValue(WebElement element, String dropDownValue) {

		Select sel = new Select(element);
		sel.selectByValue(dropDownValue);
	}

	// Selecting dropDown values by Index
	public void selectDropDownByIndex(WebElement element, int index) {

		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	// Handling the Windows
	public void handlewin(WebDriver driver) throws InterruptedException {
		System.out.println(driver);

		Set<String> s1 = driver.getWindowHandles();
		String menuWindow = driver.getWindowHandle();
		s1.remove(menuWindow);

		Iterator<String> i1 = s1.iterator();
		String child = null;

		while (i1.hasNext()) {
			child = (String) i1.next();
			driver.switchTo().window(child);
		}
		//		 driver.switchTo().window(menuWindow); // switch back to parent window

	}

	public WebDriver handlewin1(WebDriver driver) {
		String childWindow = driver.getWindowHandle();
		Set<String> pops=driver.getWindowHandles();
		pops.remove(childWindow);
		{
			Iterator<String> it =pops.iterator();
			while (it.hasNext()) {
				String menuWindow=it.next().toString();
				if(!menuWindow.contains(childWindow))
				{
					WebDriver driver1 = driver;
					driver1.close();
					driver.switchTo().window(menuWindow);
					System.out.println("Pop Up Title: "+ driver.switchTo().window(menuWindow).getTitle());

				}
			}
		}
		//    driver.switchTo().window(parent);
		return driver;
	}


	// Accepting the Alert Window
	public void acceptAlert() {

		driver.switchTo().alert().accept();
	}

	// Dismissing the Alert Window
	public void dismissAlert() {

		driver.switchTo().alert().dismiss();
	}

	// Entering Text into Alert WindowBox
	public void enterTextInAlertBox(String alertText) throws InterruptedException {

		driver.switchTo().alert().sendKeys(alertText);
		Thread.sleep(4000);

	}

	/**
	 * @Author -- Suvarna Prabhumatkari
	 **/
	// Closing browser
	public void quitBrowser() {
		System.out.println(driver);
		driver.quit();
	}

	// Short Timeout
	public void SHORT_TIMEOUT() throws InterruptedException {
		Thread.sleep(1000);
	}

	// Timeout
	public void TIMEOUT() throws InterruptedException {
		Thread.sleep(3000);
	}

	// Long Timeout
	public void LONG_TIMEOUT() throws InterruptedException {
		Thread.sleep(10000);
	}

	// Getting text from field
	public String getText(WebElement element) {
		return element.getText();
	}

	// Getting value from field
	public String getAttribute(WebElement element) {
		return element.getAttribute("value");
	}//end

	//checking CheckBox Selection And Performing Action 
	public void CheckBoxSelectAndDeslection(WebElement element, String checkbox) {
		if(element.isSelected()==true && checkbox.equals("DeSelect"))
		{
			//System.out.println("in select");
			clickElement(element);
		}//end 
		else if(element.isSelected()==false && checkbox.equals("Select"))
		{
			//System.out.println("in deslect");
			clickElement(element);
		}//end
		else
		{
			//System.out.println("No Operation Performed");
		}//end
	}//end of CheckBoxSelectAndDeslection function

	// To Select checkbox
	public void isElementSelected(WebElement element, String checkbox) {
		if (checkbox.equals("Select")) {
			element.click();
		} else {
			if (element.isSelected() == true) {
				element.click();
				System.out.println("Checkbox is deselected");
			}
		}
	}

	//Method to select element by visible text
	public void SelectElementByVisibleText(WebElement Element,String VisibleText)
	{
		Element.click();
		Select s=new Select(Element);
		s.selectByVisibleText(VisibleText);
	}//end of SelectElementByVisibleText function

	//Method Specific to Customer->Menu(Selecting checkboxes)
	public boolean selectCheckBoxes(String[] checkBoxNo) throws InterruptedException
	{
		boolean flag=false;
		List <WebElement> AllSchemeFormatMapping_Checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']")) ;

		for (String string : checkBoxNo) {
			int recordNo=Integer.parseInt(string);
			for(int i=0;i<AllSchemeFormatMapping_Checkboxes.size();i++)
			{

				if(i==recordNo)
				{
					SHORT_TIMEOUT();
					AllSchemeFormatMapping_Checkboxes.get(recordNo).click();
					flag=true;
				}
				else
				{
					//System.out.println("in else");
				}
			}//end of for
		}
		return flag;
	}//end of selectCheckBoxes function

	//Method To check String is per proper expected format
	public boolean checkStringFormat(String field) throws InterruptedException
	{
		boolean stringIsProperFlag=false;
		if(field.matches("[a-zA-Z0-9]*"))
		{
			stringIsProperFlag=true;
		}//end of if

		return stringIsProperFlag;
	}//end of checkStringFormat function

	//Method To check if value if IFSCCode is in proper expected format
	public boolean checkIFSCFormat(String ifscCode) throws InterruptedException
	{
		boolean ifscCodeProperFlag=false;
		if(ifscCode.matches("^[A-Z]{4}0[A-Z0-9]{6}$"))
		{
			ifscCodeProperFlag=true;
		}//end of if

		return ifscCodeProperFlag;
	}//end of checkIFSCFormat function

	public boolean checkElementVisibility() throws InterruptedException
	{
		boolean elementPresentFlag=false;
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//*[@id=\"pageBody\"]/div/div/div/form[3]/button"));
		if(dynamicElement.size() != 0){
			//If list size is non-zero, element is present
			System.out.println("Element present");
			elementPresentFlag=true;

		}
		else{
			//Else if size is 0, then element is not present
			System.out.println("Element not present");
			elementPresentFlag=false;
		}
		return elementPresentFlag;

	}


	// To Select checkbox
	public void isElementCheckBoxSelected(WebElement element, String Checkbox) {
		if (Checkbox.equals("Select")) {
			if(element.isSelected() == true) {
				//					System.out.println("Checkbox is alreday selected");
			}else {
				element.click();
				//					System.out.println("Checkbox is selected");
			}
		} else if (Checkbox.equals("DeSelect")){
			if (element.isSelected() == true) {
				element.click();
				//					System.out.println("Checkbox is deselected");
			}else {
				//					System.out.println("Checkbox is already deselected");
			}
		}else {
			//				log.info("For "+Checkbox+" Checkbox - No operation is specified in Excel sheet");
		}
	}




}
