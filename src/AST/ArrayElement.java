package AST;

public class ArrayElement extends ASTNode{
    Object object;
    Value value;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ArrayElement{");

        if (object != null) {
            sb.append("object=").append(object).append(", ");
        }
        if (value != null) {
            sb.append("value=").append(value);
        }

        sb.append("}");
        return sb.toString();
    }

}
