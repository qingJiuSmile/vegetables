package com.fragment.use.vegetables.util;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

public class ExcelImportUtil {
    /**
     *判断是否为老版本的excel
     * @param filePath
     * @return
     */
    public static boolean isExcel2003(String filePath) {
        return (!StringUtils.isBlank(filePath)) && filePath.matches("^.+\\.(?i)(xls)$");
    }

    /**
     * 判断是否为新版本的excel
     *
     * @param filePath *.xlsx
     * @return boolean
     */
    public static boolean isExcel2007(String filePath) {
        return (!StringUtils.isBlank(filePath)) && filePath.matches("^.+\\.(?i)(xlsx)$");
    }


    /**
     * 根据单元格获取内容
     *
     * @param cell
     * @return String
     */
    public static String getCellFormatValue(Cell cell) {
        String result = "";
        if(cell == null){
            return result;
        }

        switch (cell.getCellType()) {
            case HSSFCell.CELL_TYPE_STRING:
                result = cell.getRichStringCellValue().getString();
                break;
            case HSSFCell.CELL_TYPE_NUMERIC:
                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                    Date date = cell.getDateCellValue();
                    result = DateUtil.dateToStr(date, "yyyy-MM-dd");
                } else {
                    result = String.valueOf(new BigDecimal(cell.getNumericCellValue()));
                }
                break;
            case HSSFCell.CELL_TYPE_FORMULA:
                result = String.valueOf(cell.getNumericCellValue());
                break;
            default:
                result = "";
                break;
        }
        return result;
    }
    public static File tempFileForImport(@RequestParam MultipartFile file, HttpServletRequest request, File tempFile) {
        if (!file.isEmpty()) {
            String filePath = request.getSession().getServletContext().getRealPath("/") + "upload" + File.separator;
            File dir = new File(filePath);
            if (!dir.exists()) {
                dir.mkdir();
            }

            String path = filePath + file.getOriginalFilename();

            try {
                tempFile = new File(path);
                FileUtils.copyInputStreamToFile(file.getInputStream(), tempFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return tempFile;
    }


}

