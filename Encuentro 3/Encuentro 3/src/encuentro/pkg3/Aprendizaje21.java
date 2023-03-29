/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg3;

/**
 *
 * @author Nico
 */
public class Aprendizaje21 {
    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
        int primerF,primerC;
        int n = 1;
        int count = 0;
        System.out.println("La matriz M es:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = n;
                n++;
                System.out.print("[" + matrizM[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("La matriz P es: ");
        int m = 45;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP[i][j] = m;
                m++;
                System.out.print("[" + matrizP[i][j] + "]");
            }
            m += 7;
            System.out.println("");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizP[0][0] == matrizM[i][j]) {
                    int x = i;
                    int y = j; 
                    for (int k = 0; k < 3; k++) {
                        y=j;
                        for (int l = 0; l < 3; l++) {
                            if (matrizP[k][l] == matrizM[x][y]) {
                                count++;
                            }
                            y++;
                        }
                       x++; 
                    }
                    primerF=x-3;
                    primerC=y-3;
                    System.out.println("El primer elemento de la submatrizP inicia en la fila " + primerF + " y la columna "+ primerC);
                }
                
            }
        }
        System.out.println("");              
        if (count==9) {
            System.out.println("La matrizP estÃ¡ contenida en la matrizM");
        }else{
            System.out.println("La matrizP NO estÃ¡ contenida en la matrizM");
        }
       
    }

}
