package domain;

import java.util.ArrayList;

public class Command {
	private String keyword;
	private String strategy;
	private ArrayList<String> searchEngines;

	public Command(String keyword, String strategy, ArrayList<String> searchEngines) {
		this.keyword = keyword;
		this.strategy = strategy;
		this.searchEngines = searchEngines;
	}

	public Command() {
		String keyword = new String();
		String strategy = new String();
		ArrayList<String> searchEngines = new ArrayList<String>();
		this.keyword = keyword;
		this.strategy = strategy;
		this.searchEngines = searchEngines;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public ArrayList<String> getSearchEngines() {
		return searchEngines;
	}

	public void setSearchEngines(ArrayList<String> searchEngines) {
		this.searchEngines = searchEngines;
	}

	public void addEngine(String engine){
	    searchEngines.add(engine);
    }
	
}
