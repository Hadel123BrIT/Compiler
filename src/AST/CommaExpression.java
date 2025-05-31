package AST;

public class CommaExpression {
    String comma;
    Expression expression;

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CommaExpression{");

        if (comma != null) {
            sb.append("comma='").append(comma).append('\'');
        }

        if (expression != null) {
            sb.append("expression=").append(expression);
        }

        sb.append("}");
        return sb.toString();
    }

}
