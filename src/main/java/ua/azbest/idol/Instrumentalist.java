package ua.azbest.idol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("kenny")
public class Instrumentalist implements Performer {

    //@Resource(lookup = "Jingle Bells")
    private String song;
    private Instrument instrument;

    public Instrumentalist() {
    }

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
