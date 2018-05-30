package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ResultList {
	
	private ArrayList<ResultItem> resultList;
	
	public ResultList(ArrayList<ResultItem> resultList) {
		this.resultList = resultList;
	}
	
	public ResultList() {
		ArrayList<ResultItem> l = new ArrayList<ResultItem>();
		this.resultList = l;
	}

	public ArrayList<ResultItem> getResultList() {
		return resultList;
	}

	public void setResultList(ArrayList<ResultItem> resultList) {
		this.resultList = resultList;
	}

	public void add(ResultItem item) {
		resultList.add(item);
	}
	
	public ResultItem getTopResultItem() {
		return resultList.get(0);
	}
	
	public void removeDuplicate() {
		ArrayList<String> urlList = new ArrayList<>();
		ResultList list = new ResultList();
		for (ResultItem item : resultList){
			if(!urlList.contains(item.getUrl())){
				urlList.add(item.getUrl());
				list.add(item);
			}
		}
		resultList = list.getResultList();
	}

	public ResultList getDuplicate(){
		ArrayList<String> urlList = new ArrayList<>();
		ResultList list = new ResultList();
		for (ResultItem item : resultList){
			if(!urlList.contains(item.getUrl())){
				urlList.add(item.getUrl());
			}else {
				list.add(item);
			}
		}
		list.removeDuplicate();
		return list;
	}

	public void addAll(ResultList r) {
		resultList.addAll(r.resultList);
	}
	
}
