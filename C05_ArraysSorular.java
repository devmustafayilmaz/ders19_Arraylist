package ders19_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_ArraysSorular {
    public static void main(String[] args) {
        //kullanicidan istediği kadar isim alip
        //Q ya bastiğinde girdiği isimleri bize list olarak dondurecek
        //bir method olusturun.
        System.out.println( ListeOlustur());

    }
    public static List<String> ListeOlustur(){

        List<String> isimler=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String girilenIsim="";
        while(!girilenIsim.equalsIgnoreCase("q")){
            System.out.println("lutfen listeye isim giriniz:");
            girilenIsim= scan.nextLine();
            if (!girilenIsim.equalsIgnoreCase("q")){
                isimler.add(girilenIsim);
            }
        }
        return isimler;
    }
}
