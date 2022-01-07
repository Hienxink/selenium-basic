import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Seleniumtest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/hienxink/Desktop/Drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tiki.vn/");
        String title = driver.getTitle();
        System.out.println(title);

        WebElement sachtuduy_kynangsong = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/header/div[1]/div/"
                +"div[1]/div[2]/div/button"));
        sachtuduy_kynangsong.click();

        WebElement imgBook = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div/div[3]/div/div[1]/div[2]"
                +"/div/a/div[1]/img"));
        imgBook.click();


        WebElement soluong = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/div[1]/div[3]/div[2]"
                +"/div[1]/div[4]/div[1]/div/div/button[2]/img"));
        soluong.click();
        soluong.click();

        WebElement xemShop = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/div[1]/div[3]/div[2]"
                +"/div[2]/div[1]/div[1]/div[3]/a/span"));
        xemShop.click();

        WebElement theoDoi = driver.findElement(By.xpath("//*[@id=\"seller-info-wrapper\"]/div[3]/button"));
        theoDoi.click();

        WebElement xinChao = driver.findElement(By.xpath("//*[@name=\"tel\"]"));
        xinChao.sendKeys("0987114577");

        WebElement dangNhap1 = driver.findElement(By.xpath("//*[@type=\"password\"]"));
        dangNhap1.sendKeys("123456");

        WebElement hien = driver.findElement(By.xpath("//*[@ class=\"show-pass\"]"));
        hien.click();

        WebElement dangNhap2 = driver.findElement(By.xpath("//button[contains(text(),'Đăng Nhập')]"));
        dangNhap2.click();

        WebElement quenMatkhau = driver.findElement(By.xpath("//p[contains(text(),'Quên mật khẩu?')]"));
        quenMatkhau.click();

        driver.quit();
    }
}