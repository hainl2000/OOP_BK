package hust.soict.hedspi.Lab2;

import java.util.Scanner;

public class mainL2 {
    public static void main(String[] args) throws NullPointerException {
        Scanner sc = new Scanner(System.in);
//        Tamgiac a = new Tamgiac(3);
//        a.showTamGiac();

//        ------

//        Array a = new Array(3);
//        a.addArray(sc);
//        a.sort();
//        a.show();
//        System.out.println(a.total());
//        System.out.println(a.total()/a.getTotalIndex());

//        ------

//        Matrix a = new Matrix(2,2);
//        Matrix b = new Matrix(2,2);
//        a.inputMatrix(sc);
//        b.inputMatrix(sc);
//        a.show();
//        int[][] result = a.add(b);
//        for (int i=0;i<a.getRow();i++) {
//            for (int j = 0; j < a.getCol(); j++) {
//                System.out.print(result[i][j]);
//            }
//            System.out.println();
//        }

//        ------

//        DaysInMonth a = null;
        DaysInMonth b = new DaysInMonth();
        b.setMonth(b.transMonth(sc));
        System.out.println("Nhap vao nam kiem tra");
        int year = sc.nextInt();
        b.setYear(year);
        if(b.daysInMonth() == -1){
            System.out.println("nhap sai");
        }
        else
            System.out.println(b.daysInMonth() + " days");
//        a = new DaysInMonth((a.getMonths(sc)),100);
//        if(a.daysInMonth() == -1){
//            System.out.println("nhap sai");
//        }
//        else
//            System.out.println(a.daysInMonth());



    }
}
