package t3_while;

//1~100까지의 10항씩의 합을 출력하시오
public class Test4 {
	public static void main(String[] args) {
		int i = 0, tot = 0;
		while(i < 100) {
			i++;
			tot += i;
			if(i % 10 == 0)
			{
				System.out.println("1에서 " + i + "까지의 합은 " + tot);
			}
		}
	}
}
