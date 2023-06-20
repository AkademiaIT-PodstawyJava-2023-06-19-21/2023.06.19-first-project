public class Zadanie1 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        for(int i = 0, value = 0; i < 10; i++, value += 2) {
            tab[i] = value;
        }

        for(int element : tab) {
            System.out.println(element);
        }
    }
}
