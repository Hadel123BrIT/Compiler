package AST;

import java.util.ArrayList;
import java.util.List;

public class ImgElement extends ASTNode {
    String htmlTagOpen;
    String htmlTagClose;
    String identifier;
    List<ImgAttributes> imgAttributes=new ArrayList<ImgAttributes>();

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

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<ImgAttributes> getImgAttributes() {
        return imgAttributes;
    }

    public void setImgAttributes(List<ImgAttributes> imgAttributes) {
        this.imgAttributes = imgAttributes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ImgElement{\n");

        if (htmlTagOpen != null) {
            sb.append("  htmlTagOpen='").append(htmlTagOpen).append("',\n");
        }
        if (htmlTagClose != null) {
            sb.append("  htmlTagClose='").append(htmlTagClose).append("',\n");
        }
        if (identifier != null) {
            sb.append("  identifier='").append(identifier).append("',\n");
        }
        if (imgAttributes != null && !imgAttributes.isEmpty()) {
            sb.append("  imgAttributes=").append(imgAttributes).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}

