package in.valtech.RoadScholar.pages;

import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import in.valtech.custom.CustomFunction;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TripReviews {

	private final WebDriver driver;
	public Logger log = Logger.getLogger(this.getClass().getName());

	public TripReviews (WebDriver driver)throws Exception
	{
		this.driver=driver;
		
		log.info("RS Trip Reviews Page title" + driver.getTitle());
		
		System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("TRP_Reviews_XPATH"));
		
		if (!(CustomFunction.isElementSelected(
				By.xpath(ObjRepoProperty.getProperty("TRP_Reviews_XPATH")),
				driver))) {
			throw new IllegalStateException("This is not the RS Trip Reviews page");
		}
	}
}
