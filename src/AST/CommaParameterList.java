package AST;

public class CommaParameterList {
    String comma;
    ParameterList parameterList;

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CommaParameterList{");

        if (comma != null) {
            sb.append("comma='").append(comma).append('\'');
        }

        if (parameterList != null) {
            sb.append("parameterList=").append(parameterList);
        }

        sb.append("}");
        return sb.toString();
    }

}
