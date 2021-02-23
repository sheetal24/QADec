package Addition;

public class Add {
    int a;
    int b;

    public void AddNumbers()
    {
        int c = a + b;
        System.out.println("Addition of 2 numbers is " +c);
    }

    public static void Main(String[] args)
    {
        Add add = new Add();
        add.AddNumbers();

    }
}
