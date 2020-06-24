package Model;

import java.awt.Dimension;
import javax.swing.JTable;

public class TableVo {
	
    public JTable getTable(){
    	
        Dimension dim = new Dimension(430, 400); 
        
        String []title = {"책 제목","저자", "출판사"};
        String [][]data = {
        		
        		{"오셀로", "윌리엄 셰익스피어 원작", "민음사"},
        	
        	};

        JTable table = new JTable(data, title);
        return table;
    }
}


	
