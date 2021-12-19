import java.util.Scanner;
public class Main {
   public  static void main (String [] args){
        double derece;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Derece Giriniz:");
        derece=input.nextDouble();


       if (derece<5){
           System.out.println("Kayak yapmalısınız");

       } else if ( derece<=25){
           if (derece <= 15){
               System.out.println("Sinemaya gitmelisiniz");
            }
           if (derece >=10){
               System.out.println("Pikniğe gitmelisiniz");
           }
           }else{
           System.out.println("Yüzmeye gitmelisiniz");



       }




    }
}
