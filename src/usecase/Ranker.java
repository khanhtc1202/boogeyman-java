package usecase;

import java.util.ArrayList;

import domain.ResultItem;
import domain.ResultList;

public class Ranker {
		
	public ResultList getTopList(ArrayList<ResultList> resultLists) {
		ResultList rankedResultList = new ResultList();
		for(ResultList rl : resultLists) {
			rankedResultList.add(rl.getTopResultItem());
		}
		rankedResultList.removeDuplicate();
		return rankedResultList;
	}
	
	public ResultList getCrossList(ArrayList<ResultList> resultLists) {
		ResultList rankedResultList = new ResultList();
		for(ResultList rl:resultLists) {
			rankedResultList.addAll(rl);
		}
		return rankedResultList.getDuplicate();
	}
	
	public ResultList getNoStrategyList(ArrayList<ResultList> resultLists) {
		ResultList rankedResultList = new ResultList();
		for(ResultList rl:resultLists) {
			rankedResultList.addAll(rl);
		}
		rankedResultList.removeDuplicate();
		return rankedResultList;
	}
	
}
