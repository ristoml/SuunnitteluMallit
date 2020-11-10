import java.util.List;

public class StrategyThree implements ListConverter {
    
    public String listToString(List l) {
        String palautettava = "";
        for (int i=0;i<l.size();i++) {
            if (i > 0 && i % 3 == 0) {
                palautettava += "\n";
            }
            palautettava+=l.get(i).toString()+ " ";
            
        }
        return palautettava;

    }
    
}
