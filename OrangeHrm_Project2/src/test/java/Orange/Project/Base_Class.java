package Orange.Project;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {


	public static WebDriver driver;
	public static Properties prop;
	
	public void initialize()
	{
		readPropertyFile();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 

	}
	
	public void tearDown()
	{
		try {
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void readPropertyFile()
	{
		String PropFilePath="C:\\Users\\utsav\\eclipse-workspace\\Project\\keysValue\\Values.properties";
		prop=new Properties();
		
		try
		{
			FileInputStream fis=new FileInputStream(PropFilePath);
			prop.load(fis);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	}
