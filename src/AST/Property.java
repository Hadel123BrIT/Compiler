package AST;

public class Property extends ASTNode {
    String identifier;
    String stringLiteral;
    String colon;
    Value value;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Property{ \n");

        if (identifier != null) {
            sb.append("identifier='").append(identifier).append("', ").append("\n");
        }
        if (stringLiteral != null) {
            sb.append("stringLiteral='").append(stringLiteral).append("', ").append("\n");
        }
        if (colon != null) {
            sb.append("colon='").append(colon).append("', ").append("\n");
        }
        if (value != null) {
            sb.append("value=").append(value).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
