package AST;

import java.util.ArrayList;
import java.util.List;

public class Program  extends ASTNode{
    List<Statement>statements=new ArrayList<Statement>();

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "Program{ \n" +
                "statements=" + statements +
                '}';
    }
}
