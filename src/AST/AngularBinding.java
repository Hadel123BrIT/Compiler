package AST;

public class AngularBinding extends ASTNode {
    String binding;
    String equal;
    String stringLiteral;
    AngularExpression angularExpression;

    public AngularExpression getAngularExpression() {
        return angularExpression;
    }

    public void setAngularExpression(AngularExpression angularExpression) {
        this.angularExpression = angularExpression;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AngularBinding{\n");

        if (binding != null) {
            sb.append("  binding='").append(binding).append("\n");
        }
        if (equal != null) {
            sb.append("  equal='").append(equal).append("\n");
        }
        if (stringLiteral != null) {
            sb.append("  stringLiteral='").append(stringLiteral).append("\n");
        }
        if (angularExpression != null) {
            sb.append("  angularExpression=").append(angularExpression).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
