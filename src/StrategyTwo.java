import java.util.Iterator;
import java.util.List;

public class StrategyTwo implements ListConverter {    
    
    public String listToString(List l) {

        Iterator<Object> it = l.iterator();
        String palautettava = "";
        while (it.hasNext()) {
            palautettava+=it.next().toString()+ " "+ it.next().toString()+"\n";
        }
        return palautettava;

    }
}
