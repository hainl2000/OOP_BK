package hust.soict.hedspi.Lab04;

public class DateUtils {

    public DateUtils()
    {

    }

    private boolean compare2Dates(MyDate a,MyDate b)
    {
        if (a.year > b.year)
        {
            return true;
        }
        else if(a.year == b.year)
        {
            if (a.month > b.month)
            {
                return true;
            }
            else if (a.month == b.month)
            {
                if (a.day >= b.day)
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
