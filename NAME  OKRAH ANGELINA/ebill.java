import java.util.*;

 class ebill {
    public static void main(String args[]){
        Customerdata ob = new Customerdata();
        ob.getdata();
        ob.calc();
        ob.display();
            
                }
                    
                }
                
                
                 class Customerdata {
                    Scanner in = new  Scanner(System.in);
                    Scanner ins = new Scanner(System.in);
                    String cname, type;
                    int bn;
                    double current, previous, tbill,units;




                    void getdata()
                    {
                        System.out.print("\n\t Enter customer number ");
                        bn = in.nextInt();
                        System.out.print("\n\t Enter type of connection (D for Demestic or C for Commercial)  ");
                        type = ins.nextLine();
                        System.out.print("\n\t Enter customer name ");
                        cname = ins.nextLine();
                        System.out.print("\n\t Enter previous month reading ");
                        previous = in.nextDouble();
                        System.out.print("\n\t Enter current month reading ");
                        current = in.nextDouble();
                
                    }
                     void calc() {
                      units = current-previous;
                      if(type.equals("D")){

                        if(units>=100)
                            tbill=1*units;

                        else if (units>=100 && units<=200)
                            tbill=2.50*units;
                        else if (units>=200 && units<=500)
                            tbill=4*units;
                        
                        else 
                            tbill=6*units;
                        

                      }
                      else {
                        
                        if(units>=100)
                            tbill=2*units;
                        else if (units>=100 && units<=200)
                            tbill=4.50*units;
                        else if (units>=200 && units<=500)
                            tbill=6*units;
                        
                        else 
                            tbill=7*units;
                      }
                    }
                  
                    void display() {
                        System.out.println("\n\t  customer number is " +bn);
                        System.out.println("\n\t customer name " +cname);
                        if (type.equals("D")) 
                            System.out.println("\n\t Type of connection = DOMESTIC ");
                        else 
                            System.out.println("\n\t Type of connection = Comercial ");
                            
                            System.out.println("\n\t Current Month Reading " +current);
                            System.out.println("\n\t Previose Month Reading " +previous);
                            System.out.println("\n\t Total units " +units);
                            System.out.println("\n\t Total bill = RS " +tbill);
                            
                            
                        
                        

                    }
                 }
                
                