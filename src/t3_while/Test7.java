package t3_while;

public class Test7 {
	public static void main(String[] args) {
		double i = 0;
		double tot = 0;
		int sign = 1;
		while(i < 9) {
			i++;
			sign = sign * -1;
			tot = tot + (i / (i + 1) * sign);
			}
		System.out.println(tot);
		
		}
	}

