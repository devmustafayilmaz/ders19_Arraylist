package ders19_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C02_ArraylistSoruSet {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,2,3,4,5,6};
        //List.set(index , yeniDeger method'u istenen index teki eski degeri silip bize dondurur.
        //ve o index teki degeri verdiğimiz yeni deger olarak atar.


        List<Integer>sayilar = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar.set(0, 8));
        sayilar.set(1,9);
        System.out.println(sayilar);
    }
}
