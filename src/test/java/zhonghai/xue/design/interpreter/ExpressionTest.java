package zhonghai.xue.design.interpreter;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.behavior.interpreter.AndExpression;
import zhonghai.xue.design.behavior.interpreter.Expression;
import zhonghai.xue.design.behavior.interpreter.OrExpression;
import zhonghai.xue.design.behavior.interpreter.TerminalExpression;

public class ExpressionTest {

    public  Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }


    public Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    @Test
    public void test1(){
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
