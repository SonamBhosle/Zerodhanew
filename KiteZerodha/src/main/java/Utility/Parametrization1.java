package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization1 {

	public static String getData(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("/Users/swatibhosle/eclipse-workspace/KiteZerodha/src/test/resources/Book21.xlsx");
		String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}


}
