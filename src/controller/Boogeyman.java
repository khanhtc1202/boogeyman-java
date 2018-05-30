package controller;

import domain.ResultList;
import infrastructure.service.AskSpider;
import infrastructure.service.BingSpider;
import infrastructure.service.GoogleSpider;

import java.util.ArrayList;

public class Boogeyman {
    private ArrayList<ResultList> resultLists = new ArrayList<ResultList>();

    public ArrayList<ResultList> getResultLists() {
        return resultLists;
    }

    public void getResultListFromSearchEngine(ArrayList<String> engines, String keyword){
        for(String engine : engines){
            switch (engine){
                case "google":
                    GoogleSpider spider1 = new GoogleSpider();
                    resultLists.add(spider1.fetchResultList(keyword));
                    break;
                case "bing":
                    BingSpider spider2 = new BingSpider();
                    resultLists.add(spider2.fetchResultList(keyword));
                    break;
                case "ask":
                    AskSpider spider3 = new AskSpider();
                    resultLists.add(spider3.fetchResultList(keyword));
                    break;
            }
        }
    }
}
