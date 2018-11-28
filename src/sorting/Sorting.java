/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author 345983704
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {8,6,1,3,4,9,15,2};
        int[] b = bubbleSort(a);
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
    
    public static int[] bubbleSort(int[] array) {
        int[] a = array;
        for(int i=1; i<a.length; i++) {
            boolean swapped = false;
            for (int j=0; j<a.length - i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return a;
            }
        }
        return a;
    }
    
    public static int[] insertionSort(int[] array) {
        int[] a = array;
        for (int i=1; i<a.length; i++) {
            int current = a[i];
            int j = i-1;
            while(j >= 0 && current < a[j]) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
        return a;
    }
    
}
