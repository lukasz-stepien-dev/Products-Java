import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Print {
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");

    public static void menu() {
        System.out.println("----------------------------------");
        System.out.println("\"New\" - create new product");
        System.out.println("\"Edit\" - edit a product");
        System.out.println("\"Show\" - show all products");
        System.out.println("----------------------------------");
    }
    public static <T> void out (T x) {
        System.out.print(x);
    }
    public static void out(LocalDate x) {
        System.out.print(formatter.format(x));
    }
    public static <T> void ln(T x) {
        System.out.println(x);
    }
    public static void ln(LocalDate x) {
        System.out.println(formatter.format(x));
    }
}
