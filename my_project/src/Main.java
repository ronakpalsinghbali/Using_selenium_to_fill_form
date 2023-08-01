import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","C:\\Users\\ronaq\\Downloads\\Training\\Sellinium\\projects\\my_project\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseurl = "https://demo.guru99.com/test/newtours/register.php";
        driver.get(baseurl);

        Thread.sleep(500);

        WebElement first_Name = driver.findElement(By.name("firstName"));
        first_Name.sendKeys("Ronak Pal Singh");

        Thread.sleep(500);

        WebElement last_Name = driver.findElement(By.name("lastName"));
        last_Name.sendKeys("Bali");

        Thread.sleep(500);

        WebElement phone_number = driver.findElement(By.name("phone"));
        phone_number.sendKeys("9906354658");

        Thread.sleep(500);

        WebElement user_name = driver.findElement(By.name("userName"));
        user_name.sendKeys("ronaqpalsinghbali@gmail.com");

        Thread.sleep(500);

        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("jammu");

        Thread.sleep(500);

        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("jammu");

        Thread.sleep(500);

        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("Jammu and Kashmir");

        Thread.sleep(500);

        WebElement pinCode = driver.findElement(By.name("postalCode"));
        pinCode.sendKeys("180010");

        Thread.sleep(500);

        Select country_List = new Select(driver.findElement(By.name("country")));
        country_List.selectByValue("INDIA");

        Thread.sleep(500);

        WebElement login_UserName = driver.findElement(By.id("email"));
        login_UserName.sendKeys("ronaqpalsinghbali@gmail.com");

        Thread.sleep(500);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Ronak@1221");

        Thread.sleep(500);

        WebElement confirm_Password = driver.findElement(By.name("confirmPassword"));
        confirm_Password.sendKeys("Ronak@1221");

        Thread.sleep(500);

        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();

        Thread.sleep(3000);
        driver.close();
    }
}