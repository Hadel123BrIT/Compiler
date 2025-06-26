package AST;

public class Expression extends ASTNode {
    String lbrace;
    String rbrace;
    String identifier;
    Literal literal;
    PropertyBinding propertyBinding;
    TwoWayBinding twoWayBinding;
    NgDirective ngDirective;
    Expression expression;

    public String getLbrace() {
        return lbrace;
    }

    public void setLbrace(String lbrace) {
        this.lbrace = lbrace;
    }

    public String getRbrace() {
        return rbrace;
    }

    public void setRbrace(String rbrace) {
        this.rbrace = rbrace;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Literal getLiteral() {
        return literal;
    }

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }

    public PropertyBinding getPropertyBinding() {
        return propertyBinding;
    }

    public void setPropertyBinding(PropertyBinding propertyBinding) {
        this.propertyBinding = propertyBinding;
    }

    public TwoWayBinding getTwoWayBinding() {
        return twoWayBinding;
    }

    public void setTwoWayBinding(TwoWayBinding twoWayBinding) {
        this.twoWayBinding = twoWayBinding;
    }

    public NgDirective getNgDirective() {
        return ngDirective;
    }

    public void setNgDirective(NgDirective ngDirective) {
        this.ngDirective = ngDirective;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Expression{");

        if (identifier != null) {
            sb.append("identifier='").append(identifier).append('\'');
        }

        if (literal != null) {
            sb.append(", literal=").append(literal);
        }

        if (propertyBinding != null) {
            sb.append(", propertyBinding=").append(propertyBinding);
        }

        if (twoWayBinding != null) {
            sb.append(", twoWayBinding=").append(twoWayBinding);
        }

        if (ngDirective != null) {
            sb.append(", ngDirective=").append(ngDirective);
        }

        if (expression != null) {
            sb.append(", expression=").append(expression);
        }

        sb.append("}");
        return sb.toString();
    }

}
