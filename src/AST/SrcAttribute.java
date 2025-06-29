package AST;

public class SrcAttribute extends ASTNode {
    String src;
    String equal;
    AngularExpression angularExpression;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public AngularExpression getAngularExpression() {
        return angularExpression;
    }

    public void setAngularExpression(AngularExpression angularExpression) {
        this.angularExpression = angularExpression;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SrcAttribute{\n");

        if (src != null) {
            sb.append("  src='").append(src).append("',\n");
        }
        if (equal != null) {
            sb.append("  equal='").append(equal).append("',\n");
        }
        if (angularExpression != null) {
            sb.append("  angularExpression=").append(angularExpression).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
