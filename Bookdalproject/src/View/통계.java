package View;

import java.util.ArrayList;

import Model.ChartDAO;
import Model.testVO;

public class ��� {

	public static void main(String[] args) {
		// ���� å������ ��� ���
		
		//testVO vo = new testVO();

		ChartDAO dao = new ChartDAO();
		ArrayList<String> list = dao.getBorrowList();
		
		ArrayList<Integer> months = new ArrayList<Integer>();
		ArrayList<Integer> cnts = new ArrayList<Integer>();
		
		
		// months, cnts �� ����
		for (int i = 0; i < list.size(); i++) {
			boolean isCheck = true;
			for (int j = 0; j < months.size(); j++) {
				if (Integer.parseInt(list.get(i))==months.get(j)) {
					// ��ġ�ϴ°� �ִ�
					int cnt = cnts.get(j);
					cnt++;
					cnts.remove(j);
					cnts.add(j, cnt);
					isCheck = false;
					break;
				} 
			}
			if(isCheck) {
				months.add(Integer.parseInt(list.get(i)));
				cnts.add(1);
			}
		}

//		System.out.println(months.size());
//		System.out.println(cnts.size());
//		System.out.println(list.size());
		
		for(int i = 0; i < months.size(); i++) {
			System.out.print(months.get(i)+"�� : ");
			System.out.println(cnts.get(i)/4+"��");
		}
		
		//------------------------
		
		
		
		
	

		
	}

}
