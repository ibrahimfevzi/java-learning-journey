/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package örnek;

import java.util.Scanner;

/**
 *
 * @author ibrahimkayan
 */
public class Örnek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("****************************************");

        System.out.println("VÜCUT KİTLE ENDEKSİ HESAPLAMA PROGRAMI");
        System.out.println("*****************************************");

        System.out.print("Boyunuzu giriniz ? Örnek: 1,71   : ");

        float boy = input.nextFloat();

        System.out.print("Kilonuzu Giriniz ?   : ");

        int kilo = input.nextInt();

        float sonuc = (kilo / (boy * boy));

        System.out.println("Vücut Kitle Endeksiniz: " + sonuc);

        if (sonuc <= 25) {
            System.out.println("Vücut Tipi: Normal");

        } else if (sonuc > 25 && sonuc <= 30) {
            System.out.println("Vücut Tipi: Kilolu");

        } else {
            System.out.println("Vücut Tipi: Obez");
        }

    }

}
