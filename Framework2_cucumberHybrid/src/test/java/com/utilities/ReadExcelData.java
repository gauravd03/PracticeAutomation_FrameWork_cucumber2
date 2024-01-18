package com.utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadExcelData {

    public static List<String> readExcelData(String filePath, String sheetName, int columnIndex) {
        List<String> data = new ArrayList<String>();

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            Workbook workbook = new HSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheet(sheetName);
            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Cell cell = row.getCell(columnIndex);

                // Assuming all data is in the first column (adjust columnIndex as needed)
                data.add(cell.getRichStringCellValue().getString());
            }

            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}