package AST;

public class AngularEvent {
    String clickEvent;
    String equal;
    String stringLiteral;

    public String getClickEvent() {
        return clickEvent;
    }

    public void setClickEvent(String clickEvent) {
        this.clickEvent = clickEvent;
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
        StringBuilder sb = new StringBuilder("AngularEvent{\n");

        if (clickEvent != null) {
            sb.append("  clickEvent='").append(clickEvent).append("\n");
        }
        if (equal != null) {
            sb.append("  equal='").append(equal).append("\n");
        }
        if (stringLiteral != null) {
            sb.append("  stringLiteral='").append(stringLiteral).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}


