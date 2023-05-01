import java.time.LocalDate;
import java.util.Objects;

public class Products
{
    private static int id = 0;
    private String name;
    private long amount;
    private LocalDate deliveryDay;
    private LocalDate expirationDate;

    private int checkYear(int y) {
        if (y == 0) {
            return LocalDate.now().getYear();
        }
        else {
            return y;
        }
    }

    public Products(String n, long a, int dDelivery, int mDelivery, int yDelivery, int dExp, int mExp, int yExp)
    {
        Products.id += 1;
        Objects.requireNonNull(n, "Imie nie może być puste");
        this.name = n;
        this.amount = a;
        yDelivery = checkYear(yDelivery);
        yExp = checkYear(yExp);
        this.deliveryDay = LocalDate.of(dDelivery, mDelivery, yDelivery);
        this.expirationDate = LocalDate.of(dExp, mExp, yExp);
    }



    public static int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public long getAmount() {
        return amount;
    }
    public LocalDate getDeliveryDay() {
        return deliveryDay;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setDeliveryDay(final int d, final int m, int y) {
        y = checkYear(y);
        this.deliveryDay = LocalDate.of(d, m, y);
    }

    public void setExpirationDate(final int d, final int m, int y) {
        y = checkYear(y);
        this.expirationDate = LocalDate.of(d, m, y);
    }
}
