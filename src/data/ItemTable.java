package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ItemTable {
	
	private final TableView<Item> tableView ;
	private final ObservableList<Item> data ;
	
	public ItemTable() {
		this.tableView = new TableView<Item>() ;
		this.data = FXCollections.observableArrayList() ;
	}
	
	public void setTableProperty() {
		tableView.setEditable(true);
		tableView.setFixedCellSize(32.0);
		
		TableColumn<Item, String> idCol = new TableColumn<Item, String>("ID");
		idCol.setMinWidth(150);
		idCol.setCellValueFactory(new PropertyValueFactory<Item, String>("id"));
        idCol.setReorderable(false);
        idCol.setSortable(false);
        
		TableColumn<Item, String> codeCol = new TableColumn<Item, String>("CODE");
		codeCol.setMinWidth(150);
		codeCol.setCellValueFactory(new PropertyValueFactory<Item, String>("code"));
		codeCol.setReorderable(false);
        codeCol.setSortable(false);
        
		TableColumn<Item, String> nameCol = new TableColumn<Item, String>("NAME");
		nameCol.setMinWidth(150);
		nameCol.setCellValueFactory(new PropertyValueFactory<Item, String>("name"));
        nameCol.setReorderable(false);
        nameCol.setSortable(false);
        
		TableColumn<Item, String> barcodeCol = new TableColumn<Item, String>("BARCODE");
		barcodeCol.setMinWidth(150);
		barcodeCol.setCellValueFactory(new PropertyValueFactory<Item, String>("barcode"));
		barcodeCol.setReorderable(false);
		barcodeCol.setSortable(false);
        
		TableColumn<Item, Double> priceCol = new TableColumn<Item, Double>("PRICE");
		priceCol.setMinWidth(150);
		priceCol.setCellValueFactory(new PropertyValueFactory<Item, Double>("price"));
        priceCol.setReorderable(false);
        priceCol.setSortable(false);
        
		TableColumn<Item, Integer> todaySellCol = new TableColumn<Item, Integer>("TODAY SELL");
		todaySellCol.setMinWidth(150);
		todaySellCol.setCellValueFactory(new PropertyValueFactory<Item, Integer>("todaySell"));
		todaySellCol.setReorderable(false);
		todaySellCol.setSortable(false);
        
        tableView.setItems(data) ;
        tableView.getColumns().addAll(idCol,codeCol,nameCol,barcodeCol,priceCol,todaySellCol) ;
        
        this.readCSV();
		
	}
	
	public void readCSV() {
		int counter = 0 ;
		try (BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\User\\napat_workspace\\Visart\\item.csv"))) {

		    // CSV file delimiter
		    String DELIMITER = ",";

		    // read the file line by line
		    String line;
		    while ((line = br.readLine()) != null) {

		        // convert line into columns
		        String[] columns = line.split(DELIMITER);
		        if (counter != 0) {
		        	System.out.println(line);
		        	data.add(new Item(columns)) ;
		        }
		        counter += 1 ;
		    }

		} catch (IOException ex) {
		    ex.printStackTrace();
		}
	}
	
	

	public TableView<Item> getTableView() {
		return tableView;
	}

	public ObservableList<Item> getData() {
		return data;
	}
	
}
