package pooguiaej10;

import java.util.Arrays;

public class POOGuiaEj10 {

    public static void main(String[] args) {

        double[] arrayA = new double[50];
        double[] arrayB = new double[20];

        // Asigno valores al array A
        for (int i = 0; i < 50; i++) {

            arrayA[i] = Math.random() * 10;

        }

        // Muestro el array
        for (int i = 0; i < 50; i++) {
            System.out.println("array A:" + arrayA[i]);
        }
        System.out.println("");

        // Ordenar el array de manera ascendente:
        Arrays.sort(arrayA);

        // mostrar array ordenado
        System.out.println("El array ordenado es: ");
        System.out.println("");
        //    + Arrays.toString(arrayA));

        for (int i = 0; i < 50; i++) {

            System.out.println(Arrays.toString(arrayA));
        }
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");

        // Asigno valores al array B
        for (int i = 0; i < 20; i++) {

            if (i < 10) {
                arrayB = arrayA;
                System.out.println("array B en posicion " + (i + 1) + ":  " + arrayB[i]);

            } else {
                //Arrays.fill(arreglo, int desde, int hasta, variable)
                Arrays.fill(arrayB, 10, 20, 0.5);
                System.out.println("array B en posicion " + (i + 1) + ":  " + arrayB[i]);
            }

        }

    }

}

//Clase Arrays
//10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.
