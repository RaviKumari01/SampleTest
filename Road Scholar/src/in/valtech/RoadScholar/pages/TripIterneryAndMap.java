package in.valtech.RoadScholar.pages;

import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import in.valtech.custom.CustomFunction;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TripIterneryAndMap {

	private final WebDriver driver;
	public Logger log = Logger.getLogger(this.getClass().getName());

	public TripIterneryAndMap(WebDriver driver)throws Exception {
		this.driver=driver;
		log.info("RS Trip IterneryAndMap Page title" + driver.getTitle());
		System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("TRP_ItineraryAndMap_XPATH"));
		if (!(CustomFunction.isElementSelected(
				By.xpath(ObjRepoProperty.getProperty("TRP_ItineraryAndMap_XPATH")),
				driver))) {
			throw new IllegalStateException("This is not the RS Trip IterneryAndMap page");
		}
	}
}
