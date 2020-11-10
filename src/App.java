import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        final List<String> lista = new ArrayList<>();
        lista.add("eka");
        lista.add("toka");
        lista.add("kolmas");
        lista.add("neljäs");
        lista.add("viides");
        lista.add("kuudes");

        ListConverter listconverter1 = new StrategyOne();
        ListConverter listconverter2 = new StrategyTwo();
        ListConverter listconverter3 = new StrategyThree();

        System.out.println(listconverter1.listToString(lista));
        System.out.println(listconverter2.listToString(lista));
        System.out.println(listconverter3.listToString(lista));
            
        }

    }

