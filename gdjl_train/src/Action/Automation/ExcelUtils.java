package Automation;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static void setExcelFile(String Path, String SheetName) throws Exception {

		try {

			// Open the Excel file

			FileInputStream ExcelFile = new FileInputStream(Path);

			// Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);

		} catch (Exception e) {

			throw (e);

		}

	}

	// This method is to read the test data from the Excel cell, in this we are
	// passing parameters as Row num and Col num

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			return "";

		}

	}

	// This method is to write in the Excel cell, Row num and Col num are the
	// parameters

	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {

		try {

			Row = ExcelWSheet.getRow(RowNum);

			Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

			if (Cell == null) {

				Cell = Row.createCell(ColNum);

				Cell.setCellValue(Result);

			} else {

				Cell.setCellValue(Result);

			}

			// Constant variables Test Data path and Test Data file name

			FileOutputStream fileOut = new FileOutputStream(Contants.testData);

			ExcelWBook.write(fileOut);

			fileOut.flush();

			fileOut.close();

		} catch (Exception e) {

			throw (e);

		}

	}

	// This method is to get the last row in the excel file
	public static int getRowNumber() {

		int _num = ExcelWSheet.getLastRowNum();
		return _num;
	}

	// This method is to get the last column of header row in the excel file 
	public static int getHeaderNumber() {
		int _num = ExcelWSheet.getRow(0).getLastCellNum();
		return _num;
	}

	// This method is to return column index of the header by header's name
	public static int findHeaderIndex(String headerValue) throws Exception {
		int hIndex = -1;
		Row = ExcelWSheet.getRow(0);
		for (int hId = 0; hId <= getHeaderNumber(); hId++) {
			Cell = Row.getCell(hId);
			if (Cell == null || Cell.getCellType() == Cell.CELL_TYPE_BLANK) {
				continue;
			}
			if (Cell.getCellType() == Cell.CELL_TYPE_STRING) {
				String cValue = Cell.getStringCellValue();
				if (cValue.equals(headerValue)) {
					hIndex = hId;
					break;
				}
			}
		}
		if (hIndex == -1) {
			throw new Exception("None of the header were matched!");
		}
		return hIndex;
	}
	
	// This method is to return row index and column index of the cell by value
	public static int[] findCellIndex(String CellValue) throws Exception{
		int rIndex = -1;
		int cIndex = -1;
		for(int rID = 0; rID <= getRowNumber(); rID++){
			Row = ExcelWSheet.getRow(rID);
			for (int cID = 0; cID <= Row.getLastCellNum(); cID++) {
				Cell = Row.getCell(cID);
				if (Cell == null || Cell.getCellType() == Cell.CELL_TYPE_BLANK) {
					continue;
				}
				if (Cell.getCellType() == Cell.CELL_TYPE_STRING) {
					String cValue = Cell.getStringCellValue();
					if (cValue.equals(CellValue)) {
						rIndex = rID;
						cIndex = cID;
						break;
					}
				}
			}
		}
		if(rIndex == -1 || cIndex == -1){
			throw new Exception("None of the cell were matched!");
		}
		return new int[]{rIndex,cIndex};
	}

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
}
