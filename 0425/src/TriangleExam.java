public class TriangleExam {
	public static void main(String[] args) {
		Triangle t = new Triangle(10.2, 17.3);
		
		t.base = 10.2;
		t.height = 17.3;
		t.output();
		
		t.change();
		t.output();
	}

}

class Triangle{
	double height;
	double base;
	
	public Triangle(double b, double h) {
		this.height = h;
		this.base = b;
	}

	public void change(){
		base = (double) 7.5;
		height = (double) 9.2;
	}
	public void output() {
		System.out.println("가로 " + base + " 높이 " + height + "인 삼각형의 넓이는 " + base * height / 2 );
	}
}