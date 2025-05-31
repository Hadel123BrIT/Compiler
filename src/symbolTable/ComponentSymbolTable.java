package symbolTable;
// Symbol table implementation
import symbolTable.symbols.*;

import java.util.HashMap;
import java.util.Map;

public class ComponentSymbolTable {
    private Map<String, ComponentSymbol> components = new HashMap<>();

    public void addComponent(String name, ComponentSymbol symbol) {
        components.put(name, symbol);
    }

    public void checkComponentExists(String name, int line) {
        if (!components.containsKey(name)) {
            throw new SemanticError("Undefined component: " + name, line);
        }
    }

    public Map<String, ComponentSymbol> getComponents() {
        return components;
    }
}
