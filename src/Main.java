import java.time.LocalDate;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        while (true)
        {
            Menu.print();
            Mode.choice(Input.in());
        }
    }
}