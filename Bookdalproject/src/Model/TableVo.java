package Model;

import java.awt.Dimension;
import javax.swing.JTable;

public class TableVo {
	
    public JTable getTable(){
    	
        Dimension dim = new Dimension(430, 400); 
        
        String []title = {"å ����","����", "���ǻ�"};
        String [][]data = {
        		{"��� ���� �߱��", "�ߺο�ġ ������Ű", "�Ѹ����ǻ�"},
        		{"1�� 1� : ���� ���ŵ� ���� �ǰ� ����", "������", "���̽�����Ŀ"},
        		{"�ҸӴϰ� ���� ����", "���Ÿ� ������ ����", "�ð��ִϾ�"},
        		{"�츮���� ����", "������", "����"},
        		{"ī���������� ������ 1", "�����俹����Ű", "������"},
        		{"������", "������ ���ͽ��Ǿ� ����", "������"},
        		{"����ġ���� ��幮Ʈ", "�츣�� �켼", "���빮��"}
        	};

        JTable table = new JTable(data, title);
        return table;
    }
}


	
