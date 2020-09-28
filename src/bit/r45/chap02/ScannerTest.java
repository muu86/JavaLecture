package bit.r45.chap02;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("이름을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요: ");
		Scanner sc2 = new Scanner(System.in);
		int age = sc2.nextInt();
		
		String str = "당신의 이름은 ";
		System.out.println(str + name + " " + age);

	}

}
