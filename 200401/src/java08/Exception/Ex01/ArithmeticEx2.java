package java08.Exception.Ex01;

public class ArithmeticEx2 {
final int NUM = 100;
int result;

public void NoExceptionCase() {
	for(int i=0;i<10;i++) {
		try {
			
		//예외가 발생되는 코드
		result = NUM/(int)(Math.random()*10);
		}catch(ArithmeticException e) {
			//예외 발생 시 실행
			result = 0;
		}catch(Exception e) {
			//위 상황 이외의 모든 예외 처리 default
			e.printStackTrace();
		}finally {
			//예외와 관계 없이 무조건 처리
			System.out.println(result);
		}
		
	}
}
}
