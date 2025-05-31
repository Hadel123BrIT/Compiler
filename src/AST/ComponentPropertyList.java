package AST;

import java.util.ArrayList;
import java.util.List;

public class ComponentPropertyList {
    ComponentProperty componentProperty;
    String comma;
    List<CommaComponentProperty> commaComponentProperties = new ArrayList<CommaComponentProperty>();

    public ComponentProperty getComponentProperty() {
        return componentProperty;
    }

    public void setComponentProperty(ComponentProperty componentProperty) {
        this.componentProperty = componentProperty;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public List<CommaComponentProperty> getCommaComponentProperties() {
        return commaComponentProperties;
    }

    public void setCommaComponentProperties(List<CommaComponentProperty> commaComponentProperties) {
        this.commaComponentProperties = commaComponentProperties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ComponentPropertyList{\n");

        if (componentProperty != null) {
            sb.append("  componentProperty=").append(componentProperty).append(",\n");
        }
        if (comma != null) {
            sb.append("  comma='").append(comma).append("',\n");
        }
        if (commaComponentProperties != null && !commaComponentProperties.isEmpty()) {
            sb.append("  commaComponentProperties=").append(commaComponentProperties).append(",\n");
        }

        if (sb.lastIndexOf(",\n") == sb.length() - 2) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("}");
        return sb.toString();
    }

}
