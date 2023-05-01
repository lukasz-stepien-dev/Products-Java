import java.time.LocalDate;
import java.util.Objects;

public class Products
{
    private static int id = 0;
    private String name;
    private long amount;
    private LocalDate deliveryDay;
    private LocalDate expirationDate;

    public Products(String n, long a, int dDelivery, int mDelivery, int yDelivery, int dExp, int mExp, int yExp)
    {
        Products.id += 1;
        Objects.requireNonNull(n, "Imie nie może być puste");
        this.name = n;
        this.amount = a;
        if (yDelivery == 0) {
            yDelivery = LocalDate.now().getYear();
        }
        if (yExp == 0) {
            yExp = LocalDate.now().getYear();
        }
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

        this.deliveryDay = deliveryDay;
    }
}
