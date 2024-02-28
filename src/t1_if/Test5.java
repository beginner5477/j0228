package t1_if;

import java.util.Scanner;

//직급 코드를 입력받아서 직급별 명칭을출력하시오
/*
 * 직급코드 1: 부장, 연봉 : 5백만
 * 직급코드 2: 과장, 연봉 : 4백
 * 직급코드 3: 대리, 연봉 : 3백
 * 직급코드 4: 사원, 연봉 : 2백
 * 
 * 시간외수당 : 25,000원으로 한다.
 * 공제액 : 연봉 * 0.1
 * 실수령액 : 연봉 + 시간외수당 - 공제액으로 한다
 */
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int code = 0, workHour, salary = 0, gong = 0;
		int sil = 0; 
		String position = "";
		
		System.out.println("직급코드 1:부장, 2:과장, 3:대리, 4:사원");
		System.out.print("직급 코드를 입력하쇼잉:");
		code = sc.nextInt();
		System.out.print("시간외 근무 시간 입력하쇼잉:");
		workHour = sc.nextInt();
		
		if(code == 1)
		{
			position = "부장";
			salary = 5000000;
		}
		else if(code == 2) 
		{
			position = "과장";
			salary = 4000000;
		}
		else if(code == 3) 
		{
			position = "대리";
			salary = 3000000;
		}
		else if(code == 4)
		{
			position = "사원";
			salary = 2000000;
		}
		else
		{
			position = "비사원";
		}
		gong = (salary + (25000 * workHour)) / 100 * 10;
		sil = salary + 25000 * workHour - gong;
		
		System.out.println("입력하신 코드는 "+code+" 이며 직급은 "+position+" 입니다");
		System.out.println("본봉은 " + salary + "원이고 " + "당신의 시간외근무시간은 " + workHour +"시간이고 " + "실수령액은 " + sil + "원입니다.");
	}
}
