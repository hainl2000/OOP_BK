package hust.soict.hedspi.Lab03;

import java.util.Scanner;

public class Aim {
    public static void main(String[] args) throws NullPointerException{
        Order anOrder= new Order();
        DigitalVideoDisc[] newOrder1 = new DigitalVideoDisc[2];
        Scanner sc = new Scanner(System.in);

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("TheLionKing","Animation","Roger Allers",
                87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("StarWars","Science Fiction","George Lucas",
                87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin3","Animation",18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin4","Animation",18.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Aladin5","Animation",18.99f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladin6","Animation",18.99f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Aladin7","Animation",18.99f);
        newOrder1[0] = dvd4;
        newOrder1[1] = dvd5;

        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);


        anOrder.addDigitalVideoDisc(newOrder1);

        anOrder.addDigitalVideoDisc(dvd6,dvd7);
        anOrder.showOrder();
        System.out.println("Total Cost :" + anOrder.totalCoins());
//
//        System.out.println("Nhap ten quyen sach ban muon xoa:");
//        String title = sc.nextLine();
//        anOrder.removeDigitalVideoDisc("Animation");
//        anOrder.removeDigitalVideoDisc(title);
//        anOrder.showOrder();
//        System.out.println(anOrder.qtyOrdered);


    }
}
