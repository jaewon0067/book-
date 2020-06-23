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
			// ��Ʈ �� (ù��°���� �����ϹǷ� 0�� �ش�)
			// ���� �� ��Ʈ�� �б����ؼ��� FOR���� �ѹ��� �����ش�
			XSSFSheet sheet = workbook.getSheetAt(0);
			// ���� ��
			int rows = sheet.getPhysicalNumberOfRows();
			for (rowindex = 0; rowindex < rows; rowindex++) {
				// �����д´�
				XSSFRow row = sheet.getRow(rowindex);
				if (row != null) {
					// ���� ��
					int cells = row.getPhysicalNumberOfCells();
					for (columnindex = 0; columnindex <= cells; columnindex++) {
						// ������ �д´�
						XSSFCell cell = row.getCell(columnindex);
						String value = "";
						// ���� ���ϰ�츦 ���� ��üũ
						if (cell == null) {
							continue;
						} else {
							// Ÿ�Ժ��� ���� �б�
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
