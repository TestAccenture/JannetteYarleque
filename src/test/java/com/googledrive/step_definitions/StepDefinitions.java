package com.googledrive.step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import com.googledrive.steps.*;
import net.thucydides.core.annotations.Steps;


public class StepDefinitions {
@Steps
StepsDrive steps;
	
    @Given("^que Accenture Test Automation abre su cuenta en Google Chrome$")
    public void que_accenture_test_automation_abre_google_chrome() throws Throwable {
        steps.is_the_home_page();
        steps.open_menu_google();
		steps.open_drive();
    }
    
    @And("^se ingresa con usuario (.*) y contrasena (.*)$")
    public void se_ingresa_con_usuario_testaccenturedrive_y_contrasena_testaccenturedrive2019(String username, String password) throws Throwable {
    	System.out.println(username + password);
    	steps.google_accessFirst(username, password);
    }

    @When("^Se crea un archivo tipo Documento en Google Drive$")
    public void se_crea_un_archivo_tipo_documento_en_google_drive_con() throws Throwable {
		steps.new_document();
	}

	@Then("^El nombre del archivo debe contener$")
	public void el_nombre_del_archivo_debe_contener_something(String strArg1) throws Throwable {
		throw new PendingException();
	}

}