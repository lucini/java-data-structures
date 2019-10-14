package com.lucini.sort;

/**
 *  Complexidade quadrática
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {10, -15, 8, 35, -11, 55, 12};

        for (int primeiroIndexNaoOrdenado = 1; primeiroIndexNaoOrdenado < intArray.length; primeiroIndexNaoOrdenado++) {
            int novoElemento = intArray[primeiroIndexNaoOrdenado];
            int i;

            for(i = primeiroIndexNaoOrdenado; i > 0 && intArray[i -1] > novoElemento; i--) {
                intArray[i] = intArray[i -1];
            }
            intArray[i] = novoElemento;
        }


        // IMPRIMIR
        for (int i =0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
