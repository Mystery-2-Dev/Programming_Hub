import java.util.*;
import java.util.Optional;
import java.util.Comparator;
  
class SteamMax {
  
 
    public static void main(String[] args)
    {
  
        // list of integers
        List<Integer> listNum = Arrays.asList(-7, 30, 44, 23, 19);

        // array of strings
        List<String> listStr = Arrays.asList("hack", "hacktoberfest2021", "digitalocean",
                           "appwrite");
  
        Integer maxNum = listNum.stream().max(Integer::compare).get();


        OptionalInt maxStr = listStr.stream().mapToInt(String::length).max();

        System.out.println("The maximum Number is : "+maxNum);    

        if (maxStr.isPresent()) {
            System.out.println("The maximum length of Strings is : "+maxStr.getAsInt());
        }                           
    }
}
