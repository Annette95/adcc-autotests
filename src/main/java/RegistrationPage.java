import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy (id = "club")
    private WebElement clubField;
    @FindBy (id = "coach")
    private WebElement coachField;
    @FindBy (id = "email")
    private WebElement emailField;
    @FindBy (id= "phone")
    private WebElement phoneField;
    @FindBy (id= "state")
    private WebElement stateField;
    @FindBy (id= "playerName")
    private WebElement playerNameField;
    @FindBy (id= "showBrackets")
    private WebElement showBracketsButton;

    @FindBy (id= "playerBirthDate")
    private WebElement playerBirthDateField;
    @FindBy (id= "addParticipant")
    private WebElement addParticipantCheckBox;

    @FindBy (id= "acceptTerms")
    private WebElement acceptTermsCheckBox;
    @FindBy (id= "acceptRules")
    private WebElement acceptRulesCheckBox;

    @FindBy(id = "sendApplication")
    private WebElement sendApplicationButton;


    public RegistrationPage fillRegistrationFields(String academy, String coach, String email, String phone,
                                                   String country, String name, String birth, String category) {
        clubField.sendKeys(academy);
        coachField.sendKeys(coach);
        emailField.sendKeys(email);
        phoneField.sendKeys(phone);
        stateField.sendKeys(country);
        playerNameField.sendKeys(name);
        playerBirthDateField.sendKeys(birth);
        showBracketsButton.click();
        String chooseCategory = String.format("button[data-bracket='%s']", category);
        driver.findElement(By.cssSelector(chooseCategory)).click();
        return this;
    }

    public RegistrationPage checkConfirm(){
        addParticipantCheckBox.click();
        return this;
    }

    public RegistrationPage checkTerms(){
        acceptTermsCheckBox.click();
        return this;
    }
    public RegistrationPage checkRules(){
        acceptRulesCheckBox.click();
        return this;
    }

    public RegistrationPage clickRegistration(){
        sendApplicationButton.click();
        return this;
    }

}
