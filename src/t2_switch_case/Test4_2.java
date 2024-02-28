package t2_switch_case;

import java.util.Scanner;

//점수를 입력받아 학점을 구하시오
public class Test4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		char res = 'A';
		System.out.print("점수를 입력하세요:");
		n1 = sc.nextInt();
		
		switch(n1 / 10)
		{
			case 10:
			case 9:
				res = 'A';
				break;
			case 8:
				res = 'B';
				break;
			case 7:
				res = 'C';
				break;
			case 6:
				res = 'D';
				break;
			default:
				res = 'F';
		}
		System.out.println("당신의 점수는 "+n1+"이고 학점은 "+res+"입니다.");
	}
}
