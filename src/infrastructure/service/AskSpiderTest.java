package infrastructure.service;

import domain.ResultItem;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AskSpiderTest extends AskSpider {

    @Test
    public void fetchResultList() {
        AskSpider spider = new AskSpider();
        ArrayList<ResultItem> rls = spider.fetchResultList("java").getResultList();
        System.out.print(rls.size());
        for (ResultItem rl : rls){
            System.out.println("Tiltle: "+rl.getTiltle());
            System.out.println("URL: "+rl.getUrl());
            System.out.println("Description: "+rl.getDescription());
            System.out.println("Search Engine: "+rl.getSearchEngine());
            System.out.println("----------------------------------------------------------------------------------------------------------");
        }
    }
}