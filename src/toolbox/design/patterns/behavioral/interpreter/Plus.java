package toolbox.design.patterns.behavioral.interpreter;

import java.util.HashMap;

/**
 * Non-terminal expression. One such class is required for every non-terminal
 * rule in the grammar:
 * <p>
 * <center>R ::= R<sub>1</sub>R<sub>2</sub>...R<sub>n</sub></center>
 * </p>
 * Maintains instance abstract expression variables for each of the symbols
 * R<sub>1</sub> through R<sub>n</sub> and implements an interpret operation
 * (usually in the form of recursive calls on the variables representing
 * R<sub>1</sub> through R<sub>n</sub>) for non-terminal symbols in the grammar.
 * 
 * @author billy
 * 
 */
public class Plus implements Expression {

    private final Expression left;
    private final Expression right;

    public Plus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(HashMap<String, Expression> variables) {
        return left.interpret(variables) + right.interpret(variables);
    }

}
