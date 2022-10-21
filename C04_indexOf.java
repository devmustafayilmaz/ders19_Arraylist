package ders19_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C04_indexOf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 4, 5, 6};


        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println(sayilar.indexOf(2));
        System.out.println(sayilar.indexOf(5));
        System.out.println(sayilar.lastIndexOf(6));
    }
}