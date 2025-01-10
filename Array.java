
package java1;

public class Array {
    
public static void main(String[] args)
{
    String[] str = {"r","e","h","a","n"};
 
     System.out.println(str[2]);
     
     str[1] = "l";
     
     System.out.println(str[1]);
  
     System.out.println(str.length);
     
     for(int i=0;i<str.length;i++)//Loop Through An Array
     {
         System.out.println(str[i]);
     } 
     
     for(String st : str)//ForEach Loop
     {
         System.out.println(st);
     } 
     
     int[][] ary = {{1,2,3},{1,2}};
     
     System.out.println(ary[0][1]);
      System.out.println(ary[1][1]);

      ary[0][1]=4;
      System.out.println(ary[0][1]);
      
      ary[1][1]=7;
      System.out.println(ary[1][1]);
      
      for(int i=0;i<ary.length;i++)
      {
          for(int j=0;j<ary[i].length;j++)
          {
              System.out.println(ary[i][j]);
          }    
      }  
      for(int[] row : ary)
      {
          for(int u : row)
          {
              System.out.println(i);
          }    
      }
}        
    
}
