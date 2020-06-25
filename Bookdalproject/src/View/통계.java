package View;

import java.util.ArrayList;

import org.apache.poi.util.ArrayUtil;

import Model.ChartDAO;
import Model.cntVO;

public class 통계 {

	public static void main(String[] args) {
		// 월별 책빌린거 평균 통계

		// testVO vo = new testVO();

		ChartDAO dao = new ChartDAO();
		// ArrayList<String> list = dao.getBorrowList();

		ArrayList<Integer> months = new ArrayList<Integer>();
		ArrayList<Integer> cnts = new ArrayList<Integer>();

		// months, cnts 값 넣음
//		for (int i = 0; i < list.size(); i++) {
//			boolean isCheck = true;
//			for (int j = 0; j < months.size(); j++) {
//				if (Integer.parseInt(list.get(i))==months.get(j)) {
//					// 일치하는게 있다
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
//			System.out.print(months.get(i)+"월 : ");
//			System.out.println(cnts.get(i)/4+"개");
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
//				+ cnt12 + cnt13 + cnt14 + cnt15 - 1 + "합계");

//		ArrayList<> months = new ArrayList<Integer>();
//		ArrayList<Integer> cnts = new ArrayList<Integer>();

		String[] book_name = { "카라마조프가의 형제들", "진짜 그런 책은 없는데요 : 또다시 찾아온 더 엉뚱한 손님들", "캣콜링 : 이소호 시집",
				"진보의 미래 : 다음 세대를 위한 민주주의 교과서", "나르치스와 골드문트", "매일 마셔도 좋은 약차", "나니아나라 이야기세트", "할머나기 남긴 선물", "우리끼리 가자",
				"피로 독립 : 여자", "서른이면 알아야 할 피로 회복의 기술", "오셀로", "죽음. 2 : 베르나르 베르베르 장편소설", "어떻게 잠을 잘까요",
				"(하루 한 권)영국 엄마의 그림책 육아 : 그림책으로 시작하는 처음" };
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
