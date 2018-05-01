package usecase;

import domain.ResultList;

public class Ranker {
		
	public ResultList getTopList(ResultList[] resultLists) {
		ResultList rankedResultList = new ResultList();
		for(ResultList rl : resultLists) {
			rankedResultList.add(rl.getTopResultItem());
		}
		return rankedResultList;
	}
	
	public ResultList getCrossList(ResultList[] resultLists) {
		ResultList rankedResultList = new ResultList();
		for(ResultList rl : resultLists) {
			
		}
		return rankedResultList;

	}
	
	public ResultList getNoStrategyList(ResultList[] resultLists) {
		ResultList rankedResultList = new ResultList();
		for(ResultList rl:resultLists) {
			rankedResultList.addAll(rl);
		}
		rankedResultList.removeDuplicate();
		return rankedResultList;
	}
	
}
