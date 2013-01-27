package toolbox.design.patterns.creational.prototype;

import java.util.Vector;

import static toolbox.design.patterns.creational.prototype.Note.Helmholtz;
import static toolbox.design.patterns.creational.prototype.Note.Octave;
import static toolbox.design.patterns.creational.prototype.Note.Accidental;
import static toolbox.design.patterns.creational.prototype.Note.Value;

/**
 * Client. Creates objects by asking the prototype to clone itself.
 *
 * @author billy
 *
 */
public class SheetMusic {

    public enum Clef {
        G, C, F
    }

    public enum Meter {
        FOUR_QUARTER, TWO_HALF, FOUR_HALF, TWO_QUARTER, THREE_QUARTER, THREE_EIGHTH, SIX_EIGHT, NINE_EIGHTH, TWELVE_EIGHTH
    }

    private final Clef clef;
    private final Meter meter;
    private final Vector<Note> staff;
    private final Note prototype;

    public SheetMusic(Clef clef, Meter meter) {
        this.clef = clef;
        this.meter = meter;
        staff = new Vector<Note>();
        prototype = new Note();
    }

    public void addNote(Helmholtz helmholtz, Octave octave,
            Accidental accidental, Value value) {
        Note note = prototype.clone();
        note.shapeNote(helmholtz, octave, accidental, value);
        staff.add(note);
    }

}
