package java08.Exception.Ex01;

public class ArithmeticEx01 {
final int NUM = 100;
int result;

public void NoExceptionCase() {
	for(int i=0;i<10;i++) {
		result = NUM/(int)(Math.random()*10);
		System.out.println(result);
	}
}
}
