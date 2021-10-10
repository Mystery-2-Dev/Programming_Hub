public class pattern3    
    
   public static void main(String[] args)     
   {    
       int size ;    
       size =6;    
       for (int i = size; i != 0; i--)     
       {    
           for (int j = 0; j<size-i; j++)    
           {    
               System.out.print(" ");    
           }    
           for (int k = 0; k < (2 * i - 1); k++)     
           {    
               System.out.print("*");    
           }    
           System.out.println();    
   }    
   }    
