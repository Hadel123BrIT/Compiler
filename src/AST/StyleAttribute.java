package AST;

public class StyleAttribute {
    String style;
    String equal;
    String stringLiteral;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StyleAttribute{\n");

        if (style != null) {
            sb.append("  style='").append(style).append("',\n");
        }
        if (equal != null) {
            sb.append("  equal='").append(equal).append("',\n");
        }
        if (stringLiteral != null) {
            sb.append("  stringLiteral='").append(stringLiteral).append("'\n");
        }

        sb.append("}");
        return sb.toString();
    }

}

