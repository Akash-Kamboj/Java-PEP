public class Merg_2Array 
{
    public static void main(String[] args) 
    {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int[] b = {10,11,12,13,14,15,16,17,18,19};
        int[] c = new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                c[k]=a[i];
                i++;
                k++;
            }
            else
            {
                c[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length)
        {
            c[k]=a[i];
            i++;
            k++;
        }
    
        
    }
}
