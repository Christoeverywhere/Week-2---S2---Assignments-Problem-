```java
class InventoryParser {

    void parseInventoryRecord(String csvLine) {

        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println(
                "Product: " + fields[0] +
                " | SKU: " + fields[1] +
                " | Qty: " + fields[2]
            );
        }
    }
}

public class P3_InventoryParser {

    public static void main(String[] args) {

        InventoryParser parser = new InventoryParser();

        parser.parseInventoryRecord(
            "Wireless Mouse,WM-2201,150"
        );

        parser.parseInventoryRecord(
            "Wireless Mouse,150"
        );
    }
}
```

**Output:**

```text
Product: Wireless Mouse | SKU: WM-2201 | Qty: 150
Invalid Record
```
