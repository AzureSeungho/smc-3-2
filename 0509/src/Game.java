import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.println("가위 바위 보!");
     String str = sc.next();
     int com = (int)(Math.random()*3);
     
	  if(com==0) {
		  System.out.println("가위");
	  }
	  else if(com==1) {
		  System.out.println("바위");
	  }
	  else if(com==2) {
		  System.out.println("보");
	  }
	  
	  if(str.equals("가위")) {
		  if(com==0) System.out.println("비겼다");
		  else if(com==1) System.out.println("졌다");
		  else if(com==2) System.out.println("이겼다");
	  }
	  else if(str.equals("바위")) {
		  if(com==0) System.out.println("이겼다");
		  else if(com==1) System.out.println("비겼다");
		  else if(com==2) System.out.println("졌다");
	  }
	  else if(str.equals("보")) {
		  if(com==0) System.out.println("졌다");
		  else if(com==1) System.out.println("이겼다");
		  else if(com==2) System.out.println("비겼다");
	  }
     	
	}
}