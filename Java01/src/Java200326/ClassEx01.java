package Java200326;

/*
 * Quiz
 * 컴퓨터 클래스를 만들고
 * main 클래스에서 사양을 출력하시오
 */

class car{

	String outColor;
	int wheel;
	int engine;
}
class ClassEx01 {
	public static void main(String[] args){
		car c = new car();
		
		c.outColor="red";
		c.wheel=17;
		c.engine=2000;
		System.out.println(c.outColor);
		
	}

}
