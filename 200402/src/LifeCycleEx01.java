import javafx.application.Application;
import javafx.stage.Stage;

public class LifeCycleEx01 extends Application{
	public LifeCycleEx01() {
		System.out.println(Thread.currentThread().getName()+ ": Constructor()");
		
	}
@Override
public void init() throws Exception {
	// TODO Auto-generated method stub
	super.init();
	System.out.println(Thread.currentThread().getName()+ ": init()");
}
@Override
public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub
	System.out.println(Thread.currentThread().getName()+ ": start()");
	
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
