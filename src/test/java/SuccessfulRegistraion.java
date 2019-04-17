import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class SuccessfulRegistraion {

    private WebDriver driver;
    private RegistrationPage page;
    private DataOfUser data;
    private CheckingAsserts message;


    @BeforeMethod
    public void setUp() {
        data = new DataOfUser(driver);
        System.setProperty("webdriver.chrome.driver", data.webDriverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(data.urlRegistration);
        page = PageFactory.initElements(driver, RegistrationPage.class);
        message = PageFactory.initElements(driver, CheckingAsserts.class);

    }

//    @AfterMethod
//    public void tearDown(ITestResult testResult) throws IOException{
//        if(testResult.getStatus()==ITestResult.FAILURE){
//            utilities.Screenshots.takeScreenshot(driver, testResult.getName());
//        }
//        driver.quit();
//    }

    @Test
    public void successfulRegisteredParticipant() {
        page.fillRegistrationFields(
                data.academy,
                data.coach,
                data.email,
                data.phone,
                data.country,
                data.name,
                "12/12/2000,",
                "B-65");
        page.checkConfirm();
        page.checkRules();
        page.checkTerms();
    }

}
