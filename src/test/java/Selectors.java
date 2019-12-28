import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Selectors extends TestBase {

    @Test
    public void WikipediaElementsTest() {
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.cssSelector("#js-link-box-ru")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='js-link-box-ru']")).click();
    }

}