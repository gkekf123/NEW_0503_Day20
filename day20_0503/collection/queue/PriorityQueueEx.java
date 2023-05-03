package day20_0503.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {

		Queue<Integer> que = new PriorityQueue<>();
		
		que.offer(4);
		que.offer(3);
		que.offer(1);
		que.offer(5);
		que.offer(6);
		
		System.out.println(que.toString());	//[1,4,3,5,6]
		
		System.out.println(que.poll());	//1
		System.out.println(que.poll());	//3
		System.out.println(que.poll());	//4
		System.out.println(que.poll());	//5
		System.out.println(que.poll());	//6
		
		System.out.println(que.toString());	//[]
		
		System.out.println("=======================");
		
		// 객체에서 사용할 때
		// que에 누적 객체
		
		// User 객체를 담을 수 있는 큐 - 객체는 순서를 정할 수 없다 - User객체 안에 있는 멤버변수의 순서를 정한다
		// 큐가 순서를 확인할 때 compareTo 메서드를 확인한다
		// compareTo에 정의 된 순서에 따라서 우선순위를 정한다
		// 객체가 우선순위를 가지게 하려면 comparable 인터페이스를 상속받아서 compareTo메서드를 오버라이딩 해서 가지면 된다
		
		//우선순위 지정
		// 홍길동이 사전적으로 앞에 위치 -> 음수
		System.out.println("홍길동".compareTo("홍길자"));
		// 홍길동이 사전적으로 뒤에 위치 -> 양수
		System.out.println("홍길자".compareTo("홍길동"));
		
		Queue<User> queue = new PriorityQueue<>();
		
		queue.offer(new User("홍길동", 10));
		queue.offer(new User("홍길자", 20));
		queue.offer(new User("홍길순", 30));
		queue.offer(new User("신사임당", 40));
		
		System.out.println(queue.toString());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
//		System.out.println("가장 먼저 나온 객체의 이름 : " + queue.poll().getName());
//		System.out.println("2번째로 나온 객체의 이름 : " + queue.poll().getName());
//		System.out.println("3번쨰로 나온 객체의 이름 : " + queue.poll().getName());
//		System.out.println("4번쨰로 나온 객체의 이름 : " + queue.poll().getName());
	
	}

}
