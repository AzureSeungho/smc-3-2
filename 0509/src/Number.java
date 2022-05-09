import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		int i =0;

        System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지): ");

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int []arr=new int[10];
        
        for(i=0;i<10;i++) {
        	arr[i] = (int)(Math.random()*50+1);
        	System.out.print(arr[i] + " ");	
        }
        for(int j=0;j<10;j++) {
        	if(arr[j] == num) {
    			System.out.println("\n당첨 ! 일치하는 숫자가 있습니다.");
    			break;
    		}
    		else if(j == 9){
    			System.out.println("\n꽝 ! 다음 기회에~");
    			break;
    		}
        }
      
        sc.close();
        	
	}
}


