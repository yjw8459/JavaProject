package ButtonQuiz02;

import java.awt.Canvas;
import java.util.HashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
   final String WARRIOR = "/img/warrior.png";
   final String ROGUE = "/img/Rogue.png";
   final String MAGI = "/img/magi.png";
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      launch(args);
   }

   @Override
   public void start(Stage primaryStage) throws Exception {
      // TODO Auto-generated method stub
	   Containor con = new Containor();
      StackPane stackPane = new StackPane();
      BorderPane mainBorder = new BorderPane();
      BorderPane leftBorder = new BorderPane();
      HBox   bottomHbox = new HBox();
      HBox hJobbox = new HBox(0);
      HBox hHairbox = new HBox();
      HBox hMotionbox = new HBox();
      VBox vbox = new VBox();
      AnchorPane centerAnchorPane = new AnchorPane();//위치를 드래그해서 지정할 수 있음
 
      Map<String, Pane> mapPane = new HashMap<String, Pane>();
      Map<String, ImageButton> map = new HashMap<String, ImageButton>();
      
      mapPane.put("pane0",con.canvas(0, 27));
      mapPane.put("pane2",con.canvas(0, 33));
      mapPane.put("pane4",con.canvas(0, 33));
      mapPane.put("pane6",con.canvas(0, 10));
      mapPane.put("topPane",con.canvas(0, 50));
      mapPane.put("leftpane",con.canvas(16, 0));
      
      map.put("warimgBtn" ,new ImageButton(WARRIOR,40,40));
      map.put("rogueImgBtn" ,new ImageButton(ROGUE,40,40));
      map.put("magiImgBtn" ,new ImageButton(MAGI,40,40));
      map.put("imgHairBtn" ,new ImageButton(WARRIOR,45,45));
      map.put("imgMotionBtn" ,new ImageButton(WARRIOR,45,45));
      
      

      
      hJobbox.getChildren().addAll(
    		  map.get("warimgBtn"), map.get("rogueImgBtn"), map.get("magiImgBtn"));            
      hHairbox.getChildren().add(imgHairBtn);     
      hMotionbox.getChildren().add(imgMotionBtn);
      
      
      
      vbox.getChildren().add(mapPane.get("pane0"));
      vbox.getChildren().add(hJobbox);
      vbox.getChildren().add(mapPane.get("pane2"));
      vbox.getChildren().add(hHairbox);
      vbox.getChildren().add(mapPane.get("pane4"));
      vbox.getChildren().add(hMotionbox);
      vbox.getChildren().add(mapPane.get("pane6"));
      
      
      leftBorder.setTop(mapPane.get("topPane"));
      leftBorder.setLeft(mapPane.get("leftPane"));
      leftBorder.setCenter(vbox);
      
      mainBorder.setLeft(leftBorder);
      mainBorder.setBottom(bottomHbox);
      mainBorder.setCenter(centerAnchorPane);
      
      
      stackPane.getChildren().addAll(new ImageView("/img/L2Char.png"),mainBorder);
         
      primaryStage.setScene(new Scene(stackPane));
      primaryStage.show();
   }

}