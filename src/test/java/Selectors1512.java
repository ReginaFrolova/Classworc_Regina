import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


    public class Selectors1512 extends TestBase{


        @Test
        public void TestSelectors() {
            driver.navigate().to("https://bigcunema.tv/");
            String elementText = driver.findElement(By.cssSelector("#nav li a")).getAttribute("href");
          //  System.out.println(elementText);


        WebElement newsMenu = driver.findElement(By.cssSelector("#nav li a"));
        System.out.println(elementText);
    }

    }





