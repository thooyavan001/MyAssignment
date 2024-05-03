package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinition {
    private EdgeDriver driver;

    @Given("Open the browser")
    public void openTheBrowser() {
        driver = new EdgeDriver();
    }

    @And("Load the url")
    public void loadTheUrl() {
        driver.get("http://leaftaps.com/opentaps/control/main");
    }

    @And("Enter the username as {string}")
    public void enterUserName(String uName) {
        driver.findElement(By.id("username")).sendKeys(uName);
    }

    @And("Enter the password as {string}")
    public void enterPassword(String pword) {
        driver.findElement(By.id("password")).sendKeys(pword);
    }

    @When("Click login button")
    public void clickLoginButton() {
        driver.findElement(By.className("decorativeSubmit")).click();
    }

   
    @Then("Homepage sould be displayed")
    public void homepage_sould_be_displayed() {
    String titile = driver.getTitle();
    System.out.println(titile);
    }
    
    @When("Click on crmsfa link")
    public void click_on_crmsfa_link() {
        driver.findElement(By.xpath("//a[normalize-space()='CRM/SFA']")).click();
    }

    @And("Click Leads link")
    public void click_leads_link() {
       driver.findElement(By.xpath("//*[text()='Leads']")).click();
    }

    @And("Click createLeads Link")
    public void click_create_leads_link() {
       driver.findElement(By.xpath("(//*[text()='Create Lead'])[1]")).click();
    }

    @Given("Enter company Name as {string}")
    public void enter_company_name(String cName) {
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(cName);
    }

    @And("Enter firstName as {string}")
    public void enter_first_name(String fName) {
       driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(fName);
    }

    @And("Enter LastName as {string}")
    public void enter_last_name(String lName) {
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(lName);
    }

    @When("Click CreatLread Button")
    public void click_creat_lread_button() {
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
    }

    @Then("ViewPage Should Be Displayed")
    public void view_page_should_be_displayed() {
        String title1= driver.getTitle();
        System.out.println(title1);
        if(title1.contains("View Lead | opentaps CRM")) {
        	System.out.println("Lead is created Successfully");
        }
        
    }




    // Ensure to close the WebDriver after the test execution
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}