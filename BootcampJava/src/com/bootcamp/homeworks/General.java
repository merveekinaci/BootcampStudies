package com.bootcamp.homeworks;

public class General {
    public static void main(String[] args) {
            int[] dizi={10,25,40,60,36};

            int enbuyuk = dizi[0];
            int ikinci = dizi[0];
            for (int i=0;i<dizi.length;i++){

                if(dizi[i] % 2 == 0) {
                     System.out.println("Dizideki çift sayılar:" + dizi[i]);

                } else{
                     System.out.println("Dizideki tek sayılar:" + dizi[i] );
                }

                if (dizi[i] > enbuyuk) {
                    ikinci = enbuyuk;
                    enbuyuk = dizi[i];
                } else if (dizi[i] > ikinci) {
                    ikinci = dizi[i];
                }
        }

        System.out.println("Dizideki en büyük değer: " + enbuyuk);
        System.out.println("Dizideki en büyük ikinci değer: " + ikinci);


    }

    }





/**
 *      1- Bir array oluşturun ve array içindeki en büyük sayıyı bulan bir algoritma tasarlayın
 *      2- Aynı array içinde ikinci en büyük sayıyı bulan algoritma tasarlayın
 *      3- Aynı array içindeki çift sayıları başka bir arraya ve tek sayıları başka bir arraya setleyin, ve yeni oluşan 2 arrayi de ekrana yazdırın.
 *      4- Aynı arrayi ters şekilde başka bir arraya setleyin.
 *
 *      Bu 4 farklı algoritmayı tasarlayın ve github'ınıza pushlayın.
 *public class General {
 *     public static void main(String[] args) {
 *             int[] dizi={10,25,40,60,36};
 *             int i;
 *
 *
 *             int enbuyuk = dizi[0];
 *             int ikinci = dizi[0];
 *             for(i=1;i<dizi.length;i++){
 *                 if(dizi[i]>enbuyuk)
 *                 {
 *                     ikinci=enbuyuk;
 *                     enbuyuk=dizi[i];
 *                 }
 *                 else if(dizi[i]>ikinci){
 *                     ikinci = dizi[i];
 *             }
 *         }
 *         System.out.println("Dizideki en büyük değer: " + enbuyuk);
 *         System.out.println("Dizideki en büyük ikinci değer: " + ikinci);
 *     }
 *
 *
 *     }
 */