
public class Mode {
    public static void choice(String mode)
    {
        switch (mode)
        {
            default -> { incorrectVal(); }
            case "New" -> { newProduct(); }
            case "Show" -> {}
        }
    }
    private static void incorrectVal()
    {
        Print.ln("Incorrect value! Try again.");
        Menu.print();
        Mode.choice(Menu.getChoice());
    }
    private static void newProduct()
    {
        Print.ln("Type name: ");
        String name = Input.in();
        Print.ln("Type amount: ");
        long amount = Long.parseLong(Input.in());
        Print.ln("Type delivery day (DD MM YYYY)");
        int dD = Integer.parseInt(Input.in());
        int mD = Integer.parseInt(Input.in());
        int dY = Integer.parseInt(Input.in());
        int dE = Integer.parseInt(Input.in());
        int mE = Integer.parseInt(Input.in());
        int yE = Integer.parseInt(Input.in());
        Products newProduct = new Products(name, amount, dD, mD, dY, dE, mE, yE);
        Products.addToList(newProduct);
    }
    private static void show()
    {
        Products[] list = Products.getList();
        for (Products e : list)
        {
            Print.product(e);
        }
    }
}