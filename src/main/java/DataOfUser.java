import org.openqa.selenium.WebDriver;


public class DataOfUser {

    private WebDriver driver;

    public DataOfUser(WebDriver driver) {
        this.driver = driver;
    }

    String webDriverPath = "/Users/Annette/Desktop/programs/chromedriver.exe";
    String urlRegistration = "https://test-adcc-md.sdrom.net/may2019/";

    String academy = "BJJ";
    String coach = "Jenia";
    String email = "automationdevelopertests@gmail.com";
    String phone = "123465345";
    String country = "MD";
    String name = "Auto Test";

}
