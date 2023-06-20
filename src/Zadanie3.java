import java.util.Arrays;
import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        Random losowacz = new Random();
        for(int i = 0; i < tab.length; i++) {
            tab[i] = losowacz.nextInt(1001);
            System.out.println(tab[i]);
        }

        int sum = 0;
        for(int element : tab) {
            sum += element;
        }
        double avg = ((double) sum) / ((double) tab.length);
        System.out.println(avg);
    }
}
