package beans;

public class Producer {
	private int id;
	private String itemName;
	private String releaseDate;
	
	public Producer() {
		// TODO Auto-generated constructor stub
	
	}


	
	public Producer(int id, String itemname, String releaseDate) {
		super();
		this.id = id;
		this.itemName = itemname;
		this.releaseDate = releaseDate;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemname) {
		this.itemName = itemname;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	
}