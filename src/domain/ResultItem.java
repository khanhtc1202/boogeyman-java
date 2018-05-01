package domain;

public class ResultItem {
	private String tiltle;
	private String description;
	private String url;
	
	public ResultItem(String tiltle, String description, String url) {
		this.tiltle = tiltle;
		this.description = description;
		this.url = url;
	}
	
	public String getTiltle() {
		return tiltle;
	}
	public void setTiltle(String tiltle) {
		this.tiltle = tiltle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
