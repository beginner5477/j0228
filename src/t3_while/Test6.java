package t3_while;


public class Test6 {
	public static void main(String[] args) {
		int i = 0, tot = 0;
		int sign = -1;
		while(i < 10) {
			i++;
			sign = sign * -1;
			tot += i * sign;
			}
		System.out.println("1-2+3-4+5-6+7-8+9-10 = " + tot);
	}
		
	}

