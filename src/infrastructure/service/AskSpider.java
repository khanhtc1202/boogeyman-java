package infrastructure.service;

import domain.ResultItem;
import domain.ResultList;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class AskSpider implements Spider {

    private final String AskBaseUrl = "https://www.ask.com/web?q=";
    private ResultList resultList = new ResultList();

    @Override
    public ResultList fetchResultList(String keyword) {
        try {
            Connection connection = Jsoup.connect(AskBaseUrl+keyword);
            Document htmlDocument = connection.get();
            Elements items = htmlDocument.getElementsByClass("PartialSearchResults-item");
            for(Element item : items){
                ResultItem resultItem = new ResultItem();
                resultItem.setTiltle(item.selectFirst("a").text());
                resultItem.setUrl(item.selectFirst("a").attr("href"));
                resultItem.setSearchEngine("ask");
                resultItem.setDescription(item.getElementsByClass("PartialSearchResults-item-abstract").text());
                resultList.add(resultItem);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error in out HTTP request");
        }

        return resultList;
    }
}
