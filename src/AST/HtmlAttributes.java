package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlAttributes extends ASTNode {
    List<AngularBinding> angularBindings=new ArrayList<AngularBinding>();
    List<AngularEvent> angularEvents=new ArrayList<AngularEvent>();
    List<AngularDirective> angularDirectives=new ArrayList<AngularDirective>();
    List<StyleAttribute> styleAttributes=new ArrayList<StyleAttribute>();
    List<SrcAttribute> srcAttributes=new ArrayList<SrcAttribute>();
    List<AltAttribute> altAttributes=new ArrayList<AltAttribute>();
    List<String> stringLiterals=new ArrayList<String>();

    public List<AngularBinding> getAngularBindings() {
        return angularBindings;
    }

    public void setAngularBindings(List<AngularBinding> angularBindings) {
        this.angularBindings = angularBindings;
    }

    public List<AngularEvent> getAngularEvents() {
        return angularEvents;
    }

    public void setAngularEvents(List<AngularEvent> angularEvents) {
        this.angularEvents = angularEvents;
    }

    public List<AngularDirective> getAngularDirectives() {
        return angularDirectives;
    }

    public void setAngularDirectives(List<AngularDirective> angularDirectives) {
        this.angularDirectives = angularDirectives;
    }

    public List<StyleAttribute> getStyleAttributes() {
        return styleAttributes;
    }

    public void setStyleAttributes(List<StyleAttribute> styleAttributes) {
        this.styleAttributes = styleAttributes;
    }

    public List<SrcAttribute> getSrcAttributes() {
        return srcAttributes;
    }

    public void setSrcAttributes(List<SrcAttribute> srcAttributes) {
        this.srcAttributes = srcAttributes;
    }

    public List<AltAttribute> getAltAttributes() {
        return altAttributes;
    }

    public void setAltAttributes(List<AltAttribute> altAttributes) {
        this.altAttributes = altAttributes;
    }

    public List<String> getStringLiterals() {
        return stringLiterals;
    }

    public void setStringLiterals(List<String> stringLiterals) {
        this.stringLiterals = stringLiterals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HtmlAttributes{\n");

        if (!angularBindings.isEmpty()) {
            sb.append("  angularBindings=").append(angularBindings).append(",\n");
        }
        if (!angularEvents.isEmpty()) {
            sb.append("  angularEvents=").append(angularEvents).append(",\n");
        }
        if (!angularDirectives.isEmpty()) {
            sb.append("  angularDirectives=").append(angularDirectives).append(",\n");
        }
        if (!styleAttributes.isEmpty()) {
            sb.append("  styleAttributes=").append(styleAttributes).append(",\n");
        }
        if (!srcAttributes.isEmpty()) {
            sb.append("  srcAttributes=").append(srcAttributes).append(",\n");
        }
        if (!altAttributes.isEmpty()) {
            sb.append("  altAttributes=").append(altAttributes).append(",\n");
        }
        if (!stringLiterals.isEmpty()) {
            sb.append("  stringLiterals=").append(stringLiterals).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}

