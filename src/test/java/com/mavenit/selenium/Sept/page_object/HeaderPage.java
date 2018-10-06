package com.mavenit.selenium.Sept.page_object;

import com.mavenit.selenium.Sept.driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPage extends DriverHelper {

    @FindBy(css = "#searchTerm")
    private WebElement searchTxtBox;

    @FindBy(linkText = "SIGN IN / JOIN")
    private WebElement signLink;


    public void doSearch(String searchTerm) {
        searchTxtBox.sendKeys(searchTerm);
        searchTxtBox.sendKeys(Keys.ENTER);
        sleep(3000);
//        new WebDriverWait(driver, 20)
//                .until(ExpectedConditions.
//                        textToBePresentInElementLocated(By.cssSelector(".font-condensed.search-title__term"), searchTerm));
    }


    public String getCurrentPageURL() {
        return driver.getCurrentUrl();
    }


    public void goToLoginPage() {
        signLink.click();
    }
}
