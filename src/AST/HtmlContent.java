package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlContent {
    List<HtmlElement> htmlElements=new ArrayList<HtmlElement>();
    List<Interpolation> interpolations=new ArrayList<Interpolation>();
    List<AngularDirective> angularDirectives=new ArrayList<AngularDirective>();
    List<AngularEvent> angularEvents=new ArrayList<AngularEvent>();
    List<AngularBinding> angularBindings=new ArrayList<AngularBinding>();

    public List<HtmlElement> getHtmlElements() {
        return htmlElements;
    }

    public void setHtmlElements(List<HtmlElement> htmlElements) {
        this.htmlElements = htmlElements;
    }

    public List<Interpolation> getInterpolations() {
        return interpolations;
    }

    public void setInterpolations(List<Interpolation> interpolations) {
        this.interpolations = interpolations;
    }

    public List<AngularDirective> getAngularDirectives() {
        return angularDirectives;
    }

    public void setAngularDirectives(List<AngularDirective> angularDirectives) {
        this.angularDirectives = angularDirectives;
    }

    public List<AngularEvent> getAngularEvents() {
        return angularEvents;
    }

    public void setAngularEvents(List<AngularEvent> angularEvents) {
        this.angularEvents = angularEvents;
    }

    public List<AngularBinding> getAngularBindings() {
        return angularBindings;
    }

    public void setAngularBindings(List<AngularBinding> angularBindings) {
        this.angularBindings = angularBindings;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HtmlContent{\n");

        if (!htmlElements.isEmpty()) {
            sb.append("  htmlElements=").append(htmlElements).append(",\n");
        }
        if (!interpolations.isEmpty()) {
            sb.append("  interpolations=").append(interpolations).append(",\n");
        }
        if (!angularDirectives.isEmpty()) {
            sb.append("  angularDirectives=").append(angularDirectives).append(",\n");
        }
        if (!angularEvents.isEmpty()) {
            sb.append("  angularEvents=").append(angularEvents).append(",\n");
        }
        if (!angularBindings.isEmpty()) {
            sb.append("  angularBindings=").append(angularBindings).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}

