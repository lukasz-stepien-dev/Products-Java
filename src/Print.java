import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Print {
    public static void product(Products p)
    {
        Print.ln(p.getName());
        Print.ln(p.getAmount());
        Print.ln(p.getDeliveryDay());
        Print.ln(p.getExpirationDate());
    }
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
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
