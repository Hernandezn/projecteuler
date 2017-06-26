package euler._2002;

import static dev.utils.Algorithms.*;

public class Problem0008{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      int[]nums = new int[13];
      String numString = "731671765313306249192251196744265747423553491949349698"+
         "3520312774506326239578318016984801869478851843858615607891129494954"+
         "5950173795833195285320880551112540698747158523863050715693290963295"+
         "2274430435576689664895044524452316173185640309871112172238311362229"+
         "8934233803081353362766142828064444866452387493035890729629049156044"+
         "0772390713810515859307960866701724271218839987979087922749219016997"+
         "2088809377665727333001053367881220235421809751254540594752243525849"+
         "0771167055601360483958644670632441572215539753697817977846174064955"+
         "1492908625693219784686224828397224137565705605749026140797296865241"+
         "4535100474821663704844031998900088952434506585412275886668811642717"+
         "1479924442928230863465674813919123162824586178664583591245665294765"+
         "4568284891288314260769004224219022671055626321111109370544217506941"+
         "6589604080719840385096245544436298123098787992724428490918884580156"+
         "1660979191338754992005240636899125607176060588611646710940507754100"+
         "2256983155200055935729725716362695618826704282524836008232575304207"+
         "52963450";
      int[]digits = new int[numString.length()];
      long result = 0;
      for(int i = numString.length()-1; i>=0; i--)
         digits[i] = Integer.parseInt(numString.charAt(i)+"");
      
   loop:for(int i = digits.length; i>=13; i--){
         int limit = i-13;
         long prod = digits[i-1];
         
         if(prod == 0)
            continue loop;
         else for(int j = i-2; j>=limit; j--){
            if(digits[j] == 0)
               continue loop;
            else
               prod *= digits[j];
         }
         
         if(prod > result)
            result = prod;
      }
      
      System.out.println("Result: "+result);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 23514624000
// Run time: 4 ms