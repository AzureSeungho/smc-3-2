import java.util.*;
public class Scan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i =1;
		System.out.println("1000 이하의 자연수를 입력하세요. ");
		
		int a  = sc.nextInt();
		
		while(i<=a) {
			if(i%4==0) {
				System.out.println(i);
				sum +=i;
			}
			i++;
		}
		System.out.println("1~"+a+"까지 4의 배수의 합은 "+sum+"입니다.");
	}
}
