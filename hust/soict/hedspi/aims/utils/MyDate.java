package hust.soict.hedspi.aims.utils;

import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;

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



    public MyDate()
    {

    }

    public MyDate(int d,int m,int y)
    {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public void MyDate (String d,String m,String y)
    {
        if (isVerify(transday(d),transMonth(m),Integer.parseInt(y)))
        {
            this.day = transday(d);
            this.month= transMonth(m);
            this.year=Integer.parseInt(y);
        }
        else{
        System.out.println("Ngay thang bi loi");
    }
    }
    public boolean isVerify(int day, int month, int year)
    {
        return (month <= 12 && month >= 1 && year >= 1900 && year <= 9999 && day >= 1 && day <= 31);
    }

    public int transMonth(String month)
    {
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

    public int transday(String day)
    {
        switch (day.toLowerCase()) {
            case "first":
                return 1;
            case "second":
                return 2;
            case "third":
                return 3;
            case "fourth":
                return 4;
            case "fifth":
                return 5;
            case "sixth":
                return 6;
            case "seventh":
                return 7;
            case "eighth":
                return 8;
            case "ninth":
                return 10;
            case "eleventh":
                return 11;
            case "twelveth":
                return 12;
            case "thirdteenth":
                return 13;
            case "fourteenth":
                return 14;
            case "fifteenth":
                return 15;
            case "sixteenth":
                return 16;
            case "seventeenth":
                return 17;
            case "eightteenth":
                return 18;
            case "nineteenth":
                return 19;
            case "twentyth":
                return 20;
            case "21":
                return 21;
            case "22":
                return 22;
            case "23":
                return 23;
            case "24":
                return 24;
            case "25":
                return 25;
            case "26":
                return 26;
            case "27":
                return 27;
            case "28":
                return 28;
            case "29":
                return 29;
            case "30":
                return 30;
            case "31":
                return 31;
            default:
                return -1;
        }
    }


    public void printDate()
    {
        StringBuilder month = null;
        switch (this.month)
        {
            case 1: month = new StringBuilder("January") ;
                break;
            case 2: month = new StringBuilder("February");
                break;
            case 3: month = new StringBuilder("March");
                break;
            case 4: month = new StringBuilder("April");
                break;
            case 5: month = new StringBuilder("May");
                break;
            case 6: month = new StringBuilder("June");
                break;
            case 7: month = new StringBuilder("July");
                break;
            case 8: month = new StringBuilder("August");
                break;
            case 9: month = new StringBuilder("September");
                break;
            case 10: month = new StringBuilder("Octobor");
                break;
            case 11: month = new StringBuilder("November");
                break;
            case 12: month = new StringBuilder("December");
                break;
            default:
                System.out.println("loi");
                break;
        }
        if (month == null)
        {
            System.out.println("khong in duoc");
        }
        else{
            if(this.day == 1)
            {
                System.out.printf("%s %dst %d /n",month,this.day,this.year);
            }
            else if(this.day == 2)
            {
                System.out.printf("%s %dnd %d /n",month,this.day,this.year);
            }
            else if(this.day == 3)
            {
                System.out.printf("%s %drd %d /n",month,this.day,this.year);
            }
            else {
                System.out.printf("%s %dst %d /n",month,this.day,this.year);
            }
        }
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
        StringBuilder month = null;
        choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
                System.out.printf("%d-%d-%d",this.year,this.month,this.day);
            case 2:
                System.out.printf("%d/%d/%d",this.day,this.month,this.year);
            case 3:
                switch (this.month)
                {
                    case 1: month = new StringBuilder("January") ;
                        break;
                    case 2: month = new StringBuilder("February");
                        break;
                    case 3: month = new StringBuilder("March");
                        break;
                    case 4: month = new StringBuilder("April");
                        break;
                    case 5: month = new StringBuilder("May");
                        break;
                    case 6: month = new StringBuilder("June");
                        break;
                    case 7: month = new StringBuilder("July");
                        break;
                    case 8: month = new StringBuilder("August");
                        break;
                    case 9: month = new StringBuilder("September");
                        break;
                    case 10: month = new StringBuilder("Octobor");
                        break;
                    case 11: month = new StringBuilder("November");
                        break;
                    case 12: month = new StringBuilder("December");
                        break;
                    default:
                        System.out.println("loi");
                        break;
                }
                if (month == null)
                {
                    System.out.println("khong in duoc");
                }
                else
                {
                    System.out.printf("%d-%s-%d",this.day,month,this.year);
                }
            case 4:
                switch (this.month)
                {
                    case 1: month = new StringBuilder("January") ;
                        break;
                    case 2: month = new StringBuilder("February");
                        break;
                    case 3: month = new StringBuilder("March");
                        break;
                    case 4: month = new StringBuilder("April");
                        break;
                    case 5: month = new StringBuilder("May");
                        break;
                    case 6: month = new StringBuilder("June");
                        break;
                    case 7: month = new StringBuilder("July");
                        break;
                    case 8: month = new StringBuilder("August");
                        break;
                    case 9: month = new StringBuilder("September");
                        break;
                    case 10: month = new StringBuilder("Octobor");
                        break;
                    case 11: month = new StringBuilder("November");
                        break;
                    case 12: month = new StringBuilder("December");
                        break;
                    default:
                        System.out.println("loi");
                        break;
                }
                if (month == null)
                {
                    break;
                }
                else
                {
                    System.out.printf("%s %d %d",month,this.day,this.year);
                }
            case 5:
                System.out.printf("%d-%d-%d",this.month,this.day,this.year);
        }
    }

}
