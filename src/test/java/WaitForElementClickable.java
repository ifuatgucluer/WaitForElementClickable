import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

        import java.time.Duration;

public class WaitForElementClickable {
    public static void main(String[] args) {
        // ChromeDriver konumunu belirtiyoruz
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // ChromeDriver'ı başlatıyoruz
        WebDriver driver = new ChromeDriver();

        // Bir web sayfasını açıyoruz
        driver.get("https://www.google.com");

        // Tıklanabilir hale gelmesini bekleyeceğimiz elementin locater'ı
        By locator = By.id("clickableElementId");

        // WebDriverWait ile belirli bir süre boyunca elementin tıklanabilir olmasını bekliyoruz
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(locator));

        // Element tıklanabilir hale geldiyse tıklıyoruz
        clickableElement.click();

        // WebDriver'ı kapatıyoruz
        driver.quit();
    }
}
