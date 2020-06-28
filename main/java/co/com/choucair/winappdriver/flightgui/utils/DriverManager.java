package co.com.choucair.winappdriver.flightgui.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    private static WebDriver driver = null;
    private static DesiredCapabilities capabilities;
    private DriverManager() {throw new IllegalStateException("No se puede establecer el driver");}
    public static WebDriver abrirCalculadoraWindows() {try {capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        capabilities.setCapability("platformName", "windows");
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    } catch (Exception e) {
        e.printStackTrace();
    }
    return driver;}
}


