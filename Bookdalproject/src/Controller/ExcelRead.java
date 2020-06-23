package Controller;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream.GetField;
import java.net.URL;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public ArrayList<BookVO> getBookList() {

		ArrayList<BookVO> booklist = new ArrayList<BookVO>();
		String book_index = null;
		String lib_location = null;
		String status = null;
		String restriction = null;
		String book_id = null;
		String book_name = null;
		String author = null;
		String publisher = null;
		String publishedin = null;
		String published_place = null;
		String original = null;
		String price = null;
		String sidebook = null;
		String[] bookinfo = new String[13];

		try {

			// URL in =
			// ExcelRead.class.getClass().getResource(".//excel_resource//testValue.xlsx");
			// String path = in.getPath();

			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\excel_resource\\testValue.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			int rowindex = 0;
			int columnindex = 0;
			// 시트 수 (첫번째에만 존재하므로 0을 준다)
			// 만약 각 시트를 읽기위해서는 FOR문을 한번더 돌려준다
			XSSFSheet sheet = workbook.getSheetAt(0);
			// 행의 수
			int rows = sheet.getPhysicalNumberOfRows();
			for (rowindex = 0; rowindex < rows; rowindex++) {
				// 행을읽는다
				XSSFRow row = sheet.getRow(rowindex);
				if (row != null) {
					// 셀의 수
					int cells = row.getPhysicalNumberOfCells();
					for (columnindex = 0; columnindex <= cells; columnindex++) {
						// 셀값을 읽는다
						XSSFCell cell = row.getCell(columnindex);
						String value = "";
						// 셀이 빈값일경우를 위한 널체크
						if (cell == null) {
							continue;
						} else {
							// 타입별로 내용 읽기
							switch (cell.getCellType()) {
							case XSSFCell.CELL_TYPE_FORMULA:
								value = cell.getCellFormula();
								break;
							case XSSFCell.CELL_TYPE_NUMERIC:
								value = cell.getNumericCellValue() + "";
								break;
							case XSSFCell.CELL_TYPE_STRING:
								value = cell.getStringCellValue() + "";
								break;
							case XSSFCell.CELL_TYPE_BLANK:
								value = cell.getBooleanCellValue() + "";
								break;
							case XSSFCell.CELL_TYPE_ERROR:
								value = cell.getErrorCellValue() + "";
								break;
							}
						}
						bookinfo[columnindex] = value;
						if (columnindex == 12) {

							BookVO vo = new BookVO(bookinfo[0], bookinfo[1], bookinfo[2], bookinfo[3], bookinfo[4],
									bookinfo[5], bookinfo[6], bookinfo[7], bookinfo[8], bookinfo[9], bookinfo[10],
									bookinfo[11], bookinfo[12]);
							booklist.add(vo);
						}

					}

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return booklist;
		// System.out.println(booklist.get(20000).getOriginal());
	}

}
