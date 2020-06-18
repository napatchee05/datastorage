package Application;

import data.Item;
import data.ItemTable;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[]args) {
		launch() ;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		ItemTable itemTable = new ItemTable() ;
		Pane root = new Pane() ;
		HBox grid = new HBox() ;
		root.getChildren().add(grid) ;
		Scene scene = new Scene(root) ;
		itemTable.getData().add(new Item()) ;
		for (int i = 0 ; i<50 ; i++) {
			itemTable.getData().add(new Item()) ;
		}
		TableView<Item> tb = itemTable.getTableView() ;
		itemTable.setTableProperty() ;
		grid.getChildren().add(tb) ;
		primaryStage.setScene(scene) ;
		primaryStage.show() ;
	}

}
