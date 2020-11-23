public class SpeakerClassAdapter extends Speaker implements SpeakerAdapter{

    @Override
    public Hertz get440Hertz() {        
        return getHertz();
    }

    @Override
    public Hertz get220Hertz() {        
        Hertz h = getHertz();        
        return convertHertz(h, 2);
    }

    @Override
    public Hertz get110Hertz() {
        Hertz h = getHertz(); 
        return convertHertz(h, 4);
    }

    private Hertz convertHertz(Hertz h, int i) {
        return new Hertz(h.getHertzs()/i);
    }


    
}
