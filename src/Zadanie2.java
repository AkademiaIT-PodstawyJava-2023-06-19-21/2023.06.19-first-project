public class Zadanie2 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        for(int i = 0; i < 100; i++) {
            tab[i] = i;
        }

        for(int liczba : tab) {
            if(liczba % 2 == 0 && liczba % 5 == 0) {
                System.out.println(liczba);
            }
        }
    }
}
