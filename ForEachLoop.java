
package java1;


public class ForEachLoop {
    
public static void main(String[] args)
{
    int[] arr = {2,6,4,9,0};
    
    for(int r : arr)
    {
        System.out.println(r);
    }
    
    char[] ch = {'r','e','h','a','n'};
    
    for(char c : ch)
    {
        System.out.println(c);
    }  
    
    boolean[] bln = {true,false,true,true};
    
    for(boolean boo : bln)
    {
        System.out.println(boo);
    } 
    
    String[] str = {"This","Is","A","String","Type","Array"};
    
    for(String st : str)
    {
        System.out.println(st);
    }    
    
}        
    
}
