package hust.soict.hedspi.aims.utils;

import hust.soict.hedspi.aims.utils.MyDate;

public class DateUtils {

    public DateUtils()
    {

    }

    private boolean compare2Dates(MyDate a, MyDate b)
    {
        if (a.getYear() > b.getYear())
        {
            return true;
        }
        else if(a.getYear() == b.getYear())
        {
            if (a.getMonth() > b.getMonth())
            {
                return true;
            }
            else if (a.getMonth() == b.getMonth())
            {
                if (a.getDay() >= b.getDay())
                {
                    return true;
                }
                else
                    return false;
            }
            else
                return false;
        }
        else
            return false;
    }

    public void sortDates(MyDate[] a)
    {
        for (int i=0;i<a.length - 1;i++)
        {
            for (int j=i+1;j<a.length;j++)
                if (compare2Dates(a[i],a[j-1]))
                {
                    MyDate temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
        }
    }
}
