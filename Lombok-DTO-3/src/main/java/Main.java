import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<ProductoDTO> listaDTO = new ArrayList<>();

        Producto p1 = new Producto(1,"Monitor",500.00,"Bill Gates");
        Producto p2 = new Producto(2,"Notebook",750.00,"Enzo Severino");
        Producto p3 = new Producto(3,"Mouse",100.00,"Jerónimo Zúñiga");

        ProductoDTO dto1 = new ProductoDTO(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoDTO dto2 = new ProductoDTO(p2.getCodigo(), p2.getNombre(), p2.getPrecio());
        ProductoDTO dto3 = new ProductoDTO(p3.getCodigo(), p3.getNombre(), p3.getPrecio());

        listaDTO.add(dto1);
        listaDTO.add(dto2);
        listaDTO.add(dto3);

        for (ProductoDTO dto : listaDTO){
            System.out.println(dto);
        }
    }
}
