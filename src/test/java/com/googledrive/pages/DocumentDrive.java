package com.googledrive.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DocumentDrive extends PageObject{

	@FindBy(xpath="//div[contains(@class,'a-D-B-x')]//button[1]") private WebElementFacade nuevo;
	@FindBy(xpath="//div[@id=':3b']") private WebElementFacade nuevodoc;
	
	public void new_document() {
		nuevo.click();
		nuevodoc.click();
	}
	//html[1]/body[1]/div[12]/div[1]/div[6]
}
