package domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class ResultList_Test {

	@Test
	public void testRemoveDuplicate() {
		ResultList l = initNewList();
		l.removeDuplicate();
		assertEquals(3, l.getResultList().size());
	}

	@Test
	public void testAddAll() {
		ResultList l = initNewList();
		ResultList k = new ResultList();
		k.addAll(l);
		for(ResultItem i:k.getResultList()) {
			System.out.println(i.getTiltle()+i.getUrl()+i.getDescription());
		}
		assertEquals(l, k);
	}

	public ResultList initNewList() {
		ResultItem i1 = new ResultItem("til1", "des1", "url1","google");
		ResultItem i2 = new ResultItem("til2", "des2", "url2","google");
		ResultItem i3 = new ResultItem("til3", "des3", "url3","google");
		ResultItem i4 = new ResultItem("til1", "des1", "url1","google");
		ResultItem i5 = new ResultItem("til1", "des1", "url1","google");
		ResultList list = new ResultList();
		
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		list.add(i5);
		return list;

	}
	
}
