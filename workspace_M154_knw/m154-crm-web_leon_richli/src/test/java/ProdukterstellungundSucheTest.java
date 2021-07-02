
import org.junit.Test;

import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ProdukterstellungundSucheTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void produkterstellungundSuche() {
    driver.get("http://localhost:7070/");
    driver.findElement(By.linkText("Manage Products")).click();
    driver.findElement(By.name("description")).click();
    driver.findElement(By.name("description")).sendKeys("LeoVince Evo  7 130mm");
    driver.findElement(By.cssSelector("form:nth-child(3) > p > input")).click();
    driver.findElement(By.name("id")).click();
    driver.findElement(By.name("id")).sendKeys("0");
    driver.findElement(By.cssSelector("form:nth-child(9) > p > input")).click();
  }
}
