package AST;

public class PElement {
    String htmlTagOpen;
    String htmlTagClose;
    String htmlTagEnd;
    String pTag;
    HtmlContent htmlContent;
    PAttributes pAttributes;

    public String getHtmlTagOpen() {
        return htmlTagOpen;
    }

    public void setHtmlTagOpen(String htmlTagOpen) {
        this.htmlTagOpen = htmlTagOpen;
    }

    public String getHtmlTagClose() {
        return htmlTagClose;
    }

    public void setHtmlTagClose(String htmlTagClose) {
        this.htmlTagClose = htmlTagClose;
    }

    public String getHtmlTagEnd() {
        return htmlTagEnd;
    }

    public void setHtmlTagEnd(String htmlTagEnd) {
        this.htmlTagEnd = htmlTagEnd;
    }

    public String getpTag() {
        return pTag;
    }

    public void setpTag(String pTag) {
        this.pTag = pTag;
    }

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public PAttributes getpAttributes() {
        return pAttributes;
    }

    public void setpAttributes(PAttributes pAttributes) {
        this.pAttributes = pAttributes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PElement{\n");

        if (htmlTagOpen != null) {
            sb.append("  htmlTagOpen='").append(htmlTagOpen).append("',\n");
        }
        if (htmlTagClose != null) {
            sb.append("  htmlTagClose='").append(htmlTagClose).append("',\n");
        }
        if (htmlTagEnd != null) {
            sb.append("  htmlTagEnd='").append(htmlTagEnd).append("',\n");
        }
        if (pTag != null) {
            sb.append("  pTag='").append(pTag).append("',\n");
        }
        if (htmlContent != null) {
            sb.append("  htmlContent=").append(htmlContent).append(",\n");
        }
        if (pAttributes != null) {
            sb.append("  pAttributes=").append(pAttributes).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
