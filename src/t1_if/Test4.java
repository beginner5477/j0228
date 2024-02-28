package t1_if;

import java.util.Scanner;

//점수를 입력받아 학점을 구하시오
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		char res = 'A';
		System.out.print("점수를 입력하세요:");
		n1 = sc.nextInt();
		
		if(n1 >= 90)
			res = 'A';
		else if(n1 >= 80)
			res = 'B';
		else if(n1 >= 70)
			res = 'C';
		else if(n1 >= 60)
			res = 'D';
		else
			res = 'F';
		System.out.println("당신의 점수는 "+n1+"이고 학점은 "+res+"입니다.");
	}
}
