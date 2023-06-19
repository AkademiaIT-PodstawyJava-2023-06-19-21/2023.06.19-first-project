import java.util.function.BiFunction;

public class App4 {
    public static void main(String[] args) {
        int x = 5;

        /*if(x == 5) {
            System.out.println("To jest 5 !!!");
        } else if(x == 7) {
            System.out.println("To jest 7 !!!");
        } else if(x == 8) {
            System.out.println("To jest 8 !!!");
        } else {
            System.out.println("NIe wiadomo co to za liczba !!!");
        }*/

        switch(x) {
            case 5:
                System.out.println("To jest 5 !!");
                //x = x + 10;
            case 6:
                System.out.println("To jest 6 !!");
            case 7:
                System.out.println("To jest 7 !!");
            default:
                System.out.println("Nie wiem co to !!");
        }


        System.out.println("Ostatnia linia programu !!!");
    }
}
