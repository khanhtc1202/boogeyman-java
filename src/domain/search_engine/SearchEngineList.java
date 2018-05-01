package domain.search_engine;

import java.util.ArrayList;

public class SearchEngineList {
	private ArrayList<SearchEngine> searchEngineList;
	
	public void add(SearchEngine e) {
		searchEngineList.add(e);
	}

	public ArrayList<SearchEngine> getSearchEngineList() {
		return searchEngineList;
	}
	
}
