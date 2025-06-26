package AST;

import java.util.ArrayList;
import java.util.List;

public class DivAttributes extends ASTNode {
    List<AngularBinding> angularBindings=new ArrayList<AngularBinding>();
    List<AngularEvent> angularEvents=new ArrayList<AngularEvent>();
    List<AngularDirective> angularDirectives=new ArrayList<AngularDirective>();
    List<StyleAttribute> styleAttributes=new ArrayList<StyleAttribute>();

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DivAttributes{\n");

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
            sb.append("  styleAttributes=").append(styleAttributes).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
