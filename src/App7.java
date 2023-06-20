public class App7 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i == 6) {
                continue;
            }
            System.out.println(i);
        }

        /*jakaspetla: for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if(j == 6) {
                    break jakaspetla;
                }
                System.out.println("i: " + i + " j: " + j);
            }
        }*/
    }
}
