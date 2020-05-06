package Teacher;

import java.util.Random;

/*
 * 이름
 * 생명력
 * 몸무게
 * 키
 * 별의모래
 * 사탕
 */
public class PokeTeagher extends GameChar{
   String name;
   int state;
   public PokeTeagher() {
      super(5);
      String [] ability = {"생명력", "몸무게", "키", "별의모래", "사탕"};
      int [] data = {35, 4, 28, 18854, 38};
      
      for(int i=0;i<ability.length;i++)
         setFaculty(ability[i], data[i], i);
      state = 1;
   }
   public void BuildUp(String build) {
	   int[] buildRate = {90, 60, 20};
	   
	  /* if(state == 1) 
		   BuildUp(buildRate[0]);
		   else if(state == 2) BuildUp(buildRate[1]);
		   else if(state == 3) BuildUp(buildRate[2]);*/
	   if("좋은 진화 재료".equals(build))
		   BuildUp(buildRate[state-1]-10);//위 주석 코드 간소화
	   if("진화 재료".equals(build))
		   BuildUp(buildRate[state-1]-5);//위 주석 코드 간소화
	   
   }
   public void showAbility(){
      String [] strData;
      int [] intData;
      
      strData = super.getFacultyName();
      intData = super.getFacultyData();
      
      for(int i=0;i<strData.length;i++){
         System.out.println(strData[i] + " : " + intData[i]);
      }
   }
   private void BuildUp() {
      /*
       * 내부적인 강화 프로세스 적립
       * 강화 성공
       * - 생명령 : 3배
       * - 몸무게 : 1.5배
       * - 키 : 2배
       */
      
      int [] intData = getFacultyData();//값을 반환 받는게 아닌 연결되어 inData에 값을 바꾸면 호출된 값도 바
      intData[0] *= 3;
      intData[1] *= 1.5;
      intData[2] *= 2;
   }
   
   public void BuildUp(int buildRate) {
      Random r = new Random();
      int probability = r.nextInt(100);
      
      if(probability < buildRate) {
         System.out.println("강화에 성공하였습니다.");
         BuildUp();
         showAbility();
      }else
         System.out.println("강화에 실패하였습니다.");
   }
}













