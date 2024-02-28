package t3_while;

import java.util.Scanner;

/*
   2번 : 두개의 숫자를 입력받아서 두개 숫자 사이에 값들을 모두 더하는 프로그램을 작성하되, 이때 5개항씩 그 결과를 출력시켜주시오.
   (마지막에 남은 값이 있으면 그합까지도 마지막에 출력할수 있어야함)
	여기서 두개의 숫자는 임의의 숫자를 입력할수 있기에 첫번째숫자가 더 큰 숫자가 먼저 입력될수도 있다.
 */
public class assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, temp, tot = 0, tot5 = 0, i = 0;
		System.out.print("첫번째 수를 입력해주세요:");
		n1 = sc.nextInt();
		System.out.print("두번째 수를 입력해주세요:");
		n2 = sc.nextInt();
		if(n1 > n2)
		{
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		temp = n1;
		while(n1 < n2)
		{
			tot += n1;
			n1++;
			i++;
			if(i % 5 == 0)
			{
				tot5 = tot - tot5;
				System.out.println((n1 - 5) + "부터 " + (n1 - 1) + "까지의 합은 " + tot5);
				tot5 = tot;
			}
			if(n1 == n2)
			{
				tot += n1;
			}
		}
		System.out.println(temp + "부터" + n2 + "까지의 합은 " + tot);
		sc.close();
	}
}
