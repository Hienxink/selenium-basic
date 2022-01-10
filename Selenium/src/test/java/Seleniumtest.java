import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;

public class Seleniumtest {
    public static void main(String[] args) throws InterruptedException {
       ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get("https://www.browserstack.com/");
//        driver.get("https://www.tiki.vn");
        String title = driver.getTitle();
        System.out.println(title);

//        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
//        Thread.sleep(3000);
//        WebElement Sach = driver.findElement(By.xpath("//div[text()='Sách tư duy - Kỹ năng sống']"));
//        Thread.sleep(3000);
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Sach);
//        Sach.click();
//        Thread.sleep(3000);
//        WebElement Developers = driver.findElement(By.xpath("//span[text()='Developers']"));
//        Developers.click();
//        Thread.sleep(3000);
//
//        WebElement link_Docs = driver.findElement(By.linkText("Documentation"));
//        link_Docs.click();
//        Thread.sleep(3000);

          WebElement developers = driver.findElement(By.id("developers-menu-toggle"));
          developers.click();
          Thread.sleep(500);

          WebElement docs = driver.findElement(By.xpath("//*[@id=\"developers-menu-dropdown\"]/li[1]/a"));
          docs.click();
          Thread.sleep(500);

          WebElement abc = driver.findElement(By.id("developers-menu-toggle"));
          abc.click();
          Thread.sleep(500);

          WebElement products = driver.findElement(By.id("product-menu-toggle"));
          products.click();
          Thread.sleep(500);

          WebElement live = driver.findElement(By.xpath("//div[@class=\"dropdown-link-heading\"]"));
          live.click();
          Thread.sleep(500);

        driver.quit();
    }
}