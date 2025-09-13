import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<ProductoRecord> recordList = new ArrayList<>();

        Producto p1 = Producto.builder()
                .codigo("1")
                .nombre("Monitor")
                .precio(500.00)
                .proveedor("Enzo Severino")
                .build();
        Producto p2 = Producto.builder()
                .codigo("2")
                .nombre("Mouse")
                .precio(200.00)
                .proveedor("Jerónimo Zúñiga")
                .build();
        Producto p3 = Producto.builder()
                .codigo("3")
                .nombre("Notebook")
                .precio(700.00)
                .proveedor("Luca Bertaina")
                .build();

        ProductoRecord r1 = new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoRecord r2 = new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio());
        ProductoRecord r3 = new ProductoRecord(p3.getCodigo(), p3.getNombre(), p3.getPrecio());

        recordList.add(r1);
        recordList.add(r2);
        recordList.add(r3);

        for (ProductoRecord record : recordList){System.out.println(record);}
    }
}
