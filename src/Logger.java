import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static final Logger instance = new Logger();

    public List<String> log; 

    private Logger() {
        this.log = new ArrayList<>(); 
    }

    public static Logger getInstance() {
        return instance;
    }
    public void addWord(String word) {
        log.add(word);
    }   
    public void printLog() {
        for (String s: log) {
            System.out.println(s);
        }        
    }    
}
