package com.lucini.sort;

/**
 *  Complexidade quadrática
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] intArray = {10, -15, 8, 35, -11, 55, 12};

        for (int ultimoIndexNaoOrdenado = intArray.length -1; ultimoIndexNaoOrdenado > 0; ultimoIndexNaoOrdenado--) {
          int indexdoMaiorElemento = 0;

          for (int i = 1; i <= ultimoIndexNaoOrdenado; i++) {
              if(intArray[i] > indexdoMaiorElemento) {
                  indexdoMaiorElemento = i;
              }
          }

          trocar(intArray, indexdoMaiorElemento, ultimoIndexNaoOrdenado);
        }

        // IMPRIMIR
        for (int i =0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


    }

    /**
     * SWAP
     * @param array
     * @param indexAtual
     * @param proximoIndex
     */
    public static void trocar(int[] array, int indexAtual, int proximoIndex) {
        if (indexAtual == proximoIndex) {
            return;
        }

        int temporario = array[indexAtual];
        array[indexAtual] = array[proximoIndex];
        array[proximoIndex] = temporario;
    }
}
