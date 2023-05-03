package day20_0503.collection.set;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {

		// set + 정렬
		
		TreeSet<Integer> set = new TreeSet<>();
		
		// add()
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		System.out.println(set.toString());
		
		// 순회
		for(int a : set) {
			System.out.println(a);
		}
		
		// size()
		System.out.println("크기 : " + set.size());
		
		//삭제
		set.remove(1);
		System.out.println(set.toString());
		
		
		
		
		
		
		
		
		
	}

}
