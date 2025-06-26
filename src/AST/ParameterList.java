package AST;
import java.util.ArrayList;
import java.util.List;


public class ParameterList extends ASTNode {
    String identifier;
    String colon;
    List<CommaParameterList> commaParameterLists = new ArrayList<CommaParameterList>();

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public List<CommaParameterList> getCommaParameterLists() {
        return commaParameterLists;
    }

    public void setCommaParameterLists(List<CommaParameterList> commaParameterLists) {
        this.commaParameterLists = commaParameterLists;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ParameterList{");

        if (identifier != null) {
            sb.append("identifier='").append(identifier).append("\n");
        }

        if (colon != null) {
            sb.append("colon='").append(colon).append("\n");
        }

        if (!commaParameterLists.isEmpty()) {
            sb.append("commaParameterLists=").append(commaParameterLists).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}


