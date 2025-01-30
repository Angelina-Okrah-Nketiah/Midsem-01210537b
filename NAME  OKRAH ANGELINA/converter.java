import java.util.Scanner;

import currencyconversion.currency;
import distanceconversion.distance;
import timeconversion.timer;
 class converter {
    
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int choice, ch;
            currency c = new currency();
            distance d = new distance();
            timer t = new timer();

            do
            
               {System.out.println("1 .dollar to rupee");
                System.out.println("2 .rupee to dollar");
                System.out.println("3 .Euro to rupee");
                System.out.println("4 .rupee to euro");
                System.out.println("5 .Yen to rupee");
                System.out.println("6 .rupee to Yen");
                System.out.println("7 .Meter to kilometer");
                System.out.println("8 .Kilometer to meter");
                System.out.println("9 .Miles to Kilometer");
                System.out.println("10 .Kilometer to Miiles");
                System.out.println("11 .Hours to Minute");
                System.out.println("12 .Minute to Seconds");
                System.out.println("13 .Seconds to Hours");
                System.out.println("14 .Minutes to Hours");
                System.out.println("Enter Your Choice");
                choice = s.nextInt();
            
            
            switch(choice){
                case 1:
                {
                    c.dollartorupee();
                    break;
                }

                case 2:
                {
                    c.rupeetodollar();
                    break;
                }

                case 3:
                {
                    c.eurotorupee();
                    break;
                }

                case 4:
                {
                    c.rupeetoeuro();
                    break;
                }

                case 5:
                {
                    c.yentorupee();
                    break;
                }
                case 6:
                {
                    c.rupeetoyen();
                    break;
                }
                case 7:
                {
                    d.mtokm();
                    break;
                }
                case 8:
                {
                    d.kmtom();
                    break;
                }
                case 9:
                {
                    d.kmtom();
                    break;
                }
                case 10:
                {
                    d.kmtmiles();
                    break;
                }
                case 11:
                {
                    t.hourstominutes();
                    break;
                }
                case 12:
                {
                    t.hourstoseconds();
                    break;
                }
                case 13:
                {
                    t.secondstohours();
                    break;
                }

                case 14:
                {
                    t.minutestohours();
                    break;
                }

                
            }

            System.out.println("Enter 0 to quit and 1 to contine");
            ch = s.nextInt();
   }
   while(ch==1);
        }
        
    

    
}


}