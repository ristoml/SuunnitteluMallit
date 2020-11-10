import java.util.List;

public class StrategyOne implements ListConverter {
    
    public String listToString(List l) {
        String palautettava = "";
        for (Object o: l) {
            palautettava+=o.toString()+"\n";
        }
        return palautettava;

    }
}
