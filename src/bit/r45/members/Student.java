package bit.r45.members;

public class Student {
	
	
	//필드
	int age;
	int color;
	
	//메서드
	public void run() {
		int x = 1;
		int y = 2;
		int result = x + y;
		System.out.println(x + "+" + y + "=" + result);
		System.out.println("Student Age: " + this.age);
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
