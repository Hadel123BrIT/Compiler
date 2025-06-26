package AST;

public class ExportStatement extends ASTNode {
    String export;
VariableStatement variableStatement;
FunctionDeclaration functionDeclaration;
ClassDeclaration classDeclaration;

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }

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

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ExportStatement{\n");

        if (export != null) {
            sb.append("export='").append(export).append("\n");
        }

        if (variableStatement != null) {
            sb.append(", variableStatement=").append(variableStatement).append("\n");
        }

        if (functionDeclaration != null) {
            sb.append(", functionDeclaration=").append(functionDeclaration).append("\n");
        }

        if (classDeclaration != null) {
            sb.append(", classDeclaration=").append(classDeclaration).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
