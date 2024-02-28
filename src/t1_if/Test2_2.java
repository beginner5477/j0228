package t1_if;

import java.util.Scanner;

//논리 연산자(!, &&, ||)
public class Test2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, max;
		System.out.println("첫번째 수를 입력하세요:");
		n1 = sc.nextInt();
		System.out.println("두번째 수를 입력하세요:");
		n2 = sc.nextInt();
		System.out.println("세번째 수를 입력하세요:");
		n3 = sc.nextInt();
		max = n1;
		if((n1 > n2) && (n1 > n3))
		{
			max = n1;
		}
		else if(n2 > n3)
		{
			max = n2;
		}
		else
		{
			max = n3;
		}
		System.out.println("수1:"+n1+", 수2:"+n2+", 수3:"+n3+", max: " + max);
	}
}
