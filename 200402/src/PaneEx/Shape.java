package PaneEx;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class Shape {
public Rectangle getRectangle(int x, int y, int width, int height,Color color) {
	Rectangle r = new Rectangle(); // Rectangle 클래스
	
	r.setFill(color);
	
	
		return r;
}

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
public Ellipse getEllipse(Color color, double centerX, double centerY, double radiusX, double radiusY) {
	Ellipse e = new Ellipse(); // 타원형을 만드는 메소드
	e.setCenterX(centerX);
	e.setCenterY(centerY);
	e.setRadiusX(radiusX);
	e.setRadiusY(radiusY);
	e.setFill(color);
	
	return e;
}

}
