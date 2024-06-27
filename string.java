import java.util.*;
public class string
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = "Punjab Goa";
        String b = "Goa";
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(a.contains(b));
        System.out.println(a.stripTrailing());
    }
    
}
