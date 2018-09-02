package com.tcs.Smarthome.Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;

import com.tcs.Smarthome.Utilities.MyClient;
import com.tcs.Smarthome.Utilities.ObjectRepository;

import jxl.read.biff.BiffException;

public class TestBase extends ObjectRepository {

	// private static Logger log=Logger.getLogger(TestBase.class);
	protected String host = "localhost";
	protected int port = 8889;
	protected String usedDeviceName = "adb:HTC U11";
	protected static MyClient client = null;
	protected boolean devicelogmandatory = true;
	protected String reportName = null;
	protected static ArrayList<Map<String, String>> excelRows = null;
	protected static Map<String, String> data = null;
	protected static Map<String, String> dataenv = null;
	protected static Map<String, String> eventidsdata = null;
	protected Throwable exception = null;
	protected String defaulHostNameOfApp = "";
	protected int dataIndex = 0;
	protected static String value = null;
	private String projectBaseDirectory = "C:\\Users\\ShadabM\\workspace\\project2";

	@BeforeClass
	public void setUp() throws NumberFormatException, BiffException, IOException {

		// setLogger();
		// log.info("Running test case number "+getTestName());
		// log.info("Initiating Client and Device");

		initClientAndDevice();
		// log.info("Setting Device");
		client.setDevice(usedDeviceName);

		// client.setProjectBaseDirectory(projectBaseDirectory);
		// log.info("Openning Device");
		// client.openDevice();
		// log.info("Clearing Device Logs");
		// client.clearDeviceLog();
	}

	public void initClientAndDevice() throws NumberFormatException, BiffException, IOException {
		initHost();
		initPort();

		client = new MyClient(host, port);
		// devicelogmandatory=Boolean.getBoolean(getProperty("getdevicelogmandatory"));

		try {
			initDevice();
			// getTestData();
			// initReport();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void initHost() {
		if (host == null) {
			host = getProperty("host");
		}
	}

	private void initPort() {
		if (port == 0) {
			port = Integer.valueOf(getProperty("port"));
		}
	}

	// Understand how this value is
	// extracted??????????????????????????????????????????????
	private void initDevice() {

		if (usedDeviceName != null) {
			return;
		}
		usedDeviceName = getProperty("device.name").contains(":") ? getProperty("device.name")
				: client.waitForDevice(getProperty("device.name"), 300000);
	}

	// Check from where these values are
	// taken????????????????????????????????????????????????????
	// public String getTestName() {
	//
	// if(System.getProperty("testId") != null){
	// log.info("################ ALM Test ID ######### : " +
	// getProperty("testId"));
	// return System.getProperty("testId");
	// }
	// else if(getProperty("testId")!=null){
	// log.info("################ ALM Test ID ######### : " +
	// getProperty("testId"));
	// return getProperty("testId");
	// }
	// else{
	// String[] klassNameSplit = this.getClass().getName().split("\\.");
	// return klassNameSplit[klassNameSplit.length-1];
	// }
	// }

	// private void initReport() throws IOException {
	//
	// reportName = generateFileName(getTestName());
	// client.setReporter("pdf", getProperty("user.dir") + "\\reports\\"+reportName,
	// reportName);
	//
	// }

	// Check how data is taken from excel and this map has been created
	// protected void getTestData() throws BiffException, IOException {
	// excelRows = new ArrayList<Map <String,String>>();
	// defaulHostNameOfApp = getProperty("defaultHostName");
	// if (dataIndex == -1) {
	// return;
	// }
	// Sheet dataSheet = Workbook.getWorkbook(new
	// File(getProperty("data.spreadsheet.name"))).getSheet("Test_Data");
	// System.out.println("No of rows in the excel sheet" + dataSheet.getRows());
	// for(int rows=1 ; rows < dataSheet.getRows() ; rows++){
	// if(dataSheet.getCell(0,rows).getContents().isEmpty())
	// break;
	// data = new HashMap<String,String>();
	// for (int columns=0; columns<dataSheet.getColumns(); columns++) {
	// if(dataSheet.getCell(columns,rows).getContents().isEmpty())
	// break;
	//
	// String key = dataSheet.getCell(columns,0).getContents();
	// String value = dataSheet.getCell(columns,rows).getContents();
	// data.put(key, value);
	// }
	// excelRows.add(data);
	// }
	// System.out.println(excelRows);
	// }

	public static String getProperty(String property) {
		if (System.getProperty(property) != null) {
			return System.getProperty(property);
		}
		File setupPropFile = new File("setup.properties");
		if (setupPropFile.exists()) {
			Properties prop = new Properties();
			FileReader reader;
			try {
				reader = new FileReader(setupPropFile);
				prop.load(reader);
				reader.close();
				return prop.getProperty(property);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * Generate the file name
	 * 
	 * @param suitname
	 * @return newFile name
	 */
	public String generateFileName(String suitName) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH-mm-ss");
		Date date = new Date();

		String now = sdf.format(date);
		String newName = suitName.concat("_MobileReport_").concat(now);

		return newName;
	}

	public String getTestData(int i, int j) throws IOException {
		File excel = new File("C:\\Users\\ShadabM\\eclipse-workspace\\Smarthome\\src\\test\\resources\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(excel);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("VApp");

		int rowNum = ws.getLastRowNum();
		int colNum = ws.getRow(0).getLastCellNum();

		String[][] data = new String[rowNum][colNum];

		for (i = 0; i < rowNum; i++) {
			XSSFRow row = ws.getRow(i);

			for (j = 0; j < colNum; j++) {
				XSSFCell cell = row.getCell(j);
				 value = cellToString(cell);
				data[i][j] = value;
			//	System.out.println("The value is " + value);
			}
			
		}
		
		return value;
		
	}
	
	
	public static String cellToString(XSSFCell cell) {
		
		int type;
		Object result;
		
		type = cell.getCellType();
		
		switch (type) {
		
		case 0 :  //numeric value in excel
				result = cell.getNumericCellValue();
		break;
		
		case 1 :  //String value in excel
			result = cell.getStringCellValue();
			break;
			
			default :
				throw new RuntimeException("There is no support for this type of cell");
		}
		
		return result.toString();	
		
	}

	// Understand why Logger is used????????????????????????????????????????????
	// public void setLogger(){
	//
	// Logger.getRootLogger().getLoggerRepository().resetConfiguration();
	//
	// ConsoleAppender console = new ConsoleAppender();
	//
	// String PATTERN = "%d [%p|%c|%C{1}] %m%n";
	// console.setLayout(new PatternLayout(PATTERN));
	// console.setThreshold(Level.INFO);
	// console.activateOptions();
	// Logger.getRootLogger().addAppender(console);
	//
	// FileAppender fa = new FileAppender();
	// fa.setFile(getProperty("start.log"));
	// fa.setLayout(new PatternLayout("%d %-5p [%c{1}] %m%n"));
	// fa.setThreshold(Level.INFO);
	// fa.setAppend(false);
	// fa.activateOptions();
	//
	// Logger.getRootLogger().addAppender(fa);
	// }
}
