package Model;

import java.awt.Dimension;
import javax.swing.JTable;

public class TableVo {
	
    public JTable getTable(){
    	
        Dimension dim = new Dimension(430, 400); 
        
        String []title = {"å ����","����", "���ǻ�"};
        String [][]data = {
        		
        		{"������", "������ ���ͽ��Ǿ� ����", "������"},
        	
        	};

        JTable table = new JTable(data, title);
        return table;
    }
}


	
