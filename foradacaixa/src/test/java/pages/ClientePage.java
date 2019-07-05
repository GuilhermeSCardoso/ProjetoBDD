package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import readers.Config;
import utils.WebDriverFactory;

public class ClientePage {
	
	WebDriverFactory wdf = new WebDriverFactory();
	
	public final static String XPATH_MENU_CLIENTES = "//a[contains(text(), 'Clientes')]";
	public final static String XPATH_INSERIR_CLIENTES = "//*/li[1]//a[contains(text(), 'Inserir')]";
	public final static String XPATH_FISICA = "//input[@id='fisica']";
	public final static String XPATH_JURIDICA = "//input[@id='juridica']";
	public final static String XPATH_CPF_CNPJ = "//input[@id='cpf_cnpj']";
	public final static String XPATH_NOME_RAZAOSOCIAL = "//input[@id='nome_razaosocial']";
	public final static String XPATH_EMAIL = "//input[@id='email']";
	public final static String XPATH_DATA_NASC = "//input[@id='data_nascimento']";
	public final static String XPATH_SEXO = "//select[@id='sexo']";
	public final static String XPATH_ESTADO_CIVIL = "//select[@id='estado_civil']";
	public final static String XPATH_AVANCAR = "//input[@id='avancar']";
	public final static String XPATH_LOGOUT = "//a[text()='Logout']";
	
	public void acessarPagina() {
		
		String PAGE_URL = Config.getProperty("umbrela.url");
		
		wdf.getWebDriver().get(PAGE_URL);
	}
	
	public WebElement getMenuClientes() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_MENU_CLIENTES));
	}
	
	public void setMenuClientes() {
		
		getMenuClientes().click();
	}
	
	public WebElement getInserirClientes() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_INSERIR_CLIENTES));
	}
	
	public void setInserirClientes() {
		
		getInserirClientes().click();
	}
	
	public WebElement getFisica() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_FISICA));
	}
	
	public void setFisica() {
		
		getFisica().click();
	}
	
	public WebElement getJuridica() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_JURIDICA));
	}
	
	public void setJuridica() {
		
		getJuridica().click();
	}
	
	public WebElement getCpfCnpj() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_CPF_CNPJ));
	}
	
	public void setCpfCnpj(String values) {
		
		getCpfCnpj().sendKeys(values);
	}
	
	public WebElement getNomeRazaoSocial() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_NOME_RAZAOSOCIAL));
	}
	
	public void setNomeRazaoSocial(String values) {
		
		getNomeRazaoSocial().sendKeys(values);
	}
	
	public WebElement getEmail() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_EMAIL));
	}
	
	public void setEmail(String values) {
		
		getEmail().sendKeys(values);
	}
	
	public WebElement getDataNasc() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_DATA_NASC));
	}
	
	public void setDataNasc(String values) {
		
		getDataNasc().sendKeys(values);
	}
	
	public WebElement getSexo() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_SEXO));
	}
	
	public void setSexo(String values) {
		
		new Select(getSexo()).selectByVisibleText(values);
	}
	
	public WebElement getEstadoCivil() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_ESTADO_CIVIL));
	}
	
	public void setEstadoCivil(String values) {
		
		new Select(getEstadoCivil()).selectByVisibleText(values);
	}
	
	public WebElement getAvancar() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_AVANCAR));
	}
	
	public void setAvancar() {
		
		getAvancar().click();
	}
	
	public WebElement getLogout() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_LOGOUT));
	}
	
	public void setLogout() {
		
		getLogout().click();
	}

}
