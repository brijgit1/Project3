package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsRead2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		readXlsFile();

	}
	
	public static void readXlsFile() throws FileNotFoundException{
		File file=new File("./src/main/resources/resources/Data1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFSheet sheet1=null;
		try {
			XSSFWorkbook wb =new XSSFWorkbook(fis);
			sheet1=wb.getSheetAt(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Iterator<Row> itrRow=sheet1.iterator();
		
		while(itrRow.hasNext()){
			Row row=itrRow.next();
			Iterator<Cell> itrCell=row.cellIterator();
			while(itrCell.hasNext()){
				Cell cell=itrCell.next();
				switch(cell.getCellType()){
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+" ");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+" ");
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.print("Cell is blank");
				}
				
			}
			System.out.println();
		}
		
		
		
	}

}
