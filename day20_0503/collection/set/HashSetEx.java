package day20_0503.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {

		// 같음
		//HashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>();

		// add()
		set.add("java");
		set.add("database");
		set.add("spring");
		set.add("jsp");
		set.add("python");
		set.add("java");	// 중복 X
		set.add("java");	// 중복 X
		set.add("java");	// 중복 X
		
		// 문자열로 - 추가한 값이랑 출력 된 순서는 다르다(랜덤으로 들어가 있다)
		// 같은 값을 넣더라도 중복되지 않는다
		System.out.println(set.toString());
		
		// 크기
		System.out.println("크기 : " + set.size());
		
		// 삭제 - 인덱스로 삭제 안되고, 값으로 지원야 한다
		set.remove("python");
		System.out.println(set.toString());
		
		// 순회 - 향상된 for문 - 내부적으로 반복자(Iterator)의 개념을 사용해서 회전
		for(String s : set) {
			System.out.println(s);
		}

		System.out.println("==============================");
		
		//set -> Iterator 타입으로 변경
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {	// 다음이 있다면 true
			System.out.println(iter.next());
		}
		
		
		
		
	}

}
