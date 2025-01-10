
package java1;

public class NestedFor {
    
    public static void main(String[] args)
    {
        int i;
        
        for(i=1; i<=5; i++)
        {
            for(int j = 1; j <= i; j ++)
            {
                System.out.println(j);
            }
        }    
    }        
    
}
