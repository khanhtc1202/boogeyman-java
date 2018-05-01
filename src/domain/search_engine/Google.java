package domain.search_engine;

import domain.ResultList;

public class Google implements SearchEngine {

	@Override
	public String getEngineName() {
		return "Goolge";
	}

	@Override
	public ResultList getResultList() {
		return null;
	}

}
