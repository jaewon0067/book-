package Model;

import java.awt.Dimension;
import javax.swing.JTable;

public class TableVo {
	
    public JTable getTable(){
    	
        Dimension dim = new Dimension(430, 400); 
        
        String []title = {"책 제목","저자", "출판사"};
        String [][]data = {
        		{"어떻게 잠을 잘까요", "야부우치 마사유키", "한림출판사"},
        		{"1日 1茶 : 매일 마셔도 좋은 건강 약차", "신혜정", "라이스메이커"},
        		{"할머니가 남긴 선물", "마거릿 와이즈 브라운", "시공주니어"},
        		{"우리끼리 가자", "윤구병", "보리"},
        		{"카라마조프가의 형제들 1", "도스토예프스키", "민음사"},
        		{"오셀로", "윌리엄 셰익스피어 원작", "민음사"},
        		{"나르치스와 골드문트", "헤르만 헤세", "현대문학"}
        	};

        JTable table = new JTable(data, title);
        return table;
    }
}


	
