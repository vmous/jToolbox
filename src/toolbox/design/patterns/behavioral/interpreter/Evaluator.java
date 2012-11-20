package toolbox.design.patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * Context and client. Contains information that is global to the interpreter.
 * Builds an abstract syntax tree representing a particular sentence in the
 * language that the grammar defines. The abstract syntax tree is assembled from
 * instances of the non-terminal and terminal expression classes. It, also,
 * invokes the interpret operation.
 * 
 * @author billy
 * 
 */
public class Evaluator implements Expression {

    private final Expression syntaxTree;

    public Evaluator(String expression) {
        Stack<Expression> expressionStack = new Stack<Expression>();

        for (String token : expression.split(" "))
            if (token.equals("+")) {
                Expression subExpression = new Plus(expressionStack.pop(),
                        expressionStack.pop());
                expressionStack.push(subExpression);
            } else if (token.equals("-")) {
                // it's necessary remove first the right operand from the stack
                Expression right = expressionStack.pop();
                // ...and then the left one
                Expression left = expressionStack.pop();
                Expression subExpression = new Minus(left, right);
                expressionStack.push(subExpression);
            } else
                expressionStack.push(new Variable(token));

        syntaxTree = expressionStack.pop();
    }

    @Override
    public int interpret(HashMap<String, Expression> context) {
        return syntaxTree.interpret(context);
    }

}
