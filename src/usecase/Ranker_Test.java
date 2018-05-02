package usecase;

import static org.junit.Assert.*;

import org.junit.Test;

import domain.ResultItem;
import domain.ResultList;

public class Ranker_Test {

	@Test
	public void testGetTopList() {
		ResultList list[] = initList();
		Ranker ranker = new Ranker();
		int i=ranker.getTopList(list).getResultList().size();
		assertEquals(2, i);
	}

	@Test
	public void testGetCrossList() {
		ResultList list[] = initList();
		Ranker ranker = new Ranker();
		int i=ranker.getCrossList(list).getResultList().size();	
		assertEquals(2, i);
	}

	@Test
	public void testGetNoStrategy() {
		ResultList list[] = initList();
		Ranker ranker = new Ranker();
		int i=ranker.getNoStrategyList(list).getResultList().size();	
		assertEquals(5, i);	}
	
	public ResultList[] initList() {
		ResultItem i1 = new ResultItem("til1", "des1", "url1","google");
		ResultItem i2 = new ResultItem("til2", "des2", "url2","google");
		ResultItem i3 = new ResultItem("til3", "des3", "url3","google");
		ResultItem i4 = new ResultItem("til4", "des4", "url4","google");
		ResultItem i5 = new ResultItem("til5", "des5", "url5","google");
		
		ResultList list1 = new ResultList();
		ResultList list2 = new ResultList();
		ResultList list3 = new ResultList();

		list1.add(i1);
		list1.add(i2);
		list1.add(i3);
		
		list2.add(i1);
		list2.add(i3);
		list2.add(i4);
		
		list3.add(i2);
		list3.add(i1);
		list3.add(i5);
		list3.add(i3);
		
		ResultList list[] = {list1, list2, list3};
		
		return list;
	}

}
