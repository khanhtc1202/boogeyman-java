package infrastructure.service;

import domain.ResultItem;
import domain.ResultList;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class BingSpider implements Spider {
    private String BingBaseUrl = "https://www.bing.com/search?q=";
    private ResultList resultList = new ResultList();

    @Override
    public ResultList fetchResultList(String keyword) {
        try {
            Connection connection = Jsoup.connect(BingBaseUrl+keyword);
            Document htmlDocument = connection.get();
            Elements items = htmlDocument.getElementsByClass("b_algo");
            for(Element item : items){
                ResultItem resultItem = new ResultItem();
                resultItem.setTiltle(item.selectFirst("a").text());
                resultItem.setSearchEngine("bing");
                resultItem.setUrl(item.selectFirst("a").attr("href"));
                resultItem.setDescription(item.select("p").text());
                resultList.add(resultItem);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error in out HTTP request");
        }

        return resultList;
    }
}
