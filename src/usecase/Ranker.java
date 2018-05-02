package usecase;

import java.util.ArrayList;

import domain.ResultItem;
import domain.ResultList;

public class Ranker {
		
	public ResultList getTopList(ResultList[] resultLists) {
		ResultList rankedResultList = new ResultList();
		for(ResultList rl : resultLists) {
			rankedResultList.add(rl.getTopResultItem());
		}
		rankedResultList.removeDuplicate();
		return rankedResultList;
	}
	
	public ResultList getCrossList(ResultList[] resultLists) {
		ArrayList<ResultItem> resultList = null;
		for(ResultList rl : resultLists) {
			System.out.println(rl.getResultList().size());
			if(resultList == null) {
				resultList = rl.getResultList();
				System.out.println(resultList.size());
			}else {
				resultList.retainAll(rl.getResultList());
				System.out.println(resultList.size()+"aaaaaaa");
			}
		}
		ResultList rankedResultList = new ResultList(resultList);
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
