package services;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckData;

/**
 *
 */
public class Interpreter {
    public void interpret (BrainFuckData data, BrainFuckCode code){
        while (code.getCurrentPosition() < code.getCode().length()){
            CommandFactory factory = new CommandFactory();
            int currentPositionInCode = code.getCurrentPosition();
            char currentCharInCode = code.getCode().charAt(currentPositionInCode);
            Command command = factory.getCommand(currentCharInCode);
            command.execute(data, code);
        }
    }
}
