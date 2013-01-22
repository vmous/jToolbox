package toolbox.design.patterns.behavioral.interpreter;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;

import junit.framework.TestCase;

/**
 * Unit test for the Interpreter behavioral design pattern.
 *
 * @author billy
 */
public class InterpreterTest extends TestCase {

    private Evaluator sentence;

    private HashMap<String,Expression> variables;

    /**
     * @throws java.lang.Exception
     */
    @Override
    @Before
    public void setUp() throws Exception {
        // 3 - 4 + 5
        String expression = "w x - z +";
        this.sentence = new Evaluator(expression);
        variables = new HashMap<String,Expression>();
        variables.put("w", new Number(3));
        variables.put("x", new Number(-4));
        variables.put("z", new Number(5));
        int result = sentence.interpret(variables);
        System.out.println(result);
    }

    /**
     * @throws java.lang.Exception
     */
    @Override
    @After
    public void tearDown() throws Exception {
    }

    public void testIt() {
        assertEquals(4, sentence.interpret(variables));
    }

}
