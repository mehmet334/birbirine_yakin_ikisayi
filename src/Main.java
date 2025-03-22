import java.util.Random;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    // 10 adet benzersiz ve pozitif içeren listeyi random olarak belirleme

        Set<Integer> sayilar = new HashSet<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            while (sayilar.size()<10){
                int sayi = rand.nextInt(1000);
                sayilar.add(sayi);
            }
        }
        //En yakın iki sayıyı bulma
        List<Integer> sayiliste = new ArrayList<>(sayilar);
        Collections.sort(sayiliste);

        int mindeger = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;
        for (int i = 0; i < 9; i++) {
            int fark=sayiliste.get(i+1)-sayiliste.get(i);
            if (fark<mindeger){
                mindeger=fark;
                num1=sayiliste.get(i);
                num2=sayiliste.get(i+1);
            }

        }
        System.out.println("Belirlenen sayılar: " + sayiliste);
        System.out.println("En yakın iki sayı: "+ num1+ " ve " + num2);
    }
}