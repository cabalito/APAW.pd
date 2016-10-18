package es.upm.miw.pd.command.calculator;

import es.upm.miw.pd.command.calculator.Command.AddCommand;
import es.upm.miw.pd.command.calculator.Command.LoadCommand;
import es.upm.miw.pd.command.calculator.Command.PrintCommand;
import es.upm.miw.pd.command.calculator.Command.ResetCommand;
import es.upm.miw.pd.command.calculator.Command.SubtractCommand;
import upm.jbb.IO;

public class MainCalculator {
    private CommandManager commandManager;

    public MainCalculator() {
        Calculator calculator = new Calculator();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new SaveCommand(calculator));
        this.commandManager.add(new LoadCommand(calculator));
        
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculator());
    }
}
