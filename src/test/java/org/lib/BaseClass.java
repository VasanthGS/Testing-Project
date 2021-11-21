package org.lib;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass {
	public void writeData(String name,int rowindex,int cellindex,String data) throws IOException {
		File f = new File("C:\\Users\\welcome\\eclipse-workspace\\BaseClass\\DataBase");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet(name);
		Row r= s.createRow(rowindex);
		Cell c = r.createCell(cellindex);
		c.setCellValue(data);
		FileOutputStream stream = new FileOutputStream(f);
		w.write(stream);

	}
	
	

}
