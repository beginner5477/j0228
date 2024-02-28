package t1_if;

import java.util.Scanner;

//3과목의 점수를 입력받아서 3과목의 평균이 60점이상이고, 각 과목당 40점이상이면 합격 그렇지 않으면 불합격
public class Test3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, avg = 0;
		String res = "";
		System.out.print("첫번째 과목의 점수:");
		n1 = sc.nextInt();
		System.out.print("두번째 과목의 점수:");
		n2 = sc.nextInt();
		System.out.print("세번째 과목의 점수:");
		n3 = sc.nextInt();
		
		avg = (n1 + n2 + n3) / 3;
		if(avg >= 60 && n1 >= 40 && n2 >= 40 && n3 >= 40)
		{
			res = "합격";
		}
		else {
			res = "불합격";
		}
		System.out.println("당신은 "+res+" 입니다");
	}
}
