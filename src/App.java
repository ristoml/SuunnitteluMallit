import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
         Image image2 = new ProxyImage("HiRes_10MB_Photo2");
         Image image3 = new ProxyImage("HiRes_10MB_Photo3");
         Image image4 = new ProxyImage("HiRes_10MB_Photo4");
         Image image5 = new ProxyImage("HiRes_10MB_Photo5");

         List<Image> kuvat = new ArrayList<>();
         kuvat.add(image1);
         kuvat.add(image2);
         kuvat.add(image3);
         kuvat.add(image4);
         kuvat.add(image5);
 
         // display filename only
         for (Image i : kuvat) {
             i.showData();
         }

         // real image is loaded and displayed
         for (Image i : kuvat) {
             i.displayImage();
         }
     }
}

