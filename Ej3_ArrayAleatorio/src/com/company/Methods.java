package com.company;

import java.util.ArrayList;

/**
 * Clase para diseñar los métodos que permiten la organización del array.
 * @author Cristian Suárez Acosta.
 */
public class Methods {

    /**
     * Método para organizar el array por el método de la burbuja realizando
     * el proceso de recorrido del array y comparar los valores de la
     * posición anterior con la actual.
     * @param list Parámetro que recibir el array de tipo Integer.
     */
    public static void bubbleMethodList(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                Integer currentValue = list.get(j);
                Integer nextValue = list.get(j + 1);
                if (currentValue > nextValue) {
                    list.set(j, nextValue);
                    list.set(j + 1, currentValue);
                }
            }
        }
        System.out.println(list);
    } //Cierre del método bubbleMethodList

    /**
     * Método para organizar el array por el método de quickSortList.
     * @param unorderedList Parámetro que recibe el array con lo valores
     *                      aleatorios.
     * @param left Posición inicial del array.
     * @param right Posición final del array.
     */
    public static void quickSortList(
            ArrayList<Integer> unorderedList, int left, int right)
    {
        Integer pivot = unorderedList.get(left);
        int i = left;
        int j = right;
        Integer aux;

        while (i < j) {

            while (unorderedList.get(i) <= pivot && i < j) {
                i++;
            }
            while (unorderedList.get(j) > pivot) {
                j--;
            }
            if (i < j) {
                aux = unorderedList.get(i);
                unorderedList.set(i, unorderedList.get(j));
                unorderedList.set(j, aux);
            }
        } //Cierre del ciclo while.
        unorderedList.set(left, unorderedList.get(j));
        unorderedList.set(j, pivot);

        if(left <  j - 1){
            quickSortList(unorderedList, left, j - 1);
        }

        if(j + 1 <  right){
            quickSortList(unorderedList, j + 1, right);
        }
    } //Cierre del método quickSortList.
} //Cierre de la clase Methods.
