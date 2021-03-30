package hust.soict.hedspi.Lab03;

import java.util.Scanner;

public class MyDate {
    int day;
    int month;
    int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate(String day, String month, String year)
    {

    }

    public void formatDate(Scanner scanner)
    {
        System.out.println("Choose format date you wanna print");
        System.out.println("1: yyyy-MM-dd");
        System.out.println("2: d/M/yyyy");
        System.out.println("3: dd-MMM-yyyy");
        System.out.println("4: MMM d yyyy");
        System.out.println("5: mm-dd-yyyy");
        int choice;
        choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
        }

    }

}
