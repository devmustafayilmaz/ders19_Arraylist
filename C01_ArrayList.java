package ders19_Arraylist;


import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {
        List<Integer>sayilar1 = new ArrayList<>();

        sayilar1.add(10);
        sayilar1.add(20);
        System.out.println(sayilar1);
        sayilar1.add(1,15);
        System.out.println(sayilar1);
        sayilar1.add(0,44);
        System.out.println(sayilar1);
    }
}
