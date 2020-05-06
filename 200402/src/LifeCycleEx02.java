import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LifeCycleEx02 extends Application{
	Text txt;
	Scene scene;
	public LifeCycleEx02() {
txt = new Text(20, 70, "Infiscap World");
txt.setFont(new Font(35));

	}
	
@Override
public void init() throws Exception {
	// TODO Auto-generated method stub
	super.init();//fx Application에 있는 init에 접근
	scene = new Scene(new Group(txt), 400, 350);
	
}
@Override
public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub
	primaryStage.setTitle("LifeCycle");
	primaryStage.setScene(scene);
	primaryStage.show();
	
	
	
}
@Override
public void stop() throws Exception {
	// TODO Auto-generated method stub
	super.stop();
	System.out.println(Thread.currentThread().getName()+ ": stop()");
}
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName()+ ": main()");
	launch(args);
}
}
