package AST;

public class Literal
{
    String stringLiteral;
    String numberLiteral;
    String booleanLiteral;

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public String getNumberLiteral() {
        return numberLiteral;
    }

    public void setNumberLiteral(String numberLiteral) {
        this.numberLiteral = numberLiteral;
    }

    public String getBooleanLiteral() {
        return booleanLiteral;
    }

    public void setBooleanLiteral(String booleanLiteral) {
        this.booleanLiteral = booleanLiteral;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Literal{");

        if (stringLiteral != null) {
            sb.append("stringLiteral='").append(stringLiteral).append('\'');
        }

        if (numberLiteral != null) {
            sb.append("numberLiteral='").append(numberLiteral).append('\'');
        }

        if (booleanLiteral != null) {
            sb.append("booleanLiteral='").append(booleanLiteral).append('\'');
        }

        sb.append("}");
        return sb.toString();
    }

}
