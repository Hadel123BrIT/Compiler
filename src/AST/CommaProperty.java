package AST;

public class CommaProperty extends ASTNode {
    String comma;
    Property property;

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CommaProperty{");

        if (comma != null) {
            sb.append("comma='").append(comma).append("', ");
        }
        if (property != null) {
            sb.append("property=").append(property);
        }

        sb.append("}");
        return sb.toString();
    }

}
