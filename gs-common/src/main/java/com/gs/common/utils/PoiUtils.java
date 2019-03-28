package com.gs.common.utils;

import java.util.*;
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

	public static List<List<String>> readBySheet(InputStream in, int sheetIndex, int startRow, int endRow, int colStart,
			int colEnd) throws IOException {
		List<List<String>> list = new ArrayList<>();
		try (XSSFWorkbook workbook = new XSSFWorkbook(in)) {
			// 获得当前sheet工作表
			XSSFSheet sheet = workbook.getSheetAt(sheetIndex);
			if (sheet == null) {
				return null;
			}
			for (int rowNum = startRow; rowNum <= endRow; rowNum++) {
				// 获得当前行
				XSSFRow row = sheet.getRow(rowNum);
				List<String> rowList = new ArrayList<>();
				for (int cellNum = colStart; cellNum < colEnd; cellNum++) {
					XSSFCell cell = row.getCell(cellNum);
					String value = cell.getStringCellValue();
					rowList.add(value);
				}
			}
		}
		return list;
	}
}
