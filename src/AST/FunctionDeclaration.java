package AST;

public class FunctionDeclaration {
    String identifier;
    String lparen;
    String rparen;
    ParameterList parameterList;
    Block block;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getLparen() {
        return lparen;
    }

    public void setLparen(String lparen) {
        this.lparen = lparen;
    }

    public String getRparen() {
        return rparen;
    }

    public void setRparen(String rparen) {
        this.rparen = rparen;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FunctionDeclaration{\n");

        if (identifier != null) {
            sb.append("identifier='").append(identifier).append("\n");
        }
        if (lparen != null) {
            sb.append("lparen='").append(lparen).append("\n");
        }
        if (rparen != null) {
            sb.append("rparen='").append(rparen).append("\n");
        }
        if (parameterList != null) {
            sb.append("parameterList=").append(parameterList).append("\n");
        }
        if (block != null) {
            sb.append("block=").append(block).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
