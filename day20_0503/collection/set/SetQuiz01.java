package day20_0503.collection.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz01 {

	public static void main(String[] args) {

		/* 
		 * 중복되지 않는 6자리 수(로또번호)
		 * 	1. Random객체를 이용해서 1 ~ 45랜덤한 수를 생성
		 * 	2. Set에 6개의 랜덤한 로또 번호를 저장
		 */
		
//		int i = 1;
//		
//		Set<Integer> n = new HashSet<>();
//		Random lotto = new Random();
//		
//		while(true) {
//			i = lotto.nextInt(45);
//			n.add(i);
//		if(n.size() > 6) {
//			break;
//		}
//		
//		}
//		System.out.println(n.toString());
//		 
		TreeSet<Integer> lotto = new TreeSet<>();
		Random r = new Random();
		
		while(true) {
		
			int rn = r.nextInt(45) + 1;
		
			lotto.add(rn);
		
			if(lotto.size() == 6) {
		
				break;
		
			}
		}
		System.out.println(lotto.toString());
		
	}

}
