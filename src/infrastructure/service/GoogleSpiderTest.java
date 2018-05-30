package infrastructure.service;

import domain.ResultItem;
import domain.ResultList;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GoogleSpiderTest extends GoogleSpider {

    @Test
    public void getResultList() {
        GoogleSpider spider = new GoogleSpider();
        ArrayList<ResultItem> rls = spider.fetchResultList("java").getResultList();
        for (ResultItem rl : rls){
            System.out.println("Tiltle: "+rl.getTiltle());
            System.out.println("URL: "+rl.getUrl());
            System.out.println("Description: "+rl.getDescription());
            System.out.println("Search Engine: "+rl.getSearchEngine());
            System.out.println("----------------------------------------------------------------------------------------------------------");
        }
    }
}