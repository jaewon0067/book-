package View;

import java.util.ArrayList;

import org.apache.poi.util.ArrayUtil;

import Model.ChartDAO;
import Model.cntVO;

public class ��� {

	public static void main(String[] args) {
		// ���� å������ ��� ���

		// testVO vo = new testVO();

		ChartDAO dao = new ChartDAO();
		// ArrayList<String> list = dao.getBorrowList();

		ArrayList<Integer> months = new ArrayList<Integer>();
		ArrayList<Integer> cnts = new ArrayList<Integer>();

		// months, cnts �� ����
//		for (int i = 0; i < list.size(); i++) {
//			boolean isCheck = true;
//			for (int j = 0; j < months.size(); j++) {
//				if (Integer.parseInt(list.get(i))==months.get(j)) {
//					// ��ġ�ϴ°� �ִ�
//					int cnt = cnts.get(j);
//					cnt++;
//					cnts.remove(j);
//					cnts.add(j, cnt);
//					isCheck = false;
//					break;
//				} 
//			}
//			if(isCheck) {
//				months.add(Integer.parseInt(list.get(i)));
//				cnts.add(1);
//			}
//		}

//		System.out.println(months.size());
//		System.out.println(cnts.size());
//		System.out.println(list.size());

//		for(int i = 0; i < months.size(); i++) {
//			System.out.print(months.get(i)+"�� : ");
//			System.out.println(cnts.get(i)/4+"��");
//		}
//		
		// ------------------------

//		System.out.println(d));
		ArrayList<String> recommandList = dao.recommand();

		System.out.println(recommandList.size());
		System.out.println(recommandList);

		ArrayList<String> ukList = dao.uk();
		System.out.println(ukList.size());
		System.out.println(ukList);

		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int cnt4 = 0;
		int cnt5 = 0;
		int cnt6 = 0;
		int cnt7 = 0;
		int cnt8 = 0;
		int cnt9 = 0;
		int cnt10 = 0;
		int cnt11 = 0;
		int cnt12 = 0;
		int cnt13 = 0;
		int cnt14 = 0;
		int cnt15 = 0;

		for (int i = 0; i < recommandList.size(); i++) {

			if (ukList.get(0).equals(recommandList.get(i))) {
				cnt1++;
			} else if (ukList.get(1).equals(recommandList.get(i))) {
				cnt2++;
			} else if (ukList.get(2).equals(recommandList.get(i))) {
				cnt3++;
			} else if (ukList.get(3).equals(recommandList.get(i))) {
				cnt4++;
			} else if (ukList.get(4).equals(recommandList.get(i))) {
				cnt5++;
			} else if (ukList.get(5).equals(recommandList.get(i))) {
				cnt6++;
			} else if (ukList.get(6).equals(recommandList.get(i))) {
				cnt7++;
			} else if (ukList.get(7).equals(recommandList.get(i))) {
				cnt8++;
			} else if (ukList.get(8).equals(recommandList.get(i))) {
				cnt9++;
			} else if (ukList.get(9).equals(recommandList.get(i))) {
				cnt10++;
			} else if (ukList.get(10).equals(recommandList.get(i))) {
				cnt11++;
			} else if (ukList.get(11).equals(recommandList.get(i))) {
				cnt12++;
			} else if (ukList.get(12).equals(recommandList.get(i))) {
				cnt13++;
			} else if (ukList.get(13).equals(recommandList.get(i))) {
				cnt14++;
			} else if (ukList.get(14).equals(recommandList.get(i))) {
				cnt15++;
			}

		}
		System.out.println("---------");

		System.out.println(cnt1);
		System.out.println(cnt2);
		System.out.println(cnt3);
		System.out.println(cnt4);
		System.out.println(cnt5);
		System.out.println(cnt6);
		System.out.println(cnt7);
		System.out.println(cnt8);
		System.out.println(cnt9);
		System.out.println(cnt10);
		System.out.println(cnt11);
		System.out.println(cnt12);
		System.out.println(cnt13);
		System.out.println(cnt14);
		System.out.println(cnt15);

//		System.out.println(cnt1 + cnt2 + cnt3 + cnt4 + cnt4 + cnt5 + cnt6 + cnt7 + cnt8 + cnt9 + cnt10 + cnt11
//				+ cnt12 + cnt13 + cnt14 + cnt15 - 1 + "�հ�");

//		ArrayList<> months = new ArrayList<Integer>();
//		ArrayList<Integer> cnts = new ArrayList<Integer>();

		String[] book_name = { "ī���������� ������", "��¥ �׷� å�� ���µ��� : �Ǵٽ� ã�ƿ� �� ������ �մԵ�", "Ĺ�ݸ� : �̼�ȣ ����",
				"������ �̷� : ���� ���븦 ���� �������� ������", "����ġ���� ��幮Ʈ", "���� ���ŵ� ���� ����", "���ϾƳ��� �̾߱⼼Ʈ", "�Ҹӳ��� ���� ����", "�츮���� ����",
				"�Ƿ� ���� : ����", "�����̸� �˾ƾ� �� �Ƿ� ȸ���� ���", "������", "����. 2 : �������� �������� ����Ҽ�", "��� ���� �߱��",
				"(�Ϸ� �� ��)���� ������ �׸�å ���� : �׸�å���� �����ϴ� ó��" };
		int[] cnt = { 30, 1, 7, 1, 9, 12, 6, 1, 10, 1, 14, 1, 12, 1, 2 };
//
		ArrayList<cntVO> cntlist = new ArrayList<cntVO>();

		for (int i = 0; i < cnt.length; i++) {
			cntlist.add(new cntVO(book_name[i], cnt[i]));

		}
		for (int j = 0; j < cnt.length; j++) {
			System.out.println(cntlist.get(j).getBook_name());
			System.out.println(cntlist.get(j).getCnt());
		}
		
		

	}

}
