package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;
import hust.soict.hedspi.aims.order.Order;

import java.util.Scanner;

public class Aim {
    public static void main(String[] args) throws NullPointerException{
        Scanner sc = new Scanner(System.in);
        Order anOrder= new Order();
        Order anOrder1 = new Order();
//        System.out.println("Nhap vao ngay thang nam");
//        anOrder.getDateOrdered().setDay(sc.nextInt());
//        anOrder.getDateOrdered().setMonth(sc.nextInt());
//        anOrder.getDateOrdered().setYear(sc.nextInt());

//        anOrder1.getDateOrdered().day = sc.nextInt();
//        anOrder1.getDateOrdered().month = sc.nextInt();
//        anOrder1.getDateOrdered().year = sc.nextInt();

//        MyDate[] listDate = new MyDate[2];
//        listDate[0] = anOrder.getDateOrdered();
//        listDate[1] = anOrder1.getDateOrdered();

//        new DateUtils().sortDates(listDate);
//        for (MyDate i:listDate)
//        {
//            System.out.println(i.day+" "+i.month+" "+i.year);
//        }
        DigitalVideoDisc[] newOrder1 = new DigitalVideoDisc[2];

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",
                87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("StarWars","Science Fiction","George Lucas",
                87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin3","Animation",18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin4","Animation",18.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Aladin5","Animation",18.99f);
//        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladin6","Animation",18.99f);
//        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Aladin7","Animation",18.99f);
//        newOrder1[0] = dvd4;
//        newOrder1[1] = dvd5;

        System.out.println(dvd1.search("    Lion    King"));
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);

        anOrder.getaALuckyItem().showDigitalVideoDisc();


//        MyDate date1 = new MyDate(10,10,2000);
//        date1.printDate();
//
//        anOrder.addDigitalVideoDisc(newOrder1);
//        anOrder.showOrder();
//
//        anOrder.addDigitalVideoDisc(dvd6,dvd7);
//        anOrder.showOrder();
//        System.out.println("Total Cost :" + anOrder.totalCoins());

//
//        System.out.println("Nhap ten quyen sach ban muon xoa:");
//        String title = sc.nextLine();
//        anOrder.removeDigitalVideoDisc("Animation");
//        anOrder.removeDigitalVideoDisc(title);
//        anOrder.showOrder();
//        System.out.println(anOrder.qtyOrdered);


    }
}
