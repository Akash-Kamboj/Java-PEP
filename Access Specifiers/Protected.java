class pro 
{
    protected void show()
    {
        System.out.println("This is Protected");

    }

    private void dis()
    {
        int a = 10;
        int b = 20;

        int sum = a+b;
        System.out.println("Sum is :"+sum);
    }
    
    
}
public class Protected 
{
    public static void main(String[] args)
    {
        pro p=new pro();
        p.show();
        
    }
    
}
