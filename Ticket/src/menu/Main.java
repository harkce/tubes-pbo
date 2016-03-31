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
        System.out.println("Menu Utama");
        System.out.println("1. Menu Admin");
        System.out.println("2. Menu Customer Service");
        System.out.print("PiliMain.java:15h : ");
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
    }
    
    public static void menuCustomerService() {
        System.out.println("Ini menu customer service");
    }
}
