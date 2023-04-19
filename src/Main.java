import java.net.URI;
import java.util.Scanner;

import java.awt.Desktop;


public class Main {
    public static void main(String[] args) {

        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://image.shutterstock.com/image-photo/beautiful-afro-business-man-600w-535445056.jpg");
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
//        Scanner scan = new Scanner(System.in);
//        Integer i=0;
//        System.out.println("1-Armar lista de canciones basica");
//        System.out.println("2-Armar lista de canciones premium");
//        System.out.println("3-Seleccionar lista");
//        System.out.println("Elija la opcion de que desee");
//        i=scan.nextInt();
//    switch (i)
//    {
//        case 1:
//            break;
//    }


    }
}