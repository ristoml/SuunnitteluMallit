public class App {
    public static void main(String[] args) throws Exception {
        SpeakerAdapter speakerAdapter = new SpeakerClassAdapter();
        Hertz h440 = speakerAdapter.get440Hertz();
        Hertz h220 = speakerAdapter.get220Hertz();
        Hertz h110 = speakerAdapter.get110Hertz();

        System.out.println(h440.getHertzs());
        System.out.println(h220.getHertzs());
        System.out.println(h110.getHertzs());
        

        
    }
    
}
