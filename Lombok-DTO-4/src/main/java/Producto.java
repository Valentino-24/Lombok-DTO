import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class Producto {
    private String codigo;
    private String nombre;
    private String proveedor;
    private double precio;
}
