package AST;

public class CommaIdentifier {
    String comma;
    String identifier;

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CommaIdentifier{");

        if (comma != null) {
            sb.append("comma='").append(comma).append('\'');
        }

        if (identifier != null) {
            sb.append("identifier='").append(identifier).append('\'');
        }

        sb.append("}");
        return sb.toString();
    }

}
