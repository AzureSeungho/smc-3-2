import java.util.*;
public class GradeExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		Grade me = new Grade();
		
		me.math = a;
		
		me.science = b;
		
		me.english = c;
		
		System.out.println("평균은 " + me.average());

	}

}

class Grade{
	int math;
	int science;
	int english;
	public int average() {
		return (math+science+english)/3;
	}
}
