class calc_sum
{
    public void Sum(int a, int b)
    {
        int sum = a + b;
        System.err.println("Result is "+sum);

    }
}
class Sum
{
    public static void main(String[] args) 
    {
        calc_sum obj = new calc_sum();
        obj.Sum(10,20);
        
    }
}
