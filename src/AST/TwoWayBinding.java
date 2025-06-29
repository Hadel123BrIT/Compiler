package AST;

public class TwoWayBinding extends ASTNode {
    String equal;
    String stringLiteral;
    String towWayBinding;

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public String getTowWayBinding() {
        return towWayBinding;
    }

    public void setTowWayBinding(String towWayBinding) {
        this.towWayBinding = towWayBinding;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TwoWayBinding{\n");

        if (towWayBinding != null) {
            sb.append("towWayBinding='").append(towWayBinding).append('\n');
        }

        if (equal != null) {
            sb.append("equal='").append(equal).append('\n');
        }

        if (stringLiteral != null) {
            sb.append("stringLiteral='").append(stringLiteral).append('\n');
        }

        sb.append("}");
        return sb.toString();
    }

}
