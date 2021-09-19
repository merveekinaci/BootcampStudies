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





