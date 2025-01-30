package currencyconversion;
import java.util.*;
public class currency {

     double inr, usd;
     double euro, yen;
     Scanner in = new Scanner(System.in);
     public void dollartorupee(){
        System.out.println("Enter dollars to convert into Rupees");
        usd = in.nextInt();
        inr = usd*67;
        System.out.println("Dollar = " + usd + "equal to INR = " + inr);
     }

     public void rupeetodollar(){
        System.out.println("Enter Rupee to convert into Dollar");
        usd = in.nextInt();
        usd = inr/67;
        System.out.println("Dollar = " + usd + "equal to INR = " + inr);
     }

     public void eurotorupee(){
        System.out.println("Enter Euro to convert into Rupee");
        usd = in.nextInt();
        inr = euro*79.50;
        System.out.println("Eeuro = " + euro + "equal to INR = " + inr);
     }


     public void rupeetoeuro(){
        System.out.println("Enter Rupee to convert into Euro");
        usd = in.nextInt();
        euro = (inr/79.50);
        System.out.println("Rupee = " + euro + "equal to Euro = " + euro);
     }


     public void yentorupee(){
      System.out.println("Enter Yen to convert into Rupees");
      yen = in.nextInt();
      euro = yen*0.61;
      System.out.println("Yen = " + yen + "equal to INR = " + inr);
   }

   public void rupeetoyen(){
      System.out.println("Enter Rupee to convert into Yen");
      inr = in.nextInt();
      yen = (inr/0.61);
      System.out.println("INR = " + inr + "equal to Yen = " + yen);
   }


}