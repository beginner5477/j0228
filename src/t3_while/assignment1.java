package t3_while;
/*
   1번 : 1~100까지의 숫자중 2의 배수의 개수와 3의 배수의 개수와 5의 배수의 개수를 구하시오. 단, 중복되는 배수인 경우는 작은 숫자에 한번만 누적처리하시오.
	이때 2의 배수의 합과 3의 배수의 합을 더해서 5의 배수의 합을 뺀 결과도 마지막에 출력하시오.
 */
public class assignment1 {
	public static void main(String[] args) {
		int c2 = 0, c3 = 0, c5 = 0, i = 1;
		int tot2 = 0, tot3 = 0, tot5 =0;
		while(i <= 100)
		{
			if(i % 2 == 0)
				c2++;
			else if(i % 3 == 0)
				c3++;
			else if(i % 5 == 0)
				c5++;
			
			if(i % 2 == 0)
				tot2 += i;
			if(i % 3 == 0)
				tot3 += i;
			if(i % 5 == 0)
				tot5 += i;
			i++;
		}
		System.out.println("2의 배수 갯수 = " + c2 + ", 3의 배수 갯수 = " + c3 + ", 5의 배수 갯수 = " + c5);
		System.out.println("1부터 100까지중 2의 배수의 합 + 3의 배수의 합 - 5의 배수의합 = " + (tot2 + tot3 - tot5));
	}
}
