package com.googledrive.steps;

import com.googledrive.pages.DocumentDrive;
import com.googledrive.pages.GoogleAccess;
import com.googledrive.pages.HomePageGoogle;
import net.thucydides.core.annotations.Step;

public class StepsDrive {
	HomePageGoogle homepagegoogle;
	GoogleAccess googleacess;
	DocumentDrive documentdrive;

	@Step
	public void is_the_home_page() {
		homepagegoogle.open();
	}

	@Step
	public void open_menu_google() {
		homepagegoogle.into_menu_google();
	}

	@Step
	public void open_drive() {
		homepagegoogle.into_drive();
	}

	@Step
	public void google_accessFirst(String username, String password) {
		System.out.println(username+password);
		googleacess.google_access(username, password);
	}
	
	@Step
	public void new_document() {
		documentdrive.new_document();
	}
}
