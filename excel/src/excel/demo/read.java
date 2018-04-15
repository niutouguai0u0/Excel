package excel.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class read {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("d:/T19.xls");
			// 读取EXCEL表格
			HSSFWorkbook hw = new HSSFWorkbook(is);
			//读取第一个SHEET
			HSSFSheet sheetAt = hw.getSheetAt(0);
			//读取第一行ROW
			HSSFRow row = sheetAt.getRow(0);
			//读取第一列cell
			HSSFCell cell = row.getCell(0);
			//输入读取到的信息
			System.out.println(cell.toString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}
}
