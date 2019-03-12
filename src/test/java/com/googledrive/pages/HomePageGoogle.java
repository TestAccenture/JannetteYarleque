package com.googledrive.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/")
public class HomePageGoogle extends PageObject {
	@FindBy(xpath = "//*[@id=\"gbwa\"]") private WebElementFacade GoogleApps;
	//html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]
	@FindBy(id = "gb49") private WebElementFacade DriveIcon;
	//a[@id='gb49']//span[@class='gb_k']
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/a[1]") private WebElementFacade goGoogleDrive;
	public void into_menu_google() {
		getDriver().manage().window().maximize();
		GoogleApps.waitUntilClickable().click();
	}
	public void into_drive() {
		DriveIcon.waitUntilClickable().click();
		goGoogleDrive.waitUntilClickable().click();
	}
}