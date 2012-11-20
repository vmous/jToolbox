package toolbox.design.patterns.behavioral.interpreter;

import java.util.HashMap;

/**
 * Abstract expression. Declares an abstract interpret operation that is common
 * to all nodes in the abstract syntax tree. This example illustrates the
 * implementation of the following <em>Reverse Polish</em> notation grammar:
 * 
 * <pre>
 * expression ::= plus | minus | variable | number
 * plus ::= expression expression '+'
 * minus ::= expression expression '-'
 * variable  ::= 'a' | 'b' | 'c' | ... | 'z'
 * digit = '0' | '1' | ... '9'
 * number ::= digit | digit number
 * </pre>
 * 
 * which interprets a language which contains expressions like:
 * 
 * <pre>
 * a b +
 * a b c + -
 * a b + c a - -
 * </pre>
 * 
 * @author billy
 * 
 */
public interface Expression {

    public abstract int interpret(HashMap<String, Expression> variables);

}
