/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;
import java.util.Random;

/**
 *
 * @author 345983704
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    
    static final Random rnd = new Random();
    
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[1000];
        int[] c = new int[10000];
        int[] d = new int[100000];
        int[][] ar = {a, b, c , d};
        populate(ar);
        
        
        System.out.println("Bubble Sort 10");
        test(a);
        System.out.println("Bubble Sort 1000");
        test(b);
        System.out.println("Bubble Sort 10000");
        test(c);
        System.out.println("Bubble Sort 100000");
        test(d);
        
        
    }
    
    public static void test(int[] ar) {
        long t = System.nanoTime();
        bubbleSort(ar);
        System.out.println("It took approximately " + ((System.nanoTime() - t) * 0.000000001) + " seconds.");
    }
    
    public static void populate(int[][] arrays) {
        for (int[] i : arrays) {
            for (int j=0; j<i.length; j++) {
                i[j] = rnd.nextInt(i.length);
            }
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
    
    public static int[] selectionSort(int[] array) {
        int[] a = array;
        for (int i=0; i<a.length; i++) {
            int min = i;
            for (int j=i+1; j<a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        return a;
    }
    
}
