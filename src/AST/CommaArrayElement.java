package AST;

public class CommaArrayElement {
String comma;
ArrayElement arrayElement;

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public ArrayElement getArrayElement() {
        return arrayElement;
    }

    public void setArrayElement(ArrayElement arrayElement) {
        this.arrayElement = arrayElement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CommaArrayElement{");

        if (comma != null) {
            sb.append("comma='").append(comma).append('\'').append(", ");
        }
        if (arrayElement != null) {
            sb.append("arrayElement=").append(arrayElement);
        }

        sb.append("}");
        return sb.toString();
    }

}
