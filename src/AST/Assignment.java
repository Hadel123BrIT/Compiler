package AST;

public class Assignment {
    String identifier;
    String dot;
    String equal;
    Expression expression;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Assignment{\n");

        if (identifier != null) {
            sb.append("  identifier='").append(identifier).append("',\n");
        }
        if (dot != null) {
            sb.append("  dot='").append(dot).append("',\n");
        }
        if (equal != null) {
            sb.append("  equal='").append(equal).append("',\n");
        }
        if (expression != null) {
            sb.append("  expression=").append(expression).append(",\n");
        }

        // إزالة الفاصلة الزائدة والسطر الجديد الأخير
        if (sb.lastIndexOf(",\n") == sb.length() - 2) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("}");
        return sb.toString();
    }

}
