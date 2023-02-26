import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
        ve bu sayıları ekrana yazan programı yazın.
         */

        int inputNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Sayı Gireceksiniz: ");
        inputNumber = input.nextInt();
        int number, maxNumber=0, minNumber=0;

        for(int i=1; i<=inputNumber; i++){
            System.out.print(i + ". Sayıyı Giriniz : ");
            number = input.nextInt();
            if(i==1){
                maxNumber = number;
                minNumber = number;
            }
            if(number>=maxNumber){
                maxNumber=number;
            }
            if(number<=minNumber){
                minNumber = number;
            }
        }
        System.out.println("Max Number : " + maxNumber);
        System.out.println("Min Number : " + minNumber);
    }
}