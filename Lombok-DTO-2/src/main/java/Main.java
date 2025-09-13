public class Main {
    public static void main(String[]args){
        Usuario u1 = Usuario.builder()
                .id(1)
                .nombre("Enzo Severino")
                .email("cangrejo14@gmail.com")
                .build();

        Usuario u2 = Usuario.builder()
                .id(2)
                .nombre("Jerónimo Zúñiga")
                .email("mastant912@gmail.com")
                .build();

        System.out.println(u1);
        System.out.println(u2);
    }
}
