package AST;

public class AngularDirective {
    String ngFor;
    String ngIf;
    String equal;
    String stringLiteral;

    public String getNgFor() {
        return ngFor;
    }

    public void setNgFor(String ngFor) {
        this.ngFor = ngFor;
    }

    public String getNgIf() {
        return ngIf;
    }

    public void setNgIf(String ngIf) {
        this.ngIf = ngIf;
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
        StringBuilder sb = new StringBuilder("AngularDirective{\n");

        if (ngFor != null) {
            sb.append("  ngFor='").append(ngFor).append("\n");
        }
        if (ngIf != null) {
            sb.append("  ngIf='").append(ngIf).append("\n");
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

