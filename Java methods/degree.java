class A
{
    public void farren(float cal)
    {
        float f;
        f = cal * 9/5 + 32;
        System.out.println("Farenheit is " + f);
    }
}
class degree
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.farren(32);
        
    }
}