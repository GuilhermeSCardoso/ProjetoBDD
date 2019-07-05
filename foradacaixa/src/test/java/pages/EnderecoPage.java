package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.WebDriverFactory;

public class EnderecoPage {
	
	WebDriverFactory wdf = new WebDriverFactory();
	
	public final static String XPATH_CEP_PRINCIPAL = "//input[@id='endp_cep']";
	public final static String XPATH_ENDERECO_PRINCIPAL = "//input[@id='endp_endereco']";
	public final static String XPATH_NUMERO_PRINCIPAL = "//input[@id='endp_numero']";
	public final static String XPATH_COMPLEMENTO_PRINCIPAL = "//input[@id='endp_complemento']";
	public final static String XPATH_CIDADE_PRINCIPAL = "//input[@id='endp_cidade']";
	public final static String XPATH_ESTADO_PRINCIPAL = "//select[@id='endp_estado']";
	public final static String XPATH_TELEFONE_PRINCIPAL = "//input[@id='endp_telefone']";
	public final static String XPATH_CELULAR_PRINCIPAL = "//input[@id='endp_celular']";
	public final static String XPATH_CEP_COBRANCA = "//input[@id='endc_cep']";
	public final static String XPATH_ENDERECO_COBRANCA = "//input[@id='endc_endereco']";
	public final static String XPATH_NUMERO_COBRANCA = "//input[@id='endc_numero']";
	public final static String XPATH_COMPLEMENTO_COBRANCA = "//input[@id='endc_complemento']";
	public final static String XPATH_CIDADE_COBRANCA = "//input[@id='endc_cidade']";
	public final static String XPATH_ESTADO_COBRANCA = "//select[@id='endc_estado']";
	public final static String XPATH_TELEFONE_COBRANCA = "//input[@id='endc_telefone']";
	public final static String XPATH_CELULAR_COBRANCA = "//input[@id='endc_celular']";
	public final static String XPATH_SALVAR = "//input[@id='salvar']";
	
	public WebElement getCepPrincipal() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_CEP_PRINCIPAL));
	}
	
	public void setCepPrincipal(String values) {
		
		getCepPrincipal().sendKeys(values);
	}
	
	public WebElement getEnderecoPrincipal() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_ENDERECO_PRINCIPAL));
	}
	
	public void setEnderecoPrincipal(String values) {
		
		getEnderecoPrincipal().sendKeys(values);
	}
	
	public WebElement getNumeroPrincipal() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_NUMERO_PRINCIPAL));
	}
	
	public void setNumeroPrincipal(String values) {
		
		getNumeroPrincipal().sendKeys(values);
	}
	
	public WebElement getComplementoPrincipal() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_COMPLEMENTO_PRINCIPAL));
	}
	
	public void setComplementoPrincipal(String values) {
		
		getComplementoPrincipal().sendKeys(values);
	}
	
	public WebElement getCidadePrincipal() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_CIDADE_PRINCIPAL));
	}
	
	public void setCidadePrincipal(String values) {
		
		getCidadePrincipal().sendKeys(values);
	}
	
	public WebElement getEstadoPrincipal() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_ESTADO_PRINCIPAL));
	}
	
	public void setEstadoPrincipal(String values) {
		
		new Select(getEstadoPrincipal()).selectByVisibleText(values);
	}
	
	public WebElement getTelefonePrincipal() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_TELEFONE_PRINCIPAL));
	}
	
	public void setTelefonePrincipal(String values) {
		
		getTelefonePrincipal().sendKeys(values);
	}
	
	public WebElement getCelularPrincipal() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_CELULAR_PRINCIPAL));
	}
	
	public void setCelularPrincipal(String values) {
		
		getCelularPrincipal().sendKeys(values);
	}
	
	public WebElement getCepCobranca() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_CEP_COBRANCA));
	}
	
	public void setCepCobranca(String values) {
		
		getCepCobranca().sendKeys(values);
	}
	
	public WebElement getEnderecoCobranca() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_ENDERECO_COBRANCA));
	}
	
	public void setEnderecoCobranca(String values) {
		
		getEnderecoCobranca().sendKeys(values);
	}
	
	public WebElement getNumeroCobranca() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_NUMERO_COBRANCA));
	}
	
	public void setNumeroCobranca(String values) {
		
		getNumeroCobranca().sendKeys(values);
	}
	
	public WebElement getComplementoCobranca() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_COMPLEMENTO_COBRANCA));
	}
	
	public void setComplementoCobranca(String values) {
		
		getComplementoCobranca().sendKeys(values);
	}
	
	public WebElement getCidadeCobranca() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_CIDADE_COBRANCA));
	}
	
	public void setCidadeCobranca(String values) {
		
		getCidadeCobranca().sendKeys(values);
	}
	
	public WebElement getEstadoCobranca() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_ESTADO_COBRANCA));
	}
	
	public void setEstadoCobranca(String values) {
		
		new Select(getEstadoCobranca()).selectByVisibleText(values);
	}
	
	public WebElement getTelefoneCobranca() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_TELEFONE_COBRANCA));
	}
	
	public void setTelefoneCobranca(String values) {
		
		getTelefoneCobranca().sendKeys(values);
	}
	
	public WebElement getCelularCobranca() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_CELULAR_COBRANCA));
	}
	
	public void setCelularCobranca(String values) {
		
		getCelularCobranca().sendKeys(values);
	}
	
	public WebElement getSalvar() {
		
		return wdf.getWebDriver().findElement(By.xpath(XPATH_SALVAR));
	}
	
	public void setSalvar() {
		
		getSalvar().click();
	}

}
