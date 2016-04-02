/*
 * Created by Muhammad Habib Fikri Sundayana
 * habibgarut@gmail.com | http://edufi.id/ | http://cingkleung.com
 * Don't lazy to think, feel free to think lazy :)
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author habib
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        MenuUtama();
       
    }
    public static void MenuUtama(){
        System.out.println("Menu Utama");
        System.out.println("1. Menu Admin");
        System.out.println("2. Menu Customer Service");
        System.out.print("Pilih : ");
        int pilihan = scanner.nextInt();
        switch (pilihan) {
            case 1 :
                menuAdmin();
                break;
            case 2 :
                menuCustomerService();
                break;
        } 
    }
    
    public static void menuAdmin() {
        System.out.println("Ini menu admin");
        System.out.println("Menu : ");
        System.out.println("1.Pengelolaan data kereta");
        System.out.println("2.Pengelolaan data gerbong");
        System.out.println("3.Pengelolaan data stasiun");
        System.out.println("4.Pengelolaan data rute");
        System.out.println("5.Profil");
        System.out.println("6.Pengelolaan User - Admin");
        System.out.println("7.Pengelolaan User - Costumer Service");
        System.out.println("8.Exit");
        System.out.print("Pilih :");
        int pilihan = scanner.nextInt();
        switch (pilihan) {
            case 1 :
                pengelolaanDataKereta();
                break;
            case 2 :
                pengelolaanDataGerbong();
                break;
            case 3 :
                pengelolaanDataRute();
                break;
            case 4 : 
                profil();
                break;
            case 5 :
                pengelolaanDataStasiun();
                break;
            case 6 :
                pengelolaanUSerA();
                break;
            case 7 :
                pengelolaanUserCS();
                break;
            case 8 :
                Exit();
                break;
        }
    }
    
    public static void pengelolaanDataKereta(){
        System.out.println("Data Kereta");
        System.out.print("Kembali ke menu utama?(y/n) ");
        String kembali = scanner.next();
        if (kembali.equals("y"))
        {
            menuAdmin();
        }
    }
    public static void pengelolaanDataGerbong(){
        System.out.println("Data Gerbong");
        System.out.print("Kembali ke menu utama?(y/n) ");
        String kembali = scanner.next();
        if (kembali.equals("y"))
        {
            menuAdmin();
        }
    }
    public static void pengelolaanDataStasiun(){
        System.out.println("Data Stasiun");
        System.out.print("Kembali ke menu utama?(y/n) ");
        String kembali = scanner.next();
        if (kembali.equals("y"))
        {
            menuAdmin();
        }
    }
    public static void pengelolaanDataRute(){
        System.out.println("Data Rute");
        System.out.print("Kembali ke menu utama?(y/n) ");
        String kembali = scanner.next();
        if (kembali.equals("y"))
        {
            menuAdmin();
        }
    }
    public static void Profil(){
        System.out.println("Profil");
        System.out.print("Kembali ke menu utama?(y/n) ");
        String kembali = scanner.next();
        if (kembali.equals("y"))
        {
            menuAdmin();
        }
    }
    public static void pengelolaanUSerA(){
        System.out.println("User-Admin");
        System.out.print("Kembali ke menu utama?(y/n) ");
        String kembali = scanner.next();
        if (kembali.equals("y"))
        {
            menuAdmin();
        }
    }
    public static void pengelolaanUserCS(){
        System.out.println("User-Costumer Service");
        System.out.print("Kembali ke menu utama?(y/n) ");
        String kembali = scanner.next();
        if (kembali.equals("y"))
        {
            menuAdmin();
        }
    }
    public static void Exit(){
        MenuUtama();
    }
    public static void menuCustomerService() {
        System.out.println("Ini menu customer service");
        System.out.println("Menu : ");
        System.out.println("1.Lihat Data Kereta");
        System.out.println("2.Lihat Data Gerbong");
        System.out.println("3.Lihat Data Stasiun");
        System.out.println("4.Lihat Data Rute");
        System.out.println("5.Input Tiket");
        System.out.println("6.Profil");
        System.out.println("7.Exit");
        System.out.print("Pilih :");
        int pilihan = scanner.nextInt();
        switch (pilihan) {
            case 1 :
                LihatDataKereta();
                break;
            case 2 :
                LihatDataGerbong();
                break;
            case 3 :
                LihatDataStasiun();
                break;
            case 4 : 
                LihatDataRute();
                break;
            case 5 :
                InputTiket();
                break;
            case 6 :
                profil();
                break;
            case 7 :
                exit();
                break;
        }
    }
    public static void LihatDataKereta(){
        System.out.println("Lihat Data Kereta");
        System.out.print("Kembali ke menu utama?(y/n) ");
        String kembali = scanner.next();
        if (kembali.equals("y"))
        {
            menuCustomerService();
        }
    }
    public static void LihatDataGerbong(){
        System.out.println("Lihat Data Gerbong");
        System.out.print("Kembali ke menu utama?(y/n) ");
        String kembali = scanner.next();
        if (kembali.equals("y"))
        {
            menuCustomerService();
        }
    }
    public static void LihatDataStasiun(){
        System.out.println("Lihat Data Stasiun");
        System.out.print("Kembali ke menu utama?(y/n) ");
        String kembali = scanner.next();
        if (kembali.equals("y"))
        {
            menuCustomerService();
        }
    }
    public static void LihatDataRute(){
        System.out.println("Lihat Data Rute");
        System.out.print("Kembali ke menu utama?(y/n) ");
        String kembali = scanner.next();
        if (kembali.equals("y"))
        {
            menuCustomerService();
        }
    }
    public static void InputTiket(){
        System.out.println("Input Tiket");
        System.out.print("Kembali ke menu utama?(y/n) ");
        String kembali = scanner.next();
        if (kembali.equals("y"))
        {
            menuCustomerService();
        }
    }
    public static void profil(){
        System.out.println("Profil");
        System.out.print("Kembali ke menu utama?(y/n) ");
        String kembali = scanner.next();
        if (kembali.equals("y"))
        {
            menuCustomerService();
        }
    }
    public static void exit(){
        MenuUtama();
    }
}
