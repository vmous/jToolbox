package toolbox.design.patterns.creational.prototype;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import toolbox.design.patterns.creational.prototype.Note.*;
import toolbox.design.patterns.creational.prototype.SheetMusic.*;

/**
 * Unit test for the Prototype creational design pattern.
 *
 * @author billy
 */
public class PrototypeTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Ignore
    @Test
    public void testIt() {
		SheetMusic score = new SheetMusic(Clef.G, Meter.FOUR_QUARTER);
		score.addNote(Helmholtz.C, Octave.ONE_LINED, Accidental.NONE, Value.WHOLE);
		score.addNote(Helmholtz.D, Octave.ONE_LINED, Accidental.NONE, Value.WHOLE);
		score.addNote(Helmholtz.E, Octave.ONE_LINED, Accidental.NONE, Value.WHOLE);
		score.addNote(Helmholtz.F, Octave.ONE_LINED, Accidental.NONE, Value.WHOLE);
		score.addNote(Helmholtz.G, Octave.ONE_LINED, Accidental.NONE, Value.WHOLE);
		score.addNote(Helmholtz.A, Octave.ONE_LINED, Accidental.NONE, Value.WHOLE);
		score.addNote(Helmholtz.B, Octave.ONE_LINED, Accidental.NONE, Value.WHOLE);

		score.addNote(Helmholtz.C, Octave.TWO_LINED, Accidental.NONE, Value.WHOLE);

		score.addNote(Helmholtz.B, Octave.ONE_LINED, Accidental.NONE, Value.WHOLE);
		score.addNote(Helmholtz.A, Octave.ONE_LINED, Accidental.NONE, Value.WHOLE);
		score.addNote(Helmholtz.G, Octave.ONE_LINED, Accidental.NONE, Value.WHOLE);
		score.addNote(Helmholtz.F, Octave.ONE_LINED, Accidental.NONE, Value.WHOLE);
		score.addNote(Helmholtz.E, Octave.ONE_LINED, Accidental.NONE, Value.WHOLE);
		score.addNote(Helmholtz.D, Octave.ONE_LINED, Accidental.NONE, Value.WHOLE);
		score.addNote(Helmholtz.C, Octave.ONE_LINED, Accidental.NONE, Value.WHOLE);
	}

}
