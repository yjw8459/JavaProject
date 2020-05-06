package GroupEx;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
//Circle클래스와 Rectangle클래스를 호출하는 클래스
public class Shape {


public Rectangle getRectangle(Color color,int x, int y, int width, int height) {
	Rectangle r = new Rectangle(width, height, color);
	r.relocate(x, y);
	
	return r;
	
}
public Circle getCircle(Color color, int x, int y, int r) {
	Circle c = new Circle(r, color);
	c.relocate(x, y);
	return c;
	
}
}
