import java.util.HashMap;

public class SymbolTable {
    private HashMap<String, Integer> table;

    public SymbolTable() {
        table = new HashMap<>();
    }

    public void insert(String symbol, int value) {
        table.put(symbol, value);
    }

    public boolean contains(String symbol) {
        return table.containsKey(symbol);
    }

    public int getValue(String symbol) {
        return table.get(symbol);
    }

    public void remove(String symbol) {
        table.remove(symbol);
    }

    public void printTable() {
        for (String symbol : table.keySet()) {
            int value = table.get(symbol);
            System.out.println(symbol + ": " + value);
        }
    }

    public static void main(String[] args) {
        SymbolTable symbolTable = new SymbolTable();

        symbolTable.insert("x", 5);
        symbolTable.insert("y", 10);

        System.out.println("Symbol table contains x: " + symbolTable.contains("x"));
        System.out.println("Symbol table contains z: " + symbolTable.contains("z"));

        System.out.println("Value of x: " + symbolTable.getValue("x"));

        symbolTable.remove("x");

        symbolTable.printTable();
    }
}
