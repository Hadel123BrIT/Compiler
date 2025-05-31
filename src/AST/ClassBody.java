package AST;

public class ClassBody {
    VariableStatement variableStatement;
    FunctionDeclaration functionDeclaration;
    ConstructorDeclaration constructorDeclaration;

    public VariableStatement getVariableStatement() {
        return variableStatement;
    }

    public void setVariableStatement(VariableStatement variableStatement) {
        this.variableStatement = variableStatement;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public ConstructorDeclaration getConstructorDeclaration() {
        return constructorDeclaration;
    }

    public void setConstructorDeclaration(ConstructorDeclaration constructorDeclaration) {
        this.constructorDeclaration = constructorDeclaration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClassBody{");

        if (variableStatement != null) {
            sb.append("variableStatement=").append(variableStatement).append(", ");
        }
        if (functionDeclaration != null) {
            sb.append("functionDeclaration=").append(functionDeclaration).append(", ");
        }
        if (constructorDeclaration != null) {
            sb.append("constructorDeclaration=").append(constructorDeclaration);
        }

        sb.append("}");
        return sb.toString();
    }

}
