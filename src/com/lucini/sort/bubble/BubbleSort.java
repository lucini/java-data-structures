package com.lucini.sort.bubble;

public class BubbleSort {
    public static void main(String[] args) {

        int[] intArray = {10, -15, 8, 35, -11, 55, 12};

        for (int ultimoIndexNaoOrdenado = intArray.length -1; ultimoIndexNaoOrdenado > 0; ultimoIndexNaoOrdenado--) {
            for (int i = 0; i < ultimoIndexNaoOrdenado; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    trocar(intArray, i, i + 1);
                }
            }
        }

        // IMPRIMIR
        for (int i =0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


    }

    /**
     * SWAP
     * @param array
     * @param i
     * @param j
     */
    public static void trocar(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temporario = array[i];
        array[i] = array[j];
        array[j] = temporario;
    }
}
