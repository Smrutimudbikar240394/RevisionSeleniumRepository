package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser
{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com");git

        WebDriver driver1=new EdgeDriver();
        driver1.navigate().to("https://www.google.com");
    }
}
