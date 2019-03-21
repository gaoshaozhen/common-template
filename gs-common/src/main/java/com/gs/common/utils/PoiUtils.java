package com.gs.common.utils;

import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

/**
 * 
 * @author gaosz
 *
 */
public class PoiUtils {
	public static class ExcelCell{
		
	}
	
	public static class ExcelRow{
		
	}
	
	public static List<ExcelRow> readFirstSheet(InputStream in) throws IOException{
		
	        
		return null;
	}
	
	public static List<ExcelRow> readBySheet(InputStream in, int index, int colStart, int colEnd) throws IOException{
		try(XSSFWorkbook workbook = new XSSFWorkbook(in)){
			//获得当前sheet工作表  
			XSSFSheet  sheet = workbook.getSheetAt(index);  
			if(sheet == null){  
				return null;  
			}  
			//获得当前sheet的开始行  
			int firstRowNum  = sheet.getFirstRowNum();  
			//获得当前sheet的结束行  
			int lastRowNum = sheet.getLastRowNum();  
			//循环除了第一行的所有行  
			for(int rowNum = firstRowNum+1;rowNum <= lastRowNum;rowNum++){  
				//获得当前行  
				XSSFRow row = sheet.getRow(rowNum);  
				//获得当前行的开始列  
				int firstCellNum = row.getFirstCellNum();  
				//获得当前行的列数  
				int lastCellNum = row.getPhysicalNumberOfCells();  
				String[] cells = new String[row.getPhysicalNumberOfCells()];  
				//循环当前行  
				for(int cellNum = colStart; cellNum < colEnd;cellNum++){  
					XSSFCell cell = row.getCell(cellNum);  
//					cell.get 
				}  
				
			}  
		}
		return null;
	}
}
