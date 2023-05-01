public class Menu
{
    public static void print()
    {
        System.out.println("----------------------------------");
        System.out.println("\"New\" - create new product");
        System.out.println("\"Edit\" - edit a product");
        System.out.println("\"Show\" - show all products");
        System.out.println("----------------------------------");
    }
    public static String getChoice()
    {
        return Input.in();
    }
}
