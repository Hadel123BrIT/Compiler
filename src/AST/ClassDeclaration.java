package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration extends Statement{
    String classes;
    String identifier;
    String lbrace;
    String rbrace;
    List<ClassBody> classBodies
            = new ArrayList<ClassBody>();

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getLbrace() {
        return lbrace;
    }

    public void setLbrace(String lbrace) {
        this.lbrace = lbrace;
    }

    public String getRbrace() {
        return rbrace;
    }

    public void setRbrace(String rbrace) {
        this.rbrace = rbrace;
    }

    public List<ClassBody> getClassBodies() {
        return classBodies;
    }

    public void setClassBodies(List<ClassBody> classBodies) {
        this.classBodies = classBodies;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClassDeclaration{\n");

        if (classes != null) {
            sb.append("classes='").append(classes).append("\n");
        }
        if (identifier != null) {
            sb.append("identifier='").append(identifier).append("\n");
        }
        if (lbrace != null) {
            sb.append("lbrace='").append(lbrace).append("\n");
        }
        if (rbrace != null) {
            sb.append("rbrace='").append(rbrace).append("\n");
        }
        if (classBodies != null && !classBodies.isEmpty()) {
            sb.append("classBodies=").append(classBodies).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
