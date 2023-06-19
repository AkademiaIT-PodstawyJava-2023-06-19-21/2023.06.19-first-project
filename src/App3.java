public class App3 {
    public static void main(String[] args) {
        int x = 5;
        int[] tablicaLiczb = new int[100];
        tablicaLiczb[0] = 10;
        tablicaLiczb[1] = 15;

        tablicaLiczb[2] = tablicaLiczb[1] + tablicaLiczb[0];
        System.out.println(tablicaLiczb[2]);

        int[][] tablica2D = new int[10][5];
        tablica2D[0][0] = 6;
        tablica2D[3][3] = 10;

        int[][][] tablica3D = new int[3][3][3];
        tablica3D[0][1][2] = 5;

        int[][] tab = tablica3D[0];

        System.out.println(tablicaLiczb[50]);
        System.out.println(tablicaLiczb[60]);
        System.out.println(tablicaLiczb[61]);

        String[] names = {"Mateusz", "Janusz", "Bogdan"};
        double[][] doubles = {
                {4.4, 6.7, 8.8},
                {3.3, 6.6, 8.8},
                {9.9, 5.5}
        };

        double[][] tab1 = new double[3][];
        tab1[0] = new double[3];
        tab1[0][0] = 4.4;
        tab1[0][1] = 6.7;
        tab1[0][2] = 8.8;

        tab1[1] = new double[3];
        tab1[1][0] = 3.3;
        tab1[1][1] = 6.6;
        tab1[1][2] = 8.8;

        tab1[2] = new double[2];
        tab1[2][0] = 9.9;
        tab1[2][1] = 5.5;

        int[] x1 = tablicaLiczb;
    }
}
