package day20_0503.collection.queue;

public class User implements Comparable<User>{

	private String name;
	private int age;

	// 생성자
	public User() {
		
	}
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	@Override // PriorityQueue 사용 하기 위해서는 comparable 인터페이스 상속받고 오버라이딩 해야된다
	public int compareTo(User o) {
		// 내꺼와 매개변수로 들어오는 User객체의 멤버변수 값의 비교
		//return this.name.compareTo(o.getName()); // 오름차순
		//return o.getName().compareTo(this.name); // 내림차순
		
		//return Integer.compare(this.age, o.getAge());	//나이 오름차순
		return Integer.compare(o.getAge(), this.age);	//나이 내림차순
	}
	
	
	
}
