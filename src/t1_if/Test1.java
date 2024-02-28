package t1_if;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, t;
		System.out.print("첫번째 수를 입력하세요:");
		n1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요:");
		n2 = sc.nextInt();
		System.out.println("입력된 수 n1:" + n1 + " n2: " + n2 );
		t = n1;
		n1 = n2;
		n2 = t;
		System.out.println("교환된 수 n1:" + n1 + " n2: " + n2 );
		sc.close();
	}
}
