import controller.Boogeyman;
import controller.CommandParser;
import domain.Command;
import domain.ResultItem;
import domain.ResultList;
import usecase.Ranker;

import java.util.ArrayList;

public class Main {
    
	
	public static void main(String[] args) {
        CommandParser commandParser = new CommandParser();
        Command command = commandParser.parseCommand(args);
        Boogeyman boogeyman = new Boogeyman();
        boogeyman.getResultListFromSearchEngine(command.getSearchEngines(),command.getKeyword());
        printToScreen(command,boogeyman.getResultLists());
    }

    private static void printToScreen(Command command, ArrayList<ResultList> resultLists) {
        Ranker ranker = new Ranker();
        ResultList resultList = new ResultList();
        System.out.print("Search from ");
        for (String engine : command.getSearchEngines()){
            System.out.print(" "+engine+" ");
        }
	    switch (command.getStrategy()){
            case "top":
                resultList = ranker.getTopList(resultLists);
                System.out.print("with top strategy");
                break;
            case "cross":
                resultList = ranker.getCrossList(resultLists);
                System.out.print("with cross strategy");
                break;
            default:
                resultList = ranker.getNoStrategyList(resultLists);
                System.out.print("with no strategy");
                break;
        }

        System.out.println();System.out.println();
        for (ResultItem item : resultList.getResultList()){
	        System.out.println("Tiltle: "+item.getTiltle());
	        System.out.println("Url: "+item.getUrl());
	        System.out.println("Description: "+item.getDescription());
	        System.out.println("------------------------------------------------------------------");
        }
        System.out.println("Found "+resultList.getResultList().size());
	}


}
