import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfNumbers;
        ArrayList<Integer> Numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        numberOfNumbers = sc.nextInt();
        for (int i =1; i<(numberOfNumbers+1);i++){
            System.out.print(i + ". sayıyı giriniz: ");
            int a = sc.nextInt();
            Numbers.add(a);
        }
        System.out.println("En büyük sayı: " + Collections.max(Numbers));
        System.out.println("En küçük sayı: " + Collections.min(Numbers));
    }
}