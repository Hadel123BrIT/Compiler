package AST;

public class ComponentDefinition extends ASTNode {
    Decorator decorator;
    Block block;

    public Decorator getDecorator() {
        return decorator;
    }

    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ComponentDefinition{\n");

        if (decorator != null) {
            sb.append("  decorator=").append(decorator).append(",\n");
        }
        if (block != null) {
            sb.append("  block=").append(block).append(",\n");
        }

        // إزالة الفاصلة الزائدة والسطر الجديد الأخير
        if (sb.lastIndexOf(",\n") == sb.length() - 2) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("}");
        return sb.toString();
    }

}
