package controller;

import domain.Command;

public class CommandParser {
	
	public Command parseCommand(String[] commandParam) {
		Command command = new Command();
		
		for(int i=0;i<commandParam.length-1;i++) {
			switch (commandParam[i]) {
			case "-s":
				command.setStrategy(commandParam[i+1]);
				break;
			case "-k":
				command.setKeyword(commandParam[i+1]);
				break;
			case "-e":
				command.addEngine(commandParam[i+1]);
				break;
			default:
				break;
			}
		}
		if(command.getSearchEngines().size()==0){
			command.addEngine("google");
			command.addEngine("bing");
			command.addEngine("ask");
		}
		return command;
	}
	
}
