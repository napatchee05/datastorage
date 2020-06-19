package data;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlPane extends VBox {
	
	private Button insight ;

	public ControlPane() {
		super() ;
		this.setPrefWidth(150);
		this.setAlignment(Pos.CENTER);
		insight = new Button("Insight") ;
		insight.setPadding(new Insets(5)); ;
		insight.setAlignment(Pos.CENTER);
		insight.setOnAction(e -> {
			Pane root = new Pane() ;
			Stage stage = new Stage() ;
			stage.setScene(new Scene(root)) ;
			stage.show();
		});
		
		this.getChildren().add(insight) ;
	}
	
}
