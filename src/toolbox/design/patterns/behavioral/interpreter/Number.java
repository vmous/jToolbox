package toolbox.design.patterns.behavioral.interpreter;

import java.util.HashMap;

/**
 * Terminal expression. Implements an interpret operation associated with
 * terminal symbols in the grammar. An instance is required for every terminal
 * symbol in a sentence.
 * 
 * @author billy
 * 
 */
public class Number implements Expression {

    private final int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(HashMap<String, Expression> variables) {
        return number;
    }

}
