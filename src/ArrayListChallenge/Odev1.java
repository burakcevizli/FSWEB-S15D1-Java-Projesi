package ArrayListChallenge;

import javax.swing.text.AbstractDocument;
import java.util.*;

public class Odev1 {
    static Scanner scanner = new Scanner(System.in);
    static List<String> groceryList = new ArrayList<>();
    public static void main(String[] args) {

        while (true) {
            System.out.println("Lütfen bir sayı seçiniz");
            int sayi = scanner.nextInt();
            scanner.nextLine();


            switch (sayi) {
                case 0:
                    System.out.println("Uygulama kapatıldı.");
                    return;

                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz");
                    addItems();
                    printSorted();
                    break;

                case 2:
                    System.out.println("Çıakrılacaklar istediğiniz elemanakr");
                    removeItems();
                    printSorted();
                    break;
            }
        }
    }

    private static void addItems() {
        String elemanlar = scanner.nextLine();
        String[] eklenecekElemanlar = elemanlar.split(",");
        for(int i =0 ; i< eklenecekElemanlar.length;i++) {
            if (!checkItemsIsInList(eklenecekElemanlar[i])) {
                groceryList.add(eklenecekElemanlar[i]);
            } else {
                System.out.println("Bu eleman zaten var.");
            }
        }
    }

    private static void removeItems(){
        String cikarilacakElemanlar = scanner.nextLine();
        String[] cikarailacaklarARRAY = cikarilacakElemanlar.split(",");
        for(int i = 0; i<cikarailacaklarARRAY.length;i++){
            if(checkItemsIsInList(cikarailacaklarARRAY[i])){
                groceryList.remove(cikarailacaklarARRAY[i]);
                System.out.println("Çıkarıldı");
            }else{
                System.out.println("Zaten çıkarıldı");
            }
        }
    }

    private static boolean checkItemsIsInList(String item){
        return groceryList.contains(item);
    }

    private static void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }

}