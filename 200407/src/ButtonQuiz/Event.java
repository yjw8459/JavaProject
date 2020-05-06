/*
 * package ButtonQuiz;
 * 이벤트 클래스로도 표현가능
 * import javafx.scene.control.Alert; import
 * javafx.scene.control.Alert.AlertType; import javafx.scene.control.Button;
 * 
 * public class Event { Component com; public Event(Component com) { this.com =
 * com; // TODO Auto-generated constructor stub } public void setOnAction(Button
 * btn) { btn.setOnAction(e->{ Alert alert = com.getAlert(
 * AlertType.INFORMATION,"경고","로그인시도","아직은 로그인할 수 없습니다."); alert.show(); }); }
 * 
 * }
 */