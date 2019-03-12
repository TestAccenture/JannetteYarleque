package com.googledrive.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GoogleAccess extends PageObject{

	@FindBy(xpath="//input[@id='identifierId']") private WebElementFacade ur;
	@FindBy(id = "identifierNext']") private WebElementFacade next;
	@FindBy(xpath = "//input[@name='password']") private WebElementFacade passwo;
	@FindBy(id = "passwordNext']") private WebElementFacade secondnext;
	

	public void google_access(String username, String password) {
		System.out.println(username+password);
		ur.typeAndEnter(username);
		this.passwo.typeAndEnter(password);
	}
}