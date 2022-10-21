package ders19_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C03_remove {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 4, 5, 6};


        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        sayilar.remove(2);
        System.out.println(sayilar);
        /*
        listemiz integerlardan oluşuyorsa biz integer bir deger yazdiğimizda
        hep index kabul ettiğinde istediğimiz elemnti obje olarak girip sildirmek için önceden
        tanimlamamız gerekir.

         */
        Integer silinecekObje=4;
        sayilar.remove(silinecekObje);
        System.out.println(sayilar);
        // tum ucleri sildirin

         silinecekObje=3;
         while(sayilar.contains(silinecekObje)){
             sayilar.remove(silinecekObje);
         }
        System.out.println(sayilar);








    }
}