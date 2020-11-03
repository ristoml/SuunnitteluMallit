import sun.rmi.log.LogOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getInstance();

        logger.addWord("words");
        logger.addWord("to");
        logger.addWord("be");
        logger.addWord("logged");

        logger.printLog();
    
    }
}
