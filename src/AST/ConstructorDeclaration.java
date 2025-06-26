package AST;

public class ConstructorDeclaration extends ASTNode {
    String constructor;
    String lparen;
    String rparen;
    ParameterList parameterList;
    Block block;

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
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
        StringBuilder sb = new StringBuilder("ConstructorDeclaration{");

        if (constructor != null) {
            sb.append("constructor='").append(constructor).append('\'').append(", ");
        }
        if (lparen != null) {
            sb.append("lparen='").append(lparen).append('\'').append(", ");
        }
        if (rparen != null) {
            sb.append("rparen='").append(rparen).append('\'').append(", ");
        }
        if (parameterList != null) {
            sb.append("parameterList=").append(parameterList).append(", ");
        }
        if (block != null) {
            sb.append("block=").append(block);
        }

        sb.append("}");
        return sb.toString();
    }

}
