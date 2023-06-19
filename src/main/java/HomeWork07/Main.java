package HomeWork07;

import HomeWork07.model.logger.FileLogger;
import HomeWork07.model.logger.LogCanCalculateFactory;
import HomeWork07.model.logger.Logger;
import HomeWork07.views.ConsoleView;

public class Main {
    public static void main(String[] args) {
        Logger logger = new FileLogger();
        LogCanCalculateFactory logCanCalculateFactory = new LogCanCalculateFactory(logger);
        ConsoleView consoleView = new ConsoleView(logCanCalculateFactory);
        consoleView.run();
    }
}
