package t3_while;

//1~100까지의  홀수합
public class Test3 {
	public static void main(String[] args) {
		int i = 1, tot = 0;
		while(i < 100) {
			tot += i;
			i = i + 2;
		}
		System.out.println("1에서 100까지의 홀수합은 " + tot);
	}
}
