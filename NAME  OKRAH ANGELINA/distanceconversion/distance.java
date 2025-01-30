package distanceconversion;
import java.util.Scanner;


public class distance {
    double km,m,miles;
    Scanner sc = new Scanner(System.in);
    public void kmtom(){

        System.out.print("Enter in km");
        km = sc.nextDouble();
        m = (km*1000);
        System.out.println(km +"km" + "equal to " + m + "metress");
    }

    public void mtokm(){
        System.out.print("Enter in Meter");
        m = sc.nextDouble();
        km = (km/1000);
        System.out.println(m + "m" + "equal to " + km + "kilometress");
    }

    public void milestokm(){
        System.out.print("Enter in Miles");
        miles = sc.nextDouble();
        km = (miles* 1.60934);
        System.out.println(miles + "miles" + "equal to " + km + "kilometress");
    }

    
    public void kmtmiles(){
        System.out.print("Enter in km");
        km = sc.nextDouble();
        miles = (km* 0.621371);
        System.out.println(km + "km" + "equal to " + miles + "miles");
    }
    
}
