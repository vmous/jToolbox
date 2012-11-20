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
public class Variable implements Expression {

    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(HashMap<String, Expression> variables) {
        if (variables.get(name) == null)
            return 0;
        else
            return variables.get(name).interpret(variables);
    }

}
