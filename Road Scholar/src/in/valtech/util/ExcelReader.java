package in.valtech.util;



import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelReader {
	static List<TCExecutor> tcExecutorDetailsList;

	// For logging
	public static Logger log = Logger.getLogger(ExcelReader.class);

	

	/**
	 * Method:getTCExecutorDetails Description:This method fetches the
	 * test case details from Excel whose Execute Status is "YES"
	 * 
	 * @param fileName
	 *            :Excel File name from where data to be fetched
	 * @return :tcExecutorDetailsList
	 */
	public static List<TCExecutor> getTCExecutorDetails(String fileName,String sheetame) 
	{
		tcExecutorDetailsList = new ArrayList<TCExecutor>();
		

		/**
		 * Create a new instance for cellDataList
		 */
		List<List<HSSFCell>> cellDataList = new ArrayList<List<HSSFCell>>();
		try {
			/**
			 * Create a new instance for FileInputStream
			 */
			FileInputStream fileInputStream = new FileInputStream(fileName);

			/**
			 * Create a new instance for POIFSFileSystem class
			 */
			POIFSFileSystem fsFileSystem = new POIFSFileSystem(fileInputStream);

			/*
			 * Create a new instance for HSSFWorkBook
			 */
			HSSFWorkbook workBook = new HSSFWorkbook(fsFileSystem);
			HSSFSheet hssfSheet = workBook.getSheet(sheetame);
			/**
			 * Iterate the rows and cells of the spreadsheet * to get all the
			 * data
			 */
			Iterator<Row> rowIterator = hssfSheet.rowIterator();

			while (rowIterator.hasNext()) 
			{
				HSSFRow hssfRow = (HSSFRow) rowIterator.next();

				Iterator<Cell> iterator = hssfRow.cellIterator();

				List<HSSFCell> cellTempList = new ArrayList<HSSFCell>();
				while (iterator.hasNext()) 
				{

					HSSFCell hssfCell = (HSSFCell) iterator.next();

					cellTempList.add(hssfCell);
					//cellTempList is a list obj that contains all columns value for perticular row
				}
				cellDataList.add(cellTempList);
				//cellDataList is a list obj that contains column values for all available rows in excel 
			}



			for (int i = 0; i < cellDataList.size(); i++) 
			{

				List cellTempList = (List) cellDataList.get(i);
				
				if (cellTempList.get(0).toString().equalsIgnoreCase("YES"))
				{

					TCExecutor tcExecutorDetailsObj = new TCExecutor();

				tcExecutorDetailsObj.setExecute(cellTempList.get(
						getColumnIndex(fileName,sheetame,"EXECUTE"))
						.toString());


				//Set test case module
				tcExecutorDetailsObj.setModule(cellTempList.get(
						getColumnIndex(fileName, sheetame, "MODULE"))
						.toString());


				// Set test case description value
				tcExecutorDetailsObj.setTc_Description(cellTempList.get(
						getColumnIndex(fileName, sheetame, "TC_DESCRIPTIONS"))
						.toString());


				// Set test case priority value
				tcExecutorDetailsObj.setPriority(cellTempList.get(
						getColumnIndex(fileName, sheetame, "PRIORITY"))
						.toString());

				//Set test case name
				tcExecutorDetailsObj.setTc_Name(cellTempList.get(
						getColumnIndex(fileName, sheetame, "TC_NAME"))
						.toString());

				//Set reusable test case ID
				tcExecutorDetailsObj.setReusable_TCID(cellTempList.get(
						getColumnIndex(fileName, sheetame, "REUSABLE_TC ID"))
						.toString());


				// Set test case DS_CONFIG value					
				tcExecutorDetailsObj.setDs_Config(cellTempList.get(
						getColumnIndex(fileName, sheetame, "DS_CONFIG"))
						.toString());

				// Set test case DRIVER value
				tcExecutorDetailsObj.setDriver(cellTempList.get(
						getColumnIndex(fileName, sheetame, "DRIVER"))
						.toString());


				// Set testcase URL value
				tcExecutorDetailsObj.setHomepage_url(cellTempList.get(
						getColumnIndex(fileName, sheetame, "HOMEPAGE_URL"))
						.toString());



				// Set test case HMC_USERNAME value
				tcExecutorDetailsObj.setUserName(cellTempList.get(
						getColumnIndex(fileName, sheetame, "USERNAME"))
						.toString());

				// Set test case HMC_PASSWORD value
				tcExecutorDetailsObj.setPassword(cellTempList.get(
						getColumnIndex(fileName, sheetame, "PASSWORD"))
						.toString());


				// Add GlobalExecutorDetails object to
				// globalExecutorDetailsList
				tcExecutorDetailsList.add(tcExecutorDetailsObj);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}
	return tcExecutorDetailsList;
}






	/**
	 * Method:getTCExecuter sheet details
	 * Description:This method fetches the TC Executer Sheets
	 * 
	 * @param fileName
	 *            :Excel File name from where data to be fetched
	 * @return :
	 */
	public static List<String> getGlobalFeatureSheets(String fileName)
	{
		//System.out.println("fileName=========="+fileName);

		List<String> sheetList = new ArrayList<String>();

		try {
			/**
			 * Create a new instance for FileInputStream
			 */
			FileInputStream fileInputStream = new FileInputStream(fileName);

			/**
			 * Create a new instance for POIFSFileSystem class
			 */
			POIFSFileSystem fsFileSystem = new POIFSFileSystem(fileInputStream);

			/*
			 * Create a new instance for HSSFWorkBook
			 */
			HSSFWorkbook workBook = new HSSFWorkbook(fsFileSystem);

			//Get Sheet Count
			int sheetCount = workBook.getNumberOfSheets();

			//Add Feature GLOBALEXECUTER sheets to list
			for (int i = 0; i < sheetCount; i++) 
			{

				if (workBook.getSheetName(i).contains("TCEXECUTER"))
				{
					//	  sheetList.add(workBook.getSheetName(i).replace("GLOBALEXECUTER_",""));
					sheetList.add(workBook.getSheetName(i));


				}
			}


			for (int i = 0; i < sheetList.size(); i++) 
			{
				//System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
				//System.out.println("Sheet name :" + sheetList.get(i));

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return sheetList;
	}
















	/**
	 * Method:getColumnValue Description:This method fetches the column value
	 * for the specified version from the excel sheet.
	 * 
	 * @param fileName
	 *            :Excel File name from where data to be fetched
	 * @param sheet
	 *            : Sheet name of the excel
	 * @param dataVersion
	 *            : DataVesion for which column value to be retrieved
	 * @param colName
	 *            : Name of the column for which column value to be retrieved
	 * 
	 * @return :colValue
	 */
	public static String getColumnValue(String fileName, String sheet,String dataVersion, String colName) 
	{

		int columnIndex = 0;
		String expString = null;
		/**
		 * Create a new instance for cellDataList
		 */
		List<List<HSSFCell>> cellDataList = new ArrayList<List<HSSFCell>>();
		try {
			/**
			 * Create a new instance for FileInputStream
			 */
			FileInputStream fileInputStream = new FileInputStream(fileName);

			/**
			 * Create a new instance for POIFSFileSystem class
			 */
			POIFSFileSystem fsFileSystem = new POIFSFileSystem(fileInputStream);

			/*
			 * Create a new instance for HSSFWorkBook
			 */
			HSSFWorkbook workBook = new HSSFWorkbook(fsFileSystem);
			HSSFSheet hssfSheet = workBook.getSheet(sheet);
			/**
			 * Iterate the rows and cells of the spreadsheet * to get all the
			 * datas
			 */
			Iterator<Row> rowIterator = hssfSheet.rowIterator();

			while (rowIterator.hasNext()) 
			{
				HSSFRow hssfRow = (HSSFRow) rowIterator.next();

				Iterator<Cell> iterator = hssfRow.cellIterator();

				List<HSSFCell> cellTempList = new ArrayList<HSSFCell>();
				while (iterator.hasNext()) 
				{

					HSSFCell hssfCell = (HSSFCell) iterator.next();

					if (hssfRow.getRowNum() == 0) 
					{

						if (hssfCell.getStringCellValue().equalsIgnoreCase(colName)) 
						{
							columnIndex = hssfCell.getColumnIndex();
						}
					}

					cellTempList.add(hssfCell);
				}
				cellDataList.add(cellTempList);
			}
			for (int i = 0; i < cellDataList.size(); i++)
			{

				List cellTempList = (List) cellDataList.get(i);


				for (int j = 0; j < cellTempList.size(); j++) 
				{

					if (cellTempList.get(j).toString().equalsIgnoreCase(dataVersion)) 
					{
						expString = cellTempList.get(columnIndex).toString();

					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return expString;
	}






	/**
	 * Method:getPAYMENT_CREDIT Description:This method fetches user
	 * test data PAYMENT_CREDIT details for specified version from the excel sheet.
	 * 
	 * @param fileName
	 *            :Excel File name from where data to be fetched
	 * @param sheet
	 *            : Sheet name of the excel
	 * @param dataVersion
	 *            : DataVesion for which column value to be retrieved
	 * 
	 * @return :ShippingDetails object
	 * 
	 */
	public static Payment_Credit getPaymentCreditDetails(
			String fileName, String sheet, String dataVersion) 
	{

		Payment_Credit PaymentcreditDetails = null;

		/**
		 * Create a new instance for cellDataList
		 */
		List<List<HSSFCell>> cellDataList = new ArrayList<List<HSSFCell>>();
		try {
			/**
			 * Create a new instance for FileInputStream
			 */
			FileInputStream fileInputStream = new FileInputStream(fileName);

			/**
			 * Create a new instance for POIFSFileSystem class
			 */
			POIFSFileSystem fsFileSystem = new POIFSFileSystem(fileInputStream);

			/*
			 * Create a new instance for HSSFWorkBook
			 */
			HSSFWorkbook workBook = new HSSFWorkbook(fsFileSystem);
			HSSFSheet hssfSheet = workBook.getSheet(sheet);
			/**
			 * Iterate the rows and cells of the spreadsheet * to get all the
			 * data
			 */
			Iterator<Row> rowIterator = hssfSheet.rowIterator();

			while (rowIterator.hasNext())
			{
				HSSFRow hssfRow = (HSSFRow) rowIterator.next();

				Iterator<Cell> iterator = hssfRow.cellIterator();

				List<HSSFCell> cellTempList = new ArrayList<HSSFCell>();
				while (iterator.hasNext()) 
				{

					HSSFCell hssfCell = (HSSFCell) iterator.next();

					cellTempList.add(hssfCell);
				}
				cellDataList.add(cellTempList);
			}
			// /=============

			for (int i = 0; i < cellDataList.size(); i++) {


				List cellTempList = (List) cellDataList.get(i);


				if (cellTempList.get(0).toString().equalsIgnoreCase(dataVersion)) 
				{

					// Create shippingPageDetails to store user info details
					PaymentcreditDetails = new Payment_Credit();

					// Set DATA_VERSION value
					PaymentcreditDetails.setData_Version(cellTempList.get(
							getColumnIndex(fileName, sheet, "DATA_VERSION"))
							.toString());

					// Set CARDHOLDER_NAME value
					PaymentcreditDetails.setCardHolder_Name(cellTempList.get(
							getColumnIndex(fileName, sheet, "CARDHOLDER_NAME"))
							.toString());

					// Set CARD_NUMBER value
					PaymentcreditDetails.setCard_Number(cellTempList.get(
							getColumnIndex(fileName, sheet, "CARD_NUMBER"))
							.toString());

					// Set CVC_NUMBER value
					PaymentcreditDetails.setCVC_Number(cellTempList.get(
							getColumnIndex(fileName, sheet, "CVC_NUMBER"))
							.toString());
				


					// Set CARD_TYPE value
					PaymentcreditDetails.setCard_Type(cellTempList.get(
							getColumnIndex(fileName, sheet, "CARD_TYPE"))
							.toString());
					

					// Set EXPIRY_MONTH value
					PaymentcreditDetails.setExpiry_Month(cellTempList.get(
							getColumnIndex(fileName, sheet, "EXPIRY_MONTH"))
							.toString());

					// Set EXPIRY_YEAR value
					PaymentcreditDetails.setExpiry_Year(cellTempList.get(
							getColumnIndex(fileName, sheet, "EXPIRY_YEAR"))
							.toString());	

				}

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return PaymentcreditDetails;
	}









	/**
	 * Method: getColumnIndex
	 * Description:This method return the specific column cell value from Excel sheet.
	 * 
	 * 
	 * @param fileName : Excel file absolute path
	 * @param sheet  : Name of the target sheet
	 * @param colName : Name of the target column
	 * @return  : return the cell value of the specific column.
	 */
	public static Integer getColumnIndex(String fileName, String sheet,String colName) 
	{
		int columnIndex = 0;
		try {
			
			FileInputStream fileInputStream = new FileInputStream(fileName);
			POIFSFileSystem fsFileSystem = new POIFSFileSystem(fileInputStream);
			HSSFWorkbook workBook = new HSSFWorkbook(fsFileSystem);
			HSSFSheet hssfSheet = workBook.getSheet(sheet);
			Iterator<Row> rowIterator = hssfSheet.rowIterator();
			while (rowIterator.hasNext()) 
			{
				HSSFRow hssfRow = (HSSFRow) rowIterator.next();
            	Iterator<Cell> iterator = hssfRow.cellIterator();
				while (iterator.hasNext()) 
				{
					HSSFCell hssfCell = (HSSFCell) iterator.next();
					if (hssfRow.getRowNum() == 0)
					{
						if (hssfCell.getStringCellValue().equalsIgnoreCase(colName)) 
						{
							columnIndex = hssfCell.getColumnIndex();
						}
					}
				}
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return columnIndex;
	}

	/**
	 * Method:getColumnValue Description:This method fetches the column value
	 * for the specified version from the excel sheet.
	 * 
	 * @param fileName
	 *            :Excel File name from where data to be fetched
	 * @param sheet
	 *            : Sheet name of the excel
	 * @param dataVersion
	 *            : DataVesion for which column value to be retrieved
	 * @param colName1
	 *            : Name of the column for which column value to be
	 *            'dataVersion'
	 * @param colName2
	 *            : Name of the column for which column value to be retrieved
	 * 
	 * @return :colValue
	 */
	public static String getColumnValueDep(String fileName, String sheet,
			String dataVersion, String colName1, String colName2)
	{
		int columnIndex = 0;
		String expString = null;
		/**
		 * Create a new instance for cellDataList
		 */
		List<List<HSSFCell>> cellDataList = new ArrayList<List<HSSFCell>>();
		try {
			/**
			 * Create a new instance for FileInputStream
			 */
			FileInputStream fileInputStream = new FileInputStream(fileName);

			/**
			 * Create a new instance for POIFSFileSystem class
			 */
			POIFSFileSystem fsFileSystem = new POIFSFileSystem(fileInputStream);

			/*
			 * Create a new instance for HSSFWorkBook
			 */
			HSSFWorkbook workBook = new HSSFWorkbook(fsFileSystem);
			HSSFSheet hssfSheet = workBook.getSheet(sheet);
			/**
			 * Iterate the rows and cells of the spreadsheet * to get all the
			 * data
			 */
			Iterator<Row> rowIterator = hssfSheet.rowIterator();

			while (rowIterator.hasNext()) 
			{
				HSSFRow hssfRow = (HSSFRow) rowIterator.next();

				Iterator<Cell> iterator = hssfRow.cellIterator();

				List<HSSFCell> cellTempList = new ArrayList<HSSFCell>();
				while (iterator.hasNext()) 
				{

					HSSFCell hssfCell = (HSSFCell) iterator.next();

					if (hssfRow.getRowNum() == 0) 
					{
						if (hssfCell.getStringCellValue().equalsIgnoreCase(
								colName1)) {
							columnIndex = hssfCell.getColumnIndex();
						}
					}

					cellTempList.add(hssfCell);
				}
				cellDataList.add(cellTempList);
			}

			for (int i = 0; i < cellDataList.size(); i++)
			{

				List cellTempList = (List) cellDataList.get(i);
				for (int j = 0; j < cellTempList.size(); j++) 
				{
					if (cellTempList.get(columnIndex).toString()
							.equalsIgnoreCase(dataVersion)) 
					{
						expString = cellTempList.get(
								getColumnIndex(fileName, sheet, colName2))
								.toString();
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return expString;
	}


	

	public static Payment_Check getPaymentCheckDetails(String fileName,String sheetame,String dataVersion) 
	{
		Payment_Check paycheckList = null;
		List<List<HSSFCell>> cellDataList = new ArrayList<List<HSSFCell>>();
		try {
			FileInputStream fileInputStream = new FileInputStream(fileName);
			POIFSFileSystem fsFileSystem = new POIFSFileSystem(fileInputStream);
        	HSSFWorkbook workBook = new HSSFWorkbook(fsFileSystem);
			HSSFSheet hssfSheet = workBook.getSheet(sheetame);
			Iterator<Row> rowIterator = hssfSheet.rowIterator();
			while (rowIterator.hasNext())
			{
				HSSFRow hssfRow = (HSSFRow) rowIterator.next();
				Iterator<Cell> iterator = hssfRow.cellIterator();
				List<HSSFCell> cellTempList = new ArrayList<HSSFCell>();
				while (iterator.hasNext()) 
				{
					HSSFCell hssfCell = (HSSFCell) iterator.next();
					cellTempList.add(hssfCell);
				}
				cellDataList.add(cellTempList);
			}
			// /=============
			for (int i = 0; i < cellDataList.size(); i++) {
				List cellTempList = (List) cellDataList.get(i);
				if (cellTempList.get(0).toString().equalsIgnoreCase(dataVersion)) 
				{
			        paycheckList = new Payment_Check();
							
			        
			    	
					paycheckList.setData_Version(cellTempList.get(
							getColumnIndex(fileName,sheetame,"DATA_VERSION"))
							.toString());

					System.out.println( "Excel  Data"+cellTempList.get(
							getColumnIndex(fileName,sheetame,"DATA_VERSION"))
							.toString());
					
					
					paycheckList.setAccountHolder_Name(cellTempList.get(
						getColumnIndex(fileName, sheetame, "ACCOUNTHOLDER_NAME"))
						.toString());

					paycheckList.setAccount_Type(cellTempList.get(
							getColumnIndex(fileName, sheetame, "ACCOUNT_TYPE"))
							.toString());


					paycheckList.setRouting_Number(cellTempList.get(
							getColumnIndex(fileName, sheetame, "ROUTING_NUMBER"))
							.toString());

				
					paycheckList.setAccount_Number(cellTempList.get(
						getColumnIndex(fileName, sheetame, "ACCOUNT_NUMBER"))
						.toString());
				
					paycheckList.setBank_Name(cellTempList.get(
							getColumnIndex(fileName, sheetame, "BANK_NAME"))
						.toString());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return paycheckList;
	}



///////////////////////////////////////////////

public static User_DS getUserDetails(String fileName,String sheetame,String dataVersion) 
{
	User_DS userdsobj=null;
	//userdsList = new User_DS();
	//String sheet="GLOBALEXECUTER_"+sheetame;

	/**
	 * Create a new instance for cellDataList
	 */
	List<List<HSSFCell>> cellDataList = new ArrayList<List<HSSFCell>>();
	try {
		/**
		 * Create a new instance for FileInputStream
		 */
		FileInputStream fileInputStream = new FileInputStream(fileName);

		/**
		 * Create a new instance for POIFSFileSystem class
		 */
		POIFSFileSystem fsFileSystem = new POIFSFileSystem(fileInputStream);

		/*
		 * Create a new instance for HSSFWorkBook
		 */
		HSSFWorkbook workBook = new HSSFWorkbook(fsFileSystem);
		HSSFSheet hssfSheet = workBook.getSheet(sheetame);
		/**
		 * Iterate the rows and cells of the spreadsheet * to get all the
		 * data
		 */
		Iterator<Row> rowIterator = hssfSheet.rowIterator();

		while (rowIterator.hasNext())
		{
			HSSFRow hssfRow = (HSSFRow) rowIterator.next();

			Iterator<Cell> iterator = hssfRow.cellIterator();

			List<HSSFCell> cellTempList = new ArrayList<HSSFCell>();
			while (iterator.hasNext()) 
			{

				HSSFCell hssfCell = (HSSFCell) iterator.next();

				cellTempList.add(hssfCell);
			}
			cellDataList.add(cellTempList);
		}
		for (int i = 0; i < cellDataList.size(); i++) {

			
			List cellTempList = (List) cellDataList.get(i);

		
			if (cellTempList.get(0).toString().equalsIgnoreCase(dataVersion)) 
			
			{
				userdsobj=new User_DS();
			//	User_DS userdsobj=new User_DS();
			
				
					System.out.println( "Excel  Data"+cellTempList.get(
						getColumnIndex(fileName,sheetame,"DATA_VERSION"))
						.toString());
				userdsobj.setData_Version(cellTempList.get(
						getColumnIndex(fileName,sheetame,"DATA_VERSION"))
						.toString());

				System.out.println(cellTempList.get(
						getColumnIndex(fileName,sheetame,"FIRST_NAME"))
						.toString());
				
				userdsobj.setFirst_Name(cellTempList.get(
						getColumnIndex(fileName, sheetame, "FIRST_NAME"))
						.toString());


				
				userdsobj.setLast_Name(cellTempList.get(
						getColumnIndex(fileName, sheetame, "LAST_NAME"))
						.toString());
				


				userdsobj.setEmail_Address(cellTempList.get(
						getColumnIndex(fileName, sheetame, "EMAIL_ADDRESS"))
						.toString());
				

			
				userdsobj.setPassword(cellTempList.get(
						getColumnIndex(fileName, sheetame, "PASSWORD"))
						.toString());
			
				userdsobj. setDOB_Month(cellTempList.get(
					getColumnIndex(fileName, sheetame, "DOB_MONTH"))
					.toString());
		
				userdsobj.setDOB_Day(cellTempList.get(
						getColumnIndex(fileName, sheetame, "DOB_DAY"))
						.toString());
				
				userdsobj.setDOB_Year(cellTempList.get(
						getColumnIndex(fileName, sheetame, "DOB_YEAR"))
						.toString());
				
			
				userdsobj.setAddress(cellTempList.get(
					getColumnIndex(fileName, sheetame, "ADDRESS"))
					.toString());
		
				userdsobj.setCity(cellTempList.get(
						getColumnIndex(fileName, sheetame, "CITY"))
						.toString());
			
				
				userdsobj.setCountry(cellTempList.get(
						getColumnIndex(fileName, sheetame, "COUNTRY"))
						.toString());
			
				
				userdsobj.setState(cellTempList.get(
						getColumnIndex(fileName, sheetame, "STATE"))
						.toString());
			
				
				userdsobj.setZipCode(cellTempList.get(
						getColumnIndex(fileName, sheetame, "ZIPCODE"))
						.toString());
			
				userdsobj.setPhone_Number(cellTempList.get(
						getColumnIndex(fileName, sheetame, "PHONE_NUMBER"))
						.toString());
				
				userdsobj.setCustom_Amount(cellTempList.get(
						getColumnIndex(fileName, sheetame, "CUSTOM_AMOUNT"))
						.toString());
				
				userdsobj.setSearch_Text(cellTempList.get(
						getColumnIndex(fileName, sheetame, "SEARCH_TEXT"))
						.toString());
				userdsobj.setSearch_TripId(cellTempList.get(
						getColumnIndex(fileName, sheetame, "SEARCH_TRIPID"))
						.toString());
			
			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}
	return userdsobj;
}
/**
 * Method: getDS_USDataConfigDetails Description:This method fetches DS_US
 * data config details for specified version from the excel sheet.
 * 
 * @param fileName
 *            :Excel File name from where data to be fetched
 * @param sheet
 *            : Sheet name of the excel
 * @param dataVersion
 *            : DataVesion for which column value to be retrieved
 * 
 * @return :DS_USDetails object
 * @throws Exception
 * 
 */

//fileName contains path of excel file in system
public static DS_Config getDS_ConfigDetails(
		String fileName, String sheet, String dataVersion) throws Exception {

	DS_Config gDS_USDetails = null;

	/**
	 * Create a new instance for cellDataList
	 */
	List<List<HSSFCell>> cellDataList = new ArrayList<List<HSSFCell>>();
	try {
		/**
		 * Create a new instance for FileInputStream
		 */
		FileInputStream fileInputStream = new FileInputStream(fileName);

		/**
		 * Create a new instance for POIFSFileSystem class
		 */
		POIFSFileSystem fsFileSystem = new POIFSFileSystem(fileInputStream);

		/*
		 * Create a new instance for HSSFWorkBook
		 */
		HSSFWorkbook workBook = new HSSFWorkbook(fsFileSystem);
		HSSFSheet hssfSheet = workBook.getSheet(sheet);
		/**
		 * Iterate the rows and cells of the spreadsheet * to get all the
		 * data
		 */
		Iterator<Row> rowIterator = hssfSheet.rowIterator();

		while (rowIterator.hasNext()) 
		{
			HSSFRow hssfRow = (HSSFRow) rowIterator.next();

			Iterator<Cell> iterator = hssfRow.cellIterator();

			List<HSSFCell> cellTempList = new ArrayList<HSSFCell>();
			while (iterator.hasNext()) 
			{

				HSSFCell hssfCell = (HSSFCell) iterator.next();

				cellTempList.add(hssfCell);
			}
			cellDataList.add(cellTempList);
		}

		for (int i = 0; i < cellDataList.size() ; i++) 
		{

			List cellTempList = (List) cellDataList.get(i);

			if (cellTempList.get(0).toString().equalsIgnoreCase("DATA_VERSION")) 
			{

				// Create DS_USDetails object to store DS_US Data Set
				// Details
				gDS_USDetails = new DS_Config();

				// Set DS_US Information DATA_VERSION value
				gDS_USDetails.setData_Version(cellTempList.get(
						getColumnIndex(fileName, sheet, "DATA_VERSION"))
						.toString());


			}
		}
	}


	 catch (Exception e) {
		e.printStackTrace();

	}

	return gDS_USDetails;
}



	// Added for testing purpose
	public static void main(String args[]) throws Exception, SQLException,
	Exception {

		getGlobalFeatureSheets("D:/RS_Automation/RS_WorkSpace/Automation/Road Scholar/resources/testData/Automation_DS.xls");
		getUserDetails("D:/RS_Automation/RS_WorkSpace/Automation/Road Scholar/resources/testData/Automation_DS.xls","USER_DS","V1");
	}


}
