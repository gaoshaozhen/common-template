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
			int lastRow = sheet.getLastRowNum();
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

	public static List<List<String>> readFirstSheet(InputStream in, int colStart, int colEnd) throws IOException {
		List<List<String>> list = new ArrayList<>();
		try (XSSFWorkbook workbook = new XSSFWorkbook(in)) {
			// 获得当前sheet工作表
			XSSFSheet sheet = workbook.getSheetAt(0);
			if (sheet == null) {
				return null;
			}
			int lastRow = sheet.getLastRowNum();
			for (int rowNum = 0; rowNum <= lastRow; rowNum++) {
				// 获得当前行
				XSSFRow row = sheet.getRow(rowNum);
				List<String> rowList = new ArrayList<>();
				for (int cellNum = colStart; cellNum <= colEnd; cellNum++) {
					XSSFCell cell = row.getCell(cellNum);
					String value = cell.getStringCellValue();
					rowList.add(value);
				}
				list.add(rowList);
			}
		}
		return list;
	}
}
