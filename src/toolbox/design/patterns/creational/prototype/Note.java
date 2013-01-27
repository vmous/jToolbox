package toolbox.design.patterns.creational.prototype;

/**
 * Concrete prototype. Implements an operation for cloning itself (here we use
 * Java's build-in prototype interface <code>java.util.Cloneable</code>).
 *
 * @author billy
 *
 */
public class Note implements Cloneable {

    public static enum Helmholtz {
        C, D, E, F, G, A, B
    }

    public static enum Octave {
        SUB_SUB_CONTRA, SUB_CONTRA, CONTRA, GREAT, SMALL, ONE_LINED, TWO_LINED, THREE_LINED, FOUR_LINED, FIVE_LINED, SIX_LINED
    }

    public static enum Accidental {
        NONE, DOUBLE_SHARP, SHARP, FLAT, DOUBLE_FLAT
    }

    public static enum Value {
        DOUBLE, WHOLE, HALF, QUARTER, EIGHTH, SIXTEENTH, THIRTY_SECOND, SIXTY_FORTH, HANDRED_TWENTY_EIGHTH
    }

    private Helmholtz helmholtz;
    private Octave octave;
    private Accidental accidental;
    private Value value;

    public Note() {
        helmholtz = null;
        octave = null;
        accidental = null;
        value = null;
        System.out.println(getClass().getName()
                + " object successfully instantiated.");
    }

    @Override
    public Note clone() {
        Note obj = null;
        try {
            obj = (Note) super.clone();
            System.out.println(getClass().getName()
                    + " object successfully cloned.");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public void shapeNote(Helmholtz helmholtz, Octave octave,
            Accidental accidental, Value value) {
        this.helmholtz = helmholtz;
        this.octave = octave;
        this.accidental = accidental;
        this.value = value;
    }

    public String getDescription() {
        return "This is a(n) " + helmholtz.toString() + " "
                + accidental.toString() + " " + value.toString()
                + " note at the " + octave.toString() + " octave.";
    }
}
