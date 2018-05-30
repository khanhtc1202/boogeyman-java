package infrastructure.service;

import domain.ResultItem;
import domain.ResultList;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class GoogleSpider implements Spider{

    private final String GoogleBaseUrl = "https://www.google.com/search?q=";
    private ResultList resultList = new ResultList();

    @Override
    public ResultList fetchResultList(String keyword) {
        try {
            Connection connection = Jsoup.connect(GoogleBaseUrl+keyword);
            Document htmlDocument = connection.get();
            Elements items = htmlDocument.getElementsByClass("rc");
            for(Element item : items){
                ResultItem resultItem = new ResultItem();
                resultItem.setTiltle(item.selectFirst("a").text());
                resultItem.setUrl(item.selectFirst("a").attr("href"));
                resultItem.setDescription(item.getElementsByClass("st").get(0).text());
                resultItem.setSearchEngine("google");
                resultList.add(resultItem);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error in out HTTP request");
        }

        return resultList;
    }
}
