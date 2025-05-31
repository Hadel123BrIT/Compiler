package AST;

public class H2Element {
    String htmlTagOpen;
    String htmlTagClose;
    String htmlTagEnd;
    String h2Tag;
    HtmlAttributes htmlAttributes;
    HtmlContent htmlContent;

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

    public String getH2Tag() {
        return h2Tag;
    }

    public void setH2Tag(String h2Tag) {
        this.h2Tag = h2Tag;
    }

    public HtmlAttributes getHtmlAttributes() {
        return htmlAttributes;
    }

    public void setHtmlAttributes(HtmlAttributes htmlAttributes) {
        this.htmlAttributes = htmlAttributes;
    }

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("H2Element{\n");

        if (htmlTagOpen != null) {
            sb.append("  htmlTagOpen='").append(htmlTagOpen).append("',\n");
        }
        if (htmlTagClose != null) {
            sb.append("  htmlTagClose='").append(htmlTagClose).append("',\n");
        }
        if (htmlTagEnd != null) {
            sb.append("  htmlTagEnd='").append(htmlTagEnd).append("',\n");
        }
        if (h2Tag != null) {
            sb.append("  h2Tag='").append(h2Tag).append("',\n");
        }
        if (htmlAttributes != null) {
            sb.append("  htmlAttributes=").append(htmlAttributes).append(",\n");
        }
        if (htmlContent != null) {
            sb.append("  htmlContent=").append(htmlContent).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
