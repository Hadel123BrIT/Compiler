package AST;

public class Interpolation {
    String  propertyBinding;

    public String getPropertyBinding() {
        return propertyBinding;
    }

    public void setPropertyBinding(String propertyBinding) {
        this.propertyBinding = propertyBinding;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Interpolation{");

        if (propertyBinding != null) {
            sb.append("propertyBinding='").append(propertyBinding).append("'");
        }

        sb.append("}");
        return sb.toString();
    }

}
