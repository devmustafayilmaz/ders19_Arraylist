package ders19_Arraylist;

import java.util.Scanner;

public class C06_FibonacciSorusu {
    public static void main(String[] args) {
        //kullanicidan pozitifi bir tamsayi alın
        //o tamsayidan kucuk fibonacci sayilarini bir liste
        //olarak kaydedin ve yazdirin.
        Scanner scan = new Scanner();
        System.out.println("pozitif bir tamsayi giriniz:");
        int girilenSayi=scan.nextInt();

        if (girilenSayi<0 ){
            System.out.println("Fibonacci serisi icin 0 'den buyuk tamsayi girmelisin..");
        }
        }else if (girilenSayi==0){
            System.out.println("0'dan kucuk fibonacci sayisi yoktur.");
        }

        }else if (girilenSayi==1){
            System.out.println("1'den kucuk tek fibonacci sayisi 0'dir.")
            
        }else {
            
                fibonacciSayilariniyazdir(girilenSayi);

        }


    }
      public static void fibonacciSayilariniyazdir(int girilenSayi){
          // buraya geldiyse girilen sayi 1'den buyuktur.
      
      List<Integer>fibonacciListesi= new ArrayList<>();
          fibonacciListesi.add(0);
          fibonacciListesi.add(1);
          fibonacciListesi.add(1);
          
          int yeniFibonacciSayisi=0;
          int index=3;// ilk 3 eleman 0 1 1 oldugu icin 3.index e geldik
          
          while(yeniFibonacciSayisi<girilenSayi){
          
            yeniFibonacciSayisi= fibonacciListesi.get(index-2) + fibonacciListesi.get(index-1);
              if(yeniFibonacciSayisi<girilenSayi){
                fibonacciListesi.add(yeniFibonacciSayisi);
                  
              }
              index++;
          
          }
      
            System.out.println(fibonacciListesi);
      
      }
        







}
