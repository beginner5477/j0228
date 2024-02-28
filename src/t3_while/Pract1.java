package t3_while;

import java.util.Scanner;

//소수 판별기
public class Pract1 {
	public static void main(String[] args) {
		int n1, i = 1, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("판별할 자연수를 입력해주세요:");
		n1 = sc.nextInt();
		
		while(i <= n1)
		{
			
			
		if(n1 % i == 0)
		{
			c++;
			if(c > 2)
			{
				break;
			}
		}
			i++;
		}
		if(c > 2)
			System.out.println(n1 + "은 소수가 아닙니다.");
		else 
			System.out.println(n1 + "은 소수입니다.");
			
		
	}
}
