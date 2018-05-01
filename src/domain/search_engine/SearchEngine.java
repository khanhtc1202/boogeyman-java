package domain.search_engine;

import domain.ResultList;

public interface SearchEngine {
	
	public String getEngineName();
	
	public ResultList getResultList();
	
}
