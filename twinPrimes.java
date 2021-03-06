import java.io.*;  
import java.util.*;  
  
//create TwinPrimeNumbers class to check whether the numbers are twin prime or not  
class TwinPrimeNumbers {  
   
    // create checkPrimeNumber() method to check whether the number is prime or not  
    static boolean checkPrimeNumber(int number)  
    {  
        int i;  
        int m = 0;  
        int flag = 0;        
        m = number/2;        
        if(number == 0 || number == 1){    
            return false;        
        }else{    
            for(i = 2; i <= m ;i++){        
                if(number%i == 0){        
                    flag=1;        
                    return false;       
                }        
            }        
            if(flag == 0)    
            {   
                return true;  
            }    
        }  
        return false;  
    }  
   
    // create checkTwinPrimeNumber() to check whether the numbers are twin prime or not  
    static boolean checkTwinPrimeNumber(int number1, int number2)  
    {  
        if(checkPrimeNumber(number1) && checkPrimeNumber(number2) && Math.abs(number1 - number2) == 2)  
            return true;  
        else  
            return false;  
    }  
   
    /* Driver program to test above function */  
    public static void main(String[] args)  
    {  
         int number1, number2;  
          
        //create scanner class object to get input from user  
        Scanner sc = new Scanner(System.in);  
          
        //show custom message  
        System.out.println("Enter first number");  
          
        //store user entered value into variable n1  
        number1 = sc.nextInt();  
          
        //show custom message  
        System.out.println("Enter second number");  
          
        //store user entered value into variable n2  
        number2 = sc.nextInt();  
          
        if (checkTwinPrimeNumber(number1, number2))   
            System.out.println("("+number1 +", "+number2+ ") is a pair of twin primes");   
        else  
            System.out.println("("+number1 +", "+number2+ ") is not a pair of twin primes");   
          
    }  
}  
