package AST;

public class ComponentProperty extends ASTNode {
    String selector;
    String colon;
    String stringLiteral;
    String Template;
    String styles;
    String lbrace;
    String rbrace;
    String standalone;
    String True;
    String imports;
    Array array;
    Template template;

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public String getTemplate() {
        return Template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public void setTemplate(String template) {
        Template = template;
    }

    public String getStyles() {
        return styles;
    }

    public void setStyles(String styles) {
        this.styles = styles;
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

    public String getStandalone() {
        return standalone;
    }

    public void setStandalone(String standalone) {
        this.standalone = standalone;
    }

    public String getTrue() {
        return True;
    }

    public void setTrue(String aTrue) {
        True = aTrue;
    }

    public String getImports() {
        return imports;
    }

    public void setImports(String imports) {
        this.imports = imports;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ComponentProperty{\n");

        if (selector != null) {
            sb.append("  selector='").append(selector).append("',\n");
        }
        if (colon != null) {
            sb.append("  colon='").append(colon).append("',\n");
        }
        if (stringLiteral != null) {
            sb.append("  stringLiteral='").append(stringLiteral).append("',\n");
        }
        if (Template != null) {
            sb.append("  Template='").append(Template).append("',\n");
        }
        if (styles != null) {
            sb.append("  styles='").append(styles).append("',\n");
        }
        if (lbrace != null) {
            sb.append("  lbrace='").append(lbrace).append("',\n");
        }
        if (rbrace != null) {
            sb.append("  rbrace='").append(rbrace).append("',\n");
        }
        if (standalone != null) {
            sb.append("  standalone='").append(standalone).append("',\n");
        }
        if (True != null) {
            sb.append("  True='").append(True).append("',\n");
        }
        if (imports != null) {
            sb.append("  imports='").append(imports).append("',\n");
        }
        if (array != null) {
            sb.append("  array=").append(array).append(",\n");
        }
        if (template != null) {
            sb.append("  template=").append(template).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}


