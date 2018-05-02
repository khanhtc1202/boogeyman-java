package domain;

public class ResultItem {
	private String tiltle;
	private String description;
	private String url;
	private String searchEngine;
	
	public ResultItem(String tiltle, String description, String url, String searchEngine) {
		this.tiltle = tiltle;
		this.description = description;
		this.url = url;
		this.searchEngine = searchEngine;
	}
	
	public ResultItem() {
		String searchEngine = new String();
		String tiltle = new String();
		String description = new String();
		String url = new String();

		this.tiltle = tiltle;
		this.description = description;
		this.url = url;
		this.searchEngine = searchEngine;
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

	@Override
	public int hashCode() {
		return (this.tiltle.hashCode()+this.url.hashCode()+this.description.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ResultItem) {
			ResultItem temp = (ResultItem)obj;
			if(this.tiltle == temp.tiltle && this.url==temp.url && this.description == temp.description) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
