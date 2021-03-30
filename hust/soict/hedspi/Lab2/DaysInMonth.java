package hust.soict.hedspi.Lab2;

import java.util.Scanner;

public class DaysInMonth {
    int month;
    int year;

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

//    public DaysInMonth(int m,int y)
//    {
//        this.month = m;
//        this.year = y;
//    }

    public boolean isLeapYear()
    {
        if (this.year % 4 == 0)
        {
            if ((this.year) % 100 == 0 && this.year % 400 != 0)
            {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean isVerify()
    {
        return (this.month <= 12 && this.month >= 1 && this.year >= 1900 && this.year <= 9999);
    }

    public int transMonth(Scanner scanner)
    {
        String month;
        System.out.println("Nhập vào tháng cần kiểm tra : ");
        month = scanner.nextLine();
        switch (month.toLowerCase()) {
            case "1":
            case "january":
            case "jan":
            case "jan.":
                return 1;
            case "february":
            case "feb":
            case "2":
            case "feb.":
                return 2;
            case "3":
            case "march":
            case "mar":
            case "mar.":
                return 3;
            case "4":
            case "april":
            case "apr":
            case "apr.":
                return 4;
            case "5":
            case "may":
            case "may.":
                return 5;
            case "6":
            case "june":
            case "jun":
            case "jun.":
                return 6;
            case "7":
            case "july":
            case "jul":
            case "jul.":
                return 7;
            case "august":
            case "aug":
            case "8":
            case "aug.":
                return 8;
            case "9":
            case "september":
            case "sep":
            case "sep.":
                return 9;
            case "10":
            case "october":
            case "oct":
            case "oct.":
                return 10;
            case "11":
            case "november":
            case "nov":
            case "nov.":
                return 11;
            case "12":
            case "december":
            case "dec":
            case "dec.":
                return 12;
            default:
                return -1;
        }
    }

    public int daysInMonth()
    {
        if(isVerify())
        {
            if (this.month == 1 ||this.month == 3 ||this.month == 5 ||this.month == 7 ||this.month == 8 ||
                    this.month == 10 ||this.month == 12 )
            {
                return 31;
            }
            else if(this.month == 2)
            {
                if (this.isLeapYear())
                {
                    return 29;
                }
                return 28;
            }
            else return 30;
        }
        return -1;
    }
}
