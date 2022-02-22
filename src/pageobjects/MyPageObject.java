package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="googleConn"
     )             
public class MyPageObject {

	@ButtonType()
	@FindBy(xpath = "//form/div/div/div/center/input[@name='btnK']")
	public WebElement googleSearch;
			
}
