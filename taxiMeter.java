import java.util.Scanner;
public class taxiMeter{
    public static void main(String[] args){
        int km;
        double perKM= 2.20, total, startPrice=10;
        
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write the distance using KM:");
        km= scanner.nextInt();
        total= (perKM*km);
        total+=startPrice;
        total= (total<20)? 20: total;
        System.out.println("Total Price:" + total);
        
        
        
    }
}