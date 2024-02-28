package t3_while;

public class Test9 {
	public static void main(String[] args) {
		int odd = 0, even = 0, sw = 0;
		int i = 0;
		while(i < 100)
		{
			i++;
			if(sw == 0)
			{
				odd += i;
				sw = 1;
			}
			else
			{
				even += i;
				sw = 0;
			}
		}
		System.out.println("1~100까지의 홀수합은 " + odd);
		System.out.println("1~100까지의 짝수합은 " + even);
		
		}
	}

