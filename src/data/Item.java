package data;

public class Item {
	
	private String name ;
	private String id ;
	private String code ;
	private String barcode ;
	private double price ;
	private int lastImport ;
	private int todaySell ;
	private int currentStock ;
	
	public Item(String name, String id, String code, String barcode, float price, 
			int lastImport, int todaySell, int currentStock) {
		super();
		this.name = name;
		this.id = id;
		this.code = code;
		this.barcode = barcode;
		this.price = price;
		this.lastImport = lastImport;
		this.todaySell = todaySell;
		this.currentStock = lastImport-todaySell ;
	}
	
	public Item() {
		super() ;
		this.name = "default" ;
		this.id = "1111111111" ;
		this.code = "test-123" ;
		this.barcode = "0000000000000" ;
		this.price = 20 ;
		this.lastImport = 100 ;
		this.todaySell = 0 ;
		this.currentStock = 20 ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getLastImport() {
		return lastImport;
	}

	public void setLastImport(int lastImport) {
		this.lastImport = lastImport;
	}

	public int getTodaySell() {
		return todaySell;
	}

	public void setTodaySell(int todaySell) {
		this.todaySell = todaySell;
	}

	public int getCurrentStock() {
		return currentStock;
	}

	public void setCurrentStock(int currentStock) {
		this.currentStock = currentStock;
	}
	
	
	
}
